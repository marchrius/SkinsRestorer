/*
 * SkinsRestorer
 * Copyright (C) 2024  SkinsRestorer Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package net.skinsrestorer.shared.storage.model.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.skinsrestorer.api.property.SkinIdentifier;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor(staticName = "of")
public class PlayerData {
    private final UUID uniqueId;
    @Nullable
    private SkinIdentifier skinIdentifier;
    private List<HistoryData> history;
    private List<FavouriteData> favourites;
}
