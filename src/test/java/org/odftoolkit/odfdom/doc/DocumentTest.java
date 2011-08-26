/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 * 
 * Use is subject to license terms.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/
package org.odftoolkit.odfdom.doc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.Assert;
import org.junit.Test;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.style.StyleGraphicPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StylePageLayoutPropertiesElement;
import org.odftoolkit.odfdom.dom.element.style.StyleTextPropertiesElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.incubator.doc.office.OdfOfficeAutomaticStyles;
import org.odftoolkit.odfdom.incubator.doc.office.OdfOfficeStyles;
import org.odftoolkit.odfdom.incubator.doc.style.OdfStyle;
import org.odftoolkit.odfdom.incubator.doc.style.OdfStylePageLayout;
import org.odftoolkit.odfdom.incubator.doc.text.OdfTextListStyle;
import org.odftoolkit.odfdom.utils.NodeAction;
import org.odftoolkit.odfdom.utils.ResourceUtilities;
import org.w3c.dom.Node;

public class DocumentTest {

	private static final Logger LOG = Logger.getLogger(DocumentTest.class.getName());
	private static final String TEST_FILE = "test2.odt";
	private static final String TEST_FILE_WITHOUT_OPT = "no_size_opt.odt";
	private static final String ODF_FORMULAR_TEST_FILE = "SimpleFormula.odf";
	private static final String IMAGE_TEST_FILE = "testA.jpg";
	private static final String GENERATED_INVALID_SPREADSHEET = "invalid.ods";
	private static final String ZERO_BYTE_SPREADSHEET = "empty_file.ods";

	public DocumentTest() {
	}

