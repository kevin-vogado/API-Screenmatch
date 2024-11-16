package br.com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T converteDados(String json, Class<T> classe);
}
