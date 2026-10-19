package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e2 implements Utilities.Callback {
    public final int f42622a;
    public final f2 f42623b;

    public e2(f2 f2Var, int i10) {
        this.f42622a = i10;
        this.f42623b = f2Var;
    }

    @Override
    public final void run(Object obj) {
        h2 h2Var = (h2) obj;
        switch (this.f42622a) {
            case 0:
                f2 f2Var = this.f42623b;
                f2Var.f42640l = null;
                f2Var.f42637i = true;
                TLRPC.TL_webPage tL_webPage = f2Var.f42638j;
                if (tL_webPage != null) {
                    h2.o(tL_webPage);
                }
                f2Var.f42638j = h2Var.f42664c;
                f2Var.c();
                return;
            default:
                f2 f2Var2 = this.f42623b;
                f2Var2.f42640l = null;
                f2Var2.f42637i = true;
                TLRPC.TL_webPage tL_webPage2 = f2Var2.f42638j;
                if (tL_webPage2 != null) {
                    h2.o(tL_webPage2);
                }
                f2Var2.f42638j = h2Var.f42664c;
                f2Var2.c();
                return;
        }
    }
}
