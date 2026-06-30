/*
 *  SPDX-FileCopyrightText: crDroid Android Project
 *  SPDX-FileCopyrightText: Altair ROM Project
 *  SPDX-License-Identifier: Apache-2.0
 */

package com.android.settings.display.darkmode

import com.altair.settings.preferences.BaseAppListSettingsFragment
import com.android.settings.R

class DarkThemePerAppSettings : BaseAppListSettingsFragment() {

    private val repository: DarkThemePackageRepository by lazy {
        DarkThemePackageRepository(requireContext().contentResolver)
    }

    override fun getTitleResId(): Int = R.string.dark_theme_per_app_title

    override fun getInitialCheckedList(): List<String> =
        repository.getExcludedPackages().toList()

    override fun onListUpdate(packageName: String, isChecked: Boolean) =
        repository.setExcluded(packageName, isChecked)
}
