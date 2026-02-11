package samostoyat

fun filterByYear(items: List<LibraryItem>, year: Int): List<LibraryItem.BookItem> {
    return items.filterIsInstance<LibraryItem.BookItem>()
        .filter { it.book.year == year }
}

fun sortByTitle(items: List<LibraryItem>): List<LibraryItem> {
    return items.sortedBy { item ->
        when (item) {
            is LibraryItem.BookItem -> item.book.title
            is LibraryItem.MagazineItem -> item.magazine.title
            is LibraryItem.DVDItem -> item.dvd.title
        }
    }
}

fun groupByAuthor(items: List<LibraryItem>): Map<String, List<Book>> {
    return items.filterIsInstance<LibraryItem.BookItem>()
        .map { it.book }
        .groupBy { it.author }
}

fun calculateTotalDuration(items: List<LibraryItem>): Int {
    return items.filterIsInstance<LibraryItem.DVDItem>()
        .fold(0) { total, dvdItem -> total + dvdItem.dvd.duration }
}