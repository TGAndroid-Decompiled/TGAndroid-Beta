package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e2 implements Utilities.Callback {
    public final int f44736a;
    public final f2 f44737b;

    public e2(f2 f2Var, int i10) {
        this.f44736a = i10;
        this.f44737b = f2Var;
    }

    @Override
    public final void run(Object obj) {
        h2 h2Var = (h2) obj;
        switch (this.f44736a) {
            case 0:
                f2 f2Var = this.f44737b;
                f2Var.f44755l = null;
                f2Var.f44752i = true;
                TLRPC.TL_webPage tL_webPage = f2Var.f44753j;
                if (tL_webPage != null) {
                    h2.o(tL_webPage);
                }
                f2Var.f44753j = h2Var.f44773c;
                f2Var.c();
                return;
            default:
                f2 f2Var2 = this.f44737b;
                f2Var2.f44755l = null;
                f2Var2.f44752i = true;
                TLRPC.TL_webPage tL_webPage2 = f2Var2.f44753j;
                if (tL_webPage2 != null) {
                    h2.o(tL_webPage2);
                }
                f2Var2.f44753j = h2Var.f44773c;
                f2Var2.c();
                return;
        }
    }
}
