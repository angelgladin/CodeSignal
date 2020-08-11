fun containsDuplicates(a: MutableList<Int>): Boolean {
    val s = mutableSetOf<Int>()
    for (x in a) {
        if (x in s)
            return true
        else
            s.add(x)
    }
    return false
}
