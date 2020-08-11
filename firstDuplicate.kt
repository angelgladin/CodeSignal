fun firstDuplicate(a: MutableList<Int>): Int {
    val s = mutableSetOf<Int>()
    var idx = Int.MAX_VALUE
    for (i in 0 until a.size) {
        if (a[i] in s)
            idx = minOf(idx, i)
        else
            s.add(a[i])
    }
    return if (idx == Int.MAX_VALUE) -1 else a[idx]
}
