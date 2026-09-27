package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f2 implements Utilities.Callback {
    public final int f39013a;
    public final h2 f39014b;

    public f2(h2 h2Var, int i10) {
        this.f39013a = i10;
        this.f39014b = h2Var;
    }

    @Override
    public final void run(Object obj) {
        j2 j2Var = (j2) obj;
        switch (this.f39013a) {
            case 0:
                h2 h2Var = this.f39014b;
                h2Var.f39043l = null;
                h2Var.f39040i = true;
                TLRPC.TL_webPage tL_webPage = h2Var.f39041j;
                if (tL_webPage != null) {
                    j2.o(tL_webPage);
                }
                h2Var.f39041j = j2Var.f39069c;
                h2Var.c();
                return;
            default:
                h2 h2Var2 = this.f39014b;
                h2Var2.f39043l = null;
                h2Var2.f39040i = true;
                TLRPC.TL_webPage tL_webPage2 = h2Var2.f39041j;
                if (tL_webPage2 != null) {
                    j2.o(tL_webPage2);
                }
                h2Var2.f39041j = j2Var.f39069c;
                h2Var2.c();
                return;
        }
    }
}
