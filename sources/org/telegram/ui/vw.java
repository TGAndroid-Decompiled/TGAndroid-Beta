package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class vw implements f70 {
    public final qy f39209a;

    public vw(qy qyVar) {
        this.f39209a = qyVar;
    }

    @Override
    public final void a(g70 g70Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        qy qyVar = this.f39209a;
        ky kyVar = qyVar.f37649z2;
        if (qyVar.f37645y2) {
            qyVar.removeSelfFromStack();
        }
        kyVar.w(qyVar, arrayList, null, true, qyVar.G2, qyVar.H2, qyVar.I2, null);
    }
}
