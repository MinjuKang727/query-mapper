/*
 *    Copyright 2015-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.thesun4sky.querymapper.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.thesun4sky.querymapper.domain.User;

// DAO를 이용한 방법보다 더 간단한 Mapper 인터페이스를 이용한 방법!
@Mapper  // @Mapper Annotation을 꼭 붙여 주어야 함. > iBatis가 자동으로 클래스를 만들어 줌
public interface UserMapper {

  // UserMapper.xml에서 설정해 준 id와 메소드명이 일치해야 함.
  User selectUserById(@Param("id") Long id);  // 이 메서드를 실행하면 UserMapper에서 .xml 파일의 쿼리를 DAO를 이용한 방법과 동일하게 실행

}
