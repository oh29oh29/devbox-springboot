package com.oh29oh29.jpa.repository

import com.oh29oh29.jpa.entity.Member
import org.h2.engine.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface MemberRepository : JpaRepository<Member, Long> {

    @Query(
        """
        select
            m
        from
            Member m
        where
            m.address = :address and
            m.email = :email
        """
    )
    fun findByCondition(address: String, email: String): Member
}