package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class wx implements org.telegram.ui.Components.y4 {
    public final py f42871a;

    public wx(py pyVar) {
        this.f42871a = pyVar;
    }

    @Override
    public final void I(int i10, int i11, boolean z4) {
        py pyVar = this.f42871a;
        ArrayList arrayList = pyVar.F2;
        pyVar.H2 = i10;
        pyVar.I2 = i11;
        if (pyVar.f40278z2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            pyVar.f40278z2.v(pyVar, arrayList2, pyVar.f40273y1.getFieldText(), false, z4, i10, i11, null);
        }
    }
}
