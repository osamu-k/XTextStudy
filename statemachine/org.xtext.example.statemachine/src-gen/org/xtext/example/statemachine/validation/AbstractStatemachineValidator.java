/*
 * generated by Xtext
 */
package org.xtext.example.statemachine.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractStatemachineValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.example.statemachine.statemachine.StatemachinePackage.eINSTANCE);
		return result;
	}
}
