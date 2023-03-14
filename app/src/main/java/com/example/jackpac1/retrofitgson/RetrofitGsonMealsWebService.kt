

import com.example.jackpac1.data.GsonMealCategoriesResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitGsonMealsWebService {

    private val api: RetrofitGsonMealsApi by lazy {
        createMealsApi()
    }

    suspend fun getMealCategories(): GsonMealCategoriesResponse {
        return api.getMealCategories()
    }

    private fun createMealsApi(): RetrofitGsonMealsApi {

        val gsonConverterFactory = GsonConverterFactory.create()

        val retrofit = Retrofit.Builder()
            .baseUrl(MainRepository.BASE_URL)
            .addConverterFactory(gsonConverterFactory)
            .build()

        return retrofit.create(RetrofitGsonMealsApi::class.java)
    }
}