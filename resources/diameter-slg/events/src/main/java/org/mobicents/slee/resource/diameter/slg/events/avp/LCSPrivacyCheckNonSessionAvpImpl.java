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

package org.mobicents.slee.resource.diameter.slg.events.avp;

import net.java.slee.resource.diameter.slg.events.avp.EPCLocationProtocolAVPCodes;
import net.java.slee.resource.diameter.slg.events.avp.LCSPrivacyCheck;
import org.mobicents.slee.resource.diameter.base.events.avp.GroupedAvpImpl;
import net.java.slee.resource.diameter.slg.events.avp.LCSPrivacyCheckNonSessionAvp;

/**
 * Implementation for {@link net.java.slee.resource.diameter.slg.events.avp.LCSPrivacyCheckNonSessionAvp}
 *
 * @author <a href="mailto:fernando.mendioroz@telestax.com"> Fernando Mendioroz </a>
 */
public class LCSPrivacyCheckNonSessionAvpImpl extends GroupedAvpImpl implements LCSPrivacyCheckNonSessionAvp {

  public LCSPrivacyCheckNonSessionAvpImpl() {
    super();
  }

  /**
   * @param code
   * @param vendorId
   * @param mnd
   * @param prt
   * @param value
   */
  public LCSPrivacyCheckNonSessionAvpImpl(int code, long vendorId, int mnd, int prt, byte[] value) {
    super(code, vendorId, mnd, prt, value);
  }

  public boolean hasLCSPrivacyCheck() {
    return hasAvp(EPCLocationProtocolAVPCodes.LCS_PRIVACY_CHECK, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID);
  }

  public LCSPrivacyCheck getLCSPrivacyCheck() {
    return (LCSPrivacyCheck) getAvpAsEnumerated(EPCLocationProtocolAVPCodes.LCS_PRIVACY_CHECK, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID, LCSPrivacyCheck.class);
  }

  public void setLCSPrivacyCheck(LCSPrivacyCheck lcsPrivacyCheck) {
    addAvp(EPCLocationProtocolAVPCodes.LCS_PRIVACY_CHECK, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID, lcsPrivacyCheck);
  }

}
