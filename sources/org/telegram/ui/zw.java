package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class zw implements k70 {
    public final vy f44925a;

    public zw(vy vyVar) {
        this.f44925a = vyVar;
    }

    @Override
    public final void a(l70 l70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        vy vyVar = this.f44925a;
        py pyVar = vyVar.C2;
        if (vyVar.B2) {
            vyVar.removeSelfFromStack();
        }
        pyVar.w(vyVar, arrayList, null, true, vyVar.J2, vyVar.K2, vyVar.L2, null);
    }
}
