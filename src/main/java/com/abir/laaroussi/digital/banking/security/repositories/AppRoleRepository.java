package com.abir.laaroussi.digital.banking.security.repositories;

import com.abir.laaroussi.digital.banking.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findAppRoleByRoleName(String username);
}
