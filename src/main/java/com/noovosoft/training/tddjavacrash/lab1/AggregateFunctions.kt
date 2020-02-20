package com.noovosoft.training.tddjavacrash.lab1

import kotlin.math.roundToInt

data class Aggregate(val min: Int, val max: Int, val count: Int, val avg: Double)

fun aggregate(vararg numbers: Int) = Aggregate(min(*numbers), max(*numbers), count(*numbers), avg(*numbers))

fun min(vararg numbers: Int) = numbers.min() ?: Int.MAX_VALUE

fun max(vararg numbers: Int) = numbers.max() ?: Int.MIN_VALUE

fun count(vararg numbers: Int) = numbers.size

fun avg(vararg numbers: Int) = if (numbers.average().isNaN()) (Double.NaN) else ((numbers.average() * 100.0).roundToInt()) / 100.0

