package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("rodando");

        var consumirAPI = new ConsumoAPI();
        var json = consumirAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=17667b09");

        var conversor = new ConverteDados();
        var recebeConversor = conversor.obterDados(json, DadosSerie.class);

        System.out.println(recebeConversor);
    }
}
