package org.telegram.ui.web;

import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
public final class u1 implements r20 {
    public final int f43004a;
    public final w1 f43005b;

    public u1(w1 w1Var, int i10) {
        this.f43004a = i10;
        this.f43005b = w1Var;
    }

    @Override
    public final void a(Object obj) {
        y1 y1Var = (y1) obj;
        switch (this.f43004a) {
            case 0:
                w1 w1Var = this.f43005b;
                w1Var.f43037l = null;
                w1Var.f43034i = true;
                TLRPC.TL_webPage tL_webPage = w1Var.f43035j;
                if (tL_webPage != null) {
                    y1.o(tL_webPage);
                }
                w1Var.f43035j = y1Var.f43055c;
                w1Var.c();
                return;
            default:
                w1 w1Var2 = this.f43005b;
                w1Var2.f43037l = null;
                w1Var2.f43034i = true;
                TLRPC.TL_webPage tL_webPage2 = w1Var2.f43035j;
                if (tL_webPage2 != null) {
                    y1.o(tL_webPage2);
                }
                w1Var2.f43035j = y1Var.f43055c;
                w1Var2.c();
                return;
        }
    }
}
