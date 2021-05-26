package com.polhdez.m14.Repositories;

import com.polhdez.m14.Beans.Painting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaintingRepository extends JpaRepository<Painting,Integer> {
    void deleteAllByShopid(int id);
    List<Painting> findAllByShopid(int id);
}
