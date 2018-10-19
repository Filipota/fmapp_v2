package com.fminzynieria.fmapp_v2.repository;

import com.fminzynieria.fmapp_v2.entity.GuestPostEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestPostRepository extends CrudRepository<GuestPostEntity, Long> {
}
