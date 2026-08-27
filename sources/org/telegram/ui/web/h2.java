package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

public final class h2 extends TLObject {

    public final ArrayList f43851a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int int32 = inputSerializedData.readInt32(z10);
        for (int i10 = 0; i10 < int32; i10++) {
            i2 i2Var = new i2();
            i2Var.readParams(inputSerializedData, z10);
            if (TextUtils.isEmpty(i2Var.f43867b)) {
                return;
            }
            this.f43851a.add(i2Var);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.f43851a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((i2) arrayList.get(i10)).serializeToStream(outputSerializedData);
        }
    }
}
