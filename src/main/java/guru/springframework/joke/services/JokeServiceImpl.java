package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Get a quote from the random generator.
 */
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes quotes;

    public JokeServiceImpl() {
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
