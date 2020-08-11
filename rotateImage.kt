fun rotateImage(a: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    fun transpose(a: MutableList<MutableList<Int>>) {
        val n = a.size
        for (i in 0 until n) {
            for (j in i+1 until n) {
                val tmp = a[i][j]
                a[i][j] = a[j][i]
                a[j][i] = tmp
            }
        }
    }
    fun verticalReverse(a: MutableList<MutableList<Int>>) {
        val n = a.size
        val half = n/2
        for (i in 0 until n) {
            for (j in 0 until half) {
                val tmp = a[i][j]
                a[i][j] = a[i][n-j-1]
                a[i][n-j-1] = tmp
            }
        }
    }
    
    transpose(a)
    verticalReverse(a)
    return a
}
