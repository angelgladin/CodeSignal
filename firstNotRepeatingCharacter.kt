fun firstNotRepeatingCharacter(s: String): Char {
    val m = mutableMapOf<Char, Int>()
    s.forEach { m[it] = m.getOrDefault(it, 0) + 1 }
    for (x in s)
        if (m[x]!! == 1)
            return x
    return '_'
    
}
