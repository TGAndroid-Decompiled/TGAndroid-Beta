package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class wx implements org.telegram.ui.Components.d5 {
    public final ty f39468a;

    public wx(ty tyVar) {
        this.f39468a = tyVar;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        ty tyVar = this.f39468a;
        ArrayList arrayList = tyVar.I2;
        tyVar.K2 = i10;
        tyVar.L2 = i11;
        if (tyVar.C2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            tyVar.C2.u(tyVar, arrayList2, tyVar.B1.getFieldText(), false, z10, i10, i11, null);
        }
    }
}
