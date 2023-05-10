//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.12 at 05:39:49 nachm. MEZ 
//


package de.fhg.iais.roberta.blockly.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for block complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="block">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mutation" type="{http://de.fhg.iais.roberta.blockly}mutation" minOccurs="0"/>
 *         &lt;element name="field" type="{http://de.fhg.iais.roberta.blockly}field" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="repetitions" type="{http://de.fhg.iais.roberta.blockly}repetitions" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://de.fhg.iais.roberta.blockly}comment" minOccurs="0"/>
 *         &lt;element name="error" type="{http://de.fhg.iais.roberta.blockly}error" minOccurs="0"/>
 *         &lt;element name="warning" type="{http://de.fhg.iais.roberta.blockly}warning" minOccurs="0"/>
 *         &lt;element name="data" type="{http://de.fhg.iais.roberta.blockly}data" minOccurs="0"/>
 *         &lt;element name="hide" type="{http://de.fhg.iais.roberta.blockly}hide" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="value" type="{http://de.fhg.iais.roberta.blockly}value" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statement" type="{http://de.fhg.iais.roberta.blockly}statement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inline" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="collapsed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="intask" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="deletable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="movable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="shadow" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="editable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="error_attribute" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "block", propOrder = {
    "mutation",
    "field",
    "repetitions",
    "comment",
    "error",
    "warning",
    "data",
    "hide",
    "value",
    "statement"
})
public class Block {

    protected Mutation mutation;
    protected List<Field> field;
    protected Repetitions repetitions;
    protected Comment comment;
    protected Error error;
    protected Warning warning;
    protected Data data;
    protected List<Hide> hide;
    protected List<Value> value;
    protected List<Statement> statement;
    @XmlAttribute(name = "x")
    protected String x;
    @XmlAttribute(name = "y")
    protected String y;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "inline")
    protected Boolean inline;
    @XmlAttribute(name = "collapsed")
    protected Boolean collapsed;
    @XmlAttribute(name = "disabled")
    protected Boolean disabled;
    @XmlAttribute(name = "intask")
    protected Boolean intask;
    @XmlAttribute(name = "deletable")
    protected Boolean deletable;
    @XmlAttribute(name = "movable")
    protected Boolean movable;
    @XmlAttribute(name = "shadow")
    protected Boolean shadow;
    @XmlAttribute(name = "editable")
    protected Boolean editable;
    @XmlAttribute(name = "error_attribute")
    protected Boolean errorAttribute;

    /**
     * Gets the value of the mutation property.
     * 
     * @return
     *     possible object is
     *     {@link Mutation }
     *     
     */
    public Mutation getMutation() {
        return mutation;
    }

    /**
     * Sets the value of the mutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mutation }
     *     
     */
    public void setMutation(Mutation value) {
        this.mutation = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Field }
     * 
     * 
     */
    public List<Field> getField() {
        if (field == null) {
            field = new ArrayList<Field>();
        }
        return this.field;
    }

    /**
     * Gets the value of the repetitions property.
     * 
     * @return
     *     possible object is
     *     {@link Repetitions }
     *     
     */
    public Repetitions getRepetitions() {
        return repetitions;
    }

    /**
     * Sets the value of the repetitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Repetitions }
     *     
     */
    public void setRepetitions(Repetitions value) {
        this.repetitions = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link Warning }
     *     
     */
    public Warning getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warning }
     *     
     */
    public void setWarning(Warning value) {
        this.warning = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    public Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    public void setData(Data value) {
        this.data = value;
    }

    /**
     * Gets the value of the hide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hide }
     * 
     * 
     */
    public List<Hide> getHide() {
        if (hide == null) {
            hide = new ArrayList<Hide>();
        }
        return this.hide;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Value }
     * 
     * 
     */
    public List<Value> getValue() {
        if (value == null) {
            value = new ArrayList<Value>();
        }
        return this.value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Statement }
     * 
     * 
     */
    public List<Statement> getStatement() {
        if (statement == null) {
            statement = new ArrayList<Statement>();
        }
        return this.statement;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY(String value) {
        this.y = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the inline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInline() {
        return inline;
    }

    /**
     * Sets the value of the inline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInline(Boolean value) {
        this.inline = value;
    }

    /**
     * Gets the value of the collapsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollapsed() {
        return collapsed;
    }

    /**
     * Sets the value of the collapsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollapsed(Boolean value) {
        this.collapsed = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the intask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntask() {
        return intask;
    }

    /**
     * Sets the value of the intask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntask(Boolean value) {
        this.intask = value;
    }

    /**
     * Gets the value of the deletable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeletable() {
        return deletable;
    }

    /**
     * Sets the value of the deletable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeletable(Boolean value) {
        this.deletable = value;
    }

    /**
     * Gets the value of the movable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMovable() {
        return movable;
    }

    /**
     * Sets the value of the movable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMovable(Boolean value) {
        this.movable = value;
    }

    /**
     * Gets the value of the shadow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShadow() {
        return shadow;
    }

    /**
     * Sets the value of the shadow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShadow(Boolean value) {
        this.shadow = value;
    }

    /**
     * Gets the value of the editable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditable(Boolean value) {
        this.editable = value;
    }

    /**
     * Gets the value of the errorAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErrorAttribute() {
        return errorAttribute;
    }

    /**
     * Sets the value of the errorAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorAttribute(Boolean value) {
        this.errorAttribute = value;
    }

}
