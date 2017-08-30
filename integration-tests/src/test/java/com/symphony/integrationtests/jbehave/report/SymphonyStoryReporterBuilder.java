/*
 * Copyright 2017 The Symphony Software Foundation
 *
 * Licensed to The Symphony Software Foundation (SSF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package com.symphony.integrationtests.jbehave.report;

import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.HTML;
import static org.jbehave.core.reporters.Format.XML;

import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.StoryReporterBuilder;

public class SymphonyStoryReporterBuilder extends StoryReporterBuilder {

  private CrossReference xref;

  public SymphonyStoryReporterBuilder() {
    withDefaultFormats();
    withCodeLocation(CodeLocations.codeLocationFromClass(this.getClass()));
    withFormats(CONSOLE, HTML, XML);
    withFailureTrace(true);
    withFailureTraceCompression(true);
    this.xref = new CrossReference();
    withCrossReference(xref);
  }

  public CrossReference getXref() {
    return xref;
  }
}
