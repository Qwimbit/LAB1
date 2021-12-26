package com.example.myapplication

class StringExc{

    var maxSize = 5;
    val stringList1 = mutableListOf<String>()
    val stringList2 = mutableListOf<String>()
    val text = "Mauris faucibus porttitor tincidunt. Sed orci libero, efficitur id eleifend sit amet, hendrerit quis nibh. Cras et commodo lectus. Maecenas condimentum semper condimentum non, mollis viverra massa. Donec cursus maximus gravida. Pellentesque vitae cursus magna, at egestas nulla. Ut eget augue eget magna mattis convallis a sed nisl. Donec ut porta lorem, et dapibus dolor. Pellentesque ac erat tortor."
    var words = text.split(".", "?", "!", " ").filter{ it.isNotEmpty() }

    fun smt() {
        for (word in words) {
            var wordLength = word.count()
            if(wordLength > maxSize) {
                stringList1.add(word)
            } else {
                stringList2.add(word)
            }
        }
    }

    fun getFirstSort(): List<String> {
        return stringList1
    }

    fun getSecSort(): List<String> {
        return stringList2
    }
}