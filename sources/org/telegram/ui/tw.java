package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class tw implements d70 {
    public final oy f38767a;

    public tw(oy oyVar) {
        this.f38767a = oyVar;
    }

    @Override
    public final void a(e70 e70Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        oy oyVar = this.f38767a;
        iy iyVar = oyVar.f37131z2;
        if (oyVar.f37127y2) {
            oyVar.removeSelfFromStack();
        }
        iyVar.w(oyVar, arrayList, null, true, oyVar.G2, oyVar.H2, oyVar.I2, null);
    }
}
