package org.telegram.ui.web;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class t1 implements c20 {
    public final int f51308a;
    public final u1 f51309b;

    public t1(u1 u1Var, int i7) {
        this.f51308a = i7;
        this.f51309b = u1Var;
    }

    @Override
    public final void a(Object obj) {
        w1 w1Var = (w1) obj;
        switch (this.f51308a) {
            case 0:
                u1 u1Var = this.f51309b;
                u1Var.f51335l = null;
                u1Var.f51332i = true;
                TLRPC.TL_webPage tL_webPage = u1Var.f51333j;
                if (tL_webPage != null) {
                    w1.o(tL_webPage);
                }
                u1Var.f51333j = w1Var.f51354c;
                u1Var.c();
                return;
            default:
                u1 u1Var2 = this.f51309b;
                u1Var2.f51335l = null;
                u1Var2.f51332i = true;
                TLRPC.TL_webPage tL_webPage2 = u1Var2.f51333j;
                if (tL_webPage2 != null) {
                    w1.o(tL_webPage2);
                }
                u1Var2.f51333j = w1Var.f51354c;
                u1Var2.c();
                return;
        }
    }
}
