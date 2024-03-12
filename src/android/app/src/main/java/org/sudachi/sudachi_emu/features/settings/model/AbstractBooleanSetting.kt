// SPDX-FileCopyrightText: 2023 sudachi Emulator Project
// SPDX-License-Identifier: GPL-2.0-or-later

package org.sudachi.sudachi_emu.features.settings.model

interface AbstractBooleanSetting : AbstractSetting {
    fun getBoolean(needsGlobal: Boolean = false): Boolean
    fun setBoolean(value: Boolean)
}
