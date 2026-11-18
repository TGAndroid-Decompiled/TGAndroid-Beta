package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class w0 extends TLObject {
    public long f53387a;
    public long f53388b;
    public String f53389c;
    public z1 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f53387a = inputSerializedData.readInt64(z10);
        this.f53388b = inputSerializedData.readInt64(z10);
        this.f53389c = inputSerializedData.readString(z10);
        z1 z1Var = new z1();
        this.d = z1Var;
        z1Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f53387a);
        outputSerializedData.writeInt64(this.f53388b);
        String str = this.f53389c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
