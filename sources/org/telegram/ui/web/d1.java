package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class d1 extends TLObject {
    public long f38995a;
    public long f38996b;
    public String f38997c;
    public n2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f38995a = inputSerializedData.readInt64(z10);
        this.f38996b = inputSerializedData.readInt64(z10);
        this.f38997c = inputSerializedData.readString(z10);
        n2 n2Var = new n2();
        this.d = n2Var;
        n2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f38995a);
        outputSerializedData.writeInt64(this.f38996b);
        String str = this.f38997c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
