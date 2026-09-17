package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f2 implements Utilities.Callback {
    public final int f38788a;
    public final g2 f38789b;

    public f2(g2 g2Var, int i10) {
        this.f38788a = i10;
        this.f38789b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        i2 i2Var = (i2) obj;
        switch (this.f38788a) {
            case 0:
                g2 g2Var = this.f38789b;
                g2Var.f38800l = null;
                g2Var.f38797i = true;
                TLRPC.TL_webPage tL_webPage = g2Var.f38798j;
                if (tL_webPage != null) {
                    i2.o(tL_webPage);
                }
                g2Var.f38798j = i2Var.f38831c;
                g2Var.c();
                return;
            default:
                g2 g2Var2 = this.f38789b;
                g2Var2.f38800l = null;
                g2Var2.f38797i = true;
                TLRPC.TL_webPage tL_webPage2 = g2Var2.f38798j;
                if (tL_webPage2 != null) {
                    i2.o(tL_webPage2);
                }
                g2Var2.f38798j = i2Var.f38831c;
                g2Var2.c();
                return;
        }
    }
}
