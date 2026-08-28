package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class z0 extends TLObject {
    public long f44112a;
    public long f44113b;
    public String f44114c;
    public h2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f44112a = inputSerializedData.readInt64(z10);
        this.f44113b = inputSerializedData.readInt64(z10);
        this.f44114c = inputSerializedData.readString(z10);
        h2 h2Var = new h2();
        this.d = h2Var;
        h2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f44112a);
        outputSerializedData.writeInt64(this.f44113b);
        String str = this.f44114c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
