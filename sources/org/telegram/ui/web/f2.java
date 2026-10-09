package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f2 implements Utilities.Callback {
    public final int f43301a;
    public final g2 f43302b;

    public f2(g2 g2Var, int i10) {
        this.f43301a = i10;
        this.f43302b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        i2 i2Var = (i2) obj;
        switch (this.f43301a) {
            case 0:
                g2 g2Var = this.f43302b;
                g2Var.f43319l = null;
                g2Var.f43316i = true;
                TLRPC.TL_webPage tL_webPage = g2Var.f43317j;
                if (tL_webPage != null) {
                    i2.o(tL_webPage);
                }
                g2Var.f43317j = i2Var.f43354c;
                g2Var.c();
                return;
            default:
                g2 g2Var2 = this.f43302b;
                g2Var2.f43319l = null;
                g2Var2.f43316i = true;
                TLRPC.TL_webPage tL_webPage2 = g2Var2.f43317j;
                if (tL_webPage2 != null) {
                    i2.o(tL_webPage2);
                }
                g2Var2.f43317j = i2Var.f43354c;
                g2Var2.c();
                return;
        }
    }
}
