package org.mongodb.morphia.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a text index for this entity.  Text indexes are limited to one per collection.
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface TextIndex {
    /**
     * List of fields to include in the index.  If no fields are listed, all fields are used as discussed 
     * {@link "http://docs.mongodb.org/manual/tutorial/create-text-index-on-multiple-fields/#index-all-fields" here}
     */
    String[] value() default {};
    
    /**
     * Weights of the fields.  Weights take form of "field:weight".  If a field is omitted from this item, the weight is assumed
     * to the database default.
     */
    String[] weights() default {};

    /**
     * Name of the index
     */
    String name() default "";

    /**
     * Default language for the index.
     */
    String language() default "";
    
    /**
     * The field to use to override the default language.
     */
    String languageOverride() default "";
}