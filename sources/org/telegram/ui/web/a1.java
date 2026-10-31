package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class a1 extends TLObject {
    public long f42982a;
    public long f42983b;
    public String f42984c;
    public c2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f42982a = inputSerializedData.readInt64(z10);
        this.f42983b = inputSerializedData.readInt64(z10);
        this.f42984c = inputSerializedData.readString(z10);
        c2 c2Var = new c2();
        this.d = c2Var;
        c2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f42982a);
        outputSerializedData.writeInt64(this.f42983b);
        String str = this.f42984c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
