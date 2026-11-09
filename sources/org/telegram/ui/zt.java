package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zt implements sw, xr {
    public final cu f52669a;

    public zt(cu cuVar) {
        this.f52669a = cuVar;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(yw ywVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f52669a.q0(user);
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26520a;
            if (org.telegram.messenger.m5.E(j3)) {
                cu cuVar = this.f52669a;
                cuVar.q0(cuVar.getMessagesController().a2(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}
