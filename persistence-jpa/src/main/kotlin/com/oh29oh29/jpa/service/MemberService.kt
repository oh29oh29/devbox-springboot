package com.oh29oh29.jpa.service

import com.oh29oh29.jpa.entity.Member
import com.oh29oh29.jpa.repository.MemberRepository
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository,
) {

    init {
        save()
        println(select())
    }

    private fun save() {
        memberRepository.save(
            Member(
                "user name",
                "address",
                "01012341234",
                "dev@dev.com"
            )
        )
    }

    private fun select() =
        memberRepository.findByCondition("address", "dev@dev.com")
}