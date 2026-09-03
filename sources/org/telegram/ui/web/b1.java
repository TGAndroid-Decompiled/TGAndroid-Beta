package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class b1 extends TLObject {
    public long f42472a;
    public long f42473b;
    public String f42474c;
    public l2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        this.f42472a = inputSerializedData.readInt64(z4);
        this.f42473b = inputSerializedData.readInt64(z4);
        this.f42474c = inputSerializedData.readString(z4);
        l2 l2Var = new l2();
        this.d = l2Var;
        l2Var.readParams(inputSerializedData, z4);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f42472a);
        outputSerializedData.writeInt64(this.f42473b);
        String str = this.f42474c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
