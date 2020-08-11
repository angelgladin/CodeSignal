fun sudoku2(grid: MutableList<MutableList<Char>>): Boolean {
    fun validSubGrid(grid: MutableList<MutableList<Char>>, x: Int, y: Int) : Boolean {
        val s = mutableSetOf<Char>()
        for (i in x until x+3) {
            for (j in y until y+3) {
                if (grid[i][j] != '.') {
                    if (grid[i][j] in s)
                        return false
                    else
                        s.add(grid[i][j])
                }
            }
        }
        return true
    }
    fun validRows(grid: MutableList<MutableList<Char>>): Boolean {
        val s = mutableSetOf<Char>()
        for (j in 0 until 9) {
            for (i in 0 until 9) {
                if (grid[i][j] != '.') {
                    if (grid[i][j] in s)
                        return false
                    else
                        s.add(grid[i][j])
                }
            }
            s.clear()
        }
        return true
    }
    fun validColums(grid: MutableList<MutableList<Char>>): Boolean {
        val s = mutableSetOf<Char>()
        for (i in 0 until 9) {
            for (j in 0 until 9) {
                if (grid[i][j] != '.') {
                    if (grid[i][j] in s)
                        return false
                    else
                        s.add(grid[i][j])
                }
            }
            s.clear()
        }
        return true
    }
    
    for (x in 0 until 3) {
        for (y in 0 until 3) {
            if (!validSubGrid(grid, x*3, y*3))
                return false
        }
    }
    
    return validRows(grid) && validColums(grid)
}
