/*
 * This program is free software; you can redistribute it and/or modify it under the
 *  terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 *  Foundation.
 *
 *  You should have received a copy of the GNU Lesser General Public License along with this
 *  program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 *  or from the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU Lesser General Public License for more details.
 *
 *  Copyright (c) 2017 Pentaho Corporation..  All rights reserved.
 */
package org.pentaho.reporting.designer.core.actions;

import org.pentaho.reporting.designer.core.actions.elements.MorphAction;
import org.pentaho.reporting.designer.core.editor.ReportRenderContext;
import org.pentaho.reporting.engine.classic.core.Element;

import java.util.List;


public class ProtectedMethodHelper {
   public static void callUpdate( MorphAction action, ReportRenderContext oldContext, ReportRenderContext newContext ) {
     action.updateActiveContext( oldContext, newContext );
   }

  public static List<Element> getListElements( MorphAction action ) {
     return action.getSelectionModel().getSelectedElementsOfType( Element.class );
  }
}
