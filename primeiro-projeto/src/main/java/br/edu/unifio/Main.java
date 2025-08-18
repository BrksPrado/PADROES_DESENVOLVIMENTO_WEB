package br.edu.unifio;

import org.apache.commons.lang3.RandomStringUtils;

public class Main {
    public static void main(String[] args) {

        String senha = RandomStringUtils.insecure().nextAlphabetic(8);

        System.out.println("VALOR SENHA: " + senha);

    }
}