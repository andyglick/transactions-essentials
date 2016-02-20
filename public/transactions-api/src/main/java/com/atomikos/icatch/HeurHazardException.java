/**
 * Copyright (C) 2000-2016 Atomikos <info@atomikos.com>
 *
 * LICENSE CONDITIONS
 *
 * See http://www.atomikos.com/Main/WhichLicenseApplies for details.
 */

package com.atomikos.icatch;

/**
 * Exception signaling that two-phase commit was not acknowledged by some
 * participants.
 */

public class HeurHazardException extends Exception {

	private static final long serialVersionUID = 1L;

	public HeurHazardException() {
		super("Heuristic Hazard Exception");
	}

}
