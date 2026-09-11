package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class m2 extends TLObject {
    public final ArrayList f42182a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        for (int i10 = 0; i10 < readInt32; i10++) {
            n2 n2Var = new n2();
            n2Var.readParams(inputSerializedData, z10);
            if (!TextUtils.isEmpty(n2Var.f42189b)) {
                this.f42182a.add(n2Var);
            } else {
                return;
            }
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.f42182a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((n2) arrayList.get(i10)).serializeToStream(outputSerializedData);
        }
    }
}
