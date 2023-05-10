//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.12 at 05:39:49 nachm. MEZ 
//


package de.fhg.iais.roberta.blockly.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mutation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mutation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg" type="{http://de.fhg.iais.roberta.blockly}arg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="elseif" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="op" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="else" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="items" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="wait" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="at" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="at1" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="at2" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="statement" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="divisor_input" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="next" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="declare" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="input" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="datatype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="declaration_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="list_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="return_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operator_range" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="port" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="output_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="protocol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mutation", propOrder = {
    "arg"
})
public class Mutation {

    protected List<Arg> arg;
    @XmlAttribute(name = "elseif")
    protected BigInteger elseif;
    @XmlAttribute(name = "op")
    protected String op;
    @XmlAttribute(name = "else")
    protected BigInteger _else;
    @XmlAttribute(name = "value")
    protected BigInteger value;
    @XmlAttribute(name = "items")
    protected BigInteger items;
    @XmlAttribute(name = "wait")
    protected BigInteger wait;
    @XmlAttribute(name = "at")
    protected Boolean at;
    @XmlAttribute(name = "at1")
    protected Boolean at1;
    @XmlAttribute(name = "at2")
    protected Boolean at2;
    @XmlAttribute(name = "statement")
    protected Boolean statement;
    @XmlAttribute(name = "divisor_input")
    protected Boolean divisorInput;
    @XmlAttribute(name = "next")
    protected Boolean next;
    @XmlAttribute(name = "declare")
    protected Boolean declare;
    @XmlAttribute(name = "input")
    protected String input;
    @XmlAttribute(name = "datatype")
    protected String datatype;
    @XmlAttribute(name = "declaration_type")
    protected String declarationType;
    @XmlAttribute(name = "list_type")
    protected String listType;
    @XmlAttribute(name = "return_type")
    protected String returnType;
    @XmlAttribute(name = "operator_range")
    protected String operatorRange;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "port")
    protected String port;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "output_type")
    protected String outputType;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "protocol")
    protected String protocol;

    /**
     * Gets the value of the arg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Arg }
     * 
     * 
     */
    public List<Arg> getArg() {
        if (arg == null) {
            arg = new ArrayList<Arg>();
        }
        return this.arg;
    }

    /**
     * Gets the value of the elseif property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getElseif() {
        return elseif;
    }

    /**
     * Sets the value of the elseif property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setElseif(BigInteger value) {
        this.elseif = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOp(String value) {
        this.op = value;
    }

    /**
     * Gets the value of the else property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getElse() {
        return _else;
    }

    /**
     * Sets the value of the else property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setElse(BigInteger value) {
        this._else = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItems(BigInteger value) {
        this.items = value;
    }

    /**
     * Gets the value of the wait property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWait() {
        return wait;
    }

    /**
     * Sets the value of the wait property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWait(BigInteger value) {
        this.wait = value;
    }

    /**
     * Gets the value of the at property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAt() {
        return at;
    }

    /**
     * Sets the value of the at property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAt(Boolean value) {
        this.at = value;
    }

    /**
     * Gets the value of the at1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAt1() {
        return at1;
    }

    /**
     * Sets the value of the at1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAt1(Boolean value) {
        this.at1 = value;
    }

    /**
     * Gets the value of the at2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAt2() {
        return at2;
    }

    /**
     * Sets the value of the at2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAt2(Boolean value) {
        this.at2 = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatement(Boolean value) {
        this.statement = value;
    }

    /**
     * Gets the value of the divisorInput property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDivisorInput() {
        return divisorInput;
    }

    /**
     * Sets the value of the divisorInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDivisorInput(Boolean value) {
        this.divisorInput = value;
    }

    /**
     * Gets the value of the next property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNext() {
        return next;
    }

    /**
     * Sets the value of the next property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNext(Boolean value) {
        this.next = value;
    }

    /**
     * Gets the value of the declare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeclare() {
        return declare;
    }

    /**
     * Sets the value of the declare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeclare(Boolean value) {
        this.declare = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput(String value) {
        this.input = value;
    }

    /**
     * Gets the value of the datatype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatatype() {
        return datatype;
    }

    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatatype(String value) {
        this.datatype = value;
    }

    /**
     * Gets the value of the declarationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarationType() {
        return declarationType;
    }

    /**
     * Sets the value of the declarationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarationType(String value) {
        this.declarationType = value;
    }

    /**
     * Gets the value of the listType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListType() {
        return listType;
    }

    /**
     * Sets the value of the listType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListType(String value) {
        this.listType = value;
    }

    /**
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnType(String value) {
        this.returnType = value;
    }

    /**
     * Gets the value of the operatorRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorRange() {
        return operatorRange;
    }

    /**
     * Sets the value of the operatorRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorRange(String value) {
        this.operatorRange = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the outputType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputType() {
        return outputType;
    }

    /**
     * Sets the value of the outputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputType(String value) {
        this.outputType = value;
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
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

}
