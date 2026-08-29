package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c2 implements Utilities.Callback {
    public final int f43996a;
    public final d2 f43997b;

    public c2(d2 d2Var, int i10) {
        this.f43996a = i10;
        this.f43997b = d2Var;
    }

    @Override
    public final void run(Object obj) {
        f2 f2Var = (f2) obj;
        switch (this.f43996a) {
            case 0:
                d2 d2Var = this.f43997b;
                d2Var.f44014l = null;
                d2Var.f44011i = true;
                TLRPC.TL_webPage tL_webPage = d2Var.f44012j;
                if (tL_webPage != null) {
                    f2.o(tL_webPage);
                }
                d2Var.f44012j = f2Var.f44036c;
                d2Var.c();
                return;
            default:
                d2 d2Var2 = this.f43997b;
                d2Var2.f44014l = null;
                d2Var2.f44011i = true;
                TLRPC.TL_webPage tL_webPage2 = d2Var2.f44012j;
                if (tL_webPage2 != null) {
                    f2.o(tL_webPage2);
                }
                d2Var2.f44012j = f2Var.f44036c;
                d2Var2.c();
                return;
        }
    }
}
