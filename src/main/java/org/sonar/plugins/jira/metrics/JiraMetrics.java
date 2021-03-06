/*
 * Sonar, open source software quality management tool.
 * Copyright (C) 2009 SonarSource
 * mailto:contact AT sonarsource DOT com
 *
 * Sonar is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Sonar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Sonar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */

package org.sonar.plugins.jira.metrics;

import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;

import java.util.Arrays;
import java.util.List;

public final class JiraMetrics implements Metrics {
    public static final String ISSUES_DOMAIN = "Issues";

    public static final String ISSUES_KEY = "issues";
    public static final Metric ISSUES = new Metric.Builder(ISSUES_KEY, "JIRA Issues", Metric.ValueType.INT)
            .setDescription("Number of JIRA Issues")
            .setDirection(Metric.DIRECTION_NONE)
            .setQualitative(false)
            .setDomain(ISSUES_DOMAIN)
            .create();

    public List<Metric> getMetrics() {
        return Arrays.asList(ISSUES);
    }

    public List<Metric> getMetrics2() {
        return Arrays.asList(ISSUES);
    }
    public List<Metric> getMetrics3() {
        return Arrays.asList(ISSUES);
    }
}
