package org.telegram.ui.web;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class s1 implements x10 {
    public final int f53260a;
    public final t1 f53261b;

    public s1(t1 t1Var, int i7) {
        this.f53260a = i7;
        this.f53261b = t1Var;
    }

    @Override
    public final void a(Object obj) {
        v1 v1Var = (v1) obj;
        switch (this.f53260a) {
            case 0:
                t1 t1Var = this.f53261b;
                t1Var.f53279l = null;
                t1Var.f53276i = true;
                TLRPC.TL_webPage tL_webPage = t1Var.f53277j;
                if (tL_webPage != null) {
                    v1.o(tL_webPage);
                }
                t1Var.f53277j = v1Var.f53334c;
                t1Var.c();
                return;
            default:
                t1 t1Var2 = this.f53261b;
                t1Var2.f53279l = null;
                t1Var2.f53276i = true;
                TLRPC.TL_webPage tL_webPage2 = t1Var2.f53277j;
                if (tL_webPage2 != null) {
                    v1.o(tL_webPage2);
                }
                t1Var2.f53277j = v1Var.f53334c;
                t1Var2.c();
                return;
        }
    }
}
