/*
 *  Copyright 2017 TWO SIGMA OPEN SOURCE, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.twosigma.beakerx.groovy.evaluator.autocomplete;

import com.twosigma.beakerx.autocomplete.JVMEvaluatorAutocompleteImportTest;
import com.twosigma.beakerx.evaluator.BaseEvaluator;
import com.twosigma.beakerx.groovy.TestGroovyEvaluator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class GroovyEvaluatorAutocompleteImportTest extends JVMEvaluatorAutocompleteImportTest {

  private static BaseEvaluator groovyEvaluator;

  @BeforeClass
  public static void setUpClass() throws Exception {
    groovyEvaluator = TestGroovyEvaluator.groovyEvaluator();
  }

  @AfterClass
  public static void tearDown() throws Exception {
    groovyEvaluator.exit();
  }

  @Override
  protected BaseEvaluator evaluator() {
    return groovyEvaluator;
  }
}
