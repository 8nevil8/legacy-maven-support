/*******************************************************************************
 *
 * Copyright (c) 2004-2010 Oracle Corporation.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     
 *
 *******************************************************************************/ 

package org.jvnet.hudson.maven3.listeners;


import org.apache.maven.execution.MavenExecutionResult;

/**
 * Exists solely for backward compatibility
 * @author Winston Prakash
 * @see org.eclipse.hudson.legacy.maven3.interceptor.listeners.HudsonMavenExecutionResult
 */
public class HudsonMavenExecutionResult
		extends
		org.eclipse.hudson.legacy.maven3.interceptor.listeners.HudsonMavenExecutionResult {

	public static final long serialVersionUID = -2236073185655598257L;

	public HudsonMavenExecutionResult(MavenExecutionResult mavenExecutionResult) {
		super(mavenExecutionResult);
	}
}
