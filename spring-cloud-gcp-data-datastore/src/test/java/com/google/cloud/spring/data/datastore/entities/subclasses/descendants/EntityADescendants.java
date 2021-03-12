package com.google.cloud.spring.data.datastore.entities.subclasses.descendants;

import com.google.cloud.datastore.Key;
import com.google.cloud.spring.data.datastore.core.mapping.DiscriminatorField;
import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "A")
@DiscriminatorField(field = "type")
public abstract class EntityADescendants {
    @Id
    private Key id;

    public Key getId() {
        return id;
    }
}