package ru.kgsu.tornadotest.ui
import javafx.geometry.Pos
import tornadofx.*

class Login: View() {
    override val root = vbox {
        hbox {alignment = Pos.CENTER
            label("Логин")
            textfield()
        }
        hbox {alignment = Pos.CENTER
            label("Пароль")
            passwordfield() {
                requestFocus()
            }
        }
        vbox {alignment = Pos.CENTER
            button("Войти") {
                action {
                    replaceWith<Table>()
                }
                useMaxWidth = true
            }
            button("Зарегистрироваться") {
                action {
                    replaceWith<Regist>()
                }
                useMaxWidth = true
            }
            button("Забыл пароль") {
                action {
                    replaceWith<FogPassword>()
                }
                useMaxWidth = true
            }
        }
    }
}