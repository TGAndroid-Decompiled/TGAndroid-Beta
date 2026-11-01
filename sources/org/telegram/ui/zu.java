package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zu implements tx, vs {
    public final cv f44093a;

    public zu(cv cvVar) {
        this.f44093a = cvVar;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean O(zx zxVar) {
        return false;
    }

    @Override
    public void c(TLRPC.User user) {
        this.f44093a.q0(user);
    }

    @Override
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        if (!arrayList.isEmpty()) {
            long j10 = ((org.telegram.messenger.hs) arrayList.get(0)).f16109a;
            if (org.telegram.messenger.o5.E(j10)) {
                cv cvVar = this.f44093a;
                cvVar.q0(cvVar.getMessagesController().Z1(Long.valueOf(j10)));
                return true;
            }
            return true;
        }
        return true;
    }
}
