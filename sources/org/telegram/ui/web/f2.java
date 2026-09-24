package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f2 implements Utilities.Callback {
    public final int f39046a;
    public final g2 f39047b;

    public f2(g2 g2Var, int i10) {
        this.f39046a = i10;
        this.f39047b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        i2 i2Var = (i2) obj;
        switch (this.f39046a) {
            case 0:
                g2 g2Var = this.f39047b;
                g2Var.f39058l = null;
                g2Var.f39055i = true;
                TLRPC.TL_webPage tL_webPage = g2Var.f39056j;
                if (tL_webPage != null) {
                    i2.o(tL_webPage);
                }
                g2Var.f39056j = i2Var.f39091c;
                g2Var.c();
                return;
            default:
                g2 g2Var2 = this.f39047b;
                g2Var2.f39058l = null;
                g2Var2.f39055i = true;
                TLRPC.TL_webPage tL_webPage2 = g2Var2.f39056j;
                if (tL_webPage2 != null) {
                    i2.o(tL_webPage2);
                }
                g2Var2.f39056j = i2Var.f39091c;
                g2Var2.c();
                return;
        }
    }
}
