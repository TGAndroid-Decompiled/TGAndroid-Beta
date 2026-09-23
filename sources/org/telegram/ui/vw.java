package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class vw implements h70 {
    public final ry f38486a;

    public vw(ry ryVar) {
        this.f38486a = ryVar;
    }

    @Override
    public final void a(i70 i70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        ry ryVar = this.f38486a;
        ly lyVar = ryVar.C2;
        if (ryVar.B2) {
            ryVar.removeSelfFromStack();
        }
        lyVar.u(ryVar, arrayList, null, true, ryVar.J2, ryVar.K2, ryVar.L2, null);
    }
}
