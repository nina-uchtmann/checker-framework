package org.checkerframework.checker.signedness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * The value represents a bit pattern, not an arithmetic quantity. Bit patterns are used for values
 * that are manipulated as a pattern of bits rather than as a numeric quantity. Examples include the
 * return values of {@code Double.doubleToLongBits} and {@code Float.floatToIntBits}, as well as
 * values used as bitsets.
 *
 * <p>All bitwise operations (e.g., {@code &}, {@code |}, {@code ^}, {@code ~}, {@code <<}, {@code
 * >>}, {@code >>>}) are permitted on {@code @BitPattern} values. Arithmetic operations (e.g.,
 * {@code +}, {@code -}, {@code *}, {@code /}, {@code %}, {@code ++}, {@code --}) are forbidden on
 * {@code @BitPattern} values because they do not represent arithmetic quantities.
 *
 * <p>This type qualifier is a subtype of {@link UnknownSignedness} and a supertype of {@link
 * SignednessBottom}, but is incomparable to {@link Signed} and {@link Unsigned}.
 *
 * @checker_framework.manual #signedness-checker Signedness Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({UnknownSignedness.class})
public @interface BitPattern {}
