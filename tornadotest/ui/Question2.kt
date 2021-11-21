package ru.kgsu.tornadotest.ui
import javafx.scene.control.ToggleGroup
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Orientation
import javafx.geometry.Pos
import javafx.scene.control.TextField
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

import java.sql.DriverManager.println

class Question2: View() {
    private val toggleGroup = ToggleGroup()
    override val root = vbox { alignment = Pos.CENTER
            label("Вопрос 2")
            label("Параллепепидет - это")
            checkbox("Admin Mode").action {}
            checkbox("Mode").action {}
            checkbox("Admin Mode").action {}
            checkbox("Admin Mode").action {}
            button ("Дашьше"){
                style {
                    fontWeight = FontWeight.EXTRA_BOLD
                    borderColor += box(
                        top = Color.BLACK,
                        right = Color.BLUE,
                        left = Color.BLACK,
                        bottom = Color.BLUE)
                }
                action {replaceWith<Final>()  }
            }

    }
}


