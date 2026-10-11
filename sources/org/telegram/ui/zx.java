package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class zx implements org.telegram.ui.Components.f5 {
    public final sy f45161a;

    public zx(sy syVar) {
        this.f45161a = syVar;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        sy syVar = this.f45161a;
        ArrayList arrayList = syVar.I2;
        syVar.K2 = i10;
        syVar.L2 = i11;
        if (syVar.C2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            syVar.C2.w(syVar, arrayList2, syVar.B1.getFieldText(), false, z10, i10, i11, null);
        }
    }
}
