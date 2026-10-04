package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class ww implements j70 {
    public final uy f42649a;

    public ww(uy uyVar) {
        this.f42649a = uyVar;
    }

    @Override
    public final void a(k70 k70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        uy uyVar = this.f42649a;
        oy oyVar = uyVar.C2;
        if (uyVar.B2) {
            uyVar.removeSelfFromStack();
        }
        oyVar.u(uyVar, arrayList, null, true, uyVar.J2, uyVar.K2, uyVar.L2, null);
    }
}
