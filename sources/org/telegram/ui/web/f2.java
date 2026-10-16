package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f2 implements Utilities.Callback {
    public final int f41038a;
    public final g2 f41039b;

    public f2(g2 g2Var, int i10) {
        this.f41038a = i10;
        this.f41039b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        i2 i2Var = (i2) obj;
        switch (this.f41038a) {
            case 0:
                g2 g2Var = this.f41039b;
                g2Var.f41050l = null;
                g2Var.f41047i = true;
                TLRPC.TL_webPage tL_webPage = g2Var.f41048j;
                if (tL_webPage != null) {
                    i2.o(tL_webPage);
                }
                g2Var.f41048j = i2Var.f41080c;
                g2Var.c();
                return;
            default:
                g2 g2Var2 = this.f41039b;
                g2Var2.f41050l = null;
                g2Var2.f41047i = true;
                TLRPC.TL_webPage tL_webPage2 = g2Var2.f41048j;
                if (tL_webPage2 != null) {
                    i2.o(tL_webPage2);
                }
                g2Var2.f41048j = i2Var.f41080c;
                g2Var2.c();
                return;
        }
    }
}
