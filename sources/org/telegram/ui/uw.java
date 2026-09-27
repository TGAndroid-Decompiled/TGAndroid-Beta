package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class uw implements i70 {
    public final ty f38372a;

    public uw(ty tyVar) {
        this.f38372a = tyVar;
    }

    @Override
    public final void a(j70 j70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        ty tyVar = this.f38372a;
        ny nyVar = tyVar.C2;
        if (tyVar.B2) {
            tyVar.removeSelfFromStack();
        }
        nyVar.u(tyVar, arrayList, null, true, tyVar.J2, tyVar.K2, tyVar.L2, null);
    }
}
