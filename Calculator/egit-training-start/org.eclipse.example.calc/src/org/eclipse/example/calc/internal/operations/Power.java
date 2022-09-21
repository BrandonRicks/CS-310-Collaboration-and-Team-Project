/***************************************************
 * Brandon Ricks - CS310 - May 16, 2021
 */
package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

/**
 * Binary power operation
 */
public class Power extends AbstractOperation implements BinaryOperation {

	@Override
	public float perform(float arg1, float arg2) {
		return (float) Math.pow(arg1, arg2);
	}

	@Override
	public String getName() {
		return "pow";
	}

}
