/*
 * Copyright (C) 2008 feilong (venusdrogon@163.com)
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
package com.feilong.spring.jdbc.datasource;

import com.feilong.core.util.Validator;

/**
 * The Class MultipleGroupReadWriteUtil.
 *
 * @author <a href="mailto:venusdrogon@163.com">feilong</a>
 * @version 1.1.1 2015年4月5日 下午11:56:50
 * @since 1.1.1
 */
public class MultipleGroupReadWriteUtil{

    /** 默认的组名 <code>{@value}</code>. */
    static final String DEFAULT_GROUP_NAME = "default";

    /**
     * Gets the target data sources key.
     * 
     * @param groupName
     *            the group name
     * @param readWriteSupportType
     *            the read write support type
     * @return the target data sources key
     * @since 1.1.1
     */
    public static String getTargetDataSourcesKey(String groupName,String readWriteSupportType){
        if (Validator.isNullOrEmpty(groupName)){
            groupName = DEFAULT_GROUP_NAME;
        }
        return groupName + "@" + readWriteSupportType;
    }
}
