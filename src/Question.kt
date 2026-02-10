class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)

class TrueOrFalseQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: Boolean
)

class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)

enum class Difficulty {
    EASY,
    MEDIUM,
    HARD
}
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
data class Question<T>(
    val questionText: String,
    val answer: String,
    val difficulty: Difficulty
)

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable {
    override val progressText: String
        get() = "${answered} of ${total} answered"

    fun Quiz.StudentProgress.printProgressBar() {
        repeat(times = Quiz.answered) {print("▒")}
        repeat(times = Quiz.total - Quiz.answered) {print("▒")}
        println()
        println(Quiz.progressText)
    }
    val question1 = Question<String>(
        questionText = "Речка спятила с ума - По домам пошла сама. ___",
        answer = "водопровод",
        Difficulty.MEDIUM
    )
    val question2 = Question<Boolean>(
        questionText = "Небо зелёное. Правда или ложь",
        answer = false,
        Difficulty.EASY
    )
    val question3 = Question<Int>(
        questionText = "Сколько дней между полнолуниями?",
        answer = 28,
        Difficulty.HARD
    )
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
    fun printQuiz() {
        println(question.questionText)
    }
}

fun main() {
    Quiz().printProgressBar()
}
