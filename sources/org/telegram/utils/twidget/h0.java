package org.telegram.utils.twidget;

import org.telegram.messenger.r20;
import org.telegram.ui.web.v1;
public final class h0 implements Runnable {
    public final int f44358a = 1;
    public final String f44359b;
    public final r20 f44360c;

    public h0(String str, r20 r20Var) {
        this.f44359b = str;
        this.f44360c = r20Var;
    }

    @Override
    public final void run() {
        switch (this.f44358a) {
            case 0:
                this.f44360c.a(this.f44359b);
                return;
            default:
                org.telegram.messenger.i0.g3(new v1(23, this.f44360c, qh.g.c(this.f44359b, org.telegram.messenger.i0.L(240.0f), ac.d.M, 0.75f, null)));
                return;
        }
    }

    public h0(a aVar, String str) {
        this.f44360c = aVar;
        this.f44359b = str;
    }
}
