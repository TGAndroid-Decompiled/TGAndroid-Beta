package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class w0 extends TLObject {
    public long f53618a;
    public long f53619b;
    public String f53620c;
    public a2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f53618a = inputSerializedData.readInt64(z10);
        this.f53619b = inputSerializedData.readInt64(z10);
        this.f53620c = inputSerializedData.readString(z10);
        a2 a2Var = new a2();
        this.d = a2Var;
        a2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f53618a);
        outputSerializedData.writeInt64(this.f53619b);
        String str = this.f53620c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
