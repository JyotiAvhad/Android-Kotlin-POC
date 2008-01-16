package com.example.videoapp

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    val toolbar = null
    val drawerLayout = null
    val navigationView = null
    val it = null

    val drawerToogle by lazy {
        ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        supportActionBar?.title = ""
        navigationView.setNavigationItemSelectedListener {

            it?.let { it1 -> selectDrawerItem(it1) }
            true
        }
        drawerLayout.addDrawerListener(drawerToogle)

        val fragment = PreviewFragment.newInstance()
        addFragment(fragment)

        // The ViewPager will be implemented once it's fragments have
        // been implemented.
//        val pagerAdapter = CamFragmentPagerAdapter(supportFragmentManager)
//        viewPager.adapter = pagerAdapter
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        drawerToogle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        drawerToogle.onConfigurationChanged(newConfig)
    }

    private fun selectDrawerItem(item: MenuItem) {
        var fragment: Fragment? = null

//        val fragmentClass = TODO("Will be implemented later")
        drawerLayout.closeDrawer(GravityCompat.START)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (drawerToogle.onOptionsItemSelected(item)) true else super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.fragment_menu, menu)
        return false
    }

    private fun addFragment(fragment: Fragment?) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragment?.let { fragmentTransaction.add(R.id.fragmentContainer, it) }
        fragmentTransaction.commit()
    }
}

private fun Nothing?.setNavigationItemSelectedListener(function: () -> Boolean) {

}

private fun Nothing?.closeDrawer(start: Int) {

}

private fun Nothing?.addDrawerListener(drawerToogle: ActionBarDrawerToggle) {


}
