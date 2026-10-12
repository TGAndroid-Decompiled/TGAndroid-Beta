package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class c1 extends TLObject {
    public long f41321a;
    public long f41322b;
    public String f41323c;
    public l2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f41321a = inputSerializedData.readInt64(z10);
        this.f41322b = inputSerializedData.readInt64(z10);
        this.f41323c = inputSerializedData.readString(z10);
        l2 l2Var = new l2();
        this.d = l2Var;
        l2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f41321a);
        outputSerializedData.writeInt64(this.f41322b);
        String str = this.f41323c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
