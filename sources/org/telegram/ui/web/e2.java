package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e2 implements Utilities.Callback {
    public final int f45222a;
    public final f2 f45223b;

    public e2(f2 f2Var, int i10) {
        this.f45222a = i10;
        this.f45223b = f2Var;
    }

    @Override
    public final void run(Object obj) {
        h2 h2Var = (h2) obj;
        switch (this.f45222a) {
            case 0:
                f2 f2Var = this.f45223b;
                f2Var.f45241l = null;
                f2Var.f45238i = true;
                TLRPC.TL_webPage tL_webPage = f2Var.f45239j;
                if (tL_webPage != null) {
                    h2.o(tL_webPage);
                }
                f2Var.f45239j = h2Var.f45259c;
                f2Var.c();
                return;
            default:
                f2 f2Var2 = this.f45223b;
                f2Var2.f45241l = null;
                f2Var2.f45238i = true;
                TLRPC.TL_webPage tL_webPage2 = f2Var2.f45239j;
                if (tL_webPage2 != null) {
                    h2.o(tL_webPage2);
                }
                f2Var2.f45239j = h2Var.f45259c;
                f2Var2.c();
                return;
        }
    }
}
