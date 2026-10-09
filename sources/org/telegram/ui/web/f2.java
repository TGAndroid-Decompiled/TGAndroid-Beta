package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f2 implements Utilities.Callback {
    public final int f43303a;
    public final g2 f43304b;

    public f2(g2 g2Var, int i10) {
        this.f43303a = i10;
        this.f43304b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        i2 i2Var = (i2) obj;
        switch (this.f43303a) {
            case 0:
                g2 g2Var = this.f43304b;
                g2Var.f43321l = null;
                g2Var.f43318i = true;
                TLRPC.TL_webPage tL_webPage = g2Var.f43319j;
                if (tL_webPage != null) {
                    i2.o(tL_webPage);
                }
                g2Var.f43319j = i2Var.f43356c;
                g2Var.c();
                return;
            default:
                g2 g2Var2 = this.f43304b;
                g2Var2.f43321l = null;
                g2Var2.f43318i = true;
                TLRPC.TL_webPage tL_webPage2 = g2Var2.f43319j;
                if (tL_webPage2 != null) {
                    i2.o(tL_webPage2);
                }
                g2Var2.f43319j = i2Var.f43356c;
                g2Var2.c();
                return;
        }
    }
}
