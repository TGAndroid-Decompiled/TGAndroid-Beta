package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e2 implements Utilities.Callback {
    public final int f42493a;
    public final f2 f42494b;

    public e2(f2 f2Var, int i10) {
        this.f42493a = i10;
        this.f42494b = f2Var;
    }

    @Override
    public final void run(Object obj) {
        h2 h2Var = (h2) obj;
        switch (this.f42493a) {
            case 0:
                f2 f2Var = this.f42494b;
                f2Var.f42513l = null;
                f2Var.f42510i = true;
                TLRPC.TL_webPage tL_webPage = f2Var.f42511j;
                if (tL_webPage != null) {
                    h2.o(tL_webPage);
                }
                f2Var.f42511j = h2Var.f42543c;
                f2Var.c();
                return;
            default:
                f2 f2Var2 = this.f42494b;
                f2Var2.f42513l = null;
                f2Var2.f42510i = true;
                TLRPC.TL_webPage tL_webPage2 = f2Var2.f42511j;
                if (tL_webPage2 != null) {
                    h2.o(tL_webPage2);
                }
                f2Var2.f42511j = h2Var.f42543c;
                f2Var2.c();
                return;
        }
    }
}
