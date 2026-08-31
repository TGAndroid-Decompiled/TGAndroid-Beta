package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class k2 extends TLObject {
    public final ArrayList f42618a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        int readInt32 = inputSerializedData.readInt32(z4);
        for (int i10 = 0; i10 < readInt32; i10++) {
            l2 l2Var = new l2();
            l2Var.readParams(inputSerializedData, z4);
            if (!TextUtils.isEmpty(l2Var.f42626b)) {
                this.f42618a.add(l2Var);
            } else {
                return;
            }
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.f42618a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((l2) arrayList.get(i10)).serializeToStream(outputSerializedData);
        }
    }
}
