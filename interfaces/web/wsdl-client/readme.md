Web Service Client
------------------

The Web Service Client can be used to test operations of a SOAP Web Service.
It analyzes the WSDL file of the Web Service and presents the operations and 
the respective input fields to the user. Depending on the type of an input,
the user is presented either a simple text input field, or a file upload field.
The inserted values are sent to the Web Service and the resulting SOAP message
is displayed. If there are any attached files (for example a converted image) in
the returned message, those files can be downloaded via generated links.
	
**WS-Client for IMPACT**

WS-Client is developed mainly to test the Web Services that wrap software tools
implemented in the context of the IMPACT project. On the start page, a list of
already functioning tools is displayed. This list is read from an XML configuration file.
Nevertheless, it is possible to test an arbitrary Web Service by entering a URL
to a WSDL file into the respective input field.
	
	
**Deployment**

To install the application locally, you have to get the source files, build them and deploy 
the resulting archive on a Java application server.
	
**Building the application**

The project is managed using Maven 2. Again, you can use an IDE to build the sources.
Alternatively, you can execute the following command in the project directory:
	
    mvn package
	
**Deploying the application**

Maven generates a WAR archive in the '*target*' directory. In Tomcat, you can deploy 
this archive using the Tomcat Manager application. Or, simply copy the archive into the '*webapp*' directory of your Tomcat installation and restart Tomcat.
	
**Configuration**

In the simplest case, you enter a URL to a WSDL and an input form for the service will be presented.

It is also possible to manage a predefined list of WSDLs in an XML file that must look like this example:

    <?xml version="1.0" encoding="UTF-8"?>
    <services>
        <service id="1">
    	    <title>IMPACT Gimp Image Conversion Service</title>
    	    <url>https://localhost/IMPACTGimpImageConversionProxy?wsdl</url>
    	    <description>Perform image format conversion operations .</description>
        </service>
	    <service id="2">
		    <title>IMPACT ImageMagick Image Conversion Service</title>
		    <url>https://localhost/IMPACTImageMagickProxy?wsdl</url>
		    <description>Perform image conversion operations.</description>
	    </service>
    </services>
	
The URL pointing to such a file has to be present in the file 

    main/webapp/config.properties
	

Furthermore, it is possible here to configure one specific web service which should be loaded automatically every time.