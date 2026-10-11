package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e2 implements Utilities.Callback {
    public final int f43484a;
    public final g2 f43485b;

    public e2(g2 g2Var, int i10) {
        this.f43484a = i10;
        this.f43485b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        i2 i2Var = (i2) obj;
        switch (this.f43484a) {
            case 0:
                g2 g2Var = this.f43485b;
                g2Var.f43509l = null;
                g2Var.f43506i = true;
                TLRPC.TL_webPage tL_webPage = g2Var.f43507j;
                if (tL_webPage != null) {
                    i2.o(tL_webPage);
                }
                g2Var.f43507j = i2Var.f43544c;
                g2Var.c();
                return;
            default:
                g2 g2Var2 = this.f43485b;
                g2Var2.f43509l = null;
                g2Var2.f43506i = true;
                TLRPC.TL_webPage tL_webPage2 = g2Var2.f43507j;
                if (tL_webPage2 != null) {
                    i2.o(tL_webPage2);
                }
                g2Var2.f43507j = i2Var.f43544c;
                g2Var2.c();
                return;
        }
    }
}
