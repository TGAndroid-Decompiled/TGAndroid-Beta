package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class f2 implements Utilities.Callback {
    public final int f43100a;
    public final g2 f43101b;

    public f2(g2 g2Var, int i10) {
        this.f43100a = i10;
        this.f43101b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        i2 i2Var = (i2) obj;
        switch (this.f43100a) {
            case 0:
                g2 g2Var = this.f43101b;
                g2Var.f43118l = null;
                g2Var.f43115i = true;
                TLRPC.TL_webPage tL_webPage = g2Var.f43116j;
                if (tL_webPage != null) {
                    i2.o(tL_webPage);
                }
                g2Var.f43116j = i2Var.f43142c;
                g2Var.c();
                return;
            default:
                g2 g2Var2 = this.f43101b;
                g2Var2.f43118l = null;
                g2Var2.f43115i = true;
                TLRPC.TL_webPage tL_webPage2 = g2Var2.f43116j;
                if (tL_webPage2 != null) {
                    i2.o(tL_webPage2);
                }
                g2Var2.f43116j = i2Var.f43142c;
                g2Var2.c();
                return;
        }
    }
}
