package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class yx implements org.telegram.ui.Components.d5 {
    public final ry f39913a;

    public yx(ry ryVar) {
        this.f39913a = ryVar;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        ry ryVar = this.f39913a;
        ArrayList arrayList = ryVar.I2;
        ryVar.K2 = i10;
        ryVar.L2 = i11;
        if (ryVar.C2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            ryVar.C2.u(ryVar, arrayList2, ryVar.B1.getFieldText(), false, z10, i10, i11, null);
        }
    }
}
