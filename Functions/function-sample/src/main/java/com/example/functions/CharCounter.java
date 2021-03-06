/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.functions;

import java.util.function.Function;

/*
 * 
 * POST a localhost:8080/charCounter
 *
 * Payload

 Eugenio Garcia

 *
 *Tambien funciona con 
 *
 *GET localhost:8080/charCounter/Eugenio Garcia
 *
 */
public class CharCounter implements Function<String, Integer> {

	@Override
	public Integer apply(String word) {
		return word.length();
	}

}
