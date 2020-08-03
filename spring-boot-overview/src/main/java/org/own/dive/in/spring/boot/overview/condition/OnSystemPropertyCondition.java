package org.own.dive.in.spring.boot.overview.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ObjectUtils;

import java.util.Map;

public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Map<String, Object> map = annotatedTypeMetadata.getAnnotationAttributes(ConditionOnSystemProperty.class.getName());

        String name = String.valueOf(map.get("name"));
        String value = String.valueOf(map.get("value"));

        String propertyName = System.getProperty(name);

        return ObjectUtils.nullSafeEquals(value, propertyName);
    }
}
