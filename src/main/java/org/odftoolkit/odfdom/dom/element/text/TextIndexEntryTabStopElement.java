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
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleLeaderCharAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StylePositionAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:index-entry-tab-stop}.
 *
 */
public class TextIndexEntryTabStopElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TEXT, "index-entry-tab-stop" );


	/**
	 * Create the instance of <code>TextIndexEntryTabStopElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextIndexEntryTabStopElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME, OdfStyleFamily.Text, OdfName.newName(OdfNamespaceNames.TEXT, "style-name" )	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:index-entry-tab-stop}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStyleNameAttribute()
	{
		TextStyleNameAttribute attr = (TextStyleNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "style-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @param textStyleNameValue   The type is <code>String</code>
	 */
	public void setTextStyleNameAttribute( String textStyleNameValue )
	{
		TextStyleNameAttribute attr =  new TextStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleLeaderCharAttribute</code> , See {@odf.attribute style:leader-char}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleLeaderCharAttribute()
	{
		StyleLeaderCharAttribute attr = (StyleLeaderCharAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "leader-char" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleLeaderCharAttribute</code> , See {@odf.attribute style:leader-char}
	 *
	 * @param styleLeaderCharValue   The type is <code>String</code>
	 */
	public void setStyleLeaderCharAttribute( String styleLeaderCharValue )
	{
		StyleLeaderCharAttribute attr =  new StyleLeaderCharAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleLeaderCharValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleTypeAttribute</code> , See {@odf.attribute style:type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleTypeAttribute()
	{
		StyleTypeAttribute attr = (StyleTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleTypeAttribute</code> , See {@odf.attribute style:type}
	 *
	 * @param styleTypeValue   The type is <code>String</code>
	 */
	public void setStyleTypeAttribute( String styleTypeValue )
	{
		StyleTypeAttribute attr =  new StyleTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( styleTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>StylePositionAttribute</code> , See {@odf.attribute style:position}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStylePositionAttribute()
	{
		StylePositionAttribute attr = (StylePositionAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.STYLE), "position" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>StylePositionAttribute</code> , See {@odf.attribute style:position}
	 *
	 * @param stylePositionValue   The type is <code>String</code>
	 */
	public void setStylePositionAttribute( String stylePositionValue )
	{
		StylePositionAttribute attr =  new StylePositionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( stylePositionValue );
	}

}
