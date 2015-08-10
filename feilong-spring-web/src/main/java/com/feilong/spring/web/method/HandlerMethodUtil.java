/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.spring.web.method;

import java.lang.reflect.Method;

import org.springframework.web.method.HandlerMethod;

/**
 * The Class HandlerMethodUtil.
 *
 * @author feilong
 * @version 1.4.0 2015年8月10日 下午10:04:22
 * @since 1.4.0
 */
public class HandlerMethodUtil{

    /**
     * 获得 handler method name.
     *
     * @param handlerMethod
     *            the handler method
     * @return the handler method name
     */
    public static String getHandlerMethodName(HandlerMethod handlerMethod){
        Method method = handlerMethod.getMethod();
        return method.getName();
    }

    /**
     * 获得 declaring class simple name.
     *
     * @param handlerMethod
     *            the handler method
     * @return the declaring class simple name
     */
    public static String getDeclaringClassSimpleName(HandlerMethod handlerMethod){
        Method method = handlerMethod.getMethod();
        return method.getDeclaringClass().getSimpleName();
    }
}
