//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.0 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.05.12 时间 01:47:09 PM CST 
//


package com.benny.traveladvisor.timatic3.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>cliLoggerResponseUnit complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="cliLoggerResponseUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestSuccessful" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="requestFailureReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliLoggerResponseUnit", propOrder = {
    "requestSuccessful",
    "requestFailureReason"
})
public class CliLoggerResponseUnit {

    protected boolean requestSuccessful;
    protected String requestFailureReason;

    /**
     * 获取requestSuccessful属性的值。
     * 
     */
    public boolean isRequestSuccessful() {
        return requestSuccessful;
    }

    /**
     * 设置requestSuccessful属性的值。
     * 
     */
    public void setRequestSuccessful(boolean value) {
        this.requestSuccessful = value;
    }

    /**
     * 获取requestFailureReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestFailureReason() {
        return requestFailureReason;
    }

    /**
     * 设置requestFailureReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestFailureReason(String value) {
        this.requestFailureReason = value;
    }

}
