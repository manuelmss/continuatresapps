package com.manuel.continuatres.data.repository

import com.manuel.continuatres.data.response.ListNoteResponse
import com.manuel.continuatres.data.retrofit.RetrofitHelper

class NoteRepository {

    suspend fun getNotes(): NoteServiceResult<ListNoteResponse> {
        return try {
            val response = RetrofitHelper.noteService.getAllNotes()
            NoteServiceResult.Success(response)
        } catch (e: java.lang.Exception) {
            NoteServiceResult.Error(e)
        }
    }

}