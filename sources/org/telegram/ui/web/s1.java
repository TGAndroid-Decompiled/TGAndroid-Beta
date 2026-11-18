package org.telegram.ui.web;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class s1 implements x10 {
    public final int f53309a;
    public final t1 f53310b;

    public s1(t1 t1Var, int i7) {
        this.f53309a = i7;
        this.f53310b = t1Var;
    }

    @Override
    public final void a(Object obj) {
        v1 v1Var = (v1) obj;
        switch (this.f53309a) {
            case 0:
                t1 t1Var = this.f53310b;
                t1Var.f53328l = null;
                t1Var.f53325i = true;
                TLRPC.TL_webPage tL_webPage = t1Var.f53326j;
                if (tL_webPage != null) {
                    v1.o(tL_webPage);
                }
                t1Var.f53326j = v1Var.f53383c;
                t1Var.c();
                return;
            default:
                t1 t1Var2 = this.f53310b;
                t1Var2.f53328l = null;
                t1Var2.f53325i = true;
                TLRPC.TL_webPage tL_webPage2 = t1Var2.f53326j;
                if (tL_webPage2 != null) {
                    v1.o(tL_webPage2);
                }
                t1Var2.f53326j = v1Var.f53383c;
                t1Var2.c();
                return;
        }
    }
}
