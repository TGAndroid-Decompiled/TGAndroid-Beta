package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

public final class a1 extends TLObject {

    public long f43774a;

    public long f43775b;

    public String f43776c;
    public i2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f43774a = inputSerializedData.readInt64(z10);
        this.f43775b = inputSerializedData.readInt64(z10);
        this.f43776c = inputSerializedData.readString(z10);
        i2 i2Var = new i2();
        this.d = i2Var;
        i2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f43774a);
        outputSerializedData.writeInt64(this.f43775b);
        String str = this.f43776c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
