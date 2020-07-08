package com.example.reactivespringboot.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Reservation {

    @Id
    private String id;
    private String name;

    public Reservation() {
    }

    public Reservation(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Reservation(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return "Reservation(" + this.getId() + ", " + this.getName() + ")";
    }

    protected boolean canEqual(Object other) {
        return other instanceof Reservation;
    }

    @Override public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Reservation)) return false;
        Reservation other = (Reservation) o;
        if (!other.canEqual((Object)this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        return true;
    }

    @Override public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result*PRIME) + (this.getName() == null ? 43 : this.getName().hashCode());
        return result;
    }

}
