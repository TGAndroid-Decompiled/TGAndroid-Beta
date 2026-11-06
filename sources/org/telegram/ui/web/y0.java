package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class y0 extends TLObject {
    public long f51395a;
    public long f51396b;
    public String f51397c;
    public a2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.f51395a = inputSerializedData.readInt64(z9);
        this.f51396b = inputSerializedData.readInt64(z9);
        this.f51397c = inputSerializedData.readString(z9);
        a2 a2Var = new a2();
        this.d = a2Var;
        a2Var.readParams(inputSerializedData, z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f51395a);
        outputSerializedData.writeInt64(this.f51396b);
        String str = this.f51397c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
