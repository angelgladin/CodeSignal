fun countTinyPairs(a: MutableList<Int>, b: MutableList<Int>, k: Int): Int {
    var r = 0
    val n = a.size
    for (i in 0 until n) {
        val j = n-i-1
        val aux = (a[i].toString() + b[j].toString()).toInt()
        if (aux < k)
            r++
    }
    return r
}
