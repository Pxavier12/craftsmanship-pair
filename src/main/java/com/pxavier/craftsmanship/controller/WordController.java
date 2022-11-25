package com.pxavier.craftsmanship.controller;

import com.pxavier.craftsmanship.pojo.Word;
import com.pxavier.craftsmanship.service.WordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/words")
public class WordController {

    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }


    @GetMapping()
    public List<Word> getWordsList(){
        return wordService.getWordsList();
    }

    @PostMapping
    public ResponseEntity<Word> addWord(@RequestBody Word word){
        if (word != null){
            wordService.addWord(word);
            return ResponseEntity.accepted().body(word);
        }else {
            return ResponseEntity.status(406).body(word);
        }
    }

    @PutMapping
    public ResponseEntity<Word> editWord(@RequestBody Word word){
        if (word != null){
            wordService.addWord(word);
            return ResponseEntity.accepted().body(word);
        }else {
            return ResponseEntity.status(406).body(word);
        }
    }
}
