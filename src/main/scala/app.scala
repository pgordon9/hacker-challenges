import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.collection.parallel.immutable._
import scala.collection.parallel.mutable._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._
import java.io.PrintWriter

import scala.io.StdIn

object Solution extends App{
    for(i<-1 to 100){println(if(i%15==0)"FizzBuzz"else if(i%3==0)"Fizz"else if(i%5==0)"Buzz"else i)}
}


object Other {
    // Complete the aVeryBigSum function below.
    def aVeryBigSum(ar: Array[Long]): Long = {
        ar.sum
    }

    // Complete the compareTriplets function below.
    def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
        val result = a.zipWithIndex.map { z =>
            val bScore = b(z._2)
            if (z._1 > bScore) "a"
            else if (z._1 < bScore) "b"
            else ""
        }

        val aRes = result.count(_ == "a")
        val bRes = result.count(_ == "b")
        Array(aRes, bRes)
    }

    def main(args: Array[String]) {
        val c = compareTriplets(Array(5,6,7), Array(3,6,10))
        println(s"A: ${c(0)}")
        println(s"B: ${c(1)}")
    }
}