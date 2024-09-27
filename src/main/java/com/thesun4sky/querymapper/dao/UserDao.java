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
package com.thesun4sky.querymapper.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.thesun4sky.querymapper.domain.User;

@Component
public class UserDao {

  private final SqlSession sqlSession;

  // SqlSession 생성자 주입
  public UserDao(SqlSession sqlSession) {
    this.sqlSession = sqlSession;
  }

  /*
  selectOne() 메서드 실행
   - 첫번째 매개변수, Statement : 쿼리 id와 매핑되어 쿼리를 실행
   - 두번째 파라미터, ... : 쿼리에 들어가는 파라미터

   쿼리 실행 결과 응답 객체를 어떻게 User에 매핑하나요?
    : /resources/mapper/UserMapper.xml 파일의 resultType = "User" 설정을 해 주어야 합니다.
   */
  public User selectUserById(long id) {
    return this.sqlSession.selectOne("selectUserById", id);
  }

}
