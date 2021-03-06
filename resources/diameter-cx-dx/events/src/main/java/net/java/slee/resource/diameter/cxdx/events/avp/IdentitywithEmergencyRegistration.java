/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package net.java.slee.resource.diameter.cxdx.events.avp;

import net.java.slee.resource.diameter.base.events.avp.GroupedAvp;

/**
 * 3GPP TS 29.229 version 12.7.0 Release 12
 * 
 * Defines an interface representing the Active-APN grouped AVP type.
 * From the Diameter S6a Reference Point Protocol Details (3GPP TS 29.272 V12.7.0) specification:
 * 
 * <pre>
 * 6.3.57 Identity-with-Emergency-Registration AVP
 *
 * The Identity-with-Emergency-Registration AVP is of type Grouped and it contains a pair of private/public user
 * identities which are emergency registered.
 *
 * AVP format
 * Identity-with-Emergency-Registration ::= < AVP header: 651, 10415 >
 *                                          { User-Name }
 *                                          { Public-Identity }
 *                                          *[ AVP ]
 * </pre>
 * 
 *
 */
public interface IdentitywithEmergencyRegistration extends GroupedAvp {

  /**
   * Returns true if the User-Name AVP is present in the message.
   * 
   * @return true if the User-Name AVP is present in the message, false otherwise
   */
  public boolean hasUserName();

  /**
   * Returns the value of the User-Name AVP, of type UTF8String
   * 
   * @return the value of the User-Name AVP or null if it has not been set on this message
   */
  public String getUserName();

  /**
   * Sets the value of the User-Name AVP, of type UTF8String.
   * 
   * @param userName
   */
  public void setUserName(String userName);

  /**
   * Returns true if the Public-Identity AVP is present in the message.
   * 
   * @return true if the Public-Identity AVP is present in the message, false otherwise
   */
  public boolean hasPublicIdentity();

  /**
   * Returns the value of the Public-Identity AVP, of type UTF8String.
   * 
   * @return the value of the Public-Identity AVP or null if it has not been set on this message
   */
  public String getPublicIdentity();

  /**
   * Sets the value of the Public-Identity AVP, of type UTF8String.
   * 
   * @param publicIdentity
   */
  public void setPublicIdentity(String publicIdentity);
}