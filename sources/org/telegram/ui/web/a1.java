package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class a1 extends TLObject {
    public long f43975a;
    public long f43976b;
    public String f43977c;
    public j2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f43975a = inputSerializedData.readInt64(z10);
        this.f43976b = inputSerializedData.readInt64(z10);
        this.f43977c = inputSerializedData.readString(z10);
        j2 j2Var = new j2();
        this.d = j2Var;
        j2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f43975a);
        outputSerializedData.writeInt64(this.f43976b);
        String str = this.f43977c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
