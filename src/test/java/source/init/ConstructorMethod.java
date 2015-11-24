/* Copyright 2015 CINCHEO SAS
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package source.init;

public class ConstructorMethod {

	String s; 
	
	public ConstructorMethod(String s) {
		this.s = s;
	}

	void constructor(String s) {
	}
	
	public static void main(String[] args) {
		ConstructorMethod c = new ConstructorMethod("abc");
		c.constructor("abc");
	}

	
}