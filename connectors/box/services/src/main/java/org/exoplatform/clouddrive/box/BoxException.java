/*
 * Copyright (C) 2012 eXo Platform SAS.
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
package org.exoplatform.clouddrive.box;

import org.exoplatform.clouddrive.CloudProviderException;

/**
 * Indicates a problem on provider side or communication problem.
 */
public class BoxException extends CloudProviderException {

  /**
   * 
   */
  private static final long serialVersionUID = 4990101883452322615L;

  /**
   * @param message
   */
  public BoxException(String message) {
    super(message);
  }

  /**
   * @param message
   * @param cause
   */
  public BoxException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * @param cause
   */
  public BoxException(Throwable cause) {
    super(cause);
  }
}
