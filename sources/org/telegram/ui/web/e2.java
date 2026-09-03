package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e2 implements Utilities.Callback {
    public final int f39431a;
    public final f2 f39432b;

    public e2(f2 f2Var, int i10) {
        this.f39431a = i10;
        this.f39432b = f2Var;
    }

    @Override
    public final void run(Object obj) {
        h2 h2Var = (h2) obj;
        switch (this.f39431a) {
            case 0:
                f2 f2Var = this.f39432b;
                f2Var.f39446l = null;
                f2Var.f39443i = true;
                TLRPC.TL_webPage tL_webPage = f2Var.f39444j;
                if (tL_webPage != null) {
                    h2.o(tL_webPage);
                }
                f2Var.f39444j = h2Var.f39472c;
                f2Var.c();
                return;
            default:
                f2 f2Var2 = this.f39432b;
                f2Var2.f39446l = null;
                f2Var2.f39443i = true;
                TLRPC.TL_webPage tL_webPage2 = f2Var2.f39444j;
                if (tL_webPage2 != null) {
                    h2.o(tL_webPage2);
                }
                f2Var2.f39444j = h2Var.f39472c;
                f2Var2.c();
                return;
        }
    }
}
