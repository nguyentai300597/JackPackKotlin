

import com.example.jackpac1.data.GsonMealCategoriesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class MainRepository(

    private val retrofitGsonWebService: RetrofitGsonMealsWebService,

    ) {

    companion object {
        const val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"
    }



    suspend fun getRetrofitGsonMealCategories(enableTest: Boolean): GsonMealCategoriesResponse
            = withContext(Dispatchers.IO) {

        if (enableTest) {
            repeat(10) {
                retrofitGsonWebService.getMealCategories()
            }
        }

        return@withContext retrofitGsonWebService.getMealCategories()
    }


}