package word2vec

/**
 * Created by kgupt33 on 17/08/15.
 */

import scala.math.exp

object Options {

    val MAX_STRING = 100
    val EXP_TABLE_SIZE = 1000
    val MAX_EXP = 6
    val MAX_SENTENCE_LENGTH = 1000
    val MAX_CODE_LENGTH = 40

    val vocab_hash_size = 30000000;  // Maximum 30 * 0.7 = 21M words in the vocabulary
    var table_size = 1e8

    var binary = 0
    var cbow = 1
    var debug_mode = 2
    var window = 5
    var min_count = 5
    var num_threads = 12
    var min_reduce = 1

    var vocab_max_size = 1000
    var vocab_size = 0

    var layer1_size = 100
    var train_words = 0
    var word_count_actual = 0
    var iter = 5
    var file_size = 0
    var classes = 0
    var alpha = 0.025
    //var starting_alpha
    var sample = 1e-3
    var hs = 0
    var negative = 5


    val expTable = new Array[Double](EXP_TABLE_SIZE)

    def init(): Unit ={
        for ( i <- 0 to (EXP_TABLE_SIZE - 1) ) {
            val x = exp((i/EXP_TABLE_SIZE*2 - 1)*MAX_EXP)
            expTable(i) = x / (x + 1)
        }
    }

}
