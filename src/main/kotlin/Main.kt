import kotlin.math.pow

fun main() {
    var f1:Fraction = Fraction()
    f1.numerator = 3.0
    f1.denominator = 4.0

    var f2:Fraction = Fraction()
    f2.numerator = 6.0
    f2.denominator = 8.0

    println(f1)
    println(f2)
    println(f1 == f2)

    println(f1.equals(f2))

    println(f2.toString())

    //exerc.2.2)                                            //გაყოფას არ ვიცი რატო აწითლებს ://
    println(f2.denominator *f1.numerator + f1.denominator * f2.numerator) / (f1.denominator * f2.denominator)

    //exerc.2. 3)
    println(f1.numerator * f2.numerator) / (f1.denominator * f2.denominator )



}
class Fraction {
    var numerator:Double = 0.0
    var denominator:Double = 0.0

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Fraction){
            if (numerator*other.denominator/denominator == other.numerator)
                return true
        }
        return false

    }
}



fun main1(){
    var v1 = point( 3,  4)

    var v2 = point( 2,  5)


    println(v1)
    println(v2)
    println(v1.toString())
    println(v1.equals(v2))
    println(v1.symmetry())
    println(v2.symmetry())
}
class point(private val x: Int, private val y : Int ) {

    private var cos: Int = x
    private var sin: Int = y
     //3
    fun symmetry(): Pair<Int, Int> {
        return Pair(cos * -1, sin * -1)
    }
    //4
    fun Distance(other : point ) : Double {
        return kotlin.math.sqrt( (x- other.x).pow(2.0) + (y-other.y).pow(2.0))   //pow-საც აწითლებს
    }
}
