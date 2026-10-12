package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class e2 implements Utilities.Callback {
    public final int f41340a;
    public final f2 f41341b;

    public e2(f2 f2Var, int i10) {
        this.f41340a = i10;
        this.f41341b = f2Var;
    }

    @Override
    public final void run(Object obj) {
        h2 h2Var = (h2) obj;
        switch (this.f41340a) {
            case 0:
                f2 f2Var = this.f41341b;
                f2Var.f41354l = null;
                f2Var.f41351i = true;
                TLRPC.TL_webPage tL_webPage = f2Var.f41352j;
                if (tL_webPage != null) {
                    h2.o(tL_webPage);
                }
                f2Var.f41352j = h2Var.f41379c;
                f2Var.c();
                return;
            default:
                f2 f2Var2 = this.f41341b;
                f2Var2.f41354l = null;
                f2Var2.f41351i = true;
                TLRPC.TL_webPage tL_webPage2 = f2Var2.f41352j;
                if (tL_webPage2 != null) {
                    h2.o(tL_webPage2);
                }
                f2Var2.f41352j = h2Var.f41379c;
                f2Var2.c();
                return;
        }
    }
}
