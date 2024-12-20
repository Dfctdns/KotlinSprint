package org.example.lesson5

fun main() {

    val userName = "Zaphod"
    val password = "PanGalactic"

    print("Введите имя пользователя: ")
    val inputName = readln()

    if (inputName != userName) println("Пользователь не найден, завершите текущую сессию и зарегистрируйтесь")
    else {
        print("Введите пароль: ")
        val inputPassword = readln()

        if (inputPassword == password) println("[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.")
        else println("Неверный пароль")
    }
}