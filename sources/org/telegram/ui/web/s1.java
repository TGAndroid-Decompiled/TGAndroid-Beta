package org.telegram.ui.web;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class s1 implements z10 {
    public final int f52777a;
    public final t1 f52778b;

    public s1(t1 t1Var, int i7) {
        this.f52777a = i7;
        this.f52778b = t1Var;
    }

    @Override
    public final void a(Object obj) {
        v1 v1Var = (v1) obj;
        switch (this.f52777a) {
            case 0:
                t1 t1Var = this.f52778b;
                t1Var.f52796l = null;
                t1Var.f52793i = true;
                TLRPC.TL_webPage tL_webPage = t1Var.f52794j;
                if (tL_webPage != null) {
                    v1.o(tL_webPage);
                }
                t1Var.f52794j = v1Var.f52851c;
                t1Var.c();
                return;
            default:
                t1 t1Var2 = this.f52778b;
                t1Var2.f52796l = null;
                t1Var2.f52793i = true;
                TLRPC.TL_webPage tL_webPage2 = t1Var2.f52794j;
                if (tL_webPage2 != null) {
                    v1.o(tL_webPage2);
                }
                t1Var2.f52794j = v1Var.f52851c;
                t1Var2.c();
                return;
        }
    }
}
