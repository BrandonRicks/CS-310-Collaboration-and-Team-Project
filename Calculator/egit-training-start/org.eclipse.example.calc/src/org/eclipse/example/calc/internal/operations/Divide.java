/***************************************************
 * Brandon Ricks - CS310 - May 16, 2021
 */
package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

/**
 * Binary divide operation
 */
public class Divide extends AbstractOperation implements BinaryOperation {

	@Override
	public float perform(float arg1, float arg2) {
		return arg1 / arg2;
	}

	@Override
	public String getName() {
		return "/";
	}

}
