import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign

@Composable
fun MealCategoriesScreen(viewModel: MainViewModel) {

    Column {

        if (viewModel.mealsCategoryTitleStrId != null) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(id = viewModel.mealsCategoryTitleStrId!!),
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
            )
        }

        if (viewModel.apiLoadingTime != null) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "API Loading Time: ${viewModel.apiLoadingTime!!} ms",
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center,
            )
        }

        if (viewModel.mealCategories != null) {

            LazyColumn(
               // modifier = Modifier.fillMaxSize(),
            ) {
                items(items = viewModel.mealCategories!!) { mealCategory ->
                    MealCategoryItem(mealCategory = mealCategory)
                }
            }
        }
    }
}
