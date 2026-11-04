package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class x0 extends TLObject {
    public long f51102a;
    public long f51103b;
    public String f51104c;
    public y1 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f51102a = inputSerializedData.readInt64(z10);
        this.f51103b = inputSerializedData.readInt64(z10);
        this.f51104c = inputSerializedData.readString(z10);
        y1 y1Var = new y1();
        this.d = y1Var;
        y1Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f51102a);
        outputSerializedData.writeInt64(this.f51103b);
        String str = this.f51104c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
