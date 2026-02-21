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
                // A - Emojis Discord valides en réaction
                "a" to arrayListOf(
                    "\uD83C\uDDE6",  // 🇦 Regional indicator A
                    "\uD83C\uDD70",  // 🅰️ Negative squared Latin capital letter A
                    "\uD83C\uDD8E"   // 🆎 AB button
                ),
                // B - Emojis Discord valides
                "b" to arrayListOf(
                    "\uD83C\uDDE7",  // 🇧 Regional indicator B
                    "\uD83C\uDD71"   // 🅱️ Negative squared Latin capital letter B
                ),
                // C - Emojis Discord valides
                "c" to arrayListOf(
                    "\uD83C\uDDE8",  // 🇨 Regional indicator C
                    "\u00A9"         // ©️ Copyright
                ),
                // D - Emojis Discord valides
                "d" to arrayListOf(
                    "\uD83C\uDDE9"   // 🇩 Regional indicator D
                ),
                // E - Emojis Discord valides
                "e" to arrayListOf(
                    "\uD83C\uDDEA",  // 🇪 Regional indicator E
                    "\uD83D\uDCE7",  // 📧 E-mail
                    "\uD83C\uDFBC"   // 🎼 Musical score
                ),
                // F - Emojis Discord valides
                "f" to arrayListOf(
                    "\uD83C\uDDEB"   // 🇫 Regional indicator F
                ),
                // G - Emojis Discord valides
                "g" to arrayListOf(
                    "\uD83C\uDDEC"   // 🇬 Regional indicator G
                ),
                // H - Emojis Discord valides
                "h" to arrayListOf(
                    "\uD83C\uDDED",  // 🇭 Regional indicator H
                    "\u2653"         // ♓ Pisces
                ),
                // I - Emojis Discord valides
                "i" to arrayListOf(
                    "\uD83C\uDDEE",  // 🇮 Regional indicator I
                    "\u2139"         // ℹ️ Information
                ),
                // J - Emojis Discord valides
                "j" to arrayListOf(
                    "\uD83C\uDDEF"   // 🇯 Regional indicator J
                ),
                // K - Emojis Discord valides
                "k" to arrayListOf(
                    "\uD83C\uDDF0"   // 🇰 Regional indicator K
                ),
                // L - Emojis Discord valides
                "l" to arrayListOf(
                    "\uD83C\uDDF1"   // 🇱 Regional indicator L
                ),
                // M - Emojis Discord valides
                "m" to arrayListOf(
                    "\uD83C\uDDF2",  // 🇲 Regional indicator M
                    "\u24C2",        // Ⓜ️ Circled M
                    "\u264F",        // ♏ Scorpio
                    "\u264D"         // ♍ Virgo
                ),
                // N - Emojis Discord valides
                "n" to arrayListOf(
                    "\uD83C\uDDF3",  // 🇳 Regional indicator N
                    "\u2651"         // ♑ Capricorn
                ),
                // O - Emojis Discord valides
                "o" to arrayListOf(
                    "\uD83C\uDDF4",  // 🇴 Regional indicator O
                    "\uD83C\uDD7E",  // 🅾️ Negative squared Latin capital letter O
                    "\u2B55"         // ⭕ Hollow red circle
                ),
                // P - Emojis Discord valides
                "p" to arrayListOf(
                    "\uD83C\uDDF5",  // 🇵 Regional indicator P
                    "\uD83C\uDD7F"   // 🅿️ Negative squared Latin capital letter P
                ),
                // Q - Emojis Discord valides
                "q" to arrayListOf(
                    "\uD83C\uDDF6"   // 🇶 Regional indicator Q
                ),
                // R - Emojis Discord valides
                "r" to arrayListOf(
                    "\uD83C\uDDF7",  // 🇷 Regional indicator R
                    "\u00AE"         // ®️ Registered
                ),
                // S - Emojis Discord valides
                "s" to arrayListOf(
                    "\uD83C\uDDF8"   // 🇸 Regional indicator S
                ),
                // T - Emojis Discord valides
                "t" to arrayListOf(
                    "\uD83C\uDDF9",  // 🇹 Regional indicator T
                    "\u271D"         // ✝️ Latin cross
                ),
                // U - Emojis Discord valides
                "u" to arrayListOf(
                    "\uD83C\uDDFA"   // 🇺 Regional indicator U
                ),
                // V - Emojis Discord valides
                "v" to arrayListOf(
                    "\uD83C\uDDFB",  // 🇻 Regional indicator V
                    "\u2648"         // ♈ Aries
                ),
                // W - Emojis Discord valides
                "w" to arrayListOf(
                    "\uD83C\uDDFC"   // 🇼 Regional indicator W
                ),
                // X - Emojis Discord valides
                "x" to arrayListOf(
                    "\uD83C\uDDFD",  // 🇽 Regional indicator X
                    "\u274E",        // ❎ Cross mark button
                    "\u274C",        // ❌ Cross mark
                    "\u2716"         // ✖️ Multiply
                ),
                // Y - Emojis Discord valides
                "y" to arrayListOf(
                    "\uD83C\uDDFE"   // 🇾 Regional indicator Y
                ),
                // Z - Emojis Discord valides
                "z" to arrayListOf(
                    "\uD83C\uDDFF"   // 🇿 Regional indicator Z
                ),
                // Numbers - Emojis Discord valides (keycap)
                "0" to arrayListOf("\u0030\uFE0F\u20E3"),  // 0️⃣
                "1" to arrayListOf("\u0031\uFE0F\u20E3"),  // 1️⃣
                "2" to arrayListOf("\u0032\uFE0F\u20E3"),  // 2️⃣
                "3" to arrayListOf("\u0033\uFE0F\u20E3"),  // 3️⃣
                "4" to arrayListOf("\u0034\uFE0F\u20E3"),  // 4️⃣
                "5" to arrayListOf("\u0035\uFE0F\u20E3"),  // 5️⃣
                "6" to arrayListOf("\u0036\uFE0F\u20E3"),  // 6️⃣
                "7" to arrayListOf("\u0037\uFE0F\u20E3"),  // 7️⃣
                "8" to arrayListOf("\u0038\uFE0F\u20E3"),  // 8️⃣
                "9" to arrayListOf("\u0039\uFE0F\u20E3"),  // 9️⃣
                // Symbols - Emojis Discord valides
                "?" to arrayListOf("\u2754", "\u2753"),    // ❔ ❓
                "+" to arrayListOf("\u2795"),               // ➕
                "-" to arrayListOf("\u2796", "\u26D4", "\uD83D\uDCDB"),  // ➖ ⛔ 🚮
                "!" to arrayListOf("\u2755", "\u2757"),    // ❕ ❗
                "*" to arrayListOf("\u0023\uFE0F\u20E3", "\u2733", "\u2734"),  // *️⃣ ✳️ ✴️
                "$" to arrayListOf("\uD83D\uDCB2", "\uD83D\uDCB5", "\uD83D\uDCB0"),  // 💲 💵 💰
                "#" to arrayListOf("\u0023\uFE0F\u20E3"),  // #️⃣
                " " to arrayListOf("\u25AA", "\u25FE", "\u2796", "\u25FC", "\u2B1B", "\u26AB", "\uD83D\uDDA4", "\uD83D\uDD76", "\u2B1C", "\u25FD", "\u25FB", "\u25AB")  // carrés noirs/blancs
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