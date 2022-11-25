package com.pxavier.craftsmanship.pojo;

import com.pxavier.craftsmanship.service.WordService;

import java.util.List;

public record Word(String word, List<Language> translations) {

}
