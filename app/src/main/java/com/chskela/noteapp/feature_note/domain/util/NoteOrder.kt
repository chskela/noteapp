package com.chskela.noteapp.feature_note.domain.util

sealed class NoteOrder(val orderType: OrderType) {
    class Title(orderType: OrderType) : NoteOrder(orderType)
    class Date(orderType: OrderType) : NoteOrder(orderType)
    class Color(orderType: OrderType) : NoteOrder(orderType)
}

fun NoteOrder.copy(orderType: OrderType) : NoteOrder {
    return when(this) {
        is NoteOrder.Title -> NoteOrder.Title(orderType)
        is NoteOrder.Date -> NoteOrder.Date(orderType)
        is NoteOrder.Color -> NoteOrder.Color(orderType)
    }
}