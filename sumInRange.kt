fun sumInRange(nums: MutableList<Int>, queries: MutableList<MutableList<Int>>): Int {
    fun range(start: Int, end: Int, prefix: IntArray): Int {
        if (start == 0)
            return prefix[end]
        return prefix[end] - prefix[start-1]
    }
    var r = 0
    val acc = IntArray(nums.size) { 0 }
    val mod = (1e9 + 7).toInt()
    acc[0] = nums[0]
    for (i in 1 until nums.size)
        acc[i] = acc[i-1] + nums[i]
    for (x in queries) {
        r += range(x[0], x[1], acc)
    }
    r %= mod
    return if (r < 0) r + mod else r
}

