package com.jc.gymbasicsystem.application.services.interfaces;

import com.jc.gymbasicsystem.application.dto.member.CreateMemberDto;
import com.jc.gymbasicsystem.domain.entities.MemberEntity;

import java.util.List;

public interface IMemberService {

        List<MemberEntity> getAllMembers();

        MemberEntity getMemberById(String memberId);

        MemberEntity createMember(CreateMemberDto createMemberDto);

        MemberEntity updateMember();

        void deleteMember();
}
