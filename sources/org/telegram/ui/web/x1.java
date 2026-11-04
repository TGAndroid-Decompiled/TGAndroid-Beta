package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class x1 extends TLObject {
    public final ArrayList f51105a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        int readInt32 = inputSerializedData.readInt32(z10);
        for (int i3 = 0; i3 < readInt32; i3++) {
            y1 y1Var = new y1();
            y1Var.readParams(inputSerializedData, z10);
            if (!TextUtils.isEmpty(y1Var.f51120b)) {
                this.f51105a.add(y1Var);
            } else {
                return;
            }
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.f51105a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((y1) arrayList.get(i3)).serializeToStream(outputSerializedData);
        }
    }
}
