package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class n2 extends TLObject {
    public final ArrayList f38026a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        for (int i10 = 0; i10 < readInt32; i10++) {
            o2 o2Var = new o2();
            o2Var.readParams(inputSerializedData, z10);
            if (!TextUtils.isEmpty(o2Var.f38035b)) {
                this.f38026a.add(o2Var);
            } else {
                return;
            }
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.f38026a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((o2) arrayList.get(i10)).serializeToStream(outputSerializedData);
        }
    }
}
