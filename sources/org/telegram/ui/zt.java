package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zt implements sw, yr {
    public final cu f54024a;

    public zt(cu cuVar) {
        this.f54024a = cuVar;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean P(yw ywVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f54024a.q0(user);
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((org.telegram.messenger.ur) arrayList.get(0)).f26860a;
            if (org.telegram.messenger.m5.E(j3)) {
                cu cuVar = this.f54024a;
                cuVar.q0(cuVar.getMessagesController().a2(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}
