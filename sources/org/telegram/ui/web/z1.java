package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class z1 extends TLObject {
    public final ArrayList f51400a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        int readInt32 = inputSerializedData.readInt32(z9);
        for (int i7 = 0; i7 < readInt32; i7++) {
            a2 a2Var = new a2();
            a2Var.readParams(inputSerializedData, z9);
            if (!TextUtils.isEmpty(a2Var.f51073b)) {
                this.f51400a.add(a2Var);
            } else {
                return;
            }
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.f51400a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((a2) arrayList.get(i7)).serializeToStream(outputSerializedData);
        }
    }
}
