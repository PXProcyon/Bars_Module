package ru.kgsu.tornadotest.ui
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Orientation
import javafx.geometry.Pos
import javafx.scene.control.TextField
import tornadofx.*
import java.sql.DriverManager.println

class MyView: View() {
    override val root = vbox {alignment = Pos.CENTER
        button("Войти") {
            action {
                replaceWith<Rectangle>()
            }
        }
    }
}