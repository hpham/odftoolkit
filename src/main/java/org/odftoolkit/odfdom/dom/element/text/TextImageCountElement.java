/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
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

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumFormatAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleNumLetterSyncAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:image-count}.
 *
 */
public class TextImageCountElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TEXT, "image-count" );


	/**
	 * Create the instance of <code>TextImageCountElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextImageCountElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:image-count}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNumFormatAttribute</code> , See {@odf.attribute style:num-format}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleNumFormatAttribute()
	{
		StyleNumFormatAttribute attr = (StyleNumFormatAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "num-format" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNumFormatAttribute</code> , See {@odf.attribute style:num-format}
	 *
	 * @param styleNumFormatValue   The type is <code>String</code>
	 */
	public void setStyleNumFormatAttribute( String styleNumFormatValue )
	{
		StyleNumFormatAttribute attr =  new StyleNumFormatAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleNumFormatValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleNumLetterSyncAttribute</code> , See {@odf.attribute style:num-letter-sync}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getStyleNumLetterSyncAttribute()
	{
		StyleNumLetterSyncAttribute attr = (StyleNumLetterSyncAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "num-letter-sync" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleNumLetterSyncAttribute</code> , See {@odf.attribute style:num-letter-sync}
	 *
	 * @param styleNumLetterSyncValue   The type is <code>Boolean</code>
	 */
	public void setStyleNumLetterSyncAttribute( Boolean styleNumLetterSyncValue )
	{
		StyleNumLetterSyncAttribute attr =  new StyleNumLetterSyncAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( styleNumLetterSyncValue.booleanValue() );
	}

}
