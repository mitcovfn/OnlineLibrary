package com.library.objects;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.library.entities.Genre;
import com.library.enums.SearchType;

import java.io.Serializable;

@Component
@Scope("singleton")
public class SearchCriteria implements Serializable{

    private String text;

    private SearchType searchType;

    private Character letter;

    private Genre genre;




    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SearchType getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}