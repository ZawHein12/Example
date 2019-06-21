package com.zh.spring.ZhProject.repo;

import java.util.List;

import com.zh.spring.ZhProject.controller.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
