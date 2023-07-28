package com.manuel.model

import android.graphics.Color
import com.google.gson.annotations.SerializedName

data class Note(
    val strAlbum: String,
    @SerializedName("created_on")
    val intYearReleased: String
) {
}

fun getData(): List<Note> {
    return listOf(
        Note(
            "Nota 1",
            "13/07/2023"
        ),
        Note(
            "Nota 2",
            "13/07/2023"
        ),
        Note(
            "Nota 3",
            "13/07/2023"
        ),
        Note(
            "Nota 4",

            "13/07/2023"
        ),
        Note(
            "Nota 5",
            "13/07/2023"
        ),
        Note(
            "Nota 6",
            "13/07/2023"
        ),
        Note(
            "Nota 7",
            "13/07/2023"
        ),
        Note(
            "Nota 8",
            "13/07/2023"
        ),
        Note(
            "Nota 9",
            "13/07/2023"
        ),
    )
}
