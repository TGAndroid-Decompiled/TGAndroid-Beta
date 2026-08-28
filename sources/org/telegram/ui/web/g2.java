package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class g2 extends TLObject {
    public final ArrayList f43864a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        for (int i9 = 0; i9 < readInt32; i9++) {
            h2 h2Var = new h2();
            h2Var.readParams(inputSerializedData, z10);
            if (!TextUtils.isEmpty(h2Var.f43880b)) {
                this.f43864a.add(h2Var);
            } else {
                return;
            }
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.f43864a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((h2) arrayList.get(i9)).serializeToStream(outputSerializedData);
        }
    }
}
