import scala.compiletime.ops.float
object question02{
    def main(args: Array[String]): Unit ={

        var a: Int = 2
        var b: Int = 3
        var c: Int = 4
        var d: Int = 5
        var k: Double = 4.3f
        var g = 4.0f;

        
        

        b -= 1
       
        d -= 1 
        println(s" --b * a + c * d-- = ${b * a + c * d}")

        println(s" a++ = $a")
        a += 1

        println(s" -2 * (g - k) + c = ${-2 * (g - k) + c}")

        println(s" c++ = $c")

        c += 1
        println(s" ++c * a++ = ${c * a}")
        a += 1
    }
}