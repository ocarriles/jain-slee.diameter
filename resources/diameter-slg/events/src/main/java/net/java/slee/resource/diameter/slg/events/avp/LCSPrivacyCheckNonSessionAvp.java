/*
 *
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2017, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 */

package net.java.slee.resource.diameter.slg.events.avp;

import net.java.slee.resource.diameter.base.events.avp.GroupedAvp;

/**
 * Defines an interface representing the LCS-Privacy-Check-Non-Session AVP type.
 * From the Diameter-based ELP SLg interface for Control Plane LCS (3GPP TS 29.172 V13.0.0) specification.
 *
 * <pre>
 * 7.4.23		LCS-Privacy-Check-Non-Session
 * 	The LCS-Privacy-Check-Non-Session AVP is of type Grouped.
 *
 * 	AVP format:
 * 							LLCS-Privacy-Check-Non-Session ::= <AVP header: 2521 10415>
 * 																					{ LCS-Privacy-Check }
 * </pre>
 *
 * @author <a href="mailto:fernando.mendioroz@telestax.com"> Fernando Mendioroz </a>
 */
public interface LCSPrivacyCheckNonSessionAvp extends GroupedAvp {

  /*
    From 3GPP TS 29.172 V13.0.0

		The LCS-Privacy-Check AVP is of type Enumerated. The following values are defined:
			ALLOWED_WITHOUT_NOTIFICATION (0)
			ALLOWED_WITH_NOTIFICATION (1)
			ALLOWED_IF_NO_RESPONSE (2)
			RESTRICTED_IF_NO_RESPONSE (3)
			NOT_ALLOWED (4)
		Default value if AVP is not present is: ALLOWED_WITHOUT_NOTIFICATION (0).
  */
  public boolean hasLCSPrivacyCheck();
  public LCSPrivacyCheck getLCSPrivacyCheck();
  public void setLCSPrivacyCheck(LCSPrivacyCheck lcsPrivacyCheck);

}
