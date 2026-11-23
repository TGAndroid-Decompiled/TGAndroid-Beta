package org.telegram.ui.web;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class s1 implements y10 {
    public final int f53271a;
    public final t1 f53272b;

    public s1(t1 t1Var, int i7) {
        this.f53271a = i7;
        this.f53272b = t1Var;
    }

    @Override
    public final void a(Object obj) {
        v1 v1Var = (v1) obj;
        switch (this.f53271a) {
            case 0:
                t1 t1Var = this.f53272b;
                t1Var.f53290l = null;
                t1Var.f53287i = true;
                TLRPC.TL_webPage tL_webPage = t1Var.f53288j;
                if (tL_webPage != null) {
                    v1.o(tL_webPage);
                }
                t1Var.f53288j = v1Var.f53345c;
                t1Var.c();
                return;
            default:
                t1 t1Var2 = this.f53272b;
                t1Var2.f53290l = null;
                t1Var2.f53287i = true;
                TLRPC.TL_webPage tL_webPage2 = t1Var2.f53288j;
                if (tL_webPage2 != null) {
                    v1.o(tL_webPage2);
                }
                t1Var2.f53288j = v1Var.f53345c;
                t1Var2.c();
                return;
        }
    }
}
