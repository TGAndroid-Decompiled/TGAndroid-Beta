package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e2 implements Utilities.Callback {
    public final int f38684a;
    public final f2 f38685b;

    public e2(f2 f2Var, int i10) {
        this.f38684a = i10;
        this.f38685b = f2Var;
    }

    @Override
    public final void run(Object obj) {
        h2 h2Var = (h2) obj;
        switch (this.f38684a) {
            case 0:
                f2 f2Var = this.f38685b;
                f2Var.f38698l = null;
                f2Var.f38695i = true;
                TLRPC.TL_webPage tL_webPage = f2Var.f38696j;
                if (tL_webPage != null) {
                    h2.o(tL_webPage);
                }
                f2Var.f38696j = h2Var.f38724c;
                f2Var.c();
                return;
            default:
                f2 f2Var2 = this.f38685b;
                f2Var2.f38698l = null;
                f2Var2.f38695i = true;
                TLRPC.TL_webPage tL_webPage2 = f2Var2.f38696j;
                if (tL_webPage2 != null) {
                    h2.o(tL_webPage2);
                }
                f2Var2.f38696j = h2Var.f38724c;
                f2Var2.c();
                return;
        }
    }
}
