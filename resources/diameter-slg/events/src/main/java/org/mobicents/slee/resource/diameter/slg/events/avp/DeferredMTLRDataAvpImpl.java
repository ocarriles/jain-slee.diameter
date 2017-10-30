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
import net.java.slee.resource.diameter.slg.events.avp.EPCLocationProtocolAVPCodes;
import net.java.slee.resource.diameter.slg.events.avp.ServingNodeAvp;
import org.mobicents.slee.resource.diameter.base.events.avp.GroupedAvpImpl;
import net.java.slee.resource.diameter.slg.events.avp.DeferredMTLRDataAvp;

/**
 * Implementation for {@link net.java.slee.resource.diameter.slg.events.avp.DeferredMTLRDataAvp}
 *
 * @author <a href="mailto:fernando.mendioroz@telestax.com"> Fernando Mendioroz </a>
 */
public class DeferredMTLRDataAvpImpl extends GroupedAvpImpl implements DeferredMTLRDataAvp {

  public DeferredMTLRDataAvpImpl() {
    super();
  }

  /**
   * @param code
   * @param vendorId
   * @param mnd
   * @param prt
   * @param value
   */
  public DeferredMTLRDataAvpImpl(int code, long vendorId, int mnd, int prt, byte[] value) {
    super(code, vendorId, mnd, prt, value);
  }

  public boolean hasDeferredLocationType() {
    return hasAvp(EPCLocationProtocolAVPCodes.DEFERRED_LOCATION_TYPE, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID);
  }

  public long getDeferredLocationType() {
    return getAvpAsUnsigned32(EPCLocationProtocolAVPCodes.DEFERRED_LOCATION_TYPE, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID);
  }

  public void setDeferredLocationType(long deferredLocationType) {
    addAvp(EPCLocationProtocolAVPCodes.DEFERRED_LOCATION_TYPE, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID, deferredLocationType);
  }

  public boolean hasTerminationCause() {
    return hasAvp(EPCLocationProtocolAVPCodes.TERMINATION_CAUSE, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID);
  }

  public long getTerminationCause() {
    return getAvpAsUnsigned32(EPCLocationProtocolAVPCodes.TERMINATION_CAUSE, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID);
  }

  public void setTerminationCause(long terminationCause) {
    addAvp(EPCLocationProtocolAVPCodes.TERMINATION_CAUSE, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID, terminationCause);
  }

  public boolean hasServingNode() {
    return hasAvp(EPCLocationProtocolAVPCodes.DEFERRED_MT_LR_DATA, EPCLocationProtocolAVPCodes.SERVING_NODE);
  }

  public ServingNodeAvp getServingNode() {
    return (ServingNodeAvp) getAvpAsCustom(EPCLocationProtocolAVPCodes.SERVING_NODE, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID, ServingNodeAvpImpl.class);
  }

  public void setServingNode(ServingNodeAvp servingNode) {
    addAvp(EPCLocationProtocolAVPCodes.SERVING_NODE, EPCLocationProtocolAVPCodes.SLg_VENDOR_ID, servingNode.byteArrayValue());
  }
}