	@Test
	public void loadDocument() {
		try {
			System.setProperty("org.odftoolkit.odfdom.tmpfile.disable", "true");
			// LOAD INVALID GENERATED SPREADSHEET DOCUMENT
			LOG.info("Loading an supported ODF Spreadsheet document as an ODF Document!");
			try {
				// Should work!
				OdfDocument ods = OdfDocument.loadDocument(ResourceUtilities.getTestResourceAsStream(GENERATED_INVALID_SPREADSHEET));
				Assert.assertNotNull(ods);
			} catch (Exception e) {
				LOG.log(Level.SEVERE, e.getMessage(), e);
				Assert.fail();
			}


			// LOAD EMPTY DOCUMENT
			LOG.info("Loading an empty document as an ODF Document!");
			try {
				// Should throw adequate error message!
				OdfDocument ods = OdfDocument.loadDocument(ResourceUtilities.getTestResourceAsStream(ZERO_BYTE_SPREADSHEET));
				Assert.assertNull(ods);
			} catch (Exception e) {
				if (!e.getMessage().contains("empty file")) {
					LOG.log(Level.SEVERE, e.getMessage(), e);
					Assert.fail();
				}
			}

			// LOAD FORMULA DOCUMENT
			LOG.info("Loading an unsupported ODF Formula document as an ODF Document!");
			try {
				// Exception is expected!
				OdfDocument.loadDocument(ResourceUtilities.getTestResourceAsStream(ODF_FORMULAR_TEST_FILE));
				Assert.fail();
			} catch (IllegalArgumentException e) {
				if (!e.getMessage().contains("is either not yet supported or not an ODF mediatype!")) {
					LOG.log(Level.SEVERE, e.getMessage(), e);
					Assert.fail();
				}
			}

			// LOAD DOCUMENT IMAGE
			LOG.info("Loading an unsupported image file as an ODF Document!");
			try {
				// Exception is expected!
				OdfDocument.loadDocument(ResourceUtilities.getTestResourceAsStream(IMAGE_TEST_FILE));
				Assert.fail();
			} catch (IllegalArgumentException e) {
				if (!e.getMessage().contains("unzip the file")) {
					LOG.log(Level.SEVERE, e.getMessage(), e);
					Assert.fail();
				}
			}

		} catch (Exception e) {
			LOG.log(Level.SEVERE, e.getMessage(), e);
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void testParser() {
		try {
			OdfDocument.loadDocument(ResourceUtilities.getAbsolutePath(TEST_FILE));
		} catch (Exception e) {
			LOG.log(Level.SEVERE, e.getMessage(), e);
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void testGetContentRoot() {
		try {
			OdfTextDocument odt = (OdfTextDocument) OdfDocument.loadDocument(ResourceUtilities.getAbsolutePath(TEST_FILE_WITHOUT_OPT));
			Assert.assertNotNull(odt.getContentRoot());
		} catch (Exception e) {
			LOG.log(Level.SEVERE, e.getMessage(), e);
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void testDumpDom() {
		try {			
			Assert.assertTrue(testXSLT("content") & testXSLT("styles"));
		} catch (Exception e) {
			LOG.log(Level.SEVERE, e.getMessage(), e);
			Assert.fail(e.getMessage());
		}
	}

	private static boolean testXSLT(String odfFileNamePrefix) throws Exception {
		OdfDocument odfdoc = OdfDocument.loadDocument(ResourceUtilities.getAbsolutePath(TEST_FILE));

		Transformer trans = TransformerFactory.newInstance().newTransformer();
		trans.setOutputProperty("indent", "yes");
		// trans.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

		LOG.log(Level.INFO, "---------- {0}.xml transformed and compared ---------", odfFileNamePrefix);
		// The XML file (e.g. content.xml) is transformed by XSLT into the similar/identical XML file
		ByteArrayOutputStream xmlBytes = new ByteArrayOutputStream();
		OdfFileDom fileDom = null;
		if (odfFileNamePrefix.equals("content")) {
			fileDom = odfdoc.getContentDom();
		} else {
			fileDom = odfdoc.getStylesDom();
		}
		// transforming the XML using identical transformation
		trans.transform(new DOMSource(fileDom), new StreamResult(xmlBytes));
		String xmlString = xmlBytes.toString("UTF-8");		
		// Saving test file to disc
		saveString(xmlString, ResourceUtilities.getTestOutputFolder() + odfFileNamePrefix + "-temporary-test.xml");

		// The template XML was once transformed and saved to the resource folder to gurantee the same indentation
		String xmlStringOriginal = inputStreamToString(ResourceUtilities.getTestResourceAsStream("test2-" + odfFileNamePrefix + ".xml"));
		// Saving original file to disc
		saveString(xmlStringOriginal, ResourceUtilities.getTestOutputFolder() + odfFileNamePrefix + "-temporary-original.xml");


		// Loading original file back to string representation
		String originalString = inputStreamToString(new FileInputStream(ResourceUtilities.getTestOutputFolder() + odfFileNamePrefix + "-temporary-test.xml"));
		// Loading test file back to string representation
		String testString = inputStreamToString(new FileInputStream(ResourceUtilities.getTestOutputFolder() + odfFileNamePrefix + "-temporary-original.xml"));

		boolean xmlEqual = originalString.equals(testString);
		if (!xmlEqual) {
			String testFilePath = ResourceUtilities.getTestOutputFolder() + odfFileNamePrefix + "-final-test.xml";
			String originalFilePath = ResourceUtilities.getTestOutputFolder() + odfFileNamePrefix + "-final-original.xml";
			saveString(testString, testFilePath);
			saveString(originalString, originalFilePath);
			LOG.log(Level.SEVERE, "Please compare the XML of two file:\n{0}\n and \n{1}", new Object[]{testFilePath, originalFilePath});
		}
		return xmlEqual;
	}

	@Test
	public void testStylesDom() {
		try {
			OdfDocument odfdoc = OdfDocument.loadDocument(ResourceUtilities.getAbsolutePath(TEST_FILE));

			OdfFileDom stylesDom = odfdoc.getStylesDom();
			Assert.assertNotNull(stylesDom);

			// test styles.xml:styles
			OdfOfficeStyles styles = odfdoc.getDocumentStyles();
			Assert.assertNotNull(styles);

			Assert.assertNotNull(styles.getDefaultStyle(OdfStyleFamily.Graphic));
			Assert.assertNotNull(styles.getDefaultStyle(OdfStyleFamily.Paragraph));
			Assert.assertNotNull(styles.getDefaultStyle(OdfStyleFamily.Table));
			Assert.assertNotNull(styles.getDefaultStyle(OdfStyleFamily.TableRow));

			OdfStyle style = styles.getStyle("Standard", OdfStyleFamily.Paragraph);
			Assert.assertNotNull(style);
			Assert.assertEquals(style.getStyleClassAttribute(), "text");

			style = styles.getStyle("List", OdfStyleFamily.Paragraph);
			Assert.assertNotNull(style);
			Assert.assertEquals(style.getProperty(StyleTextPropertiesElement.FontNameComplex), "Tahoma1");
			Assert.assertTrue(style.hasProperty(StyleTextPropertiesElement.FontNameComplex));
			Assert.assertFalse(style.hasProperty(StyleTextPropertiesElement.FontNameAsian));

			Assert.assertNull(styles.getStyle("foobar", OdfStyleFamily.Chart));

			// test styles.xml:automatic-styles
			OdfOfficeAutomaticStyles autostyles = stylesDom.getAutomaticStyles();
			Assert.assertNotNull(autostyles);

			OdfStylePageLayout pageLayout = autostyles.getPageLayout("pm1");
			Assert.assertNotNull(pageLayout);
			Assert.assertEquals(pageLayout.getProperty(StylePageLayoutPropertiesElement.PageWidth), "8.5in");
			Assert.assertEquals(pageLayout.getProperty(StylePageLayoutPropertiesElement.PageHeight), "11in");

			Assert.assertNull(autostyles.getStyle("foobar", OdfStyleFamily.Chart));

		} catch (Exception e) {
			LOG.log(Level.SEVERE, e.getMessage(), e);
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void testContentNode() {
		try {
			OdfDocument odfdoc = OdfDocument.loadDocument(ResourceUtilities.getAbsolutePath(TEST_FILE));

			OdfFileDom contentDom = odfdoc.getContentDom();

			// test content.xml:automatic-styles
			OdfOfficeAutomaticStyles autoStyles = contentDom.getAutomaticStyles();
			Assert.assertNotNull(autoStyles);

			OdfStyle style = autoStyles.getStyle("P1", OdfStyleFamily.Paragraph);
			Assert.assertNotNull(style);
			Assert.assertEquals(style.getStyleNameAttribute(), "P1");
			Assert.assertEquals(style.getStyleParentStyleNameAttribute(), "Text_20_body");
			Assert.assertEquals(style.getStyleListStyleNameAttribute(), "L1");

			style = autoStyles.getStyle("T1", OdfStyleFamily.Text);
			Assert.assertNotNull(style);
			Assert.assertEquals(style.getStyleNameAttribute(), "T1");

			for (OdfStyle testStyle : autoStyles.getStylesForFamily(OdfStyleFamily.Paragraph)) {
				testStyle(testStyle);
			}

			for (OdfStyle testStyle : autoStyles.getStylesForFamily(OdfStyleFamily.Text)) {
				testStyle(testStyle);
			}

		} catch (Exception e) {
			LOG.log(Level.SEVERE, e.getMessage(), e);
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void testSaveDocument() {
		try {
			OdfDocument odfdoc = OdfDocument.loadDocument(ResourceUtilities.getAbsolutePath(TEST_FILE));
			new NodeAction<String>() {

				@Override
				protected void apply(Node cur, String replace, int depth) {
					if (cur.getNodeType() == Node.TEXT_NODE) {
						cur.setNodeValue(cur.getNodeValue().replaceAll("\\w", replace));
					}
				}
			};
//            replaceText.performAction(e, "X");            
			odfdoc.save(ResourceUtilities.newTestOutputFile("list-out.odt"));
		} catch (Exception e) {
			LOG.log(Level.SEVERE, e.getMessage(), e);
			Assert.fail(e.getMessage());
		}
	}

	private void testStyle(OdfStyle testStyle) throws Exception {
		OdfFileDom dom = (OdfFileDom) testStyle.getOwnerDocument();
		if (testStyle.getStyleParentStyleNameAttribute() != null) {
			OdfStyle parentStyle = dom.getAutomaticStyles().getStyle(testStyle.getStyleParentStyleNameAttribute(), testStyle.getFamily());
			if (parentStyle == null) {
				parentStyle = ((OdfDocument) dom.getDocument()).getDocumentStyles().getStyle(testStyle.getStyleParentStyleNameAttribute(), testStyle.getFamily());
			}

			Assert.assertNotNull(parentStyle);
		}
		if (testStyle.hasOdfAttribute(OdfName.newName(OdfDocumentNamespace.STYLE, "list-style-name"))) {
			if (testStyle.getStyleListStyleNameAttribute() != null) {
				OdfTextListStyle listStyle = dom.getAutomaticStyles().getListStyle(testStyle.getStyleListStyleNameAttribute());
				if (listStyle == null) {
					listStyle = ((OdfDocument) dom.getDocument()).getDocumentStyles().getListStyle(testStyle.getStyleListStyleNameAttribute());
				}

				Assert.assertNotNull(listStyle);
			}
		}
	}

	@Test
	public void testParsingOfInvalidAttribute() {
		try {
			// file with invalid value for enum text-underline-style
			File testfile = ResourceUtilities.newTestOutputFile("InvalidUnderlineAttribute.odt");

			// Test1: Loading shouldn't fail just because of one invalid attribute
			OdfTextDocument odt = (OdfTextDocument) OdfDocument.loadDocument(testfile);
			Assert.assertNotNull(odt);

			// Test2: invalid attribute node should have been be removed
//			OdfStyle styleNode = odt.getContentDom().getAutomaticStyles().getStyle("T1", OdfStyleFamily.Text);
//			StyleTextPropertiesElement props = OdfElement.findFirstChildNode(StyleTextPropertiesElement.class, styleNode);
//			Assert.assertFalse(props.hasAttribute("style:text-underline-style"));
//			odt.save(ResourceUtilities.newTestOutputFile("saving-is-possible2.odt"));

			// Test3: New ODF 1.2 attribute node should exist
			OdfStyle styleNode2 = odt.getStylesDom().getOfficeStyles().getStyle("bug77", OdfStyleFamily.Graphic);
			StyleGraphicPropertiesElement propsGrapicElement = OdfElement.findFirstChildNode(StyleGraphicPropertiesElement.class, styleNode2);
			Assert.assertTrue("Could not find the attribute svg:opac-capicity. Workaround bug77 did not succeeded!", propsGrapicElement.hasAttribute("svg:stroke-opacity"));
			odt.save(ResourceUtilities.newTestOutputFile("saving-is-possible.odt"));
		} catch (Exception e) {
			LOG.log(Level.SEVERE, e.getMessage(), e);
			Assert.fail(e.getMessage());
		}
	}

	private static String inputStreamToString(InputStream in) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
		StringBuilder stringBuilder = new StringBuilder();
		String line = null;

		while ((line = bufferedReader.readLine()) != null) {
			stringBuilder.append(line).append("\n");
		}
		bufferedReader.close();
		return stringBuilder.toString();
	}

	/** Saves the datastring as UTF8 to the given filePath */
	private static void saveString(String dataString, String filePath) throws UnsupportedEncodingException, IOException {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "UTF8"));
		out.append(dataString);
		out.close();
	}
}
