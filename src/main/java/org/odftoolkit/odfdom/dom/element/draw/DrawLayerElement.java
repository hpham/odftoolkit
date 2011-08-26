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

package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawProtectedAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawDisplayAttribute;

import org.odftoolkit.odfdom.dom.element.svg.SvgTitleElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgDescElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element draw:layer}.
 *
 */
public class DrawLayerElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.DRAW, "layer" );


	/**
	 * Create the instance of <code>DrawLayerElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DrawLayerElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element draw:layer}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  DrawLayerElement}
	 *
     * @param drawNameAttributeValue  The mandatory attribute {@odf.attribute  draw:name}"
     *
	 */
	public void init(String drawNameAttributeValue)
	{
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawNameAttribute()
	{
		DrawNameAttribute attr = (DrawNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * @param drawNameValue   The type is <code>String</code>
	 */
	public void setDrawNameAttribute( String drawNameValue )
	{
		DrawNameAttribute attr =  new DrawNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawProtectedAttribute</code> , See {@odf.attribute draw:protected}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDrawProtectedAttribute()
	{
		DrawProtectedAttribute attr = (DrawProtectedAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "protected" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( DrawProtectedAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawProtectedAttribute</code> , See {@odf.attribute draw:protected}
	 *
	 * @param drawProtectedValue   The type is <code>Boolean</code>
	 */
	public void setDrawProtectedAttribute( Boolean drawProtectedValue )
	{
		DrawProtectedAttribute attr =  new DrawProtectedAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( drawProtectedValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawDisplayAttribute</code> , See {@odf.attribute draw:display}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawDisplayAttribute()
	{
		DrawDisplayAttribute attr = (DrawDisplayAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "display" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return DrawDisplayAttribute.DEFAULT_VALUE;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawDisplayAttribute</code> , See {@odf.attribute draw:display}
	 *
	 * @param drawDisplayValue   The type is <code>String</code>
	 */
	public void setDrawDisplayAttribute( String drawDisplayValue )
	{
		DrawDisplayAttribute attr =  new DrawDisplayAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawDisplayValue );
	}

	/**
	 * Create child element {@odf.element svg:title}.
	 *
	 * @return   return  the element {@odf.element svg:title}
	 * DifferentQName 
	 */
	public SvgTitleElement newSvgTitleElement()
	{
		SvgTitleElement  svgTitle = ((OdfFileDom)this.ownerDocument).newOdfElement(SvgTitleElement.class);
		this.appendChild( svgTitle);
		return  svgTitle;
	}                   
               
	/**
	 * Create child element {@odf.element svg:desc}.
	 *
	 * @return   return  the element {@odf.element svg:desc}
	 * DifferentQName 
	 */
	public SvgDescElement newSvgDescElement()
	{
		SvgDescElement  svgDesc = ((OdfFileDom)this.ownerDocument).newOdfElement(SvgDescElement.class);
		this.appendChild( svgDesc);
		return  svgDesc;
	}                   
               
}
