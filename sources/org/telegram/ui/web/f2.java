package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f2 implements Utilities.Callback {
    public final int f43347a;
    public final g2 f43348b;

    public f2(g2 g2Var, int i10) {
        this.f43347a = i10;
        this.f43348b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        i2 i2Var = (i2) obj;
        switch (this.f43347a) {
            case 0:
                g2 g2Var = this.f43348b;
                g2Var.f43365l = null;
                g2Var.f43362i = true;
                TLRPC.TL_webPage tL_webPage = g2Var.f43363j;
                if (tL_webPage != null) {
                    i2.o(tL_webPage);
                }
                g2Var.f43363j = i2Var.f43400c;
                g2Var.c();
                return;
            default:
                g2 g2Var2 = this.f43348b;
                g2Var2.f43365l = null;
                g2Var2.f43362i = true;
                TLRPC.TL_webPage tL_webPage2 = g2Var2.f43363j;
                if (tL_webPage2 != null) {
                    i2.o(tL_webPage2);
                }
                g2Var2.f43363j = i2Var.f43400c;
                g2Var2.c();
                return;
        }
    }
}
