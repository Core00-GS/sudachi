// SPDX-FileCopyrightText: 2023 sudachi Emulator Project
// SPDX-License-Identifier: GPL-2.0-or-later

package org.sudachi.sudachi_emu.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class License(
    val titleId: Int,
    val descriptionId: Int,
    val linkId: Int,
    val copyrightId: Int,
    val licenseId: Int
) : Parcelable
