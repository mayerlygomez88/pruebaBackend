/**
 * RegistroRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package registro.com.RegistroWSDL;

public class RegistroRequest  implements java.io.Serializable {
    private java.lang.String canal;

    private java.lang.String codigotrs;

    private java.lang.String date;

    private java.lang.String idservice;

    private java.lang.String vrs;

    private java.lang.String date2;

    private java.lang.String name;

    private java.lang.String password;

    private java.lang.String email;

    private java.lang.String rol;

    public RegistroRequest() {
    }

    public RegistroRequest(
           java.lang.String canal,
           java.lang.String codigotrs,
           java.lang.String date,
           java.lang.String idservice,
           java.lang.String vrs,
           java.lang.String date2,
           java.lang.String name,
           java.lang.String password,
           java.lang.String email,
           java.lang.String rol) {
           this.canal = canal;
           this.codigotrs = codigotrs;
           this.date = date;
           this.idservice = idservice;
           this.vrs = vrs;
           this.date2 = date2;
           this.name = name;
           this.password = password;
           this.email = email;
           this.rol = rol;
    }


    /**
     * Gets the canal value for this RegistroRequest.
     * 
     * @return canal
     */
    public java.lang.String getCanal() {
        return canal;
    }


    /**
     * Sets the canal value for this RegistroRequest.
     * 
     * @param canal
     */
    public void setCanal(java.lang.String canal) {
        this.canal = canal;
    }


    /**
     * Gets the codigotrs value for this RegistroRequest.
     * 
     * @return codigotrs
     */
    public java.lang.String getCodigotrs() {
        return codigotrs;
    }


    /**
     * Sets the codigotrs value for this RegistroRequest.
     * 
     * @param codigotrs
     */
    public void setCodigotrs(java.lang.String codigotrs) {
        this.codigotrs = codigotrs;
    }


    /**
     * Gets the date value for this RegistroRequest.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this RegistroRequest.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the idservice value for this RegistroRequest.
     * 
     * @return idservice
     */
    public java.lang.String getIdservice() {
        return idservice;
    }


    /**
     * Sets the idservice value for this RegistroRequest.
     * 
     * @param idservice
     */
    public void setIdservice(java.lang.String idservice) {
        this.idservice = idservice;
    }


    /**
     * Gets the vrs value for this RegistroRequest.
     * 
     * @return vrs
     */
    public java.lang.String getVrs() {
        return vrs;
    }


    /**
     * Sets the vrs value for this RegistroRequest.
     * 
     * @param vrs
     */
    public void setVrs(java.lang.String vrs) {
        this.vrs = vrs;
    }


    /**
     * Gets the date2 value for this RegistroRequest.
     * 
     * @return date2
     */
    public java.lang.String getDate2() {
        return date2;
    }


    /**
     * Sets the date2 value for this RegistroRequest.
     * 
     * @param date2
     */
    public void setDate2(java.lang.String date2) {
        this.date2 = date2;
    }


    /**
     * Gets the name value for this RegistroRequest.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RegistroRequest.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the password value for this RegistroRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this RegistroRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the email value for this RegistroRequest.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this RegistroRequest.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the rol value for this RegistroRequest.
     * 
     * @return rol
     */
    public java.lang.String getRol() {
        return rol;
    }


    /**
     * Sets the rol value for this RegistroRequest.
     * 
     * @param rol
     */
    public void setRol(java.lang.String rol) {
        this.rol = rol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistroRequest)) return false;
        RegistroRequest other = (RegistroRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.canal==null && other.getCanal()==null) || 
             (this.canal!=null &&
              this.canal.equals(other.getCanal()))) &&
            ((this.codigotrs==null && other.getCodigotrs()==null) || 
             (this.codigotrs!=null &&
              this.codigotrs.equals(other.getCodigotrs()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.idservice==null && other.getIdservice()==null) || 
             (this.idservice!=null &&
              this.idservice.equals(other.getIdservice()))) &&
            ((this.vrs==null && other.getVrs()==null) || 
             (this.vrs!=null &&
              this.vrs.equals(other.getVrs()))) &&
            ((this.date2==null && other.getDate2()==null) || 
             (this.date2!=null &&
              this.date2.equals(other.getDate2()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.rol==null && other.getRol()==null) || 
             (this.rol!=null &&
              this.rol.equals(other.getRol())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCanal() != null) {
            _hashCode += getCanal().hashCode();
        }
        if (getCodigotrs() != null) {
            _hashCode += getCodigotrs().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getIdservice() != null) {
            _hashCode += getIdservice().hashCode();
        }
        if (getVrs() != null) {
            _hashCode += getVrs().hashCode();
        }
        if (getDate2() != null) {
            _hashCode += getDate2().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getRol() != null) {
            _hashCode += getRol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistroRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", ">RegistroRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "canal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigotrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "codigotrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idservice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "idservice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vrs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "vrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "rol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
