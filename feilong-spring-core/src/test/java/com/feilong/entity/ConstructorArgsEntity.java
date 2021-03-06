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
package com.feilong.entity;

/**
 * The Class ConstructorPropertiesEntity.
 *
 * @author <a href="http://feitianbenyue.iteye.com/">feilong</a>
 * @since 1.1.1
 */
public class ConstructorArgsEntity{

    /** The name. */
    private String[] names;

    /** The ages. */
    private int[]    ages;

    //---------------------------------------------------------------

    /**
     * The Constructor.
     *
     * @param names
     *            the names
     */
    public ConstructorArgsEntity(String...names){
        this.names = names;
    }

    /**
     * Instantiates a new constructor args entity.
     *
     * @param ages
     *            the ages
     */
    public ConstructorArgsEntity(int[] ages){
        this.ages = ages;
    }

    //---------------------------------------------------------------

    /**
     * 获得 name.
     *
     * @return the names
     */
    public String[] getNames(){
        return names;
    }

    /**
     * 设置 name.
     *
     * @param names
     *            the names to set
     */
    public void setNames(String[] names){
        this.names = names;
    }

    /**
     * Gets the ages.
     *
     * @return the ages
     */
    public int[] getAges(){
        return ages;
    }

    /**
     * Sets the ages.
     *
     * @param ages
     *            the ages to set
     */
    public void setAges(int[] ages){
        this.ages = ages;
    }

}
