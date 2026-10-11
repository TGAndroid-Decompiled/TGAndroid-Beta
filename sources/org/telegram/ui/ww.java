package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class ww implements i70 {
    public final sy f43915a;

    public ww(sy syVar) {
        this.f43915a = syVar;
    }

    @Override
    public final void a(j70 j70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        sy syVar = this.f43915a;
        my myVar = syVar.C2;
        if (syVar.B2) {
            syVar.removeSelfFromStack();
        }
        myVar.w(syVar, arrayList, null, true, syVar.J2, syVar.K2, syVar.L2, null);
    }
}
