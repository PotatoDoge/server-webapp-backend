package io.potatodoge.server.repo;

import io.potatodoge.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ServerRepo extends JpaRepository <Server, Long> {
    Server findByIpAddress(String ipAddress);
}
