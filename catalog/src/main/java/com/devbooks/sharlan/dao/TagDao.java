package com.devbooks.sharlan.dao;

import com.devbooks.sharlan.entities.Tag;

import java.util.List;
import java.util.Set;

public interface TagDao {

    Tag findById(long id);

    Tag save(Tag tag);

    void saveAll(Set<Tag> tags);

    Tag update(Tag tag);

    void delete(Tag tag);

    void delete(long id);

    List<Tag> findAll();
}
