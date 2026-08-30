package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class j2 extends TLObject {
    public final ArrayList f39545a = new ArrayList();

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        int readInt32 = inputSerializedData.readInt32(z4);
        for (int i10 = 0; i10 < readInt32; i10++) {
            k2 k2Var = new k2();
            k2Var.readParams(inputSerializedData, z4);
            if (!TextUtils.isEmpty(k2Var.f39560b)) {
                this.f39545a.add(k2Var);
            } else {
                return;
            }
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        ArrayList arrayList = this.f39545a;
        outputSerializedData.writeInt32(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((k2) arrayList.get(i10)).serializeToStream(outputSerializedData);
        }
    }
}
