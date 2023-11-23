package com.jc.gymbasicsystem.domain.usercases.member;

import com.jc.gymbasicsystem.application.dto.member.CreateMemberDto;
import com.jc.gymbasicsystem.domain.entities.MemberEntity;
import com.jc.gymbasicsystem.domain.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateMemberUseCase {

    @Autowired
    private MemberRepository memberRepository;

    public CreateMemberUseCase(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public MemberEntity execute(CreateMemberDto createMemberDto) {
        MemberEntity member = new MemberEntity();
        member.setFirstName(createMemberDto.getFirstName());
        member.setLastName(createMemberDto.getLastName());
        member.setDni(createMemberDto.getDni());
        member.setPhoneNumber(createMemberDto.getPhoneNumber());
        member.setEmail(createMemberDto.getEmail());
        member.setActive(true);

        return memberRepository.save(member);
    }
}
