package word2vec

/**
 * Created by kgupt33 on 17/08/15.
 */
class Vocab (opt: Options) {


     def GetWordHash(word: String): Int = {
        var hash: Long = 0
        for (c <- word)
            hash = (hash * 257 + c)
        hash = hash % opt.vocab_hash_size
        return hash.toInt
    }

    def AddWordToVocab(word: String): Int = {
        val len = {
            if (word.length > opt.vocab_max_size)
                word.length
            else
                opt.vocab_max_size
        }

    }

    int AddWordToVocab(char *word) {
        unsigned int hash, length = strlen(word) + 1;
        if (length > MAX_STRING) length = MAX_STRING;
        vocab[vocab_size].word = (char *)calloc(length, sizeof(char));
        strcpy(vocab[vocab_size].word, word);
        vocab[vocab_size].cn = 0;
        vocab_size++;
        // Reallocate memory if needed
        if (vocab_size + 2 >= vocab_max_size) {
            vocab_max_size += 1000;
            vocab = (struct vocab_word *)realloc(vocab, vocab_max_size * sizeof(struct vocab_word));
        }
        hash = GetWordHash(word);
        while (vocab_hash[hash] != -1) hash = (hash + 1) % vocab_hash_size;
        vocab_hash[hash] = vocab_size - 1;
        return vocab_size - 1;
    }
}