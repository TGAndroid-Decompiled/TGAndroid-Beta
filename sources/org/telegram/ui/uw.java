package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class uw implements e70 {
    public final py f42054a;

    public uw(py pyVar) {
        this.f42054a = pyVar;
    }

    @Override
    public final void a(f70 f70Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        py pyVar = this.f42054a;
        jy jyVar = pyVar.f40308z2;
        if (pyVar.f40304y2) {
            pyVar.removeSelfFromStack();
        }
        jyVar.v(pyVar, arrayList, null, true, pyVar.G2, pyVar.H2, pyVar.I2, null);
    }
}
