package com.jmt.member.repositories;

import com.jmt.global.entities.SessionEntity;
import org.springframework.data.repository.CrudRepository;

public interface SessionRepository extends CrudRepository<SessionEntity, String> {

}