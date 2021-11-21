package ru.kgsu.tornadotest.ui
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Orientation
import javafx.scene.control.TextField
import tornadofx.*
import java.sql.DriverManager.println

class Regist: View() {
    override val root = vbox {
        hbox {
            label("Фамилия")
            textfield()
        }
        hbox {
            label("Имя")
            textfield()
        }
        hbox {
            label("Логин")
            textfield()
        }
        hbox {
            label("Пароль")
            passwordfield() {
                requestFocus()
            }
        }
        hbox {
            label("Email")
            textfield()
        }
        hbox{
            button("Зарегистрироваться") {
                action {
                    replaceWith<Login>()
                }
                useMaxWidth = true
            }
        }
    }
}

