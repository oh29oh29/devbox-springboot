package com.oh29oh29.jpa.repository

import com.oh29oh29.jpa.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long>