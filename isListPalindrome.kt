//data class ListNode<T>(var value: T) {
//    var next: ListNode<T>? = null;
//}

//

fun ListNode<Int>.toList(): MutableList<Int> {
    var p : ListNode<Int>? = this
    val l = mutableListOf<Int>()
    while (p != null) {
        l.add(p.value)
        p = p.next
    }
    return l
}

fun isListPalindrome(l: ListNode<Int>?): Boolean {
    if (l == null)
        return true

    var xs = l.toList()
    val n = xs.size
    val half = xs.size / 2
    for (i in 0 until half)
        if (xs[i] != xs[n-i-1])
            return false
    return true
    
    
}
