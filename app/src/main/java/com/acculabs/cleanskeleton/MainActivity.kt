package com.acculabs.cleanskeleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acculabs.cleanskeleton.dataSource.testDataSource.TestAssetsDataProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestAssetsDataProvider().getTodoTestData()
    }
}

/***
 * Room
 * ViewModel
 * LiveData
 * RecyclerView
 * Toolbar
 * databinding
 * rxjava
 * Dagger
 *
 *
 * +NavigationController
 * +Pagination
 * +coroutines
 * +firebase
 *
 *
 * Application
 * MainActivity
 *    ListingFragment
 *    DetailFragment <-> Viewmodel <-> Task <-> Repo <-> DataSource
 *    StatisticsFragment
 *      ExtensionFunction
  *
 * Models->DataSource->Assets/TestDataSource
 *
 * Dagger
 *     AppComponent/AppModule
 *        ToDoModule(AppModule)
 *             // Inject fragment/activity <- presenter <- Task <- Repo <- Datasource
 */
