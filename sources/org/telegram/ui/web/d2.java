package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class d2 implements Utilities.Callback {
    public final int f39471a;
    public final e2 f39472b;

    public d2(e2 e2Var, int i10) {
        this.f39471a = i10;
        this.f39472b = e2Var;
    }

    @Override
    public final void run(Object obj) {
        g2 g2Var = (g2) obj;
        switch (this.f39471a) {
            case 0:
                e2 e2Var = this.f39472b;
                e2Var.f39489l = null;
                e2Var.f39486i = true;
                TLRPC.TL_webPage tL_webPage = e2Var.f39487j;
                if (tL_webPage != null) {
                    g2.o(tL_webPage);
                }
                e2Var.f39487j = g2Var.f39511c;
                e2Var.c();
                return;
            default:
                e2 e2Var2 = this.f39472b;
                e2Var2.f39489l = null;
                e2Var2.f39486i = true;
                TLRPC.TL_webPage tL_webPage2 = e2Var2.f39487j;
                if (tL_webPage2 != null) {
                    g2.o(tL_webPage2);
                }
                e2Var2.f39487j = g2Var.f39511c;
                e2Var2.c();
                return;
        }
    }
}
