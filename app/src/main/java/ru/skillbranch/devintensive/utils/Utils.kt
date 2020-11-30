package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?): Pair<String?, String?>? {
        if (fullName.isNullOrBlank()) {
            return null
        }

        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return firstName to lastName
    }

    fun toInitials(firstName:String?, lastName:String?):String?{
        var result:String = ""
        if (!firstName.isNullOrBlank()){
            result += firstName.get(0)
        }
        if(!lastName.isNullOrBlank()) {
            result += lastName.get(0)
        }
        if (result.isNullOrBlank()){
            return null
        }

        return result.toUpperCase()


    }

    fun transliteration(value:String):String{
        /*{
    'зг' : 'zgh',
    'Зг' : 'Zgh',
    'А':'A',
    'а':'a',
    'Б':'B',
    'б':'b',
    'В':'V',
    'в':'v',
    'Г':'G',
    'г':'g',
    'Ґ':'G',
    'ґ':'g',
    'Д':'D',
    'д':'d',
    'Е':'E',
    'е':'e',
    'Ё':'E',
    'ё':'e',
    'Є':'Ye',
    'є':'ie',
    'Ж':'Zh',
    'ж':'zh',
    'З':'Z',
    'з':'z',
    'И':'Y',
    'и':'y',
    'І':'I',
    'і':'i',
    'Ї':'Yi',
    'ї':'i',
    'Й':'Y',
    'й':'i',
    'К':'K',
    'к':'k',
    'Л':'L',
    'л':'l',
    'М':'M',
    'м':'m',
    'Н':'N',
    'н':'n',
    'О':'O',
    'о':'o',
    'П':'P',
    'п':'p',
    'Р':'R',
    'р':'r',
    'С':'S',
    'с':'s',
    'Т':'T',
    'т':'t',
    'У':'U',
    'у':'u',
    'Ф':'F',
    'ф':'f',
    'Х':'Kh',
    'х':'kh',
    'Ц':'Ts',
    'ц':'ts',
    'Ч':'Ch',
    'ч':'ch',
    'Ш':'Sh',
    'ш':'sh',
    'Щ':'Shch',
    'щ':'shch',
    'Ы':'Y',
    'ы':'y',
    'Э':'E',
    'э':'e',
    'Ю':'Yu',
    'ю':'iu',
    'Я':'Ya',
    'я':'ia',
    'Ь': '',
    'ь': '',
    'Ъ': '',
    'ъ': '',
    '\'': ''*/
        return ""
    }
}