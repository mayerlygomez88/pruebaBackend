/**
 * RegistroWSDL_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package registro.com.RegistroWSDL;

public class RegistroWSDL_ServiceLocator extends org.apache.axis.client.Service implements registro.com.RegistroWSDL.RegistroWSDL_Service {

    public RegistroWSDL_ServiceLocator() {
    }


    public RegistroWSDL_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RegistroWSDL_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RegistroWSDLSOAP
    private java.lang.String RegistroWSDLSOAP_address = "http://localhost:8080/RegistroWSDL/Registro/";

    public java.lang.String getRegistroWSDLSOAPAddress() {
        return RegistroWSDLSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RegistroWSDLSOAPWSDDServiceName = "RegistroWSDLSOAP";

    public java.lang.String getRegistroWSDLSOAPWSDDServiceName() {
        return RegistroWSDLSOAPWSDDServiceName;
    }

    public void setRegistroWSDLSOAPWSDDServiceName(java.lang.String name) {
        RegistroWSDLSOAPWSDDServiceName = name;
    }

    public registro.com.RegistroWSDL.RegistroWSDL_PortType getRegistroWSDLSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RegistroWSDLSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRegistroWSDLSOAP(endpoint);
    }

    public registro.com.RegistroWSDL.RegistroWSDL_PortType getRegistroWSDLSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            registro.com.RegistroWSDL.RegistroWSDLSOAPStub _stub = new registro.com.RegistroWSDL.RegistroWSDLSOAPStub(portAddress, this);
            _stub.setPortName(getRegistroWSDLSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRegistroWSDLSOAPEndpointAddress(java.lang.String address) {
        RegistroWSDLSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (registro.com.RegistroWSDL.RegistroWSDL_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                registro.com.RegistroWSDL.RegistroWSDLSOAPStub _stub = new registro.com.RegistroWSDL.RegistroWSDLSOAPStub(new java.net.URL(RegistroWSDLSOAP_address), this);
                _stub.setPortName(getRegistroWSDLSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RegistroWSDLSOAP".equals(inputPortName)) {
            return getRegistroWSDLSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "RegistroWSDL");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "RegistroWSDLSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RegistroWSDLSOAP".equals(portName)) {
            setRegistroWSDLSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
