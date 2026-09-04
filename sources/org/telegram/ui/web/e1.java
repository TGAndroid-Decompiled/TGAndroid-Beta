package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class e1 extends TLObject {
    public long f42076a;
    public long f42077b;
    public String f42078c;
    public n2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f42076a = inputSerializedData.readInt64(z10);
        this.f42077b = inputSerializedData.readInt64(z10);
        this.f42078c = inputSerializedData.readString(z10);
        n2 n2Var = new n2();
        this.d = n2Var;
        n2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f42076a);
        outputSerializedData.writeInt64(this.f42077b);
        String str = this.f42078c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
