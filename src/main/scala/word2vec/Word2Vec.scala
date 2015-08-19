package word2vec

/**
 * Created by kgupt33 on 17/08/15.
 */

object Word2Vec {
    def main(args: Array[String]): Unit ={

        //val infile = args(0)

        val opt = new Options()
        opt.init()

        val vocab = new Vocab(opt)
        println(vocab.GetWordHash("kskks"))
    }
}
