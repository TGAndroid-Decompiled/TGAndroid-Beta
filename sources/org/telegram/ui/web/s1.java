package org.telegram.ui.web;

import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class s1 implements w10 {
    public final int f53542a;
    public final u1 f53543b;

    public s1(u1 u1Var, int i7) {
        this.f53542a = i7;
        this.f53543b = u1Var;
    }

    @Override
    public final void a(Object obj) {
        w1 w1Var = (w1) obj;
        switch (this.f53542a) {
            case 0:
                u1 u1Var = this.f53543b;
                u1Var.f53568l = null;
                u1Var.f53565i = true;
                TLRPC.TL_webPage tL_webPage = u1Var.f53566j;
                if (tL_webPage != null) {
                    w1.o(tL_webPage);
                }
                u1Var.f53566j = w1Var.f53625c;
                u1Var.c();
                return;
            default:
                u1 u1Var2 = this.f53543b;
                u1Var2.f53568l = null;
                u1Var2.f53565i = true;
                TLRPC.TL_webPage tL_webPage2 = u1Var2.f53566j;
                if (tL_webPage2 != null) {
                    w1.o(tL_webPage2);
                }
                u1Var2.f53566j = w1Var.f53625c;
                u1Var2.c();
                return;
        }
    }
}
