package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g2 implements Utilities.Callback {
    public final int f38907a;
    public final h2 f38908b;

    public g2(h2 h2Var, int i10) {
        this.f38907a = i10;
        this.f38908b = h2Var;
    }

    @Override
    public final void run(Object obj) {
        j2 j2Var = (j2) obj;
        switch (this.f38907a) {
            case 0:
                h2 h2Var = this.f38908b;
                h2Var.f38926l = null;
                h2Var.f38923i = true;
                TLRPC.TL_webPage tL_webPage = h2Var.f38924j;
                if (tL_webPage != null) {
                    j2.o(tL_webPage);
                }
                h2Var.f38924j = j2Var.f38955c;
                h2Var.c();
                return;
            default:
                h2 h2Var2 = this.f38908b;
                h2Var2.f38926l = null;
                h2Var2.f38923i = true;
                TLRPC.TL_webPage tL_webPage2 = h2Var2.f38924j;
                if (tL_webPage2 != null) {
                    j2.o(tL_webPage2);
                }
                h2Var2.f38924j = j2Var.f38955c;
                h2Var2.c();
                return;
        }
    }
}
