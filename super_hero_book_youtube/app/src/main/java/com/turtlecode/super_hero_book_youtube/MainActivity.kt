package com.turtlecode.super_hero_book_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superHeronames = ArrayList<String>()
        superHeronames.add("Batman")
        superHeronames.add("Superman")
        superHeronames.add("Ironman")
        superHeronames.add("Aquaman")
        superHeronames.add("Spiderman")

        val information = ArrayList<String>()
        information.add("Batman is a good man")
        information.add("Superman is a good man")
        information.add("Ironman is a good man")
        information.add("Aquaman is a good man")
        information.add("Spiderman is a good man")

        val batmanDrawID = R.drawable.batman
        val supermanDrawID = R.drawable.superman
        val IronmanDrawID = R.drawable.ironman
        val AquaManDrawID = R.drawable.aquaman
        val spidermanDrawID = R.drawable.spiderman

        var superHerosDrawList = ArrayList<Int>()
        superHerosDrawList.add(batmanDrawID)
        superHerosDrawList.add(supermanDrawID)
        superHerosDrawList.add(IronmanDrawID)
        superHerosDrawList.add(AquaManDrawID)
        superHerosDrawList.add(spidermanDrawID)

        val layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = layoutManager
        val adapter = Adapter(superHeronames,superHerosDrawList,information)
        recyclerview.adapter = adapter
    }
}