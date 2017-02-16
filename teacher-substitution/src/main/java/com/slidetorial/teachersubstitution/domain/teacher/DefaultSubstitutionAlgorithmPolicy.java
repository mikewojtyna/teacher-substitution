/**
 *
 */
package com.slidetorial.teachersubstitution.domain.teacher;

/**
 * The default substitution algorithm policy. This policy uses the following
 * rules:
 *
 * <ol>
 * <li>If teacher is not available at time lesson takes place - she is
 * automatically disqualified</li>
 * <li>If teacher has matching qualifications (she can advance the core
 * curriculum of the subject) and is available, the score is automatically the
 * highest possible</li>
 * <li>If teacher just finished her work and lesson takes place at the same
 * time, she is a possible candidate</li>
 * <li>If lesson takes place before teacher started her first lesson, the score
 * is the same as in previous point</li>
 * <li>If two teachers have the same qualifications, the one with highest
 * seniority wins</li>
 * </ol>
 *
 * @author goobar
 *
 */
public class DefaultSubstitutionAlgorithmPolicy
	implements SubstitutionAlgorithmPolicy
{

}
