fun kthLargestElement(nums: MutableList<Int>, k: Int): Int {
    val q = PriorityQueue<Int>(Collections.reverseOrder())
    q.addAll(nums)
    var r = -1
    var i = 0
    while (i < k) {
        r = q.remove()
        i++
    }
    return r
}
