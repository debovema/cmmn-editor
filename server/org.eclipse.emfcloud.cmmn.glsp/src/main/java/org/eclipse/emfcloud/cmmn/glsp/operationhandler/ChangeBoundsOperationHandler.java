/********************************************************************************
 * Copyright (c) 2019-2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
package org.eclipse.emfcloud.cmmn.glsp.operationhandler;

import org.eclipse.emfcloud.cmmn.glsp.CMMNModelIndex;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.metamodel.enotation.Shape;
import org.eclipse.glsp.graph.GDimension;
import org.eclipse.glsp.graph.GPoint;
import org.eclipse.glsp.server.model.GModelState;
import org.eclipse.glsp.server.operations.BasicOperationHandler;
import org.eclipse.glsp.server.operations.ChangeBoundsOperation;
import org.eclipse.glsp.server.types.ElementAndBounds;

public class ChangeBoundsOperationHandler extends BasicOperationHandler<ChangeBoundsOperation> {

	@Override
	public void executeOperation(ChangeBoundsOperation changeBoundsOperation, GModelState graphicalModelState) {
		CMMNModelState modelState = CMMNModelState.getModelState(graphicalModelState);
		applyBounds(changeBoundsOperation, modelState.getIndex());
	}

	private void applyBounds(ChangeBoundsOperation operation, CMMNModelIndex index) {
		for (ElementAndBounds element : operation.getNewBounds()) {
			index.getNotation(element.getElementId(), Shape.class)
					.ifPresent(notationElement -> changeElementBounds(notationElement, element.getNewSize(),
							element.getNewPosition()));
		}
	}

	private void changeElementBounds(Shape element, GDimension dimension, GPoint position) {
		if (position != null) {
			element.setPosition(position);
		}
		if (dimension != null) {
			element.setSize(dimension);
		}
	}

	@Override
	public String getLabel() {
		return "Change bounds";
	}
}