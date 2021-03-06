/*
 * JavaMoney Examples
 * Copyright 2012-2014, Werner Keil 
 * and individual contributors by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.javamoney.examples.console.simple;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.Money;


/**
 * @author Werner Keil
 * @version 0.8
 */
public class MoneyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Money amt1 = Money.of(10.1234556123456789, "USD");
		FastMoney amt2 = FastMoney.of(123456789, "USD");
		Money total = amt1.add(amt2);
		System.out.println(total);
	}

}
