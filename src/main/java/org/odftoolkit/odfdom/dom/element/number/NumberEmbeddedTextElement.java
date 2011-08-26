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

package org.odftoolkit.odfdom.dom.element.number;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.number.NumberPositionAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element number:embedded-text}.
 *
 */
public class NumberEmbeddedTextElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.NUMBER, "embedded-text" );


	/**
	 * Create the instance of <code>NumberEmbeddedTextElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public NumberEmbeddedTextElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element number:embedded-text}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  NumberEmbeddedTextElement}
	 *
     * @param numberPositionAttributeValue  The mandatory attribute {@odf.attribute  number:position}"
     *
	 */
	public void init(int numberPositionAttributeValue)
	{
		setNumberPositionAttribute( Integer.valueOf(numberPositionAttributeValue) );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberPositionAttribute</code> , See {@odf.attribute number:position}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberPositionAttribute()
	{
		NumberPositionAttribute attr = (NumberPositionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "position" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberPositionAttribute</code> , See {@odf.attribute number:position}
	 *
	 * @param numberPositionValue   The type is <code>Integer</code>
	 */
	public void setNumberPositionAttribute( Integer numberPositionValue )
	{
		NumberPositionAttribute attr =  new NumberPositionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( numberPositionValue.intValue() );
	}

}
