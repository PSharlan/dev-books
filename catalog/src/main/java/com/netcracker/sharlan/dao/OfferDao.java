package com.netcracker.sharlan.dao;

import com.netcracker.sharlan.bean.Category;
import com.netcracker.sharlan.bean.Offer;
import com.netcracker.sharlan.bean.Tag;

import java.util.Set;

public interface OfferDao {

    Offer findById(long id);

    Offer save(Offer offer);

    Offer update(Offer offer);

    void delete(Offer offer);

    void delete(long id);

    Set<Offer> findByTag(Tag tag);

    Set<Offer> findByCategory(Category category);

    Set<Offer> findByPrice(double price);

    Offer addTag(Offer offer, Tag tag);

    Offer deleteTag(Offer offer, Tag tag);

    Offer updateTags(Offer offer, Set<Tag> tags);

    Offer updateCategory(Offer offer, Category category);
}