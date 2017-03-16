package com.alexfrei.jsf.web.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;

/**
 * Created by AlexFrei on 16.03.17.
 */
@Entity
public class Book {
    private long id;
    private String name;
    private byte[] content;
    private int pageCount;
    private String isbn;
    private long genreId;
    private long autorId;
    private int publishYear;
    private long publisherId;
    private byte[] image;
    private String descr;
    private Integer rating;
    private Long voteCount;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "content")
    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Basic
    @Column(name = "page_count")
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Basic
    @Column(name = "isbn")
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "genre_id")
    public long getGenreId() {
        return genreId;
    }

    public void setGenreId(long genreId) {
        this.genreId = genreId;
    }

    @Basic
    @Column(name = "autor_id")
    public long getAutorId() {
        return autorId;
    }

    public void setAutorId(long autorId) {
        this.autorId = autorId;
    }

    @Basic
    @Column(name = "publish_year")
    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Basic
    @Column(name = "publisher_id")
    public long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(long publisherId) {
        this.publisherId = publisherId;
    }

    @Basic
    @Column(name = "image")
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Basic
    @Column(name = "descr")
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Basic
    @Column(name = "rating")
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "vote_count")
    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (pageCount != book.pageCount) return false;
        if (genreId != book.genreId) return false;
        if (autorId != book.autorId) return false;
        if (publishYear != book.publishYear) return false;
        if (publisherId != book.publisherId) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (!Arrays.equals(content, book.content)) return false;
        if (isbn != null ? !isbn.equals(book.isbn) : book.isbn != null) return false;
        if (!Arrays.equals(image, book.image)) return false;
        if (descr != null ? !descr.equals(book.descr) : book.descr != null) return false;
        if (rating != null ? !rating.equals(book.rating) : book.rating != null) return false;
        if (voteCount != null ? !voteCount.equals(book.voteCount) : book.voteCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(content);
        result = 31 * result + pageCount;
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (int) (genreId ^ (genreId >>> 32));
        result = 31 * result + (int) (autorId ^ (autorId >>> 32));
        result = 31 * result + publishYear;
        result = 31 * result + (int) (publisherId ^ (publisherId >>> 32));
        result = 31 * result + Arrays.hashCode(image);
        result = 31 * result + (descr != null ? descr.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (voteCount != null ? voteCount.hashCode() : 0);
        return result;
    }
}
