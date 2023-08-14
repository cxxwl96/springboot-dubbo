/*
 * Copyright (c) 2021-2023, cxxwl96.com (cxxwl96@sina.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cxxwl96.springbootdubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cxxwl96.springbootdubbo.api.UserService;
import org.springframework.stereotype.Component;

/**
 * UserServiceImpl
 *
 * @author cxxwl96
 * @since 2023/8/14 22:55
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public String test(String name) {
        return "test " + name;
    }
}
