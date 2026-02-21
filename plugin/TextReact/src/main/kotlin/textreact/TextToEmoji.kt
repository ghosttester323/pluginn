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
                // A - Tous les emojis Discord valides
                "a" to arrayListOf(
                    "\uD83C\uDDE6",  // 🇦 Regional indicator A
                    "\uD83C\uDD70",  // 🅰️ A button (blood type)
                    "\uD83C\uDD8E"   // 🆎 AB button
                ),
                // B - Tous les emojis Discord valides
                "b" to arrayListOf(
                    "\uD83C\uDDE7",  // 🇧 Regional indicator B
                    "\uD83C\uDD71"   // 🅱️ B button (blood type)
                ),
                // C - Tous les emojis Discord valides
                "c" to arrayListOf(
                    "\uD83C\uDDE8",  // 🇨 Regional indicator C
                    "\u00A9",        // ©️ Copyright
                    "\uD83C\uDD91"   // 🆒 COOL button
                ),
                // D - Tous les emojis Discord valides
                "d" to arrayListOf(
                    "\uD83C\uDDE9"   // 🇩 Regional indicator D
                ),
                // E - Tous les emojis Discord valides
                "e" to arrayListOf(
                    "\uD83C\uDDEA",  // 🇪 Regional indicator E
                    "\uD83D\uDCE7",  // 📧 E-mail
                    "\uD83C\uDFBC"   // 🎼 Musical score (looks like E)
                ),
                // F - Tous les emojis Discord valides
                "f" to arrayListOf(
                    "\uD83C\uDDEB"   // 🇫 Regional indicator F
                ),
                // G - Tous les emojis Discord valides
                "g" to arrayListOf(
                    "\uD83C\uDDEC"   // 🇬 Regional indicator G
                ),
                // H - Tous les emojis Discord valides
                "h" to arrayListOf(
                    "\uD83C\uDDED",  // 🇭 Regional indicator H
                    "\u2653"         // ♓ Pisces (looks like H)
                ),
                // I - Tous les emojis Discord valides
                "i" to arrayListOf(
                    "\uD83C\uDDEE",  // 🇮 Regional indicator I
                    "\u2139",        // ℹ️ Information
                    "\uD83C\uDD94"   // 🆔 ID button
                ),
                // J - Tous les emojis Discord valides
                "j" to arrayListOf(
                    "\uD83C\uDDEF"   // 🇯 Regional indicator J
                ),
                // K - Tous les emojis Discord valides
                "k" to arrayListOf(
                    "\uD83C\uDDF0"   // 🇰 Regional indicator K
                ),
                // L - Tous les emojis Discord valides
                "l" to arrayListOf(
                    "\uD83C\uDDF1"   // 🇱 Regional indicator L
                ),
                // M - Tous les emojis Discord valides
                "m" to arrayListOf(
                    "\uD83C\uDDF2",  // 🇲 Regional indicator M
                    "\u24C2",        // Ⓜ️ Circled M
                    "\u264F",        // ♏ Scorpio (looks like M)
                    "\u264D"         // ♍ Virgo (looks like m)
                ),
                // N - Tous les emojis Discord valides
                "n" to arrayListOf(
                    "\uD83C\uDDF3",  // 🇳 Regional indicator N
                    "\u2651"         // ♑ Capricorn (looks like n)
                ),
                // O - Tous les emojis Discord valides (PLEIN!)
                "o" to arrayListOf(
                    "\uD83C\uDDF4",  // 🇴 Regional indicator O
                    "\uD83C\uDD7E",  // 🅾️ O button (blood type)
                    "\u2B55",        // ⭕ Hollow red circle
                    "\u26AB",        // ⚫ Medium black circle
                    "\u26AA",        // ⚪ Medium white circle
                    "\uD83D\uDFE0",  // 🔴 Large red circle
                    "\uD83D\uDFE1",  // 🟠 Large orange circle
                    "\uD83D\uDFE2",  // 🟡 Large yellow circle
                    "\uD83D\uDFE3",  // 🟢 Large green circle
                    "\uD83D\uDFE4",  // 🔵 Large blue circle
                    "\uD83D\uDFE5",  // 🟣 Large purple circle
                    "\uD83D\uDFE6",  // 🟤 Large brown circle
                    "\uD83D\uDD18",  // 🔘 Radio button
                    "\uD83D\uDD73",  // 🕳️ Hole
                    "\uD83C\uDF4E"   // 💮 White flower (O shape)
                ),
                // P - Tous les emojis Discord valides
                "p" to arrayListOf(
                    "\uD83C\uDDF5",  // 🇵 Regional indicator P
                    "\uD83C\uDD7F"   // 🅿️ P button (parking)
                ),
                // Q - Tous les emojis Discord valides
                "q" to arrayListOf(
                    "\uD83C\uDDF6"   // 🇶 Regional indicator Q
                ),
                // R - Tous les emojis Discord valides
                "r" to arrayListOf(
                    "\uD83C\uDDF7",  // 🇷 Regional indicator R
                    "\u00AE"         // ®️ Registered
                ),
                // S - Tous les emojis Discord valides
                "s" to arrayListOf(
                    "\uD83C\uDDF8",  // 🇸 Regional indicator S
                    "\uD83D\uDCB2",  // 💲 Dollar sign (S shape)
                    "\u269C"         // ⚜️ Fleur-de-lis (S curve)
                ),
                // T - Tous les emojis Discord valides
                "t" to arrayListOf(
                    "\uD83C\uDDF9",  // 🇹 Regional indicator T
                    "\u271D",        // ✝️ Latin cross
                    "\u2626",        // ☦️ Orthodox cross
                    "\u26B0"         // ⚰️ Coffin (cross shape)
                ),
                // U - Tous les emojis Discord valides
                "u" to arrayListOf(
                    "\uD83C\uDDFA"   // 🇺 Regional indicator U
                ),
                // V - Tous les emojis Discord valides
                "v" to arrayListOf(
                    "\uD83C\uDDFB",  // 🇻 Regional indicator V
                    "\u2648",        // ♈ Aries (looks like V)
                    "\u270C",        // ✌️ Victory hand
                    "\uD83C\uDD9A"   // 🆚 VS button
                ),
                // W - Tous les emojis Discord valides
                "w" to arrayListOf(
                    "\uD83C\uDDFC"   // 🇼 Regional indicator W
                ),
                // X - Tous les emojis Discord valides (PLEIN!)
                "x" to arrayListOf(
                    "\uD83C\uDDFD",  // 🇽 Regional indicator X
                    "\u274E",        // ❎ Cross mark button
                    "\u274C",        // ❌ Cross mark
                    "\u2716"         // ✖️ Multiply
                ),
                // Y - Tous les emojis Discord valides
                "y" to arrayListOf(
                    "\uD83C\uDDFE"   // 🇾 Regional indicator Y
                ),
                // Z - Tous les emojis Discord valides
                "z" to arrayListOf(
                    "\uD83C\uDDFF"   // 🇿 Regional indicator Z
                ),
                // Numbers - Tous les emojis Discord valides
                "0" to arrayListOf(
                    "\u0030\uFE0F\u20E3",  // 0️⃣ Keycap 0
                    "\u2B55",              // ⭕ (also for O/zero)
                    "\u26AB",              // ⚫ Black circle
                    "\u26AA"               // ⚪ White circle
                ),
                "1" to arrayListOf(
                    "\u0031\uFE0F\u20E3",  // 1️⃣ Keycap 1
                    "\uD83D\uDD1F"         // 🔟 Keycap 10
                ),
                "2" to arrayListOf("\u0032\uFE0F\u20E3"),  // 2️⃣
                "3" to arrayListOf("\u0033\uFE0F\u20E3"),  // 3️⃣
                "4" to arrayListOf("\u0034\uFE0F\u20E3"),  // 4️⃣
                "5" to arrayListOf("\u0035\uFE0F\u20E3"),  // 5️⃣
                "6" to arrayListOf("\u0036\uFE0F\u20E3"),  // 6️⃣
                "7" to arrayListOf("\u0037\uFE0F\u20E3"),  // 7️⃣
                "8" to arrayListOf(
                    "\u0038\uFE0F\u20E3",  // 8️⃣ Keycap 8
                    "\uD83D\uDD1E"         // 🔞 18 button
                ),
                "9" to arrayListOf("\u0039\uFE0F\u20E3"),  // 9️⃣
                // Symbols - Tous les emojis Discord valides
                "?" to arrayListOf(
                    "\u2754",  // ❔ White question mark
                    "\u2753"   // ❓ Red question mark
                ),
                "+" to arrayListOf(
                    "\u2795",  // ➕ Plus
                    "\u2797",  // ➗ Divide (alternative)
                    "\u267B"   // ♻️ Recycle (plus-like)
                ),
                "-" to arrayListOf(
                    "\u2796",  // ➖ Minus
                    "\u26D4",  // ⛔ No entry
                    "\uD83D\uDCDB"  // 🚮 Litter
                ),
                "!" to arrayListOf(
                    "\u2755",  // ❕ White exclamation
                    "\u2757",  // ❗ Red exclamation
                    "\u203C"   // ‼️ Double exclamation
                ),
                "*" to arrayListOf(
                    "\u002A\uFE0F\u20E3",  // *️⃣ Keycap asterisk
                    "\u2733",              // ✳️ Eight-spoked asterisk
                    "\u2734"               // ✴️ Eight-pointed star
                ),
                "$" to arrayListOf(
                    "\uD83D\uDCB2",  // 💲 Dollar sign
                    "\uD83D\uDCB5",  // 💵 Dollar banknote
                    "\uD83D\uDCB0",  // 💰 Money bag
                    "\uD83D\uDCB4",  // 💴 Yen banknote
                    "\uD83D\uDCB6",  // 💶 Euro banknote
                    "\uD83D\uDCB7"   // 💷 Pound banknote
                ),
                "#" to arrayListOf(
                    "\u0023\uFE0F\u20E3"  // #️⃣ Keycap hash
                ),
                // Space - Tous les emojis Discord valides (formes/blocs)
                " " to arrayListOf(
                    "\u25AA",  // ▪️ Small black square
                    "\u25AB",  // ▫️ Small white square
                    "\u25FB",  // ◻️ Medium white square
                    "\u25FC",  // ◼️ Medium black square
                    "\u25FD",  // ◽ Medium-small white square
                    "\u25FE",  // ◾ Medium-small black square
                    "\u2B1B",  // ⬛ Large black square
                    "\u2B1C",  // ⬜ Large white square
                    "\u26AB",  // ⚫ Medium black circle
                    "\u26AA",  // ⚪ Medium white circle
                    "\uD83D\uDDA4",  // 🖤 Black heart
                    "\uD83D\uDD76",  // 🕶️ Sunglasses
                    "\uD83D\uDFE0",  // 🔴 Red circle
                    "\uD83D\uDFE1",  // 🟠 Orange circle
                    "\uD83D\uDFE2",  // 🟡 Yellow circle
                    "\uD83D\uDFE3",  // 🟢 Green circle
                    "\uD83D\uDFE4",  // 🔵 Blue circle
                    "\uD83D\uDFE5",  // 🟣 Purple circle
                    "\uD83D\uDFE6",  // 🟤 Brown circle
                    "\uD83E\uDDE1",  // 🩷 Pink heart
                    "\uD83E\uDD75",  // 🩵 Light blue heart
                    "\uD83E\uDD76",  // 🩶 Grey heart
                    "\uD83D\uDC99",  // 💙 Blue heart
                    "\uD83D\uDC9A",  // 💚 Green heart
                    "\uD83D\uDC9B",  // 💛 Yellow heart
                    "\uD83D\uDC9C",  // 💜 Purple heart
                    "\uD83D\uDC9E",  // 💝 Heart with ribbon
                    "\uD83E\uDDE0"   // 🧠 Brain (alternative)
                )
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