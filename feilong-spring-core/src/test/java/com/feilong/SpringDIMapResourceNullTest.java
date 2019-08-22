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
package com.feilong;

import static java.util.Collections.emptyMap;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "classpath:spring-DI-Map.xml" })
public class SpringDIMapResourceNullTest extends AbstractJUnit4SpringContextTests{

    @Value("#{getObject('sanguoMap')}")
    private Map<String, Object>       map;

    @Value("#{getObject('sanguoMap2')}")
    private final Map<String, Object> map2 = emptyMap();

    //map sanguoMap

    @Test
    public void test(){
        assertThat(map.get("五子良将"), allOf(hasProperty("isSuccess", is(false)), hasProperty("description", is("哈哈哈"))));
        assertThat(map.get("八虎骑"), allOf(hasProperty("isSuccess", is(true)), hasProperty("description", is("呵呵呵"))));
    }

}