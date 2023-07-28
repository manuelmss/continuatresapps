package com.manuel.continuatres.data.retrofit

import com.manuel.continuatres.data.response.ListNoteResponse
import retrofit2.http.GET

interface NoteService {

    @GET("discography.php?s=coldplay")
    suspend fun getAllNotes(): ListNoteResponse

}