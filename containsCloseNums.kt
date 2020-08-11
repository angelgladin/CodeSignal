fun containsCloseNums(nums: MutableList<Int>, k: Int): Boolean {
    val m = mutableMapOf<Int, MutableList<Int>>()
    for ((i,x) in nums.withIndex()) {
        if (x in m) {
            m[x]!!.add(i)
        } else {
            m[x] = mutableListOf(i)
        }
    }
    for (key in m.keys) {
        val l = m[key]!!
        for (i in 0 until l.size) {
            for (j in i+1 until l.size) {
                if (Math.abs(l[i] - l[j]) <= k)
                return true
            }
        }
    }
    return false
}
