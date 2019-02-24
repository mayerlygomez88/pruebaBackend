/**
 * RegistroWSDLSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package registro.com.RegistroWSDL;

public class RegistroWSDLSOAPSkeleton implements registro.com.RegistroWSDL.RegistroWSDL_PortType, org.apache.axis.wsdl.Skeleton {
    private registro.com.RegistroWSDL.RegistroWSDL_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "RegistroRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", ">RegistroRequest"), registro.com.RegistroWSDL.RegistroRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("registro", _params, new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", "RegistroResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://com.registro/RegistroWSDL/", ">RegistroResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "Registro"));
        _oper.setSoapAction("http://localhost:8080/RegistroWSDL/Registro");
        _myOperationsList.add(_oper);
        if (_myOperations.get("registro") == null) {
            _myOperations.put("registro", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("registro")).add(_oper);
    }

    public RegistroWSDLSOAPSkeleton() {
        this.impl = new registro.com.RegistroWSDL.RegistroWSDLSOAPImpl();
    }

    public RegistroWSDLSOAPSkeleton(registro.com.RegistroWSDL.RegistroWSDL_PortType impl) {
        this.impl = impl;
    }
    public registro.com.RegistroWSDL.RegistroResponse registro(registro.com.RegistroWSDL.RegistroRequest parameters) throws java.rmi.RemoteException
    {
        registro.com.RegistroWSDL.RegistroResponse ret = impl.registro(parameters);
        return ret;
    }

}
