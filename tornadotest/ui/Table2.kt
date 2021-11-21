package ru.kgsu.tornadotest.ui

import javafx.scene.Parent
import javafx.scene.control.SelectionMode
import ru.kgsu.tornadotest.app.Person
import tornadofx.*
import java.time.LocalDate

class Table2() : View() {
    override val root = vbox {
        label(teacher_fio) {
        }
        val teacher_info = listOf(
                Teacher_info(1, "Программная инженирия","ИТ-40022", 56, LocalDate.of(2023, 1, 13)),
                Teacher_info(2, "Объектно-ориентированное программирование", "ИТ-40020",72, LocalDate.of(2023, 1, 14)),
                Teacher_info(3, "Основы программирования","ИТ-40021",102, LocalDate.of(2023, 1, 21)),
                Teacher_info(4, "Стандарты проектирования","ИТ-40021",56, LocalDate.of(2023, 1, 22))
        ).asObservable()

        tableview(persons) {
            readonlyColumn("ID", Teacher_info::id)
            readonlyColumn("Дисциплина", Teacher_info::subject)
            readonlyColumn("Группа", Teacher_info::groups)
            readonlyColumn("Часы", Teacher_info::times)
            readonlyColumn("Дата экзамена", Teacher_info::data_exam)
        }

    }
}
