fun mutateTheArray(n: Int, a: MutableList<Int>): MutableList<Int> {
    val l = IntArray(n)
    l[0] = a[0]
    if (n == 1) {
        return l.toMutableList()
    } else {
        l[0] = a[0] + a[1]
        l[n-1] = a[n-1] + a[n-2]
        for (i in 1 until n-1)
            l[i] = a[i-1] + a[i] + a[i+1]
        return l.toMutableList()
    }
}
