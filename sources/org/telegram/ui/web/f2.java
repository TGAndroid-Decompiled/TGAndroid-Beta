package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f2 implements Utilities.Callback {
    public final int f38945a;
    public final g2 f38946b;

    public f2(g2 g2Var, int i10) {
        this.f38945a = i10;
        this.f38946b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        i2 i2Var = (i2) obj;
        switch (this.f38945a) {
            case 0:
                g2 g2Var = this.f38946b;
                g2Var.f38957l = null;
                g2Var.f38954i = true;
                TLRPC.TL_webPage tL_webPage = g2Var.f38955j;
                if (tL_webPage != null) {
                    i2.o(tL_webPage);
                }
                g2Var.f38955j = i2Var.f38988c;
                g2Var.c();
                return;
            default:
                g2 g2Var2 = this.f38946b;
                g2Var2.f38957l = null;
                g2Var2.f38954i = true;
                TLRPC.TL_webPage tL_webPage2 = g2Var2.f38955j;
                if (tL_webPage2 != null) {
                    i2.o(tL_webPage2);
                }
                g2Var2.f38955j = i2Var.f38988c;
                g2Var2.c();
                return;
        }
    }
}
