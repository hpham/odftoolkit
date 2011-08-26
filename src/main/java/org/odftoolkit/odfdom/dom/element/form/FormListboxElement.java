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

package org.odftoolkit.odfdom.dom.element.form;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.form.FormNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormControlImplementationAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.xforms.XformsBindAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormDisabledAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormDropdownAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormPrintableAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormSizeAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormTabIndexAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormTabStopAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormTitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormBoundColumnAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormDataFieldAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormListSourceAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormListSourceTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormLinkedCellAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormListLinkageTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormSourceCellRangeAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormMultipleAttribute;
import org.odftoolkit.odfdom.dom.attribute.form.FormXformsListSourceAttribute;

import org.odftoolkit.odfdom.dom.element.office.OfficeEventListenersElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element form:listbox}.
 *
 */
public class FormListboxElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.FORM, "listbox" );


	/**
	 * Create the instance of <code>FormListboxElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public FormListboxElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element form:listbox}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  FormListboxElement}
	 *
     * @param formIdAttributeValue  The mandatory attribute {@odf.attribute  form:id}"
     * @param xmlIdAttributeValue  The mandatory attribute {@odf.attribute  xml:id}"
     *
	 */
	public void init(String formIdAttributeValue, String xmlIdAttributeValue)
	{
		setFormIdAttribute( formIdAttributeValue );
		setXmlIdAttribute( xmlIdAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormNameAttribute</code> , See {@odf.attribute form:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormNameAttribute()
	{
		FormNameAttribute attr = (FormNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormNameAttribute</code> , See {@odf.attribute form:name}
	 *
	 * @param formNameValue   The type is <code>String</code>
	 */
	public void setFormNameAttribute( String formNameValue )
	{
		FormNameAttribute attr =  new FormNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormControlImplementationAttribute</code> , See {@odf.attribute form:control-implementation}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormControlImplementationAttribute()
	{
		FormControlImplementationAttribute attr = (FormControlImplementationAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "control-implementation" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormControlImplementationAttribute</code> , See {@odf.attribute form:control-implementation}
	 *
	 * @param formControlImplementationValue   The type is <code>String</code>
	 */
	public void setFormControlImplementationAttribute( String formControlImplementationValue )
	{
		FormControlImplementationAttribute attr =  new FormControlImplementationAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formControlImplementationValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormIdAttribute</code> , See {@odf.attribute form:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormIdAttribute()
	{
		FormIdAttribute attr = (FormIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormIdAttribute</code> , See {@odf.attribute form:id}
	 *
	 * @param formIdValue   The type is <code>String</code>
	 */
	public void setFormIdAttribute( String formIdValue )
	{
		FormIdAttribute attr =  new FormIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXmlIdAttribute()
	{
		XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XML), "id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @param xmlIdValue   The type is <code>String</code>
	 */
	public void setXmlIdAttribute( String xmlIdValue )
	{
		XmlIdAttribute attr =  new XmlIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xmlIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>XformsBindAttribute</code> , See {@odf.attribute xforms:bind}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXformsBindAttribute()
	{
		XformsBindAttribute attr = (XformsBindAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.XFORMS), "bind" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>XformsBindAttribute</code> , See {@odf.attribute xforms:bind}
	 *
	 * @param xformsBindValue   The type is <code>String</code>
	 */
	public void setXformsBindAttribute( String xformsBindValue )
	{
		XformsBindAttribute attr =  new XformsBindAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( xformsBindValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormDisabledAttribute</code> , See {@odf.attribute form:disabled}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormDisabledAttribute()
	{
		FormDisabledAttribute attr = (FormDisabledAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "disabled" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( FormDisabledAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormDisabledAttribute</code> , See {@odf.attribute form:disabled}
	 *
	 * @param formDisabledValue   The type is <code>Boolean</code>
	 */
	public void setFormDisabledAttribute( Boolean formDisabledValue )
	{
		FormDisabledAttribute attr =  new FormDisabledAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( formDisabledValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormDropdownAttribute</code> , See {@odf.attribute form:dropdown}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormDropdownAttribute()
	{
		FormDropdownAttribute attr = (FormDropdownAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "dropdown" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( FormDropdownAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormDropdownAttribute</code> , See {@odf.attribute form:dropdown}
	 *
	 * @param formDropdownValue   The type is <code>Boolean</code>
	 */
	public void setFormDropdownAttribute( Boolean formDropdownValue )
	{
		FormDropdownAttribute attr =  new FormDropdownAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( formDropdownValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormPrintableAttribute</code> , See {@odf.attribute form:printable}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormPrintableAttribute()
	{
		FormPrintableAttribute attr = (FormPrintableAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "printable" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( FormPrintableAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormPrintableAttribute</code> , See {@odf.attribute form:printable}
	 *
	 * @param formPrintableValue   The type is <code>Boolean</code>
	 */
	public void setFormPrintableAttribute( Boolean formPrintableValue )
	{
		FormPrintableAttribute attr =  new FormPrintableAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( formPrintableValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormSizeAttribute</code> , See {@odf.attribute form:size}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getFormSizeAttribute()
	{
		FormSizeAttribute attr = (FormSizeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "size" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormSizeAttribute</code> , See {@odf.attribute form:size}
	 *
	 * @param formSizeValue   The type is <code>Integer</code>
	 */
	public void setFormSizeAttribute( Integer formSizeValue )
	{
		FormSizeAttribute attr =  new FormSizeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( formSizeValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormTabIndexAttribute</code> , See {@odf.attribute form:tab-index}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getFormTabIndexAttribute()
	{
		FormTabIndexAttribute attr = (FormTabIndexAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "tab-index" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return Integer.valueOf( FormTabIndexAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormTabIndexAttribute</code> , See {@odf.attribute form:tab-index}
	 *
	 * @param formTabIndexValue   The type is <code>Integer</code>
	 */
	public void setFormTabIndexAttribute( Integer formTabIndexValue )
	{
		FormTabIndexAttribute attr =  new FormTabIndexAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( formTabIndexValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormTabStopAttribute</code> , See {@odf.attribute form:tab-stop}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormTabStopAttribute()
	{
		FormTabStopAttribute attr = (FormTabStopAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "tab-stop" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( FormTabStopAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormTabStopAttribute</code> , See {@odf.attribute form:tab-stop}
	 *
	 * @param formTabStopValue   The type is <code>Boolean</code>
	 */
	public void setFormTabStopAttribute( Boolean formTabStopValue )
	{
		FormTabStopAttribute attr =  new FormTabStopAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( formTabStopValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormTitleAttribute</code> , See {@odf.attribute form:title}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormTitleAttribute()
	{
		FormTitleAttribute attr = (FormTitleAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "title" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormTitleAttribute</code> , See {@odf.attribute form:title}
	 *
	 * @param formTitleValue   The type is <code>String</code>
	 */
	public void setFormTitleAttribute( String formTitleValue )
	{
		FormTitleAttribute attr =  new FormTitleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formTitleValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormBoundColumnAttribute</code> , See {@odf.attribute form:bound-column}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormBoundColumnAttribute()
	{
		FormBoundColumnAttribute attr = (FormBoundColumnAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "bound-column" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormBoundColumnAttribute</code> , See {@odf.attribute form:bound-column}
	 *
	 * @param formBoundColumnValue   The type is <code>String</code>
	 */
	public void setFormBoundColumnAttribute( String formBoundColumnValue )
	{
		FormBoundColumnAttribute attr =  new FormBoundColumnAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formBoundColumnValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormDataFieldAttribute</code> , See {@odf.attribute form:data-field}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormDataFieldAttribute()
	{
		FormDataFieldAttribute attr = (FormDataFieldAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "data-field" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormDataFieldAttribute</code> , See {@odf.attribute form:data-field}
	 *
	 * @param formDataFieldValue   The type is <code>String</code>
	 */
	public void setFormDataFieldAttribute( String formDataFieldValue )
	{
		FormDataFieldAttribute attr =  new FormDataFieldAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formDataFieldValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormListSourceAttribute</code> , See {@odf.attribute form:list-source}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormListSourceAttribute()
	{
		FormListSourceAttribute attr = (FormListSourceAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "list-source" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormListSourceAttribute</code> , See {@odf.attribute form:list-source}
	 *
	 * @param formListSourceValue   The type is <code>String</code>
	 */
	public void setFormListSourceAttribute( String formListSourceValue )
	{
		FormListSourceAttribute attr =  new FormListSourceAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formListSourceValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormListSourceTypeAttribute</code> , See {@odf.attribute form:list-source-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormListSourceTypeAttribute()
	{
		FormListSourceTypeAttribute attr = (FormListSourceTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "list-source-type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormListSourceTypeAttribute</code> , See {@odf.attribute form:list-source-type}
	 *
	 * @param formListSourceTypeValue   The type is <code>String</code>
	 */
	public void setFormListSourceTypeAttribute( String formListSourceTypeValue )
	{
		FormListSourceTypeAttribute attr =  new FormListSourceTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formListSourceTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormLinkedCellAttribute</code> , See {@odf.attribute form:linked-cell}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormLinkedCellAttribute()
	{
		FormLinkedCellAttribute attr = (FormLinkedCellAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "linked-cell" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormLinkedCellAttribute</code> , See {@odf.attribute form:linked-cell}
	 *
	 * @param formLinkedCellValue   The type is <code>String</code>
	 */
	public void setFormLinkedCellAttribute( String formLinkedCellValue )
	{
		FormLinkedCellAttribute attr =  new FormLinkedCellAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formLinkedCellValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormListLinkageTypeAttribute</code> , See {@odf.attribute form:list-linkage-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormListLinkageTypeAttribute()
	{
		FormListLinkageTypeAttribute attr = (FormListLinkageTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "list-linkage-type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormListLinkageTypeAttribute</code> , See {@odf.attribute form:list-linkage-type}
	 *
	 * @param formListLinkageTypeValue   The type is <code>String</code>
	 */
	public void setFormListLinkageTypeAttribute( String formListLinkageTypeValue )
	{
		FormListLinkageTypeAttribute attr =  new FormListLinkageTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formListLinkageTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormSourceCellRangeAttribute</code> , See {@odf.attribute form:source-cell-range}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormSourceCellRangeAttribute()
	{
		FormSourceCellRangeAttribute attr = (FormSourceCellRangeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "source-cell-range" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormSourceCellRangeAttribute</code> , See {@odf.attribute form:source-cell-range}
	 *
	 * @param formSourceCellRangeValue   The type is <code>String</code>
	 */
	public void setFormSourceCellRangeAttribute( String formSourceCellRangeValue )
	{
		FormSourceCellRangeAttribute attr =  new FormSourceCellRangeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formSourceCellRangeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormMultipleAttribute</code> , See {@odf.attribute form:multiple}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getFormMultipleAttribute()
	{
		FormMultipleAttribute attr = (FormMultipleAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "multiple" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( FormMultipleAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormMultipleAttribute</code> , See {@odf.attribute form:multiple}
	 *
	 * @param formMultipleValue   The type is <code>Boolean</code>
	 */
	public void setFormMultipleAttribute( Boolean formMultipleValue )
	{
		FormMultipleAttribute attr =  new FormMultipleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( formMultipleValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>FormXformsListSourceAttribute</code> , See {@odf.attribute form:xforms-list-source}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getFormXformsListSourceAttribute()
	{
		FormXformsListSourceAttribute attr = (FormXformsListSourceAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.FORM), "xforms-list-source" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>FormXformsListSourceAttribute</code> , See {@odf.attribute form:xforms-list-source}
	 *
	 * @param formXformsListSourceValue   The type is <code>String</code>
	 */
	public void setFormXformsListSourceAttribute( String formXformsListSourceValue )
	{
		FormXformsListSourceAttribute attr =  new FormXformsListSourceAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( formXformsListSourceValue );
	}

	/**
	 * Create child element {@odf.element form:properties}.
	 *
	 * @return   return  the element {@odf.element form:properties}
	 * DifferentQName 
	 */
	public FormPropertiesElement newFormPropertiesElement()
	{
		FormPropertiesElement  formProperties = ((OdfFileDom)this.ownerDocument).newOdfElement(FormPropertiesElement.class);
		this.appendChild( formProperties);
		return  formProperties;
	}                   
               
	/**
	 * Create child element {@odf.element office:event-listeners}.
	 *
	 * @return   return  the element {@odf.element office:event-listeners}
	 * DifferentQName 
	 */
	public OfficeEventListenersElement newOfficeEventListenersElement()
	{
		OfficeEventListenersElement  officeEventListeners = ((OdfFileDom)this.ownerDocument).newOdfElement(OfficeEventListenersElement.class);
		this.appendChild( officeEventListeners);
		return  officeEventListeners;
	}                   
               
	/**
	 * Create child element {@odf.element form:option}.
	 *
	 * @return   return  the element {@odf.element form:option}
	 * DifferentQName 
	 */
	public FormOptionElement newFormOptionElement()
	{
		FormOptionElement  formOption = ((OdfFileDom)this.ownerDocument).newOdfElement(FormOptionElement.class);
		this.appendChild( formOption);
		return  formOption;
	}                   
               
}
