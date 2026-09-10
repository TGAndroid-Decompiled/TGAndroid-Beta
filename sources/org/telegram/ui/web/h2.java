package org.telegram.ui.web;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h2 implements Utilities.Callback {
    public final int f37948a;
    public final i2 f37949b;

    public h2(i2 i2Var, int i10) {
        this.f37948a = i10;
        this.f37949b = i2Var;
    }

    @Override
    public final void run(Object obj) {
        k2 k2Var = (k2) obj;
        switch (this.f37948a) {
            case 0:
                i2 i2Var = this.f37949b;
                i2Var.f37970l = null;
                i2Var.f37967i = true;
                TLRPC.TL_webPage tL_webPage = i2Var.f37968j;
                if (tL_webPage != null) {
                    k2.o(tL_webPage);
                }
                i2Var.f37968j = k2Var.f37996c;
                i2Var.c();
                return;
            default:
                i2 i2Var2 = this.f37949b;
                i2Var2.f37970l = null;
                i2Var2.f37967i = true;
                TLRPC.TL_webPage tL_webPage2 = i2Var2.f37968j;
                if (tL_webPage2 != null) {
                    k2.o(tL_webPage2);
                }
                i2Var2.f37968j = k2Var.f37996c;
                i2Var2.c();
                return;
        }
    }
}
