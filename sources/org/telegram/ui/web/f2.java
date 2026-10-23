package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f2 implements Utilities.Callback {
    public final int f43111a;
    public final g2 f43112b;

    public f2(g2 g2Var, int i10) {
        this.f43111a = i10;
        this.f43112b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        i2 i2Var = (i2) obj;
        switch (this.f43111a) {
            case 0:
                g2 g2Var = this.f43112b;
                g2Var.f43129l = null;
                g2Var.f43126i = true;
                TLRPC.TL_webPage tL_webPage = g2Var.f43127j;
                if (tL_webPage != null) {
                    i2.o(tL_webPage);
                }
                g2Var.f43127j = i2Var.f43153c;
                g2Var.c();
                return;
            default:
                g2 g2Var2 = this.f43112b;
                g2Var2.f43129l = null;
                g2Var2.f43126i = true;
                TLRPC.TL_webPage tL_webPage2 = g2Var2.f43127j;
                if (tL_webPage2 != null) {
                    i2.o(tL_webPage2);
                }
                g2Var2.f43127j = i2Var.f43153c;
                g2Var2.c();
                return;
        }
    }
}
