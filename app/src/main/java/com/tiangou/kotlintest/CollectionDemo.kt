package com.tiangou.kotlintest

class CollectionDemo {


    fun collectionTest1() {

        val emptyList = listOf<Int>()

        println(emptyList.any())

        val list1 = listOf<Int>(1)

        println(list1.any())

        val list2 = listOf(1, 2, 3)

        println(list2.any())
        println(list2.any({it % 2 == 0}))
        println(list2.any({it > 4}))


        val list3 = listOf(0, 2, 4, 6, 8)
        println(list3.all { it % 2 == 0 })
        println(list3.all { it > 2 })


        println(list3.none())

        println(list3.none({ it % 2 == 0 }))

        println(list3.count())

        println(list3.count { it % 2 == 0})



        val list4 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        list4.reduce { sum, next -> sum + next }
        list4.reduce { sum, next -> sum * next }

        list4.fold(100, {total, next -> next + total})

        list4.forEach {
                value1 -> if (value1 > 7) {

                    println(value1)

                }
        }

        list4.forEachIndexed { index, i -> if (i > 8) {

                println("value of $index is $i")
            }
        }

        println(list4.max())
        println(list4.min())

        val list5 = listOf("a", "b", "c")
        list5.reduce { total, s -> total + s }

        list5.reduceRight { total, s -> s + total }

        list5.fold("xyz", {s, pre -> pre + s})



        val list6 = listOf(100, -500, 300, 200)

        println(list6.maxBy { it })

        println(list6.maxBy { it * (1 - it) })

        println(list6.maxBy { it * it })


        println(list6.minBy { it })

        println(list6.minBy { it * (1 - it) })

        println(list6.minBy { it * it })


        println(list6.sumBy { it})

        println(list6.sumBy { it * it })


        val list7 = listOf("a", "b", "c")

        println(list7.take(2))
        println(list7.take(10))
        println(list7.take(0))

        //如果遇到满足条件的元素就添加到集合中 只要遇到任何一个元素不满足条件 就结束循环
        val list8 = listOf(1, 2, 4, 6, 8, 9)
        println(list8.takeWhile { it % 2 == 0 })
        println(list8.takeWhile { it % 2 == 1 })


        val list9 = listOf(2, 4, 6, 8, 9, 11, 12, 16)
        println(list9.takeLast(0))

        println(list9.takeLast(3))

        println(list9.takeLast(100))

        //println(list9.takeLast(-1))


        println(list9.takeLastWhile { it % 2 == 0 })

        val list10 = listOf(2, 4, 6, 8, 9, 11, 12, 16)

        println(list10.drop(10))

        println(list10.drop(5))


        println(list10.drop(0))


        val list11 = listOf(2, 4, 6, 8, 9, 11, 12, 16)

        //当遇到一个满足条件的元素 终止操作 返回剩下的元素子集合
        println(list11.dropWhile { it % 2 == 0 })

        println(list11.dropLast(3))

        println(list11.dropLast(100))

        println(list11.dropLast(0))

        //println(list11.dropLast(-1))


        println(list11.dropLastWhile { it % 2 == 0 })



        println(list11.slice(1..3) )

        println(list11.slice(2..7) )


        //去除相应下标的值
        println(list11.slice(listOf(2, 4, 6)))


        val list12 = listOf(1, 2, 3, 4, 5, 6, 7)
        val dest = mutableListOf<Int>()

        println(list12.filterTo(dest, {it > 3}))

        println(list12.filter({it > 3}))



    }

}