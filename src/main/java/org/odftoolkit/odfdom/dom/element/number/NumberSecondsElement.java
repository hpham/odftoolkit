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
import org.odftoolkit.odfdom.dom.attribute.number.NumberStyleAttribute;
import org.odftoolkit.odfdom.dom.attribute.number.NumberDecimalPlacesAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element number:seconds}.
 *
 */
public class NumberSecondsElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.NUMBER, "seconds" );


	/**
	 * Create the instance of <code>NumberSecondsElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public NumberSecondsElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element number:seconds}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberStyleAttribute</code> , See {@odf.attribute number:style}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getNumberStyleAttribute()
	{
		NumberStyleAttribute attr = (NumberStyleAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "style" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberStyleAttribute</code> , See {@odf.attribute number:style}
	 *
	 * @param numberStyleValue   The type is <code>String</code>
	 */
	public void setNumberStyleAttribute( String numberStyleValue )
	{
		NumberStyleAttribute attr =  new NumberStyleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( numberStyleValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>NumberDecimalPlacesAttribute</code> , See {@odf.attribute number:decimal-places}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getNumberDecimalPlacesAttribute()
	{
		NumberDecimalPlacesAttribute attr = (NumberDecimalPlacesAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.NUMBER), "decimal-places" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>NumberDecimalPlacesAttribute</code> , See {@odf.attribute number:decimal-places}
	 *
	 * @param numberDecimalPlacesValue   The type is <code>Integer</code>
	 */
	public void setNumberDecimalPlacesAttribute( Integer numberDecimalPlacesValue )
	{
		NumberDecimalPlacesAttribute attr =  new NumberDecimalPlacesAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( numberDecimalPlacesValue.intValue() );
	}

}
