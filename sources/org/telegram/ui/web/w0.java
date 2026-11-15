package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class w0 extends TLObject {
    public long f52858a;
    public long f52859b;
    public String f52860c;
    public z1 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f52858a = inputSerializedData.readInt64(z10);
        this.f52859b = inputSerializedData.readInt64(z10);
        this.f52860c = inputSerializedData.readString(z10);
        z1 z1Var = new z1();
        this.d = z1Var;
        z1Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f52858a);
        outputSerializedData.writeInt64(this.f52859b);
        String str = this.f52860c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
