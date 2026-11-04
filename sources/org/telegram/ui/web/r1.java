package org.telegram.ui.web;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class r1 implements u10 {
    public final int f51000a;
    public final s1 f51001b;

    public r1(s1 s1Var, int i3) {
        this.f51000a = i3;
        this.f51001b = s1Var;
    }

    @Override
    public final void a(Object obj) {
        u1 u1Var = (u1) obj;
        switch (this.f51000a) {
            case 0:
                s1 s1Var = this.f51001b;
                s1Var.f51016l = null;
                s1Var.f51013i = true;
                TLRPC.TL_webPage tL_webPage = s1Var.f51014j;
                if (tL_webPage != null) {
                    u1.o(tL_webPage);
                }
                s1Var.f51014j = u1Var.f51048c;
                s1Var.c();
                return;
            default:
                s1 s1Var2 = this.f51001b;
                s1Var2.f51016l = null;
                s1Var2.f51013i = true;
                TLRPC.TL_webPage tL_webPage2 = s1Var2.f51014j;
                if (tL_webPage2 != null) {
                    u1.o(tL_webPage2);
                }
                s1Var2.f51014j = u1Var.f51048c;
                s1Var2.c();
                return;
        }
    }
}
