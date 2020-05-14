package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Get a quote from the random generator.
 */
@Service
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
