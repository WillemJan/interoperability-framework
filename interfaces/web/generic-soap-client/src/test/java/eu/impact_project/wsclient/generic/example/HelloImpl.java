/*
	
	Copyright 2011 The IMPACT Project
	
	@author Dennis Neumann

	Licensed under the Apache License, Version 2.0 (the "License"); 
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
 
  		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.

*/
package eu.impact_project.wsclient.generic.example;

import javax.jws.WebService;
import org.bouncycastle.util.encoders.Base64;



	@WebService(endpointInterface = "eu.impact_project.wsclient.generic.example.Hello",
            serviceName = "Hello")
public class HelloImpl implements Hello {
 
    public String sayHi(HelloRequest text, byte[] bytes) {
    	String decoded = new String(bytes);
        return "Hello " + text.getText() + " " + decoded;
    }

}
