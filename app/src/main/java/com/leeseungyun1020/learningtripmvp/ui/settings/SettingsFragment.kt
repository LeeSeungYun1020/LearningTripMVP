package com.leeseungyun1020.learningtripmvp.ui.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.leeseungyun1020.learningtripmvp.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}