package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class b1 extends TLObject {
    public long f39459a;
    public long f39460b;
    public String f39461c;
    public k2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        this.f39459a = inputSerializedData.readInt64(z4);
        this.f39460b = inputSerializedData.readInt64(z4);
        this.f39461c = inputSerializedData.readString(z4);
        k2 k2Var = new k2();
        this.d = k2Var;
        k2Var.readParams(inputSerializedData, z4);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f39459a);
        outputSerializedData.writeInt64(this.f39460b);
        String str = this.f39461c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
