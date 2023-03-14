

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jackpac1.R
import com.example.jackpac1.data.asMealCategories
import com.example.jackpac1.service.MealCategory
import kotlinx.coroutines.launch

import kotlin.system.measureTimeMillis

class MainViewModel(preview: Boolean = false) : ViewModel() {

    var mealCategories: List<MealCategory>? by mutableStateOf(null)
        private set

    var mealsCategoryTitleStrId: Int? by mutableStateOf(null)
        private set

    var apiLoadingTime: String? by mutableStateOf(null)
        private set

    var enablePerformanceTest: Boolean by mutableStateOf(false)
        private set

    private val repository = MainRepository(

        RetrofitGsonMealsWebService(),

    )



    fun updateMealCategoriesWithRetrofitGson() = viewModelScope.launch {

        val time = measureTimeMillis {
            clear()
            mealsCategoryTitleStrId = R.string.retrofit_gson

            val response = repository.getRetrofitGsonMealCategories(enablePerformanceTest)
            mealCategories = response.asMealCategories()
        }

        apiLoadingTime = time.toString()
    }



    fun onEnablePerformanceTestClick(value: Boolean) {
        enablePerformanceTest = value
    }

    private fun clear() {
        apiLoadingTime = null
        mealCategories = null
    }
}