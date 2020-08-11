//
//data class Tree<T>(var value: T) {
//    var left: Tree<T>? = null;
//    var right: Tree<T>? = null;
//}

fun traverseTree(t: Tree<Int>?): MutableList<Int> {
    val l = mutableListOf<Int>()
    if (t == null)
        return l
    val queue = LinkedList<Tree<Int>>()
    queue.add(t)
    while (queue.isNotEmpty()) {
        val aux = queue.poll()
        l.add(aux.value)
        if (aux.left != null)
            queue.add(aux.left!!)
        if (aux.right != null)
            queue.add(aux.right!!)
    }
    return l
}
