package org.telegram.ui.web;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class s1 implements y10 {
    public final int f53307a;
    public final t1 f53308b;

    public s1(t1 t1Var, int i7) {
        this.f53307a = i7;
        this.f53308b = t1Var;
    }

    @Override
    public final void a(Object obj) {
        v1 v1Var = (v1) obj;
        switch (this.f53307a) {
            case 0:
                t1 t1Var = this.f53308b;
                t1Var.f53326l = null;
                t1Var.f53323i = true;
                TLRPC.TL_webPage tL_webPage = t1Var.f53324j;
                if (tL_webPage != null) {
                    v1.o(tL_webPage);
                }
                t1Var.f53324j = v1Var.f53381c;
                t1Var.c();
                return;
            default:
                t1 t1Var2 = this.f53308b;
                t1Var2.f53326l = null;
                t1Var2.f53323i = true;
                TLRPC.TL_webPage tL_webPage2 = t1Var2.f53324j;
                if (tL_webPage2 != null) {
                    v1.o(tL_webPage2);
                }
                t1Var2.f53324j = v1Var.f53381c;
                t1Var2.c();
                return;
        }
    }
}
