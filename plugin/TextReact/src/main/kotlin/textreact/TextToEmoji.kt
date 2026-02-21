package textreact

// huge thanks to https://github.com/Juby210/text-react/blob/master/index.js

class TextToEmoji {
    companion object {
        private data class ReactionsType(
            val single: MutableMap<String, ArrayList<String>>,
            val multiple: MutableMap<String, ArrayList<String>>,
        )

        private val reactions: ReactionsType = ReactionsType(
            single=mutableMapOf(
                // A - Regional indicator, circled, squared, negative squared
                "a" to arrayListOf(
                    "\uD83C\uDDE6",  // 🇦 Regional indicator A
                    "\uD83C\uDD70",  // 🅰 Negative squared A
                    "Ⓐ",             // Circled A
                    "🅰",             // Negative squared A (emoji)
                    "🆎"              // AB button
                ),
                // B - Regional indicator, circled, squared, negative squared, B button
                "b" to arrayListOf(
                    "\uD83C\uDDE7",  // 🇧 Regional indicator B
                    "\uD83C\uDD71",  // 🅱 Negative squared B
                    "Ⓑ",             // Circled B
                    "🅱"              // Negative squared B (emoji)
                ),
                // C - Regional indicator, circled, copyright, squared
                "c" to arrayListOf(
                    "\uD83C\uDDE8",  // 🇨 Regional indicator C
                    "©",             // Copyright
                    "Ⓒ",             // Circled C
                    "🅲"              // Squared C
                ),
                // D - Regional indicator, circled, squared
                "d" to arrayListOf(
                    "\uD83C\uDDE9",  // 🇩 Regional indicator D
                    "Ⓓ",             // Circled D
                    "🅳"              // Squared D
                ),
                // E - Regional indicator, circled, email, musical
                "e" to arrayListOf(
                    "\uD83C\uDDEA",  // 🇪 Regional indicator E
                    "\uD83D\uDCE7",  // 📧 E-mail
                    "🎼",            // Musical score
                    "Ⓔ",             // Circled E
                    "🅴"              // Squared E
                ),
                // F - Regional indicator, circled, squared
                "f" to arrayListOf(
                    "\uD83C\uDDEB",  // 🇫 Regional indicator F
                    "Ⓕ",             // Circled F
                    "🅵"              // Squared F
                ),
                // G - Regional indicator, circled, squared
                "g" to arrayListOf(
                    "\uD83C\uDDEC",  // 🇬 Regional indicator G
                    "Ⓖ",             // Circled G
                    "🅶"              // Squared G
                ),
                // H - Regional indicator, circled, squared, Pisces
                "h" to arrayListOf(
                    "\uD83C\uDDED",  // 🇭 Regional indicator H
                    "♓",            // Pisces
                    "Ⓗ",             // Circled H
                    "🅷"              // Squared H
                ),
                // I - Regional indicator, circled, info, squared
                "i" to arrayListOf(
                    "\uD83C\uDDEE",  // 🇮 Regional indicator I
                    "ℹ",             // Information
                    "Ⓘ",             // Circled I
                    "🅸"              // Squared I
                ),
                // J - Regional indicator, circled, squared
                "j" to arrayListOf(
                    "\uD83C\uDDEF",  // 🇯 Regional indicator J
                    "Ⓙ",             // Circled J
                    "🅹"              // Squared J
                ),
                // K - Regional indicator, circled, squared
                "k" to arrayListOf(
                    "\uD83C\uDDF0",  // 🇰 Regional indicator K
                    "Ⓚ",             // Circled K
                    "🅺"              // Squared K
                ),
                // L - Regional indicator, circled, squared
                "l" to arrayListOf(
                    "\uD83C\uDDF1",  // 🇱 Regional indicator L
                    "Ⓛ",             // Circled L
                    "🅻"              // Squared L
                ),
                // M - Regional indicator, circled, squared, zodiac signs
                "m" to arrayListOf(
                    "\uD83C\uDDF2",  // 🇲 Regional indicator M
                    "Ⓜ",             // Circled M
                    "♏",            // Scorpio
                    "♍",            // Virgo
                    "Ⓜ",             // Circled M (emoji)
                    "🅼"              // Squared M
                ),
                // N - Regional indicator, circled, squared, Capricorn
                "n" to arrayListOf(
                    "\uD83C\uDDF3",  // 🇳 Regional indicator N
                    "♑",            // Capricorn
                    "Ⓝ",             // Circled N
                    "🅽"              // Squared N
                ),
                // O - Regional indicator, circled, squared, O button
                "o" to arrayListOf(
                    "\uD83C\uDDF4",  // 🇴 Regional indicator O
                    "\uD83C\uDD7E",  // 🅾 O button
                    "⭕",            // Hollow red circle
                    "Ⓞ",             // Circled O
                    "🅾"              // Squared O
                ),
                // P - Regional indicator, circled, squared, P button
                "p" to arrayListOf(
                    "\uD83C\uDDF5",  // 🇵 Regional indicator P
                    "\uD83C\uDD7F",  // 🅿 P button
                    "Ⓟ",             // Circled P
                    "🅿"              // Squared P
                ),
                // Q - Regional indicator, circled, squared
                "q" to arrayListOf(
                    "\uD83C\uDDF6",  // 🇶 Regional indicator Q
                    "Ⓠ",             // Circled Q
                    "🆀"              // Squared Q
                ),
                // R - Regional indicator, circled, squared, registered
                "r" to arrayListOf(
                    "\uD83C\uDDF7",  // 🇷 Regional indicator R
                    "®",             // Registered
                    "Ⓡ",             // Circled R
                    "🆁"              // Squared R
                ),
                // S - Regional indicator, circled, squared
                "s" to arrayListOf(
                    "\uD83C\uDDF8",  // 🇸 Regional indicator S
                    "Ⓢ",             // Circled S
                    "🆂"              // Squared S
                ),
                // T - Regional indicator, circled, squared, cross
                "t" to arrayListOf(
                    "\uD83C\uDDF9",  // 🇹 Regional indicator T
                    "✝",            // Latin cross
                    "Ⓣ",             // Circled T
                    "🆃"              // Squared T
                ),
                // U - Regional indicator, circled, squared
                "u" to arrayListOf(
                    "\uD83C\uDDFA",  // 🇺 Regional indicator U
                    "Ⓤ",             // Circled U
                    "🆄"              // Squared U
                ),
                // V - Regional indicator, circled, squared, Aries
                "v" to arrayListOf(
                    "\uD83C\uDDFB",  // 🇻 Regional indicator V
                    "♈",            // Aries
                    "Ⓥ",             // Circled V
                    "🆅"              // Squared V
                ),
                // W - Regional indicator, circled, squared
                "w" to arrayListOf(
                    "\uD83C\uDDFC",  // 🇼 Regional indicator W
                    "Ⓦ",             // Circled W
                    "🆆"              // Squared W
                ),
                // X - Regional indicator, circled, squared, crosses
                "x" to arrayListOf(
                    "\uD83C\uDDFD",  // 🇽 Regional indicator X
                    "❎",            // Cross mark button
                    "❌",            // Cross mark
                    "✖",            // Multiply
                    "Ⓧ",             // Circled X
                    "🆇"              // Squared X
                ),
                // Y - Regional indicator, circled, squared
                "y" to arrayListOf(
                    "\uD83C\uDDFE",  // 🇾 Regional indicator Y
                    "Ⓨ",             // Circled Y
                    "🆈"              // Squared Y
                ),
                // Z - Regional indicator, circled, squared
                "z" to arrayListOf(
                    "\uD83C\uDDFF",  // 🇿 Regional indicator Z
                    "Ⓩ",             // Circled Z
                    "🆉"              // Squared Z
                ),
                // Numbers with keycap
                "0" to arrayListOf("0️⃣", "⓪"),
                "1" to arrayListOf("1️⃣", "①", "➀", "⓵"),
                "2" to arrayListOf("2️⃣", "②", "➁", "⓶"),
                "3" to arrayListOf("3️⃣", "③", "➂", "⓷"),
                "4" to arrayListOf("4️⃣", "④", "➃", "⓸"),
                "5" to arrayListOf("5️⃣", "⑤", "➄", "⓹"),
                "6" to arrayListOf("6️⃣", "⑥", "➅", "⓺"),
                "7" to arrayListOf("7️⃣", "⑦", "➆", "⓻"),
                "8" to arrayListOf("8️⃣", "⑧", "➇", "⓼"),
                "9" to arrayListOf("9️⃣", "⑨", "➈", "⓽"),
                // Symbols
                "?" to arrayListOf("❔", "❓", "⁉", "⁉️"),
                "+" to arrayListOf("➕", "➕"),
                "-" to arrayListOf("➖", "⛔", "\uD83D\uDCDB", "➖"),
                "!" to arrayListOf("❕", "❗", "‼", "‼️"),
                "*" to arrayListOf("*️⃣", "✳", "✴"),
                "$" to arrayListOf("\uD83D\uDCB2", "💵", "💰"),
                "#" to arrayListOf("#️⃣", "♯", "⋕"),
                " " to arrayListOf("▪", "◾", "➖", "◼", "⬛", "⚫", "\uD83D\uDDA4", "\uD83D\uDD76", "⬜", "◽", "◻", "▫")
            ),
            multiple=mutableMapOf(
                "wc" to arrayListOf("\uD83D\uDEBE"),
                "back" to arrayListOf("\uD83D\uDD19"),
                "end" to arrayListOf("\uD83D\uDD1A"),
                "on!" to arrayListOf("\uD83D\uDD1B"),
                "soon" to arrayListOf("\uD83D\uDD1C"),
                "top" to arrayListOf("\uD83D\uDD1D"),
                "!!" to arrayListOf("‼"),
                "!?" to arrayListOf("⁉"),
                "tm" to arrayListOf("™"),
                "10" to arrayListOf("\uD83D\uDD1F"),
                "cl" to arrayListOf("\uD83C\uDD91"),
                "cool" to arrayListOf("\uD83C\uDD92"),
                "free" to arrayListOf("\uD83C\uDD93"),
                "id" to arrayListOf("\uD83C\uDD94"),
                "new" to arrayListOf("\uD83C\uDD95"),
                "ng" to arrayListOf("\uD83C\uDD96"),
                "ok" to arrayListOf("\uD83C\uDD97"),
                "sos" to arrayListOf("\uD83C\uDD98"),
                "up!" to arrayListOf("\uD83C\uDD99"),
                "vs" to arrayListOf("\uD83C\uDD9A"),
                "abc" to arrayListOf("\uD83D\uDD24"),
                "ab" to arrayListOf("\uD83C\uDD8E"),
                "18" to arrayListOf("\uD83D\uDD1E"),
                "100" to arrayListOf("\uD83D\uDCAF"),
                "atm" to arrayListOf("\uD83C\uDFE7")
            )
        )

        fun generateEmojiArray(string: String): Pair<List<String>, Boolean> {
            val unusedReactions = reactions
            var msg = string.lowercase()
            val newReactions = ArrayList<String>()

            val allReactions = ArrayList((unusedReactions.single + unusedReactions.multiple).keys)
            var incomplete = false

            while (msg.isNotEmpty()) {
                if (!allReactions.contains(msg[0].toString())) {
                    msg = msg.slice(1 until msg.length)
                    incomplete = true
                }
                for (reactionName in unusedReactions.multiple.keys) {
                    if (msg.isNotEmpty() && msg.startsWith(reactionName) && unusedReactions.multiple[reactionName]!!.isNotEmpty()) {
                        val reactionValue = unusedReactions.multiple[reactionName]!!.first()
                        newReactions.add(reactionValue)
                        unusedReactions.multiple[reactionName] = ArrayList(unusedReactions.multiple[reactionName]!!.filter { value -> value != reactionValue })
                        msg = msg.replace(reactionName, "")
                    } else if (msg.isNotEmpty() && msg.startsWith(reactionName) && unusedReactions.multiple[reactionName]!!.isEmpty()) {
                        msg = msg.replaceFirst(reactionName, "")
                        incomplete = true
                    }
                }
                for (reactionName in unusedReactions.single.keys) {
                    if (msg.isNotEmpty() && msg.startsWith(reactionName) && unusedReactions.single[reactionName]!!.isNotEmpty()) {
                        val reactionValue = unusedReactions.single[reactionName]!!.first()
                        newReactions.add(reactionValue)
                        unusedReactions.single[reactionName] = ArrayList(unusedReactions.single[reactionName]!!.filter { value -> value != reactionValue })
                        msg = msg.replaceFirst(reactionName, "")
                    } else if (msg.isNotEmpty() && msg.startsWith(reactionName) && unusedReactions.single[reactionName]!!.isEmpty()) {
                        msg = msg.replaceFirst(reactionName, "")
                        incomplete = true
                    }
                }
            }
            return Pair(newReactions, incomplete)
        }
    }
}