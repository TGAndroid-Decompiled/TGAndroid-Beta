package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class b1 extends TLObject {
    public long f45196a;
    public long f45197b;
    public String f45198c;
    public l2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f45196a = inputSerializedData.readInt64(z10);
        this.f45197b = inputSerializedData.readInt64(z10);
        this.f45198c = inputSerializedData.readString(z10);
        l2 l2Var = new l2();
        this.d = l2Var;
        l2Var.readParams(inputSerializedData, z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f45196a);
        outputSerializedData.writeInt64(this.f45197b);
        String str = this.f45198c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
