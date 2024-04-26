package com.temple.Vittheshwar.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.temple.Vittheshwar.Model.TempleEvent;

public interface TempleEventRepository extends JpaRepository<TempleEvent, Long> {
    // Additional query methods can be added here
}