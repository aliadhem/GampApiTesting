package org.example;

import com.intuit.karate.junit5.Karate;

public class TestRunner {
    @Karate.Test
    Karate testGames() {
        return Karate.run("src/main/games.feature");
    }
}
