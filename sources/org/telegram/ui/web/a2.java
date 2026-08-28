package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a2 implements Utilities.Callback {
    public final int f43798a;
    public final b2 f43799b;

    public a2(b2 b2Var, int i9) {
        this.f43798a = i9;
        this.f43799b = b2Var;
    }

    @Override
    public final void run(Object obj) {
        d2 d2Var = (d2) obj;
        switch (this.f43798a) {
            case 0:
                b2 b2Var = this.f43799b;
                b2Var.f43816l = null;
                b2Var.f43813i = true;
                TLRPC.TL_webPage tL_webPage = b2Var.f43814j;
                if (tL_webPage != null) {
                    d2.o(tL_webPage);
                }
                b2Var.f43814j = d2Var.f43839c;
                b2Var.c();
                return;
            default:
                b2 b2Var2 = this.f43799b;
                b2Var2.f43816l = null;
                b2Var2.f43813i = true;
                TLRPC.TL_webPage tL_webPage2 = b2Var2.f43814j;
                if (tL_webPage2 != null) {
                    d2.o(tL_webPage2);
                }
                b2Var2.f43814j = d2Var.f43839c;
                b2Var2.c();
                return;
        }
    }
}
