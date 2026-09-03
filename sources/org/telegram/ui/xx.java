package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class xx implements org.telegram.ui.Components.y4 {
    public final qy f40089a;

    public xx(qy qyVar) {
        this.f40089a = qyVar;
    }

    @Override
    public final void J(int i10, int i11, boolean z4) {
        qy qyVar = this.f40089a;
        ArrayList arrayList = qyVar.F2;
        qyVar.H2 = i10;
        qyVar.I2 = i11;
        if (qyVar.f37649z2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            qyVar.f37649z2.w(qyVar, arrayList2, qyVar.f37644y1.getFieldText(), false, z4, i10, i11, null);
        }
    }
}
