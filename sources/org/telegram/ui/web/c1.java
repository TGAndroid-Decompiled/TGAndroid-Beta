package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class c1 extends TLObject {
    public long f43278a;
    public long f43279b;
    public String f43280c;
    public m2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f43278a = inputSerializedData.readInt64(z10);
        this.f43279b = inputSerializedData.readInt64(z10);
        this.f43280c = inputSerializedData.readString(z10);
        m2 m2Var = new m2();
        this.d = m2Var;
        m2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f43278a);
        outputSerializedData.writeInt64(this.f43279b);
        String str = this.f43280c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
