package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class e1 extends TLObject {
    public long f37926a;
    public long f37927b;
    public String f37928c;
    public o2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f37926a = inputSerializedData.readInt64(z10);
        this.f37927b = inputSerializedData.readInt64(z10);
        this.f37928c = inputSerializedData.readString(z10);
        o2 o2Var = new o2();
        this.d = o2Var;
        o2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f37926a);
        outputSerializedData.writeInt64(this.f37927b);
        String str = this.f37928c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
