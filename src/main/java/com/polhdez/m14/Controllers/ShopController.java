package com.polhdez.m14.Controllers;

import com.polhdez.m14.Beans.Painting;
import com.polhdez.m14.Beans.Shop;
import com.polhdez.m14.Repositories.PaintingRepository;
import com.polhdez.m14.Repositories.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Transactional
@RestController
@RequestMapping("/shops")
public class ShopController {
    @Autowired
    private ShopRepository shopRepository;
    @Autowired
    private PaintingRepository paintingRepository;

    @GetMapping("")
    public List<Shop> getShops()  {
        return shopRepository.findAll();
    }

    @PostMapping("")
    public Shop addShop(@RequestParam String name, @RequestParam int capacity) {
        Shop shop = new Shop(name, capacity);
        return shopRepository.save(shop);
    }

    @PostMapping("{id}/paintings")
    public Painting addPainting(@PathVariable(value = "id") int id, @RequestParam String name, @RequestParam String author) {
        Painting painting = new Painting(name, author, id);
        return paintingRepository.save(painting);
    }

    @GetMapping("{id}/paintings")
    public List<Painting> getAllPaintings(@PathVariable(value = "id") int id)  {
        return this.paintingRepository.findAllByShopid(id);
    }

    @DeleteMapping("{id}/paintings")
    public List<Painting> deleteAllPaintings(@PathVariable(value = "id") int id)  {
        this.paintingRepository.deleteAllByShopid(id);
        return this.paintingRepository.findAllByShopid(id);
    }
}
