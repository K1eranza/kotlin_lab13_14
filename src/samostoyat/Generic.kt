package samostoyat

class Library<T>(
    private val items: MutableList<T> = mutableListOf()
) {
    fun addItem(item: T) {
        items.add(item)
    }

    fun removeItem(item: T): Boolean {
        return items.remove(item)
    }

    fun getAllItems(): List<T> {
        return items.toList()
    }

    fun clear() {
        items.clear()
    }

    fun size(): Int = items.size
}