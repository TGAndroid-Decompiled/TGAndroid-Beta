package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class uw implements e70 {
    public final py f41947a;

    public uw(py pyVar) {
        this.f41947a = pyVar;
    }

    @Override
    public final void a(f70 f70Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        py pyVar = this.f41947a;
        jy jyVar = pyVar.f40278z2;
        if (pyVar.f40274y2) {
            pyVar.removeSelfFromStack();
        }
        jyVar.v(pyVar, arrayList, null, true, pyVar.G2, pyVar.H2, pyVar.I2, null);
    }
}
