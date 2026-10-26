package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class b1 extends TLObject {
    public long f45199a;
    public long f45200b;
    public String f45201c;
    public l2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f45199a = inputSerializedData.readInt64(z10);
        this.f45200b = inputSerializedData.readInt64(z10);
        this.f45201c = inputSerializedData.readString(z10);
        l2 l2Var = new l2();
        this.d = l2Var;
        l2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f45199a);
        outputSerializedData.writeInt64(this.f45200b);
        String str = this.f45201c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
