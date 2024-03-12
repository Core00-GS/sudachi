// SPDX-FileCopyrightText: 2023 sudachi Emulator Project
// SPDX-License-Identifier: GPL-2.0-or-later

package org.sudachi.sudachi_emu.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameDir(
    val uriString: String,
    var deepScan: Boolean
) : Parcelable
