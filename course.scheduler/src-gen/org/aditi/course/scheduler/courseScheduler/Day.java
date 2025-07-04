/**
 * generated by Xtext 2.38.0
 */
package org.aditi.course.scheduler.courseScheduler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Day</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.aditi.course.scheduler.courseScheduler.CourseSchedulerPackage#getDay()
 * @model
 * @generated
 */
public enum Day implements Enumerator
{
  /**
   * The '<em><b>Mon</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MON_VALUE
   * @generated
   * @ordered
   */
  MON(0, "Mon", "Mon"),

  /**
   * The '<em><b>Tue</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TUE_VALUE
   * @generated
   * @ordered
   */
  TUE(1, "Tue", "Tue"),

  /**
   * The '<em><b>Wed</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WED_VALUE
   * @generated
   * @ordered
   */
  WED(2, "Wed", "Wed"),

  /**
   * The '<em><b>Thu</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #THU_VALUE
   * @generated
   * @ordered
   */
  THU(3, "Thu", "Thu"),

  /**
   * The '<em><b>Fri</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRI_VALUE
   * @generated
   * @ordered
   */
  FRI(4, "Fri", "Fri"),

  /**
   * The '<em><b>Sat</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAT_VALUE
   * @generated
   * @ordered
   */
  SAT(5, "Sat", "Sat"),

  /**
   * The '<em><b>Sun</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUN_VALUE
   * @generated
   * @ordered
   */
  SUN(6, "Sun", "Sun");

  /**
   * The '<em><b>Mon</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MON
   * @model name="Mon"
   * @generated
   * @ordered
   */
  public static final int MON_VALUE = 0;

  /**
   * The '<em><b>Tue</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TUE
   * @model name="Tue"
   * @generated
   * @ordered
   */
  public static final int TUE_VALUE = 1;

  /**
   * The '<em><b>Wed</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WED
   * @model name="Wed"
   * @generated
   * @ordered
   */
  public static final int WED_VALUE = 2;

  /**
   * The '<em><b>Thu</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #THU
   * @model name="Thu"
   * @generated
   * @ordered
   */
  public static final int THU_VALUE = 3;

  /**
   * The '<em><b>Fri</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRI
   * @model name="Fri"
   * @generated
   * @ordered
   */
  public static final int FRI_VALUE = 4;

  /**
   * The '<em><b>Sat</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAT
   * @model name="Sat"
   * @generated
   * @ordered
   */
  public static final int SAT_VALUE = 5;

  /**
   * The '<em><b>Sun</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUN
   * @model name="Sun"
   * @generated
   * @ordered
   */
  public static final int SUN_VALUE = 6;

  /**
   * An array of all the '<em><b>Day</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Day[] VALUES_ARRAY =
    new Day[]
    {
      MON,
      TUE,
      WED,
      THU,
      FRI,
      SAT,
      SUN,
    };

  /**
   * A public read-only list of all the '<em><b>Day</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Day> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Day</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Day get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Day result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Day</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Day getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Day result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Day</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Day get(int value)
  {
    switch (value)
    {
      case MON_VALUE: return MON;
      case TUE_VALUE: return TUE;
      case WED_VALUE: return WED;
      case THU_VALUE: return THU;
      case FRI_VALUE: return FRI;
      case SAT_VALUE: return SAT;
      case SUN_VALUE: return SUN;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Day(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Day
