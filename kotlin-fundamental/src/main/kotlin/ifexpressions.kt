fun main() {
    val minimal = 75
    var nilai : Int = 65
    val penilaian: String
    penilaian = if (nilai >= minimal) {
        "Nilai kamu $nilai, selamat ya!"
    } else {
        "Nilai kamu $nilai, silakan ikuti remidial."
    }
    print(penilaian)
}