//
//data class Tree<T>(var value: T) {
//    var left: Tree<T>? = null;
//    var right: Tree<T>? = null;
//}

fun <T> Tree<T>.isLeaf(): Boolean {
    if (this.left == null && this.right == null)
        return true
    return false
}

fun hasPathWithGivenSum(t: Tree<Int>?, s: Int): Boolean {
    if (t == null)
        return false
    if(t.isLeaf() && s - t.value == 0)
        return true
    return hasPathWithGivenSum(t.left, s - t.value) || hasPathWithGivenSum(t.right, s - t.value)
}
