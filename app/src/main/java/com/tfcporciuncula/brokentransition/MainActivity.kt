package com.tfcporciuncula.brokentransition

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    // by uncommenting this two issues are fixed:
    // - the red fragment never blinks in the beginning of the transition from the blue frag to the red frag
    //   (turns out this issue had already been reported here: https://issuetracker.google.com/issues/163084315)
    // - pressing back during the transition from the blue frag to the red frag won't result in a blank screen
//    FragmentManager.enableNewStateManager(false)
    setContentView(R.layout.activity_main)
  }
}
