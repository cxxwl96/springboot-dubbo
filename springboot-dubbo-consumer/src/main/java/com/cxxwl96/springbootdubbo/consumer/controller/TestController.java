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
package com.cxxwl96.springbootdubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cxxwl96.springbootdubbo.api.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author cxxwl96
 * @since 2023/8/14 22:56
 */
@RestController
public class TestController {
    @Reference
    private UserService userService;

    @GetMapping("/test/{name}")
    public String test(@PathVariable String name) {
        return userService.test(name);
    }
}
