/*
 * Trident - A Multithreaded Server Alternative
 * Copyright 2014 The TridentSDK Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.tridentsdk.server.entity.living;

import net.tridentsdk.base.Position;
import net.tridentsdk.base.SubstanceColor;
import net.tridentsdk.entity.living.Player;
import net.tridentsdk.entity.living.Wolf;
import net.tridentsdk.entity.types.EntityType;
import net.tridentsdk.event.entity.EntityDamageEvent;
import net.tridentsdk.server.entity.TridentLivingEntity;

import java.util.UUID;

/**
 * Represents a wolf
 *
 * @author The TridentSDK Team
 */
public class TridentWolf extends TridentLivingEntity implements Wolf {
    public TridentWolf(UUID uuid, Position spawnPosition) {
        super(uuid, spawnPosition);
    }

    @Override
    public boolean isAngry() {
        return false;
    }

    @Override
    public SubstanceColor collarColor() {
        return null;
    }

    @Override
    public boolean isTamed() {
        return false;
    }

    @Override
    public UUID owner() {
        return null;
    }

    @Override
    public boolean isSitting() {
        return false;
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public void setAge(int ticks) {

    }

    @Override
    public boolean canBreed() {
        return false;
    }

    @Override
    public boolean isInLove() {
        return false;
    }

    @Override
    public boolean isHostile() {
        return false;
    }

    @Override
    public EntityDamageEvent lastDamageEvent() {
        return null;
    }

    @Override
    public Player lastPlayerDamager() {
        return null;
    }

    @Override
    public EntityType type() {
        return EntityType.WOLF;
    }
}
