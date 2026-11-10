package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class y0 extends TLObject {
    public long f51337a;
    public long f51338b;
    public String f51339c;
    public a2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.f51337a = inputSerializedData.readInt64(z9);
        this.f51338b = inputSerializedData.readInt64(z9);
        this.f51339c = inputSerializedData.readString(z9);
        a2 a2Var = new a2();
        this.d = a2Var;
        a2Var.readParams(inputSerializedData, z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f51337a);
        outputSerializedData.writeInt64(this.f51338b);
        String str = this.f51339c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
