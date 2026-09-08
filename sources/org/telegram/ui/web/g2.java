package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g2 implements Utilities.Callback {
    public final int f42125a;
    public final h2 f42126b;

    public g2(h2 h2Var, int i10) {
        this.f42125a = i10;
        this.f42126b = h2Var;
    }

    @Override
    public final void run(Object obj) {
        j2 j2Var = (j2) obj;
        switch (this.f42125a) {
            case 0:
                h2 h2Var = this.f42126b;
                h2Var.f42138l = null;
                h2Var.f42135i = true;
                TLRPC.TL_webPage tL_webPage = h2Var.f42136j;
                if (tL_webPage != null) {
                    j2.o(tL_webPage);
                }
                h2Var.f42136j = j2Var.f42173c;
                h2Var.c();
                return;
            default:
                h2 h2Var2 = this.f42126b;
                h2Var2.f42138l = null;
                h2Var2.f42135i = true;
                TLRPC.TL_webPage tL_webPage2 = h2Var2.f42136j;
                if (tL_webPage2 != null) {
                    j2.o(tL_webPage2);
                }
                h2Var2.f42136j = j2Var.f42173c;
                h2Var2.c();
                return;
        }
    }
}
