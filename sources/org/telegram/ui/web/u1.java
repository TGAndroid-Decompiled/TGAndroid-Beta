package org.telegram.ui.web;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class u1 implements c20 {
    public final int f51327a;
    public final v1 f51328b;

    public u1(v1 v1Var, int i7) {
        this.f51327a = i7;
        this.f51328b = v1Var;
    }

    @Override
    public final void a(Object obj) {
        x1 x1Var = (x1) obj;
        switch (this.f51327a) {
            case 0:
                v1 v1Var = this.f51328b;
                v1Var.f51344l = null;
                v1Var.f51341i = true;
                TLRPC.TL_webPage tL_webPage = v1Var.f51342j;
                if (tL_webPage != null) {
                    x1.o(tL_webPage);
                }
                v1Var.f51342j = x1Var.f51398c;
                v1Var.c();
                return;
            default:
                v1 v1Var2 = this.f51328b;
                v1Var2.f51344l = null;
                v1Var2.f51341i = true;
                TLRPC.TL_webPage tL_webPage2 = v1Var2.f51342j;
                if (tL_webPage2 != null) {
                    x1.o(tL_webPage2);
                }
                v1Var2.f51342j = x1Var.f51398c;
                v1Var2.c();
                return;
        }
    }
}
