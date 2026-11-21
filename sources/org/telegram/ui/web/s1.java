package org.telegram.ui.web;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class s1 implements x10 {
    public final int f53303a;
    public final t1 f53304b;

    public s1(t1 t1Var, int i7) {
        this.f53303a = i7;
        this.f53304b = t1Var;
    }

    @Override
    public final void a(Object obj) {
        v1 v1Var = (v1) obj;
        switch (this.f53303a) {
            case 0:
                t1 t1Var = this.f53304b;
                t1Var.f53322l = null;
                t1Var.f53319i = true;
                TLRPC.TL_webPage tL_webPage = t1Var.f53320j;
                if (tL_webPage != null) {
                    v1.o(tL_webPage);
                }
                t1Var.f53320j = v1Var.f53377c;
                t1Var.c();
                return;
            default:
                t1 t1Var2 = this.f53304b;
                t1Var2.f53322l = null;
                t1Var2.f53319i = true;
                TLRPC.TL_webPage tL_webPage2 = t1Var2.f53320j;
                if (tL_webPage2 != null) {
                    v1.o(tL_webPage2);
                }
                t1Var2.f53320j = v1Var.f53377c;
                t1Var2.c();
                return;
        }
    }
}
