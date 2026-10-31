package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class b2 extends TLObject {
    public final ArrayList f43002a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        for (int i10 = 0; i10 < readInt32; i10++) {
            c2 c2Var = new c2();
            c2Var.readParams(inputSerializedData, z10);
            if (!TextUtils.isEmpty(c2Var.f43008b)) {
                this.f43002a.add(c2Var);
            } else {
                return;
            }
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.f43002a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((c2) arrayList.get(i10)).serializeToStream(outputSerializedData);
        }
    }
}
