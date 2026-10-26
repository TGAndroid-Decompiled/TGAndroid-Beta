package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e2 implements Utilities.Callback {
    public final int f45225a;
    public final f2 f45226b;

    public e2(f2 f2Var, int i10) {
        this.f45225a = i10;
        this.f45226b = f2Var;
    }

    @Override
    public final void run(Object obj) {
        h2 h2Var = (h2) obj;
        switch (this.f45225a) {
            case 0:
                f2 f2Var = this.f45226b;
                f2Var.f45244l = null;
                f2Var.f45241i = true;
                TLRPC.TL_webPage tL_webPage = f2Var.f45242j;
                if (tL_webPage != null) {
                    h2.o(tL_webPage);
                }
                f2Var.f45242j = h2Var.f45262c;
                f2Var.c();
                return;
            default:
                f2 f2Var2 = this.f45226b;
                f2Var2.f45244l = null;
                f2Var2.f45241i = true;
                TLRPC.TL_webPage tL_webPage2 = f2Var2.f45242j;
                if (tL_webPage2 != null) {
                    h2.o(tL_webPage2);
                }
                f2Var2.f45242j = h2Var.f45262c;
                f2Var2.c();
                return;
        }
    }
}
