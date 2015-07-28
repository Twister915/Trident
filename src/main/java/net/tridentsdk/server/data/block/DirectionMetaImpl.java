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
package net.tridentsdk.server.data.block;

import net.tridentsdk.base.Block;
import net.tridentsdk.base.BlockDirection;
import net.tridentsdk.base.Substance;
import net.tridentsdk.meta.block.DirectionMeta;
import net.tridentsdk.meta.component.Meta;
import net.tridentsdk.meta.component.MetaCollection;

/**
 * Represents a block direction
 *
 * @author The TridentSDK Team
 */
// TODO
public class DirectionMetaImpl implements DirectionMeta {
    private volatile BlockDirection direction = BlockDirection.SELF;

    @Override
    public BlockDirection direction() {
        return direction;
    }

    @Override
    public void setDirection(BlockDirection direction) {
        this.direction = direction;
    }

    @Override
    public byte encode() {
        return 0;
    }

    @Override
    public Meta<Block> decode(Block instance, float yaw, byte direction, byte cx, byte cy, byte cz, short damageValue) {
        DirectionMeta meta = new DirectionMetaImpl();

        return meta;
    }

    @Override
    public Meta<Block> make() {
        return new DirectionMetaImpl();
    }

    @Override
    public Substance[] applyTo(MetaCollection collection) {
        collection.putIfAbsent(DirectionMeta.class, this);
        return new Substance[]{Substance.WOOL};
    }
}
