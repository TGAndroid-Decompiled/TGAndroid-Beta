package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class y0 extends TLObject {
    public long f51402a;
    public long f51403b;
    public String f51404c;
    public a2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.f51402a = inputSerializedData.readInt64(z9);
        this.f51403b = inputSerializedData.readInt64(z9);
        this.f51404c = inputSerializedData.readString(z9);
        a2 a2Var = new a2();
        this.d = a2Var;
        a2Var.readParams(inputSerializedData, z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f51402a);
        outputSerializedData.writeInt64(this.f51403b);
        String str = this.f51404c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
