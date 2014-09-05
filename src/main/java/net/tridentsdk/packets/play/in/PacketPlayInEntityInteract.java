/*
 * Copyright (C) 2014 The TridentSDK Team
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.tridentsdk.packets.play.in;

import io.netty.buffer.ByteBuf;
import net.tridentsdk.api.Location;
import net.tridentsdk.server.netty.Codec;
import net.tridentsdk.server.netty.client.ClientConnection;
import net.tridentsdk.server.netty.packet.InPacket;
import net.tridentsdk.server.netty.packet.Packet;

public class PacketPlayInEntityInteract extends InPacket {

    private int target;
    private int type; // TODO: Change to InteractType

    private Location location;

    @Override
    public int getId() {
        return 0x02;
    }

    @Override
    public Packet decode(ByteBuf buf) {
        this.target = Codec.readVarInt32(buf);
        this.type = Codec.readVarInt32(buf);

        double x = (double) buf.readFloat();
        double y = (double) buf.readFloat();
        double z = (double) buf.readFloat();

        this.location = new Location(null, x, y, z); // TODO: Get the clients world
        return this;
    }

    public int getTarget() {
        return this.target;
    }

    public int getInteractType() {
        return this.type;
    }

    public Location getLocation() {
        return this.location;
    }

    @Override
    public void handleReceived(ClientConnection connection) {
        // TODO: Respond to the client accordingly
    }
}
