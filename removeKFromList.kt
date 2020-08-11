//data class ListNode<T>(var value: T) {
//    var next: ListNode<T>? = null;
//}

//
fun removeKFromList(l: ListNode<Int>?, k: Int): ListNode<Int>? {
    val dummy = ListNode(-1)
    dummy.next = l
    var p = dummy
    
    while (p.next != null) {
        if (p.next!!.value == k) {
            val nextNext = p.next!!.next
            p.next = nextNext
        } else {
            p = p.next!!
        }
    } 
    return dummy.next
        
}
