package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class d1 extends TLObject {
    public long f41019a;
    public long f41020b;
    public String f41021c;
    public m2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f41019a = inputSerializedData.readInt64(z10);
        this.f41020b = inputSerializedData.readInt64(z10);
        this.f41021c = inputSerializedData.readString(z10);
        m2 m2Var = new m2();
        this.d = m2Var;
        m2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f41019a);
        outputSerializedData.writeInt64(this.f41020b);
        String str = this.f41021c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
