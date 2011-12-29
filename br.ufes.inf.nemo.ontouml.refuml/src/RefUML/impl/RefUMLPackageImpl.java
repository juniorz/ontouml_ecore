/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RefUML.impl;

import RefUML.AggregationKind;
import RefUML.Association;
import RefUML.Classifier;
import RefUML.Comment;
import RefUML.Constraintx;
import RefUML.DataType;
import RefUML.Dependency;
import RefUML.DirectedRelationship;
import RefUML.Element;
import RefUML.ElementImport;
import RefUML.Enumeration;
import RefUML.EnumerationLiteral;
import RefUML.Expression;
import RefUML.Feature;
import RefUML.Generalization;
import RefUML.GeneralizationSet;
import RefUML.InstanceSpecification;
import RefUML.InstanceValue;
import RefUML.LiteralBoolean;
import RefUML.LiteralInteger;
import RefUML.LiteralNull;
import RefUML.LiteralSpecification;
import RefUML.LiteralString;
import RefUML.LiteralUnlimitedNatural;
import RefUML.Model;
import RefUML.MultiplicityElement;
import RefUML.NamedElement;
import RefUML.Namespace;
import RefUML.OpaqueExpression;
import RefUML.PackageImport;
import RefUML.PackageMerge;
import RefUML.PackageableElement;
import RefUML.PrimitiveType;
import RefUML.Property;
import RefUML.RedefinableElement;
import RefUML.RefUMLFactory;
import RefUML.RefUMLPackage;
import RefUML.Relationship;
import RefUML.Slot;
import RefUML.StringExpression;
import RefUML.StructuralFeature;
import RefUML.Type;
import RefUML.TypedElement;
import RefUML.ValueSpecification;
import RefUML.VisibilityKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefUMLPackageImpl extends EPackageImpl implements RefUMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalUnlimitedNaturalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unlimitedNaturalEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see RefUML.RefUMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RefUMLPackageImpl() {
		super(eNS_URI, RefUMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RefUMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RefUMLPackage init() {
		if (isInited) return (RefUMLPackage)EPackage.Registry.INSTANCE.getEPackage(RefUMLPackage.eNS_URI);

		// Obtain or create and register package
		RefUMLPackageImpl theRefUMLPackage = (RefUMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RefUMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RefUMLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRefUMLPackage.createPackageContents();

		// Initialize created meta-data
		theRefUMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRefUMLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RefUMLPackage.eNS_URI, theRefUMLPackage);
		return theRefUMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_AnnotatedElement() {
		return (EReference)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_OwnedElement() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Owner() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_OwnedComment() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__Destroy() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__HasKeyword__String() {
		return elementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetKeywords() {
		return elementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__AddKeyword__String() {
		return elementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__RemoveKeyword__String() {
		return elementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetNearestPackage() {
		return elementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetModel() {
		return elementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetApplicableStereotype__String() {
		return elementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetStereotypeApplications() {
		return elementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetRequiredStereotype__String() {
		return elementEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetAppliedStereotype__String() {
		return elementEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__CreateEAnnotation__String() {
		return elementEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetRelationships() {
		return elementEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetRelationships__EClass() {
		return elementEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetSourceDirectedRelationships() {
		return elementEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetSourceDirectedRelationships__EClass() {
		return elementEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetTargetDirectedRelationships() {
		return elementEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__GetTargetDirectedRelationships__EClass() {
		return elementEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__AllOwnedElements() {
		return elementEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__MustBeOwned() {
		return elementEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_OwnedType() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackageMerge() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackagedElement() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestedPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestingPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__CreateOwnedClass__String_boolean() {
		return packageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__CreateOwnedEnumeration__String() {
		return packageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__CreateOwnedPrimitiveType__String() {
		return packageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__CreateOwnedInterface__String() {
		return packageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__GetAppliedProfile__String() {
		return packageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__GetAppliedProfile__String_boolean() {
		return packageEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__IsModelLibrary() {
		return packageEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__VisibleMembers() {
		return packageEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__MakesVisible__NamedElement() {
		return packageEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageableElement() {
		return packageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Visibility() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_QualifiedName() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_ClientDependency() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_Namespace() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_NameExpression() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__CreateDependency__NamedElement() {
		return namedElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__GetLabel() {
		return namedElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__GetLabel__boolean() {
		return namedElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__CreateUsage__NamedElement() {
		return namedElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__GetQualifiedName() {
		return namedElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__AllNamespaces() {
		return namedElementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__IsDistinguishableFrom__NamedElement_Namespace() {
		return namedElementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__Separator() {
		return namedElementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__AllOwningPackages() {
		return namedElementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Supplier() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Client() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedRelationship() {
		return directedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_Source() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_Target() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_RelatedElement() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_ElementImport() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_PackageImport() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_OwnedRule() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_Member() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_ImportedMember() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_OwnedMember() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__CreateElementImport__PackageableElement_VisibilityKind() {
		return namespaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__CreatePackageImport__Package_VisibilityKind() {
		return namespaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__GetImportedElements() {
		return namespaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__GetImportedPackages() {
		return namespaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__GetImportedMembers() {
		return namespaceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__GetNamesOfMember__NamedElement() {
		return namespaceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__MembersAreDistinguishable() {
		return namespaceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__ImportMembers__EList() {
		return namespaceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__ExcludeCollisions__EList() {
		return namespaceEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementImport() {
		return elementImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementImport_Visibility() {
		return (EAttribute)elementImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementImport_Alias() {
		return (EAttribute)elementImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementImport_ImportedElement() {
		return (EReference)elementImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementImport_ImportingNamespace() {
		return (EReference)elementImportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementImport__GetName() {
		return elementImportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageImport() {
		return packageImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageImport_Visibility() {
		return (EAttribute)packageImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageImport_ImportedPackage() {
		return (EReference)packageImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageImport_ImportingNamespace() {
		return (EReference)packageImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintx() {
		return constraintxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintx_ConstrainedElement() {
		return (EReference)constraintxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintx_Specification() {
		return (EReference)constraintxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintx_Context() {
		return (EReference)constraintxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IsComputable() {
		return valueSpecificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IntegerValue() {
		return valueSpecificationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__BooleanValue() {
		return valueSpecificationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__StringValue() {
		return valueSpecificationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__UnlimitedValue() {
		return valueSpecificationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IsNull() {
		return valueSpecificationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Package() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getType__CreateAssociation__boolean_AggregationKind_String_int_int_Type_boolean_AggregationKind_String_int_int() {
		return typeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getType__GetAssociations() {
		return typeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getType__ConformsTo__Type() {
		return typeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_OwnedEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_MemberEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_IsDerived() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_EndType() {
		return (EReference)associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_NavigableOwnedEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssociation__IsBinary() {
		return associationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssociation__GetEndTypes() {
		return associationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_IsAbstract() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Generalization() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_PowertypeExtent() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Feature() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_InheritedMember() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_RedefinedClassifier() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_General() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Attribute() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__GetAllAttributes() {
		return classifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__GetGenerals() {
		return classifierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__GetInheritedMembers() {
		return classifierEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__AllFeatures() {
		return classifierEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__Parents() {
		return classifierEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__InheritableMembers__Classifier() {
		return classifierEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__HasVisibilityOf__NamedElement() {
		return classifierEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__ConformsTo__Classifier() {
		return classifierEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__Inherit__EList() {
		return classifierEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__MaySpecializeType__Classifier() {
		return classifierEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__AllParents() {
		return classifierEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__HasKindAncestor() {
		return classifierEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__HasQuantityAncestor() {
		return classifierEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__HasCollectiveAncestor() {
		return classifierEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__HasKindOffspring() {
		return classifierEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__HasQuantityOffspring() {
		return classifierEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__HasCollectiveOffspring() {
		return classifierEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__HasFunctionalComplexInstances() {
		return classifierEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__HasQuantityInstances() {
		return classifierEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__HasCollectiveInstances() {
		return classifierEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableElement() {
		return redefinableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedefinableElement_IsLeaf() {
		return (EAttribute)redefinableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableElement_RedefinedElement() {
		return (EReference)redefinableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableElement_RedefinitionContext() {
		return (EReference)redefinableElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedefinableElement__IsConsistentWith__RedefinableElement() {
		return redefinableElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedefinableElement__IsRedefinitionContextValid__RedefinableElement() {
		return redefinableElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralization_IsSubstitutable() {
		return (EAttribute)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_General() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_GeneralizationSet() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Specific() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationSet() {
		return generalizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsCovering() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsDisjoint() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Powertype() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Generalization() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsStatic() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_FeaturingClassifier() {
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueExpression() {
		return opaqueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Body() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Language() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__GetResult() {
		return opaqueExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__Value() {
		return opaqueExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__IsIntegral() {
		return opaqueExpressionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__IsPositive() {
		return opaqueExpressionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__IsNonNegative() {
		return opaqueExpressionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement() {
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsOrdered() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsUnique() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Upper() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Lower() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_UpperValue() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_LowerValue() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__SetLower__int() {
		return multiplicityElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__SetUpper__int() {
		return multiplicityElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__GetLower() {
		return multiplicityElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__GetUpper() {
		return multiplicityElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__IsMultivalued() {
		return multiplicityElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__IncludesCardinality__int() {
		return multiplicityElementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__IncludesMultiplicity__MultiplicityElement() {
		return multiplicityElementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__LowerBound() {
		return multiplicityElementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__UpperBound() {
		return multiplicityElementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__CompatibleWith__MultiplicityElement() {
		return multiplicityElementEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__Is__int_int() {
		return multiplicityElementEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Class() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Datatype() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerived() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerivedUnion() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Default() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Aggregation() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsComposite() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_RedefinedProperty() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_OwningAssociation() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_DefaultValue() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Opposite() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_SubsettedProperty() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Association() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__GetDefault() {
		return propertyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__IsSetDefault() {
		return propertyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SetDefault__String() {
		return propertyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SetIsComposite__boolean() {
		return propertyEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SetOpposite__Property() {
		return propertyEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__UnsetDefault() {
		return propertyEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SetIsNavigable__boolean() {
		return propertyEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__GetOtherEnd() {
		return propertyEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SetBooleanDefaultValue__boolean() {
		return propertyEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SetIntegerDefaultValue__int() {
		return propertyEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SetStringDefaultValue__String() {
		return propertyEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SetUnlimitedNaturalDefaultValue__int() {
		return propertyEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SetNullDefaultValue() {
		return propertyEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__IsAttribute__Property() {
		return propertyEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__GetOpposite() {
		return propertyEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__IsComposite() {
		return propertyEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SubsettingContext() {
		return propertyEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__IsNavigable() {
		return propertyEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_NestedClassifier() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SuperClass() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsActive() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedAttribute() {
		return (EReference)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__CreateOwnedOperation__String_EList_EList_Type() {
		return classEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__IsMetaclass() {
		return classEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Viewpoint() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModel__IsMetamodel() {
		return modelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_OwnedAttribute() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataType__CreateOwnedOperation__String_EList_EList_Type() {
		return dataTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataType__CreateOwnedAttribute__String_Type_int_int() {
		return dataTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeature() {
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeature_IsReadOnly() {
		return (EAttribute)structuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringExpression() {
		return stringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringExpression_SubExpression() {
		return (EReference)stringExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringExpression_OwningExpression() {
		return (EReference)stringExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Symbol() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Operand() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageMerge() {
		return packageMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageMerge_MergedPackage() {
		return (EReference)packageMergeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageMerge_ReceivingPackage() {
		return (EReference)packageMergeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedLiteral() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationLiteral_Enumeration() {
		return (EReference)enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSpecification() {
		return instanceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Classifier() {
		return (EReference)instanceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Slot() {
		return (EReference)instanceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Specification() {
		return (EReference)instanceSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlot() {
		return slotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_DefiningFeature() {
		return (EReference)slotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Value() {
		return (EReference)slotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_OwningInstance() {
		return (EReference)slotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralSpecification() {
		return literalSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralInteger() {
		return literalIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralInteger_Value() {
		return (EAttribute)literalIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralString() {
		return literalStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralString_Value() {
		return (EAttribute)literalStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralBoolean() {
		return literalBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralBoolean_Value() {
		return (EAttribute)literalBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralNull() {
		return literalNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceValue() {
		return instanceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceValue_Instance() {
		return (EReference)instanceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralUnlimitedNatural() {
		return literalUnlimitedNaturalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralUnlimitedNatural_Value() {
		return (EAttribute)literalUnlimitedNaturalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationKind() {
		return aggregationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnlimitedNatural() {
		return unlimitedNaturalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefUMLFactory getRefUMLFactory() {
		return (RefUMLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__BODY);
		createEReference(commentEClass, COMMENT__ANNOTATED_ELEMENT);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNED_ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNER);
		createEReference(elementEClass, ELEMENT__OWNED_COMMENT);
		createEOperation(elementEClass, ELEMENT___DESTROY);
		createEOperation(elementEClass, ELEMENT___HAS_KEYWORD__STRING);
		createEOperation(elementEClass, ELEMENT___GET_KEYWORDS);
		createEOperation(elementEClass, ELEMENT___ADD_KEYWORD__STRING);
		createEOperation(elementEClass, ELEMENT___REMOVE_KEYWORD__STRING);
		createEOperation(elementEClass, ELEMENT___GET_NEAREST_PACKAGE);
		createEOperation(elementEClass, ELEMENT___GET_MODEL);
		createEOperation(elementEClass, ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING);
		createEOperation(elementEClass, ELEMENT___GET_STEREOTYPE_APPLICATIONS);
		createEOperation(elementEClass, ELEMENT___GET_REQUIRED_STEREOTYPE__STRING);
		createEOperation(elementEClass, ELEMENT___GET_APPLIED_STEREOTYPE__STRING);
		createEOperation(elementEClass, ELEMENT___CREATE_EANNOTATION__STRING);
		createEOperation(elementEClass, ELEMENT___GET_RELATIONSHIPS);
		createEOperation(elementEClass, ELEMENT___GET_RELATIONSHIPS__ECLASS);
		createEOperation(elementEClass, ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS);
		createEOperation(elementEClass, ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS);
		createEOperation(elementEClass, ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS);
		createEOperation(elementEClass, ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS);
		createEOperation(elementEClass, ELEMENT___ALL_OWNED_ELEMENTS);
		createEOperation(elementEClass, ELEMENT___MUST_BE_OWNED);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__OWNED_TYPE);
		createEReference(packageEClass, PACKAGE__PACKAGE_MERGE);
		createEReference(packageEClass, PACKAGE__PACKAGED_ELEMENT);
		createEReference(packageEClass, PACKAGE__NESTED_PACKAGE);
		createEReference(packageEClass, PACKAGE__NESTING_PACKAGE);
		createEOperation(packageEClass, PACKAGE___CREATE_OWNED_CLASS__STRING_BOOLEAN);
		createEOperation(packageEClass, PACKAGE___CREATE_OWNED_ENUMERATION__STRING);
		createEOperation(packageEClass, PACKAGE___CREATE_OWNED_PRIMITIVE_TYPE__STRING);
		createEOperation(packageEClass, PACKAGE___CREATE_OWNED_INTERFACE__STRING);
		createEOperation(packageEClass, PACKAGE___GET_APPLIED_PROFILE__STRING);
		createEOperation(packageEClass, PACKAGE___GET_APPLIED_PROFILE__STRING_BOOLEAN);
		createEOperation(packageEClass, PACKAGE___IS_MODEL_LIBRARY);
		createEOperation(packageEClass, PACKAGE___VISIBLE_MEMBERS);
		createEOperation(packageEClass, PACKAGE___MAKES_VISIBLE__NAMEDELEMENT);

		packageableElementEClass = createEClass(PACKAGEABLE_ELEMENT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__VISIBILITY);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__QUALIFIED_NAME);
		createEReference(namedElementEClass, NAMED_ELEMENT__CLIENT_DEPENDENCY);
		createEReference(namedElementEClass, NAMED_ELEMENT__NAMESPACE);
		createEReference(namedElementEClass, NAMED_ELEMENT__NAME_EXPRESSION);
		createEOperation(namedElementEClass, NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT);
		createEOperation(namedElementEClass, NAMED_ELEMENT___GET_LABEL);
		createEOperation(namedElementEClass, NAMED_ELEMENT___GET_LABEL__BOOLEAN);
		createEOperation(namedElementEClass, NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT);
		createEOperation(namedElementEClass, NAMED_ELEMENT___GET_QUALIFIED_NAME);
		createEOperation(namedElementEClass, NAMED_ELEMENT___ALL_NAMESPACES);
		createEOperation(namedElementEClass, NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE);
		createEOperation(namedElementEClass, NAMED_ELEMENT___SEPARATOR);
		createEOperation(namedElementEClass, NAMED_ELEMENT___ALL_OWNING_PACKAGES);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__SUPPLIER);
		createEReference(dependencyEClass, DEPENDENCY__CLIENT);

		directedRelationshipEClass = createEClass(DIRECTED_RELATIONSHIP);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__RELATED_ELEMENT);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__ELEMENT_IMPORT);
		createEReference(namespaceEClass, NAMESPACE__PACKAGE_IMPORT);
		createEReference(namespaceEClass, NAMESPACE__OWNED_RULE);
		createEReference(namespaceEClass, NAMESPACE__MEMBER);
		createEReference(namespaceEClass, NAMESPACE__IMPORTED_MEMBER);
		createEReference(namespaceEClass, NAMESPACE__OWNED_MEMBER);
		createEOperation(namespaceEClass, NAMESPACE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND);
		createEOperation(namespaceEClass, NAMESPACE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND);
		createEOperation(namespaceEClass, NAMESPACE___GET_IMPORTED_ELEMENTS);
		createEOperation(namespaceEClass, NAMESPACE___GET_IMPORTED_PACKAGES);
		createEOperation(namespaceEClass, NAMESPACE___GET_IMPORTED_MEMBERS);
		createEOperation(namespaceEClass, NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT);
		createEOperation(namespaceEClass, NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE);
		createEOperation(namespaceEClass, NAMESPACE___IMPORT_MEMBERS__ELIST);
		createEOperation(namespaceEClass, NAMESPACE___EXCLUDE_COLLISIONS__ELIST);

		elementImportEClass = createEClass(ELEMENT_IMPORT);
		createEAttribute(elementImportEClass, ELEMENT_IMPORT__VISIBILITY);
		createEAttribute(elementImportEClass, ELEMENT_IMPORT__ALIAS);
		createEReference(elementImportEClass, ELEMENT_IMPORT__IMPORTED_ELEMENT);
		createEReference(elementImportEClass, ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		createEOperation(elementImportEClass, ELEMENT_IMPORT___GET_NAME);

		packageImportEClass = createEClass(PACKAGE_IMPORT);
		createEAttribute(packageImportEClass, PACKAGE_IMPORT__VISIBILITY);
		createEReference(packageImportEClass, PACKAGE_IMPORT__IMPORTED_PACKAGE);
		createEReference(packageImportEClass, PACKAGE_IMPORT__IMPORTING_NAMESPACE);

		constraintxEClass = createEClass(CONSTRAINTX);
		createEReference(constraintxEClass, CONSTRAINTX__CONSTRAINED_ELEMENT);
		createEReference(constraintxEClass, CONSTRAINTX__SPECIFICATION);
		createEReference(constraintxEClass, CONSTRAINTX__CONTEXT);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___IS_COMPUTABLE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___INTEGER_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___BOOLEAN_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___STRING_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___UNLIMITED_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___IS_NULL);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__PACKAGE);
		createEOperation(typeEClass, TYPE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT);
		createEOperation(typeEClass, TYPE___GET_ASSOCIATIONS);
		createEOperation(typeEClass, TYPE___CONFORMS_TO__TYPE);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__OWNED_END);
		createEReference(associationEClass, ASSOCIATION__MEMBER_END);
		createEAttribute(associationEClass, ASSOCIATION__IS_DERIVED);
		createEReference(associationEClass, ASSOCIATION__END_TYPE);
		createEReference(associationEClass, ASSOCIATION__NAVIGABLE_OWNED_END);
		createEOperation(associationEClass, ASSOCIATION___IS_BINARY);
		createEOperation(associationEClass, ASSOCIATION___GET_END_TYPES);

		classifierEClass = createEClass(CLASSIFIER);
		createEAttribute(classifierEClass, CLASSIFIER__IS_ABSTRACT);
		createEReference(classifierEClass, CLASSIFIER__GENERALIZATION);
		createEReference(classifierEClass, CLASSIFIER__POWERTYPE_EXTENT);
		createEReference(classifierEClass, CLASSIFIER__FEATURE);
		createEReference(classifierEClass, CLASSIFIER__INHERITED_MEMBER);
		createEReference(classifierEClass, CLASSIFIER__REDEFINED_CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__GENERAL);
		createEReference(classifierEClass, CLASSIFIER__ATTRIBUTE);
		createEOperation(classifierEClass, CLASSIFIER___GET_ALL_ATTRIBUTES);
		createEOperation(classifierEClass, CLASSIFIER___GET_GENERALS);
		createEOperation(classifierEClass, CLASSIFIER___GET_INHERITED_MEMBERS);
		createEOperation(classifierEClass, CLASSIFIER___ALL_FEATURES);
		createEOperation(classifierEClass, CLASSIFIER___PARENTS);
		createEOperation(classifierEClass, CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER);
		createEOperation(classifierEClass, CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT);
		createEOperation(classifierEClass, CLASSIFIER___CONFORMS_TO__CLASSIFIER);
		createEOperation(classifierEClass, CLASSIFIER___INHERIT__ELIST);
		createEOperation(classifierEClass, CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER);
		createEOperation(classifierEClass, CLASSIFIER___ALL_PARENTS);
		createEOperation(classifierEClass, CLASSIFIER___HAS_KIND_ANCESTOR);
		createEOperation(classifierEClass, CLASSIFIER___HAS_QUANTITY_ANCESTOR);
		createEOperation(classifierEClass, CLASSIFIER___HAS_COLLECTIVE_ANCESTOR);
		createEOperation(classifierEClass, CLASSIFIER___HAS_KIND_OFFSPRING);
		createEOperation(classifierEClass, CLASSIFIER___HAS_QUANTITY_OFFSPRING);
		createEOperation(classifierEClass, CLASSIFIER___HAS_COLLECTIVE_OFFSPRING);
		createEOperation(classifierEClass, CLASSIFIER___HAS_FUNCTIONAL_COMPLEX_INSTANCES);
		createEOperation(classifierEClass, CLASSIFIER___HAS_QUANTITY_INSTANCES);
		createEOperation(classifierEClass, CLASSIFIER___HAS_COLLECTIVE_INSTANCES);

		redefinableElementEClass = createEClass(REDEFINABLE_ELEMENT);
		createEAttribute(redefinableElementEClass, REDEFINABLE_ELEMENT__IS_LEAF);
		createEReference(redefinableElementEClass, REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
		createEReference(redefinableElementEClass, REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
		createEOperation(redefinableElementEClass, REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT);
		createEOperation(redefinableElementEClass, REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT);

		generalizationEClass = createEClass(GENERALIZATION);
		createEAttribute(generalizationEClass, GENERALIZATION__IS_SUBSTITUTABLE);
		createEReference(generalizationEClass, GENERALIZATION__GENERAL);
		createEReference(generalizationEClass, GENERALIZATION__GENERALIZATION_SET);
		createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);

		generalizationSetEClass = createEClass(GENERALIZATION_SET);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_COVERING);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_DISJOINT);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__POWERTYPE);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__GENERALIZATION);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__IS_STATIC);
		createEReference(featureEClass, FEATURE__FEATURING_CLASSIFIER);

		opaqueExpressionEClass = createEClass(OPAQUE_EXPRESSION);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__BODY);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__LANGUAGE);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___GET_RESULT);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___VALUE);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___IS_INTEGRAL);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___IS_POSITIVE);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___IS_NON_NEGATIVE);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__IS_ORDERED);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__IS_UNIQUE);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER_VALUE);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER_VALUE);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___SET_LOWER__INT);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___SET_UPPER__INT);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___GET_LOWER);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___GET_UPPER);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___IS_MULTIVALUED);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___INCLUDES_CARDINALITY__INT);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___LOWER_BOUND);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___UPPER_BOUND);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___IS__INT_INT);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__CLASS);
		createEReference(propertyEClass, PROPERTY__DATATYPE);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED_UNION);
		createEAttribute(propertyEClass, PROPERTY__DEFAULT);
		createEAttribute(propertyEClass, PROPERTY__AGGREGATION);
		createEAttribute(propertyEClass, PROPERTY__IS_COMPOSITE);
		createEReference(propertyEClass, PROPERTY__REDEFINED_PROPERTY);
		createEReference(propertyEClass, PROPERTY__OWNING_ASSOCIATION);
		createEReference(propertyEClass, PROPERTY__DEFAULT_VALUE);
		createEReference(propertyEClass, PROPERTY__OPPOSITE);
		createEReference(propertyEClass, PROPERTY__SUBSETTED_PROPERTY);
		createEReference(propertyEClass, PROPERTY__ASSOCIATION);
		createEOperation(propertyEClass, PROPERTY___GET_DEFAULT);
		createEOperation(propertyEClass, PROPERTY___IS_SET_DEFAULT);
		createEOperation(propertyEClass, PROPERTY___SET_DEFAULT__STRING);
		createEOperation(propertyEClass, PROPERTY___SET_IS_COMPOSITE__BOOLEAN);
		createEOperation(propertyEClass, PROPERTY___SET_OPPOSITE__PROPERTY);
		createEOperation(propertyEClass, PROPERTY___UNSET_DEFAULT);
		createEOperation(propertyEClass, PROPERTY___SET_IS_NAVIGABLE__BOOLEAN);
		createEOperation(propertyEClass, PROPERTY___GET_OTHER_END);
		createEOperation(propertyEClass, PROPERTY___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN);
		createEOperation(propertyEClass, PROPERTY___SET_INTEGER_DEFAULT_VALUE__INT);
		createEOperation(propertyEClass, PROPERTY___SET_STRING_DEFAULT_VALUE__STRING);
		createEOperation(propertyEClass, PROPERTY___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT);
		createEOperation(propertyEClass, PROPERTY___SET_NULL_DEFAULT_VALUE);
		createEOperation(propertyEClass, PROPERTY___IS_ATTRIBUTE__PROPERTY);
		createEOperation(propertyEClass, PROPERTY___GET_OPPOSITE);
		createEOperation(propertyEClass, PROPERTY___IS_COMPOSITE);
		createEOperation(propertyEClass, PROPERTY___SUBSETTING_CONTEXT);
		createEOperation(propertyEClass, PROPERTY___IS_NAVIGABLE);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__NESTED_CLASSIFIER);
		createEReference(classEClass, CLASS__SUPER_CLASS);
		createEAttribute(classEClass, CLASS__IS_ACTIVE);
		createEReference(classEClass, CLASS__OWNED_ATTRIBUTE);
		createEOperation(classEClass, CLASS___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE);
		createEOperation(classEClass, CLASS___IS_METACLASS);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__VIEWPOINT);
		createEOperation(modelEClass, MODEL___IS_METAMODEL);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_ATTRIBUTE);
		createEOperation(dataTypeEClass, DATA_TYPE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE);
		createEOperation(dataTypeEClass, DATA_TYPE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT);

		structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);
		createEAttribute(structuralFeatureEClass, STRUCTURAL_FEATURE__IS_READ_ONLY);

		stringExpressionEClass = createEClass(STRING_EXPRESSION);
		createEReference(stringExpressionEClass, STRING_EXPRESSION__SUB_EXPRESSION);
		createEReference(stringExpressionEClass, STRING_EXPRESSION__OWNING_EXPRESSION);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__SYMBOL);
		createEReference(expressionEClass, EXPRESSION__OPERAND);

		packageMergeEClass = createEClass(PACKAGE_MERGE);
		createEReference(packageMergeEClass, PACKAGE_MERGE__MERGED_PACKAGE);
		createEReference(packageMergeEClass, PACKAGE_MERGE__RECEIVING_PACKAGE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__OWNED_LITERAL);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEReference(enumerationLiteralEClass, ENUMERATION_LITERAL__ENUMERATION);

		instanceSpecificationEClass = createEClass(INSTANCE_SPECIFICATION);
		createEReference(instanceSpecificationEClass, INSTANCE_SPECIFICATION__CLASSIFIER);
		createEReference(instanceSpecificationEClass, INSTANCE_SPECIFICATION__SLOT);
		createEReference(instanceSpecificationEClass, INSTANCE_SPECIFICATION__SPECIFICATION);

		slotEClass = createEClass(SLOT);
		createEReference(slotEClass, SLOT__DEFINING_FEATURE);
		createEReference(slotEClass, SLOT__VALUE);
		createEReference(slotEClass, SLOT__OWNING_INSTANCE);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		literalSpecificationEClass = createEClass(LITERAL_SPECIFICATION);

		literalIntegerEClass = createEClass(LITERAL_INTEGER);
		createEAttribute(literalIntegerEClass, LITERAL_INTEGER__VALUE);

		literalStringEClass = createEClass(LITERAL_STRING);
		createEAttribute(literalStringEClass, LITERAL_STRING__VALUE);

		literalBooleanEClass = createEClass(LITERAL_BOOLEAN);
		createEAttribute(literalBooleanEClass, LITERAL_BOOLEAN__VALUE);

		literalNullEClass = createEClass(LITERAL_NULL);

		instanceValueEClass = createEClass(INSTANCE_VALUE);
		createEReference(instanceValueEClass, INSTANCE_VALUE__INSTANCE);

		literalUnlimitedNaturalEClass = createEClass(LITERAL_UNLIMITED_NATURAL);
		createEAttribute(literalUnlimitedNaturalEClass, LITERAL_UNLIMITED_NATURAL__VALUE);

		// Create enums
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
		aggregationKindEEnum = createEEnum(AGGREGATION_KIND);

		// Create data types
		integerEDataType = createEDataType(INTEGER);
		booleanEDataType = createEDataType(BOOLEAN);
		stringEDataType = createEDataType(STRING);
		unlimitedNaturalEDataType = createEDataType(UNLIMITED_NATURAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commentEClass.getESuperTypes().add(this.getElement());
		elementEClass.getESuperTypes().add(ecorePackage.getEModelElement());
		packageEClass.getESuperTypes().add(this.getNamespace());
		packageEClass.getESuperTypes().add(this.getPackageableElement());
		packageableElementEClass.getESuperTypes().add(this.getNamedElement());
		namedElementEClass.getESuperTypes().add(this.getElement());
		dependencyEClass.getESuperTypes().add(this.getPackageableElement());
		dependencyEClass.getESuperTypes().add(this.getDirectedRelationship());
		directedRelationshipEClass.getESuperTypes().add(this.getRelationship());
		relationshipEClass.getESuperTypes().add(this.getElement());
		namespaceEClass.getESuperTypes().add(this.getNamedElement());
		elementImportEClass.getESuperTypes().add(this.getDirectedRelationship());
		packageImportEClass.getESuperTypes().add(this.getDirectedRelationship());
		constraintxEClass.getESuperTypes().add(this.getPackageableElement());
		valueSpecificationEClass.getESuperTypes().add(this.getPackageableElement());
		valueSpecificationEClass.getESuperTypes().add(this.getTypedElement());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		typeEClass.getESuperTypes().add(this.getPackageableElement());
		associationEClass.getESuperTypes().add(this.getClassifier());
		associationEClass.getESuperTypes().add(this.getRelationship());
		classifierEClass.getESuperTypes().add(this.getNamespace());
		classifierEClass.getESuperTypes().add(this.getRedefinableElement());
		classifierEClass.getESuperTypes().add(this.getType());
		redefinableElementEClass.getESuperTypes().add(this.getNamedElement());
		generalizationEClass.getESuperTypes().add(this.getDirectedRelationship());
		generalizationSetEClass.getESuperTypes().add(this.getPackageableElement());
		featureEClass.getESuperTypes().add(this.getRedefinableElement());
		opaqueExpressionEClass.getESuperTypes().add(this.getValueSpecification());
		multiplicityElementEClass.getESuperTypes().add(this.getElement());
		propertyEClass.getESuperTypes().add(this.getStructuralFeature());
		classEClass.getESuperTypes().add(this.getClassifier());
		modelEClass.getESuperTypes().add(this.getPackage());
		dataTypeEClass.getESuperTypes().add(this.getClassifier());
		structuralFeatureEClass.getESuperTypes().add(this.getFeature());
		structuralFeatureEClass.getESuperTypes().add(this.getTypedElement());
		structuralFeatureEClass.getESuperTypes().add(this.getMultiplicityElement());
		stringExpressionEClass.getESuperTypes().add(this.getExpression());
		expressionEClass.getESuperTypes().add(this.getValueSpecification());
		packageMergeEClass.getESuperTypes().add(this.getDirectedRelationship());
		enumerationEClass.getESuperTypes().add(this.getDataType());
		enumerationLiteralEClass.getESuperTypes().add(this.getInstanceSpecification());
		instanceSpecificationEClass.getESuperTypes().add(this.getPackageableElement());
		slotEClass.getESuperTypes().add(this.getElement());
		primitiveTypeEClass.getESuperTypes().add(this.getDataType());
		literalSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		literalIntegerEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalStringEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalBooleanEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalNullEClass.getESuperTypes().add(this.getLiteralSpecification());
		instanceValueEClass.getESuperTypes().add(this.getValueSpecification());
		literalUnlimitedNaturalEClass.getESuperTypes().add(this.getLiteralSpecification());

		// Initialize classes, features, and operations; add parameters
		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Body(), this.getString(), "body", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComment_AnnotatedElement(), this.getElement(), null, "annotatedElement", null, 0, -1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_OwnedElement(), this.getElement(), this.getElement_Owner(), "ownedElement", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_Owner(), this.getElement(), this.getElement_OwnedElement(), "owner", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwnedComment(), this.getComment(), null, "ownedComment", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getElement__Destroy(), null, "destroy", 0, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getElement__HasKeyword__String(), this.getBoolean(), "hasKeyword", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__GetKeywords(), this.getString(), "getKeywords", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getElement__AddKeyword__String(), this.getBoolean(), "addKeyword", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getElement__RemoveKeyword__String(), this.getBoolean(), "removeKeyword", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__GetNearestPackage(), this.getPackage(), "getNearestPackage", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__GetModel(), this.getModel(), "getModel", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getElement__GetApplicableStereotype__String(), null, "getApplicableStereotype", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__GetStereotypeApplications(), ecorePackage.getEObject(), "getStereotypeApplications", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getElement__GetRequiredStereotype__String(), null, "getRequiredStereotype", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getElement__GetAppliedStereotype__String(), null, "getAppliedStereotype", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getElement__CreateEAnnotation__String(), ecorePackage.getEAnnotation(), "createEAnnotation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__GetRelationships(), this.getRelationship(), "getRelationships", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getElement__GetRelationships__EClass(), this.getRelationship(), "getRelationships", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "eClass", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__GetSourceDirectedRelationships(), this.getDirectedRelationship(), "getSourceDirectedRelationships", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getElement__GetSourceDirectedRelationships__EClass(), this.getDirectedRelationship(), "getSourceDirectedRelationships", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "eClass", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__GetTargetDirectedRelationships(), this.getDirectedRelationship(), "getTargetDirectedRelationships", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getElement__GetTargetDirectedRelationships__EClass(), this.getDirectedRelationship(), "getTargetDirectedRelationships", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "eClass", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__AllOwnedElements(), this.getElement(), "allOwnedElements", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__MustBeOwned(), this.getBoolean(), "mustBeOwned", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(packageEClass, RefUML.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_OwnedType(), this.getType(), this.getType_Package(), "ownedType", null, 0, -1, RefUML.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_PackageMerge(), this.getPackageMerge(), this.getPackageMerge_ReceivingPackage(), "packageMerge", null, 0, -1, RefUML.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_PackagedElement(), this.getPackageableElement(), null, "packagedElement", null, 0, -1, RefUML.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_NestedPackage(), this.getPackage(), this.getPackage_NestingPackage(), "nestedPackage", null, 0, -1, RefUML.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_NestingPackage(), this.getPackage(), this.getPackage_NestedPackage(), "nestingPackage", null, 0, 1, RefUML.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPackage__CreateOwnedClass__String_boolean(), this.getClass_(), "createOwnedClass", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "isAbstract", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPackage__CreateOwnedEnumeration__String(), this.getEnumeration(), "createOwnedEnumeration", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPackage__CreateOwnedPrimitiveType__String(), this.getPrimitiveType(), "createOwnedPrimitiveType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPackage__CreateOwnedInterface__String(), null, "createOwnedInterface", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPackage__GetAppliedProfile__String(), null, "getAppliedProfile", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPackage__GetAppliedProfile__String_boolean(), null, "getAppliedProfile", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "recurse", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__IsModelLibrary(), this.getBoolean(), "isModelLibrary", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__VisibleMembers(), this.getPackageableElement(), "visibleMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPackage__MakesVisible__NamedElement(), this.getBoolean(), "makesVisible", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "el", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(packageableElementEClass, PackageableElement.class, "PackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), this.getString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamedElement_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamedElement_QualifiedName(), this.getString(), "qualifiedName", null, 0, 1, NamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_ClientDependency(), this.getDependency(), this.getDependency_Client(), "clientDependency", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_Namespace(), this.getNamespace(), this.getNamespace_OwnedMember(), "namespace", null, 0, 1, NamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_NameExpression(), this.getStringExpression(), null, "nameExpression", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getNamedElement__CreateDependency__NamedElement(), this.getDependency(), "createDependency", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "supplier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamedElement__GetLabel(), this.getString(), "getLabel", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamedElement__GetLabel__boolean(), this.getString(), "getLabel", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "localize", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamedElement__CreateUsage__NamedElement(), null, "createUsage", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "supplier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamedElement__GetQualifiedName(), this.getString(), "getQualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamedElement__AllNamespaces(), this.getNamespace(), "allNamespaces", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNamedElement__IsDistinguishableFrom__NamedElement_Namespace(), this.getBoolean(), "isDistinguishableFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "n", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamespace(), "ns", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamedElement__Separator(), this.getString(), "separator", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamedElement__AllOwningPackages(), this.getPackage(), "allOwningPackages", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Supplier(), this.getNamedElement(), null, "supplier", null, 1, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDependency_Client(), this.getNamedElement(), this.getNamedElement_ClientDependency(), "client", null, 1, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(directedRelationshipEClass, DirectedRelationship.class, "DirectedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectedRelationship_Source(), this.getElement(), null, "source", null, 1, -1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDirectedRelationship_Target(), this.getElement(), null, "target", null, 1, -1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_RelatedElement(), this.getElement(), null, "relatedElement", null, 1, -1, Relationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespace_ElementImport(), this.getElementImport(), this.getElementImport_ImportingNamespace(), "elementImport", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_PackageImport(), this.getPackageImport(), this.getPackageImport_ImportingNamespace(), "packageImport", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_OwnedRule(), this.getConstraintx(), this.getConstraintx_Context(), "ownedRule", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_Member(), this.getNamedElement(), null, "member", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_ImportedMember(), this.getPackageableElement(), null, "importedMember", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_OwnedMember(), this.getNamedElement(), this.getNamedElement_Namespace(), "ownedMember", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getNamespace__CreateElementImport__PackageableElement_VisibilityKind(), this.getElementImport(), "createElementImport", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPackageableElement(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVisibilityKind(), "visibility", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__CreatePackageImport__Package_VisibilityKind(), this.getPackageImport(), "createPackageImport", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPackage(), "package_", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVisibilityKind(), "visibility", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamespace__GetImportedElements(), this.getPackageableElement(), "getImportedElements", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamespace__GetImportedPackages(), this.getPackage(), "getImportedPackages", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamespace__GetImportedMembers(), this.getPackageableElement(), "getImportedMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__GetNamesOfMember__NamedElement(), this.getString(), "getNamesOfMember", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamespace__MembersAreDistinguishable(), this.getBoolean(), "membersAreDistinguishable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__ImportMembers__EList(), this.getPackageableElement(), "importMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPackageableElement(), "imps", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__ExcludeCollisions__EList(), this.getPackageableElement(), "excludeCollisions", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPackageableElement(), "imps", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(elementImportEClass, ElementImport.class, "ElementImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementImport_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementImport_Alias(), this.getString(), "alias", null, 0, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementImport_ImportedElement(), this.getPackageableElement(), null, "importedElement", null, 1, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementImport_ImportingNamespace(), this.getNamespace(), this.getNamespace_ElementImport(), "importingNamespace", null, 1, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getElementImport__GetName(), this.getString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(packageImportEClass, PackageImport.class, "PackageImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageImport_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageImport_ImportedPackage(), this.getPackage(), null, "importedPackage", null, 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageImport_ImportingNamespace(), this.getNamespace(), this.getNamespace_PackageImport(), "importingNamespace", null, 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(constraintxEClass, Constraintx.class, "Constraintx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintx_ConstrainedElement(), this.getElement(), null, "constrainedElement", null, 0, -1, Constraintx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintx_Specification(), this.getValueSpecification(), null, "specification", null, 1, 1, Constraintx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraintx_Context(), this.getNamespace(), this.getNamespace_OwnedRule(), "context", null, 0, 1, Constraintx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getValueSpecification__IsComputable(), this.getBoolean(), "isComputable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__IntegerValue(), this.getInteger(), "integerValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__BooleanValue(), this.getBoolean(), "booleanValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__StringValue(), this.getString(), "stringValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__UnlimitedValue(), this.getUnlimitedNatural(), "unlimitedValue", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__IsNull(), this.getBoolean(), "isNull", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getType(), null, "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Package(), this.getPackage(), this.getPackage_OwnedType(), "package", null, 0, 1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getType__CreateAssociation__boolean_AggregationKind_String_int_int_Type_boolean_AggregationKind_String_int_int(), this.getAssociation(), "createAssociation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "end1IsNavigable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAggregationKind(), "end1Aggregation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "end1Name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "end1Lower", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "end1Upper", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "end1Type", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "end2IsNavigable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAggregationKind(), "end2Aggregation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "end2Name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "end2Lower", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "end2Upper", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getType__GetAssociations(), this.getAssociation(), "getAssociations", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getType__ConformsTo__Type(), this.getBoolean(), "conformsTo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "other", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_OwnedEnd(), this.getProperty(), this.getProperty_OwningAssociation(), "ownedEnd", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_MemberEnd(), this.getProperty(), this.getProperty_Association(), "memberEnd", null, 2, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_IsDerived(), this.getBoolean(), "isDerived", "false", 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_EndType(), this.getType(), null, "endType", null, 1, -1, Association.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_NavigableOwnedEnd(), this.getProperty(), null, "navigableOwnedEnd", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAssociation__IsBinary(), this.getBoolean(), "isBinary", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAssociation__GetEndTypes(), this.getType(), "getEndTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifier_IsAbstract(), this.getBoolean(), "isAbstract", "false", 1, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Generalization(), this.getGeneralization(), this.getGeneralization_Specific(), "generalization", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_PowertypeExtent(), this.getGeneralizationSet(), this.getGeneralizationSet_Powertype(), "powertypeExtent", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Feature(), this.getFeature(), this.getFeature_FeaturingClassifier(), "feature", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_InheritedMember(), this.getNamedElement(), null, "inheritedMember", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_RedefinedClassifier(), this.getClassifier(), null, "redefinedClassifier", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_General(), this.getClassifier(), null, "general", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Attribute(), this.getProperty(), null, "attribute", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getClassifier__GetAllAttributes(), this.getProperty(), "getAllAttributes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__GetGenerals(), this.getClassifier(), "getGenerals", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__GetInheritedMembers(), this.getNamedElement(), "getInheritedMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__AllFeatures(), this.getFeature(), "allFeatures", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__Parents(), this.getClassifier(), "parents", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__InheritableMembers__Classifier(), this.getNamedElement(), "inheritableMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "c", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__HasVisibilityOf__NamedElement(), this.getBoolean(), "hasVisibilityOf", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "n", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__ConformsTo__Classifier(), this.getBoolean(), "conformsTo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "other", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__Inherit__EList(), this.getNamedElement(), "inherit", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "inhs", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__MaySpecializeType__Classifier(), this.getBoolean(), "maySpecializeType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "c", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__AllParents(), this.getClassifier(), "allParents", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__HasKindAncestor(), ecorePackage.getEBoolean(), "hasKindAncestor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassifier__HasQuantityAncestor(), ecorePackage.getEBoolean(), "hasQuantityAncestor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassifier__HasCollectiveAncestor(), ecorePackage.getEBoolean(), "hasCollectiveAncestor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassifier__HasKindOffspring(), ecorePackage.getEBoolean(), "hasKindOffspring", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassifier__HasQuantityOffspring(), ecorePackage.getEBoolean(), "hasQuantityOffspring", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassifier__HasCollectiveOffspring(), ecorePackage.getEBoolean(), "hasCollectiveOffspring", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassifier__HasFunctionalComplexInstances(), ecorePackage.getEBoolean(), "hasFunctionalComplexInstances", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassifier__HasQuantityInstances(), ecorePackage.getEBoolean(), "hasQuantityInstances", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassifier__HasCollectiveInstances(), ecorePackage.getEBoolean(), "hasCollectiveInstances", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(redefinableElementEClass, RedefinableElement.class, "RedefinableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRedefinableElement_IsLeaf(), this.getBoolean(), "isLeaf", "false", 1, 1, RedefinableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinableElement_RedefinedElement(), this.getRedefinableElement(), null, "redefinedElement", null, 0, -1, RedefinableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinableElement_RedefinitionContext(), this.getClassifier(), null, "redefinitionContext", null, 0, -1, RedefinableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRedefinableElement__IsConsistentWith__RedefinableElement(), this.getBoolean(), "isConsistentWith", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRedefinableElement(), "redefinee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRedefinableElement__IsRedefinitionContextValid__RedefinableElement(), this.getBoolean(), "isRedefinitionContextValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRedefinableElement(), "redefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralization_IsSubstitutable(), this.getBoolean(), "isSubstitutable", "true", 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_General(), this.getClassifier(), null, "general", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_GeneralizationSet(), this.getGeneralizationSet(), this.getGeneralizationSet_Generalization(), "generalizationSet", null, 0, -1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_Specific(), this.getClassifier(), this.getClassifier_Generalization(), "specific", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralizationSet_IsCovering(), this.getBoolean(), "isCovering", "false", 1, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralizationSet_IsDisjoint(), this.getBoolean(), "isDisjoint", "false", 1, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralizationSet_Powertype(), this.getClassifier(), this.getClassifier_PowertypeExtent(), "powertype", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralizationSet_Generalization(), this.getGeneralization(), this.getGeneralization_GeneralizationSet(), "generalization", null, 0, -1, GeneralizationSet.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_IsStatic(), this.getBoolean(), "isStatic", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_FeaturingClassifier(), this.getClassifier(), this.getClassifier_Feature(), "featuringClassifier", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(opaqueExpressionEClass, OpaqueExpression.class, "OpaqueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueExpression_Body(), this.getString(), "body", null, 0, -1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpaqueExpression_Language(), this.getString(), "language", null, 0, -1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOpaqueExpression__GetResult(), null, "getResult", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOpaqueExpression__Value(), this.getInteger(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOpaqueExpression__IsIntegral(), this.getBoolean(), "isIntegral", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOpaqueExpression__IsPositive(), this.getBoolean(), "isPositive", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOpaqueExpression__IsNonNegative(), this.getBoolean(), "isNonNegative", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityElement_IsOrdered(), this.getBoolean(), "isOrdered", "false", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiplicityElement_IsUnique(), this.getBoolean(), "isUnique", "true", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiplicityElement_Upper(), this.getUnlimitedNatural(), "upper", "1", 0, 1, MultiplicityElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiplicityElement_Lower(), this.getInteger(), "lower", "1", 0, 1, MultiplicityElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicityElement_UpperValue(), this.getValueSpecification(), null, "upperValue", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicityElement_LowerValue(), this.getValueSpecification(), null, "lowerValue", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getMultiplicityElement__SetLower__int(), null, "setLower", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "newLower", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMultiplicityElement__SetUpper__int(), null, "setUpper", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "newUpper", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__GetLower(), this.getInteger(), "getLower", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__GetUpper(), this.getUnlimitedNatural(), "getUpper", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__IsMultivalued(), this.getBoolean(), "isMultivalued", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMultiplicityElement__IncludesCardinality__int(), this.getBoolean(), "includesCardinality", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "C", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMultiplicityElement__IncludesMultiplicity__MultiplicityElement(), this.getBoolean(), "includesMultiplicity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMultiplicityElement(), "M", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__LowerBound(), this.getInteger(), "lowerBound", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__UpperBound(), this.getUnlimitedNatural(), "upperBound", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMultiplicityElement__CompatibleWith__MultiplicityElement(), this.getBoolean(), "compatibleWith", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMultiplicityElement(), "other", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMultiplicityElement__Is__int_int(), this.getBoolean(), "is", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "lowerbound", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "upperbound", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Class(), this.getClass_(), this.getClass_OwnedAttribute(), "class", null, 0, 1, Property.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Datatype(), this.getDataType(), this.getDataType_OwnedAttribute(), "datatype", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_IsDerived(), this.getBoolean(), "isDerived", "false", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_IsDerivedUnion(), this.getBoolean(), "isDerivedUnion", "false", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_Default(), this.getString(), "default", null, 0, 1, Property.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_Aggregation(), this.getAggregationKind(), "aggregation", "none", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_IsComposite(), this.getBoolean(), "isComposite", "false", 1, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_RedefinedProperty(), this.getProperty(), null, "redefinedProperty", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_OwningAssociation(), this.getAssociation(), this.getAssociation_OwnedEnd(), "owningAssociation", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_DefaultValue(), this.getValueSpecification(), null, "defaultValue", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Opposite(), this.getProperty(), null, "opposite", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_SubsettedProperty(), this.getProperty(), null, "subsettedProperty", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Association(), this.getAssociation(), this.getAssociation_MemberEnd(), "association", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getProperty__GetDefault(), this.getString(), "getDefault", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__IsSetDefault(), this.getBoolean(), "isSetDefault", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getProperty__SetDefault__String(), null, "setDefault", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "newDefault", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getProperty__SetIsComposite__boolean(), null, "setIsComposite", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "newIsComposite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getProperty__SetOpposite__Property(), null, "setOpposite", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProperty(), "newOpposite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__UnsetDefault(), null, "unsetDefault", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getProperty__SetIsNavigable__boolean(), null, "setIsNavigable", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "isNavigable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__GetOtherEnd(), this.getProperty(), "getOtherEnd", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getProperty__SetBooleanDefaultValue__boolean(), null, "setBooleanDefaultValue", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBoolean(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getProperty__SetIntegerDefaultValue__int(), null, "setIntegerDefaultValue", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getProperty__SetStringDefaultValue__String(), null, "setStringDefaultValue", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getProperty__SetUnlimitedNaturalDefaultValue__int(), null, "setUnlimitedNaturalDefaultValue", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__SetNullDefaultValue(), null, "setNullDefaultValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getProperty__IsAttribute__Property(), this.getBoolean(), "isAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProperty(), "p", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__GetOpposite(), this.getProperty(), "getOpposite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__IsComposite(), this.getBoolean(), "isComposite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__SubsettingContext(), this.getType(), "subsettingContext", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__IsNavigable(), this.getBoolean(), "isNavigable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(classEClass, RefUML.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_NestedClassifier(), this.getClassifier(), null, "nestedClassifier", null, 0, -1, RefUML.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_SuperClass(), this.getClass_(), null, "superClass", null, 0, -1, RefUML.Class.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClass_IsActive(), this.getBoolean(), "isActive", "false", 1, 1, RefUML.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_OwnedAttribute(), this.getProperty(), this.getProperty_Class(), "ownedAttribute", null, 0, -1, RefUML.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getClass__CreateOwnedOperation__String_EList_EList_Type(), null, "createOwnedOperation", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "parameterNames", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "parameterTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "returnType", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClass__IsMetaclass(), this.getBoolean(), "isMetaclass", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Viewpoint(), this.getString(), "viewpoint", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getModel__IsMetamodel(), this.getBoolean(), "isMetamodel", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_OwnedAttribute(), this.getProperty(), this.getProperty_Datatype(), "ownedAttribute", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDataType__CreateOwnedOperation__String_EList_EList_Type(), null, "createOwnedOperation", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "parameterNames", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "parameterTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "returnType", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDataType__CreateOwnedAttribute__String_Type_int_int(), this.getProperty(), "createOwnedAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getString(), "name", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "type", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getInteger(), "lower", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getUnlimitedNatural(), "upper", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuralFeature_IsReadOnly(), this.getBoolean(), "isReadOnly", "false", 1, 1, StructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringExpression_SubExpression(), this.getStringExpression(), this.getStringExpression_OwningExpression(), "subExpression", null, 0, -1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStringExpression_OwningExpression(), this.getStringExpression(), this.getStringExpression_SubExpression(), "owningExpression", null, 0, 1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Symbol(), this.getString(), "symbol", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExpression_Operand(), this.getValueSpecification(), null, "operand", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageMergeEClass, PackageMerge.class, "PackageMerge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageMerge_MergedPackage(), this.getPackage(), null, "mergedPackage", null, 1, 1, PackageMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageMerge_ReceivingPackage(), this.getPackage(), this.getPackage_PackageMerge(), "receivingPackage", null, 1, 1, PackageMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_OwnedLiteral(), this.getEnumerationLiteral(), this.getEnumerationLiteral_Enumeration(), "ownedLiteral", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationLiteral_Enumeration(), this.getEnumeration(), this.getEnumeration_OwnedLiteral(), "enumeration", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(instanceSpecificationEClass, InstanceSpecification.class, "InstanceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceSpecification_Classifier(), this.getClassifier(), null, "classifier", null, 0, -1, InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstanceSpecification_Slot(), this.getSlot(), this.getSlot_OwningInstance(), "slot", null, 0, -1, InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstanceSpecification_Specification(), this.getValueSpecification(), null, "specification", null, 0, 1, InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(slotEClass, Slot.class, "Slot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlot_DefiningFeature(), this.getStructuralFeature(), null, "definingFeature", null, 1, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSlot_Value(), this.getValueSpecification(), null, "value", null, 0, -1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlot_OwningInstance(), this.getInstanceSpecification(), this.getInstanceSpecification_Slot(), "owningInstance", null, 1, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalSpecificationEClass, LiteralSpecification.class, "LiteralSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalIntegerEClass, LiteralInteger.class, "LiteralInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralInteger_Value(), this.getInteger(), "value", "0", 1, 1, LiteralInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalStringEClass, LiteralString.class, "LiteralString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralString_Value(), this.getString(), "value", null, 0, 1, LiteralString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralBoolean_Value(), this.getBoolean(), "value", "false", 1, 1, LiteralBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalNullEClass, LiteralNull.class, "LiteralNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceValueEClass, InstanceValue.class, "InstanceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceValue_Instance(), this.getInstanceSpecification(), null, "instance", null, 1, 1, InstanceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalUnlimitedNaturalEClass, LiteralUnlimitedNatural.class, "LiteralUnlimitedNatural", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralUnlimitedNatural_Value(), this.getUnlimitedNatural(), "value", "0", 1, 1, LiteralUnlimitedNatural.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PACKAGE);

		initEEnum(aggregationKindEEnum, AggregationKind.class, "AggregationKind");
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.NONE);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.SHARED);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.COMPOSITE);

		// Initialize data types
		initEDataType(integerEDataType, int.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unlimitedNaturalEDataType, int.class, "UnlimitedNatural", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/ocl/examples/OCL
		createOCLAnnotations();
		// union
		createUnionAnnotations();
		// subsets
		createSubsetsAnnotations();
		// duplicates
		createDuplicatesAnnotations();
		// redefines
		createRedefinesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";								
		addAnnotation
		  (getComment_Body(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });																																																																																																																																																																																																																																																																																																					
		addAnnotation
		  (getOpaqueExpression_Body(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });																																																																																																																																																													
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/ocl/examples/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/ocl/examples/OCL";																																								
		addAnnotation
		  (getElement__AllOwnedElements(), 
		   source, 
		   new String[] {
			 "body", "ownedElement->union( ownedElement->collect(e | e.allOwnedElements()) )"
		   });					
		addAnnotation
		  (getElement_OwnedElement(), 
		   source, 
		   new String[] {
			 "derive", "Set {}"
		   });				
		addAnnotation
		  (getElement_Owner(), 
		   source, 
		   new String[] {
			 "derive", "null"
		   });																									
		addAnnotation
		  (getPackage_OwnedType(), 
		   source, 
		   new String[] {
			 "derive", "Set {}"
		   });								
		addAnnotation
		  (getPackage_NestedPackage(), 
		   source, 
		   new String[] {
			 "derive", "Set {}"
		   });				
		addAnnotation
		  (getPackage_NestingPackage(), 
		   source, 
		   new String[] {
			 "derive", "null"
		   });														
		addAnnotation
		  (getNamedElement__AllNamespaces(), 
		   source, 
		   new String[] {
			 "body", "if namespace->isEmpty() then Sequence {} else namespace.allNamespaces()->prepend(namespace) endif"
		   });				
		addAnnotation
		  (getNamedElement__Separator(), 
		   source, 
		   new String[] {
			 "body", "\'::\'"
		   });						
		addAnnotation
		  (getNamedElement_QualifiedName(), 
		   source, 
		   new String[] {
			 "derive", "if ( name->isEmpty() or allNamespaces()->select (ns | ns.name->isEmpty())->notEmpty() ) then\r\n\tnull\t\r\nelse\r\n\tallNamespaces()->iterate( ns : Namespace; all : String =\r\n\tname | ns.name.concat(separator()).concat(all))\r\nendif"
		   });						
		addAnnotation
		  (getNamedElement_Namespace(), 
		   source, 
		   new String[] {
			 "derive", "null"
		   });														
		addAnnotation
		  (getDirectedRelationship_Source(), 
		   source, 
		   new String[] {
			 "derive", "if self.oclIsKindOf(Generalization) then\r\n\tSet{self.oclAsType(Generalization).specific}\r\nelse\r\n\tnull\r\nendif"
		   });					
		addAnnotation
		  (getDirectedRelationship_Target(), 
		   source, 
		   new String[] {
			 "derive", "if self.oclIsKindOf(Generalization) then\r\n\tSet{self.oclAsType(Generalization).general}\r\nelse\r\n\tnull\r\nendif"
		   });					
		addAnnotation
		  (getRelationship_RelatedElement(), 
		   source, 
		   new String[] {
			 "derive", "if self.oclIsKindOf(DirectedRelationship) then\r\n\tself.oclAsType(DirectedRelationship).source->union(self.oclAsType(DirectedRelationship).target)\r\nelse\r\n\tif self.oclIsKindOf(Association) then\r\n\t\tself.oclAsType(Association).endType\r\n\telse\r\n\t\tnull\r\n\tendif\r\nendif"
		   });																								
		addAnnotation
		  (getNamespace_Member(), 
		   source, 
		   new String[] {
			 "derive", "if oclIsKindOf(Association) then\r\n\toclAsType(Association).memberEnd\r\nelse\r\n\tif oclIsKindOf(Classifier) then\r\n\t\toclAsType(Classifier).feature.oclAsType(NamedElement)->union(oclAsType(Classifier).inheritedMember)\r\n\telse\r\n\t\tSet {}\r\n\tendif\r\nendif"
		   });				
		addAnnotation
		  (getNamespace_ImportedMember(), 
		   source, 
		   new String[] {
			 "derive", "Set {}"
		   });					
		addAnnotation
		  (getNamespace_OwnedMember(), 
		   source, 
		   new String[] {
			 "derive", "if oclIsKindOf(Class) then\r\n\toclAsType(Class).ownedAttribute\r\nelse\r\n\tif oclIsKindOf(DataType) then\r\n\t\toclAsType(DataType).ownedAttribute\t\r\n\telse\r\n\t\tif oclIsKindOf(Association) then\r\n\t\t\toclAsType(Association).ownedEnd\r\n\t\telse\r\n\t\t\tSet {}\r\n\t\tendif\r\n\tendif\r\nendif\r\n"
		   });																																																	
		addAnnotation
		  (getType_Package(), 
		   source, 
		   new String[] {
			 "derive", "null"
		   });												
		addAnnotation
		  (getAssociation_EndType(), 
		   source, 
		   new String[] {
			 "derive", "self.memberEnd->collect(e | e.type)"
		   });											
		addAnnotation
		  (getClassifier__Parents(), 
		   source, 
		   new String[] {
			 "body", "generalization.general"
		   });							
		addAnnotation
		  (getClassifier__Inherit__EList(), 
		   source, 
		   new String[] {
			 "body", "inhs"
		   });				
		addAnnotation
		  (getClassifier__AllParents(), 
		   source, 
		   new String[] {
			 "body", "self.parents()->union(self.parents()->collect(p | p.allParents()))"
		   });		
		addAnnotation
		  (getClassifier__HasKindAncestor(), 
		   source, 
		   new String[] {
			 "body", "allParents()->including(self)->exists ( x | x.oclIsKindOf (Kind) )"
		   });		
		addAnnotation
		  (getClassifier__HasQuantityAncestor(), 
		   source, 
		   new String[] {
			 "body", "allParents()->including(self)->exists ( x | x.oclIsKindOf (Quantity) )"
		   });		
		addAnnotation
		  (getClassifier__HasCollectiveAncestor(), 
		   source, 
		   new String[] {
			 "body", "allParents()->including(self)->exists ( x | x.oclIsKindOf (Collective) )"
		   });		
		addAnnotation
		  (getClassifier__HasKindOffspring(), 
		   source, 
		   new String[] {
			 "body", "ObjectClass.allInstances()->select ( x | x.allParents()->includes(self) )->forAll ( y | not y.hasQuantityAncestor() and not y.hasCollectiveAncestor() )"
		   });		
		addAnnotation
		  (getClassifier__HasQuantityOffspring(), 
		   source, 
		   new String[] {
			 "body", "ObjectClass.allInstances()->select ( x | x.allParents()->includes(self) )->forAll ( y | not y.hasKindAncestor() and not y.hasCollectiveAncestor() )"
		   });		
		addAnnotation
		  (getClassifier__HasCollectiveOffspring(), 
		   source, 
		   new String[] {
			 "body", "ObjectClass.allInstances()->select ( x | x.allParents()->includes(self) )->forAll ( y | not y.hasKindAncestor() and not y.hasQuantityAncestor() )"
		   });		
		addAnnotation
		  (getClassifier__HasFunctionalComplexInstances(), 
		   source, 
		   new String[] {
			 "body", "if oclIsKindOf (SortalClass) then\r\n\thasKindAncestor()\r\nelse\r\n\tif oclIsKindOf (MixinClass) then\r\n\t\thasKindOffspring()\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nendif"
		   });		
		addAnnotation
		  (getClassifier__HasQuantityInstances(), 
		   source, 
		   new String[] {
			 "body", "if oclIsKindOf (SortalClass) then\r\n\thasQuantityAncestor()\r\nelse\r\n\tif oclIsKindOf (MixinClass) then\r\n\t\thasQuantityOffspring()\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nendif"
		   });		
		addAnnotation
		  (getClassifier__HasCollectiveInstances(), 
		   source, 
		   new String[] {
			 "body", "if oclIsKindOf (SortalClass) then\r\n\thasCollectiveAncestor()\r\nelse\r\n\tif oclIsKindOf (MixinClass) then\r\n\t\thasCollectiveOffspring()\r\n\telse\r\n\t\tfalse\r\n\tendif\r\nendif"
		   });									
		addAnnotation
		  (getClassifier_Feature(), 
		   source, 
		   new String[] {
			 "derive", "if oclIsKindOf(Association) then\r\n\toclAsType(Association).ownedEnd\r\nelse\r\n\tattribute\r\nendif"
		   });				
		addAnnotation
		  (getClassifier_InheritedMember(), 
		   source, 
		   new String[] {
			 "derive", "Set {}"
		   });					
		addAnnotation
		  (getClassifier_General(), 
		   source, 
		   new String[] {
			 "derive", "parents()"
		   });					
		addAnnotation
		  (getClassifier_Attribute(), 
		   source, 
		   new String[] {
			 "derive", "if self.oclIsKindOf(Class) then\r\n\tself.oclAsType(Class).ownedAttribute\r\nelse\r\n\tif self.oclIsKindOf(DataType) then\r\n\t\tself.oclAsType(DataType).ownedAttribute\r\n\telse\r\n\t\tSet {}\r\n\tendif\r\nendif"
		   });								
		addAnnotation
		  (getRedefinableElement_RedefinedElement(), 
		   source, 
		   new String[] {
			 "derive", "Set {}"
		   });				
		addAnnotation
		  (getRedefinableElement_RedefinitionContext(), 
		   source, 
		   new String[] {
			 "derive", "Set {}"
		   });																		
		addAnnotation
		  (getFeature_FeaturingClassifier(), 
		   source, 
		   new String[] {
			 "derive", "Set {}"
		   });																					
		addAnnotation
		  (getMultiplicityElement__LowerBound(), 
		   source, 
		   new String[] {
			 "body", "if lowerValue->isEmpty() then 1 else lowerValue.oclAsType(LiteralInteger).value endif"
		   });			
		addAnnotation
		  (getMultiplicityElement__UpperBound(), 
		   source, 
		   new String[] {
			 "body", "if upperValue->isEmpty() then 1 else upperValue.oclAsType(LiteralUnlimitedNatural).value endif"
		   });							
		addAnnotation
		  (getMultiplicityElement_Upper(), 
		   source, 
		   new String[] {
			 "derive", "upperBound()"
		   });			
		addAnnotation
		  (getMultiplicityElement_Lower(), 
		   source, 
		   new String[] {
			 "derive", "lowerBound()"
		   });																																						
		addAnnotation
		  (getProperty_Default(), 
		   source, 
		   new String[] {
			 "derive", "null"
		   });				
		addAnnotation
		  (getProperty_IsComposite(), 
		   source, 
		   new String[] {
			 "derive", "self.aggregation = AggregationKind::composite"
		   });									
		addAnnotation
		  (getProperty_Opposite(), 
		   source, 
		   new String[] {
			 "derive", "if self.association.memberEnd->size() = 2 then\r\n\tlet otherEnd : Property  = association.memberEnd->any( x | x <> self) in \r\n\r\n\tif self.owningAssociation->isEmpty() then\r\n\t\tif otherEnd.owningAssociation->isEmpty() then\r\n\t\t\totherEnd\r\n\t\telse\r\n\t\t\tnull\r\n\t\tendif\r\n\telse\r\n\t\totherEnd\r\n\tendif\r\nelse\r\n\tnull\r\nendif"
		   });																
		addAnnotation
		  (getClass_SuperClass(), 
		   source, 
		   new String[] {
			 "derive", "Set {}"
		   });																																																																									
	}

	/**
	 * Initializes the annotations for <b>union</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnionAnnotations() {
		String source = "union";																																											
		addAnnotation
		  (getElement_OwnedElement(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getElement_Owner(), 
		   source, 
		   new String[] {
		   });																																																													
		addAnnotation
		  (getNamedElement_Namespace(), 
		   source, 
		   new String[] {
		   });														
		addAnnotation
		  (getDirectedRelationship_Source(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getDirectedRelationship_Target(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getRelationship_RelatedElement(), 
		   source, 
		   new String[] {
		   });																								
		addAnnotation
		  (getNamespace_Member(), 
		   source, 
		   new String[] {
		   });								
		addAnnotation
		  (getNamespace_OwnedMember(), 
		   source, 
		   new String[] {
		   });																																																																																																
		addAnnotation
		  (getClassifier_Feature(), 
		   source, 
		   new String[] {
		   });												
		addAnnotation
		  (getClassifier_Attribute(), 
		   source, 
		   new String[] {
		   });								
		addAnnotation
		  (getRedefinableElement_RedefinedElement(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getRedefinableElement_RedefinitionContext(), 
		   source, 
		   new String[] {
		   });																		
		addAnnotation
		  (getFeature_FeaturingClassifier(), 
		   source, 
		   new String[] {
		   });																																																																																																																																																																							
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";																																																	
		addAnnotation
		  (getElement_OwnedComment(), 
		   source, 
		   new String[] {
		   });																						
		addAnnotation
		  (getPackage_OwnedType(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getPackage_PackageMerge(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getPackage_PackagedElement(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getPackage_NestedPackage(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getPackage_NestingPackage(), 
		   source, 
		   new String[] {
		   });																										
		addAnnotation
		  (getNamedElement_Namespace(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getNamedElement_NameExpression(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getDependency_Supplier(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getDependency_Client(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getDirectedRelationship_Source(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getDirectedRelationship_Target(), 
		   source, 
		   new String[] {
		   });																							
		addAnnotation
		  (getNamespace_ElementImport(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getNamespace_PackageImport(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getNamespace_OwnedRule(), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  (getNamespace_ImportedMember(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getNamespace_OwnedMember(), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (getElementImport_ImportedElement(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getElementImport_ImportingNamespace(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getPackageImport_ImportedPackage(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getPackageImport_ImportingNamespace(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getConstraintx_Specification(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getConstraintx_Context(), 
		   source, 
		   new String[] {
		   });																												
		addAnnotation
		  (getType_Package(), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  (getAssociation_OwnedEnd(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getAssociation_MemberEnd(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getAssociation_EndType(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getAssociation_NavigableOwnedEnd(), 
		   source, 
		   new String[] {
		   });																														
		addAnnotation
		  (getClassifier_Generalization(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getClassifier_Feature(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getClassifier_InheritedMember(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getClassifier_RedefinedClassifier(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getClassifier_Attribute(), 
		   source, 
		   new String[] {
		   });																	
		addAnnotation
		  (getGeneralization_General(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getGeneralization_Specific(), 
		   source, 
		   new String[] {
		   });																																											
		addAnnotation
		  (getMultiplicityElement_UpperValue(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getMultiplicityElement_LowerValue(), 
		   source, 
		   new String[] {
		   });																												
		addAnnotation
		  (getProperty_Class(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getProperty_Datatype(), 
		   source, 
		   new String[] {
		   });										
		addAnnotation
		  (getProperty_RedefinedProperty(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getProperty_OwningAssociation(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getProperty_DefaultValue(), 
		   source, 
		   new String[] {
		   });															
		addAnnotation
		  (getClass_NestedClassifier(), 
		   source, 
		   new String[] {
		   });																						
		addAnnotation
		  (getDataType_OwnedAttribute(), 
		   source, 
		   new String[] {
		   });								
		addAnnotation
		  (getStringExpression_SubExpression(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getStringExpression_OwningExpression(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getExpression_Operand(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getPackageMerge_MergedPackage(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getPackageMerge_ReceivingPackage(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getEnumeration_OwnedLiteral(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getEnumerationLiteral_Enumeration(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getInstanceSpecification_Slot(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getInstanceSpecification_Specification(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getSlot_Value(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getSlot_OwningInstance(), 
		   source, 
		   new String[] {
		   });																			
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";																																																			
		addAnnotation
		  (packageEClass, 
		   source, 
		   new String[] {
		   });																																	
		addAnnotation
		  (packageableElementEClass, 
		   source, 
		   new String[] {
		   });																																																																																																		
		addAnnotation
		  (valueSpecificationEClass, 
		   source, 
		   new String[] {
		   });																																										
		addAnnotation
		  (classifierEClass, 
		   source, 
		   new String[] {
		   });																																																																									
		addAnnotation
		  (opaqueExpressionEClass, 
		   source, 
		   new String[] {
		   });																																			
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
		   });																																															
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
		   });																		
		addAnnotation
		  (dataTypeEClass, 
		   source, 
		   new String[] {
		   });																		
		addAnnotation
		  (stringExpressionEClass, 
		   source, 
		   new String[] {
		   });																																				
		addAnnotation
		  (literalIntegerEClass, 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (literalStringEClass, 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (literalBooleanEClass, 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (literalNullEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (instanceValueEClass, 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (literalUnlimitedNaturalEClass, 
		   source, 
		   new String[] {
		   });	
	}

	/**
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines";																																																																																																																																																																																																																																							
		addAnnotation
		  (getClassifier__ConformsTo__Classifier(), 
		   source, 
		   new String[] {
		   });																																																																																																																																																									
		addAnnotation
		  (getClass_SuperClass(), 
		   source, 
		   new String[] {
		   });																																																																										
	}

} //RefUMLPackageImpl
