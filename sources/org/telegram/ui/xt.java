package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xt implements qw, vr {
    public final au f51981a;

    public xt(au auVar) {
        this.f51981a = auVar;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ww wwVar) {
        return false;
    }

    @Override
    public void b(TLRPC.User user) {
        this.f51981a.q0(user);
    }

    @Override
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26513a;
            if (org.telegram.messenger.m5.E(j3)) {
                au auVar = this.f51981a;
                auVar.q0(auVar.getMessagesController().a2(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}
