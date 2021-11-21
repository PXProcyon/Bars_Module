package ru.kgsu.tornadotest.ui
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Orientation
import javafx.geometry.Pos
import javafx.scene.control.TextField
import tornadofx.*
import java.sql.DriverManager.println

class FogPassword: View() {
    override val root = vbox {
        vbox {alignment = Pos.CENTER
            label("Введите Email")
            textfield()
        }
        button("Отправить") {
            action {
                replaceWith<Regist>()
            }
            useMaxWidth = true
        }
        vbox {alignment = Pos.CENTER
            label("Введите код из письма")
            textfield()
        }

    }
}