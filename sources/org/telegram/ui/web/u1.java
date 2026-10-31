package org.telegram.ui.web;

import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
public final class u1 implements q20 {
    public final int f43202a;
    public final w1 f43203b;

    public u1(w1 w1Var, int i10) {
        this.f43202a = i10;
        this.f43203b = w1Var;
    }

    @Override
    public final void a(Object obj) {
        y1 y1Var = (y1) obj;
        switch (this.f43202a) {
            case 0:
                w1 w1Var = this.f43203b;
                w1Var.f43235l = null;
                w1Var.f43232i = true;
                TLRPC.TL_webPage tL_webPage = w1Var.f43233j;
                if (tL_webPage != null) {
                    y1.o(tL_webPage);
                }
                w1Var.f43233j = y1Var.f43253c;
                w1Var.c();
                return;
            default:
                w1 w1Var2 = this.f43203b;
                w1Var2.f43235l = null;
                w1Var2.f43232i = true;
                TLRPC.TL_webPage tL_webPage2 = w1Var2.f43233j;
                if (tL_webPage2 != null) {
                    y1.o(tL_webPage2);
                }
                w1Var2.f43233j = y1Var.f43253c;
                w1Var2.c();
                return;
        }
    }
}
