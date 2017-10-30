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

import net.java.slee.resource.diameter.base.events.avp.Enumerated;
import net.java.slee.resource.diameter.slg.events.avp.AreaAvp;
import net.java.slee.resource.diameter.slg.events.avp.EPCLocationProtocolAVPCodes;
import org.mobicents.slee.resource.diameter.base.events.avp.GroupedAvpImpl;
import net.java.slee.resource.diameter.slg.events.avp.AreaDefinitionAvp;

/**
 * Implementation for {@link net.java.slee.resource.diameter.slg.events.avp.AreaDefinitionAvp}
 *
 * @author <a href="mailto:fernando.mendioroz@telestax.com"> Fernando Mendioroz </a>
 */
public class AreaDefinitionAvpImpl extends GroupedAvpImpl implements AreaDefinitionAvp {

  public AreaDefinitionAvpImpl() {
    super();
  }

  /**
   * @param code
   * @param vendorId
   * @param mnd
   * @param prt
   * @param value
   */
  public AreaDefinitionAvpImpl(int code, long vendorId, int mnd, int prt, byte[] value) {
    super(code, vendorId, mnd, prt, value);
  }

  public boolean hasArea() {
    return hasAvp(EPCLocationProtocolAVPCodes.AREA, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID);
  }

  public AreaAvp getArea(){
    return (AreaAvp) getAvpAsCustom(EPCLocationProtocolAVPCodes.AREA, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID, AreaAvpImpl.class);
  }

  public void setArea(AreaAvp area){
    addAvp(EPCLocationProtocolAVPCodes.AREA, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID, area);
  }

}
