package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f2 implements Utilities.Callback {
    public final int f39148a;
    public final g2 f39149b;

    public f2(g2 g2Var, int i10) {
        this.f39148a = i10;
        this.f39149b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        i2 i2Var = (i2) obj;
        switch (this.f39148a) {
            case 0:
                g2 g2Var = this.f39149b;
                g2Var.f39164l = null;
                g2Var.f39161i = true;
                TLRPC.TL_webPage tL_webPage = g2Var.f39162j;
                if (tL_webPage != null) {
                    i2.o(tL_webPage);
                }
                g2Var.f39162j = i2Var.f39195c;
                g2Var.c();
                return;
            default:
                g2 g2Var2 = this.f39149b;
                g2Var2.f39164l = null;
                g2Var2.f39161i = true;
                TLRPC.TL_webPage tL_webPage2 = g2Var2.f39162j;
                if (tL_webPage2 != null) {
                    i2.o(tL_webPage2);
                }
                g2Var2.f39162j = i2Var.f39195c;
                g2Var2.c();
                return;
        }
    }
}
