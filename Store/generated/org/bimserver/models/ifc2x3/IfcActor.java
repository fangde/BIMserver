/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcActor#getTheActor <em>The Actor</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcActor#getIsActingUpon <em>Is Acting Upon</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcActor()
 * @model
 * @generated
 */
public interface IfcActor extends IfcObject {
	/**
	 * Returns the value of the '<em><b>The Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Actor</em>' reference.
	 * @see #setTheActor(IfcActorSelect)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcActor_TheActor()
	 * @model
	 * @generated
	 */
	IfcActorSelect getTheActor();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcActor#getTheActor <em>The Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Actor</em>' reference.
	 * @see #getTheActor()
	 * @generated
	 */
	void setTheActor(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>Is Acting Upon</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcRelAssignsToActor}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcRelAssignsToActor#getRelatingActor <em>Relating Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Acting Upon</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Acting Upon</em>' reference list.
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcActor_IsActingUpon()
	 * @see org.bimserver.models.ifc2x3.IfcRelAssignsToActor#getRelatingActor
	 * @model opposite="RelatingActor"
	 * @generated
	 */
	EList<IfcRelAssignsToActor> getIsActingUpon();

} // IfcActor