package pt.ipt.api.retrofit

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import pt.ipt.api.retrofit.service.NoteService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/** access to API*/

class RetrofitInitializer {
    val host = "http://ram.ipt.pt/"
    //val host = "https://adamastor.ipt.pt/DAM-API/"

    private val gson:Gson = GsonBuilder().setLenient().create()

    private val retrofit = Retrofit.Builder()
        .baseUrl(host)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    fun noteService() = retrofit.create(NoteService::class.java)
}