package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class vx implements org.telegram.ui.Components.y4 {
    public final oy f39278a;

    public vx(oy oyVar) {
        this.f39278a = oyVar;
    }

    @Override
    public final void J(int i10, int i11, boolean z4) {
        oy oyVar = this.f39278a;
        ArrayList arrayList = oyVar.F2;
        oyVar.H2 = i10;
        oyVar.I2 = i11;
        if (oyVar.f37131z2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            oyVar.f37131z2.w(oyVar, arrayList2, oyVar.f37126y1.getFieldText(), false, z4, i10, i11, null);
        }
    }
}
