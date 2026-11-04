package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class y00 implements org.telegram.messenger.n10 {
    public final int f52149a;
    public final x30 f52150b;

    public y00(x30 x30Var, int i3) {
        this.f52149a = i3;
        this.f52150b = x30Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f52149a) {
            case 0:
                x30 x30Var = this.f52150b;
                if (updates != null) {
                    org.telegram.messenger.hp.s1(x30Var.f51759l1.f21919a).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new p00(x30Var, 10));
                return;
            default:
                x30 x30Var2 = this.f52150b;
                if (updates != null) {
                    org.telegram.messenger.hp.s1(x30Var2.f51759l1.f21919a).O3(updates, false);
                    return;
                } else {
                    x30Var2.getClass();
                    return;
                }
        }
    }
}
