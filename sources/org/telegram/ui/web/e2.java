package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e2 implements Utilities.Callback {
    public final int f43518a;
    public final g2 f43519b;

    public e2(g2 g2Var, int i10) {
        this.f43518a = i10;
        this.f43519b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        i2 i2Var = (i2) obj;
        switch (this.f43518a) {
            case 0:
                g2 g2Var = this.f43519b;
                g2Var.f43543l = null;
                g2Var.f43540i = true;
                TLRPC.TL_webPage tL_webPage = g2Var.f43541j;
                if (tL_webPage != null) {
                    i2.o(tL_webPage);
                }
                g2Var.f43541j = i2Var.f43578c;
                g2Var.c();
                return;
            default:
                g2 g2Var2 = this.f43519b;
                g2Var2.f43543l = null;
                g2Var2.f43540i = true;
                TLRPC.TL_webPage tL_webPage2 = g2Var2.f43541j;
                if (tL_webPage2 != null) {
                    i2.o(tL_webPage2);
                }
                g2Var2.f43541j = i2Var.f43578c;
                g2Var2.c();
                return;
        }
    }
}
