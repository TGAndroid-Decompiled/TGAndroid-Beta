package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class y1 extends TLObject {
    public final ArrayList f53409a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        for (int i7 = 0; i7 < readInt32; i7++) {
            z1 z1Var = new z1();
            z1Var.readParams(inputSerializedData, z10);
            if (!TextUtils.isEmpty(z1Var.f53416b)) {
                this.f53409a.add(z1Var);
            } else {
                return;
            }
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.f53409a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((z1) arrayList.get(i7)).serializeToStream(outputSerializedData);
        }
    }
}
