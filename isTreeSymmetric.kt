//
//data class Tree<T>(var value: T) {
//    var left: Tree<T>? = null;
//    var right: Tree<T>? = null;
//}

fun isTreeSymmetric(t: Tree<Int>?): Boolean {
    fun symmetricSubtrees(t1: Tree<Int>?, t2: Tree<Int>?): Boolean {
        if (t1 == null && t2 == null)
            return true
        if (t1 == null || t2 == null)
            return false
        return t1.value == t2.value &&
            symmetricSubtrees(t1.left, t2.right) && symmetricSubtrees(t1.right, t2.left)
    }
    return symmetricSubtrees(t, t)
}
