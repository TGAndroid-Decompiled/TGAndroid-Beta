package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class uw implements f70 {
    public final qy f38565a;

    public uw(qy qyVar) {
        this.f38565a = qyVar;
    }

    @Override
    public final void a(g70 g70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        qy qyVar = this.f38565a;
        ky kyVar = qyVar.C2;
        if (qyVar.B2) {
            qyVar.removeSelfFromStack();
        }
        kyVar.u(qyVar, arrayList, null, true, qyVar.J2, qyVar.K2, qyVar.L2, null);
    }
}
