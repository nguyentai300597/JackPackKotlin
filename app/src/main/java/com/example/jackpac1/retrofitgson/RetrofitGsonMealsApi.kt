

import com.example.jackpac1.data.GsonMealCategoriesResponse
import retrofit2.http.GET


interface RetrofitGsonMealsApi {
    @GET("categories.php")
    suspend fun getMealCategories(): GsonMealCategoriesResponse
}