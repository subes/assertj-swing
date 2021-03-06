/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2018 the original author or authors.
 */
package org.assertj.swing.format;

import static org.assertj.swing.test.builder.JTextFields.textField;

import org.assertj.swing.test.core.EDTSafeTestCase;
import org.junit.Test;

/**
 * Tests for {@link JOptionPaneFormatter#format(java.awt.Component)}.
 * 
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public class JOptionPaneFormatter_format_withInvalidInput_Test extends EDTSafeTestCase {
  @Test(expected = IllegalArgumentException.class)
  public void should_Throw_Error_If_Component_Is_Not_JOptionPane() {
    new JOptionPaneFormatter().format(textField().createNew());
  }
}
