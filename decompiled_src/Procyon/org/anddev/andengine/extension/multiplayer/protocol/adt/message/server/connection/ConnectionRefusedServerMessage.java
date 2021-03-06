package org.anddev.andengine.extension.multiplayer.protocol.adt.message.server.connection;

import org.anddev.andengine.extension.multiplayer.protocol.adt.message.server.*;
import java.io.*;

public class ConnectionRefusedServerMessage extends BaseServerMessage
{
    public ConnectionRefusedServerMessage() {
        super();
    }
    
    public ConnectionRefusedServerMessage(final DataInputStream dataInputStream) throws IOException {
        super();
    }
    
    @Override
    public short getFlag() {
        return -32767;
    }
    
    @Override
    protected void onAppendTransmissionDataForToString(final StringBuilder sb) {
    }
    
    @Override
    protected void onWriteTransmissionData(final DataOutputStream dataOutputStream) throws IOException {
    }
}
