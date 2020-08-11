fun groupingDishes(dishes: MutableList<MutableList<String>>): MutableList<MutableList<String>> {
    val map = mutableMapOf<String, MutableList<String>>()
    
    for (i in 0 until dishes.size) {
        val dish = dishes[i][0]
        for (j in 1 until dishes[i].size) {
            if (dishes[i][j] in map) {
                map[dishes[i][j]]!!.add(dish)
            } else {
                map[dishes[i][j]] = mutableListOf(dish)
            }
        }
    }
    val r = mutableListOf<MutableList<String>>()
    
    for (k in map.keys.sorted()) {
        if (map[k]!!.size > 1) {
            val aux = mutableListOf(k)
            aux.addAll(map[k]!!.sorted())
            r.add(aux)
        }
    }
    return r
}
