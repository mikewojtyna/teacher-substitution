/**
 *
 */
package com.slidetorial.teachersubstitution;

import org.junit.runner.RunWith;
import com.googlecode.junittoolbox.ExcludeCategories;
import com.googlecode.junittoolbox.SuiteClasses;
import com.googlecode.junittoolbox.WildcardPatternSuite;

/**
 * @author goobar
 *
 */
@RunWith(WildcardPatternSuite.class)
@ExcludeCategories({ IntegrationTestMarker.class })
@SuiteClasses(value = { "**/**Test.class" })
public class UnitTests
{

}
