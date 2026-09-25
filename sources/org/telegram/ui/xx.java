package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class xx implements org.telegram.ui.Components.d5 {
    public final qy f40006a;

    public xx(qy qyVar) {
        this.f40006a = qyVar;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        qy qyVar = this.f40006a;
        ArrayList arrayList = qyVar.I2;
        qyVar.K2 = i10;
        qyVar.L2 = i11;
        if (qyVar.C2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            qyVar.C2.u(qyVar, arrayList2, qyVar.B1.getFieldText(), false, z10, i10, i11, null);
        }
    }
}
