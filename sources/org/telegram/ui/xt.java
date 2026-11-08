package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xt implements qw, vr {
    public final au f51974a;

    public xt(au auVar) {
        this.f51974a = auVar;
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
        this.f51974a.q0(user);
    }

    @Override
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, w91 w91Var) {
        if (!arrayList.isEmpty()) {
            long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).f26520a;
            if (org.telegram.messenger.m5.E(j3)) {
                au auVar = this.f51974a;
                auVar.q0(auVar.getMessagesController().a2(Long.valueOf(j3)));
                return true;
            }
            return true;
        }
        return true;
    }
}
