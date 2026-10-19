package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class b1 extends TLObject {
    public long f42600a;
    public long f42601b;
    public String f42602c;
    public l2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f42600a = inputSerializedData.readInt64(z10);
        this.f42601b = inputSerializedData.readInt64(z10);
        this.f42602c = inputSerializedData.readString(z10);
        l2 l2Var = new l2();
        this.d = l2Var;
        l2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f42600a);
        outputSerializedData.writeInt64(this.f42601b);
        String str = this.f42602c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
