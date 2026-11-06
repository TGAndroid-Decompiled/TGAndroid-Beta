package org.telegram.ui.web;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class y0 extends TLObject {
    public long f51403a;
    public long f51404b;
    public String f51405c;
    public b2 d;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.f51403a = inputSerializedData.readInt64(z9);
        this.f51404b = inputSerializedData.readInt64(z9);
        this.f51405c = inputSerializedData.readString(z9);
        b2 b2Var = new b2();
        this.d = b2Var;
        b2Var.readParams(inputSerializedData, z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f51403a);
        outputSerializedData.writeInt64(this.f51404b);
        String str = this.f51405c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
