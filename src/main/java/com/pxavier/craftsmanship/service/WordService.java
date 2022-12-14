package com.pxavier.craftsmanship.service;

import com.pxavier.craftsmanship.pojo.Word;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordService {

    public List<Word> wordsList = new ArrayList<>();
    public List<Word> getWordsList(){
        return wordsList;
    }

    public void addWord(Word word){
        wordsList.add(new Word(word.word(), word.translations()));
    }
}
