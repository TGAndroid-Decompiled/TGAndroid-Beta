package org.telegram.utils.twidget;

import org.telegram.messenger.q20;
import org.telegram.ui.web.v1;
public final class h0 implements Runnable {
    public final int f44347a = 1;
    public final String f44348b;
    public final q20 f44349c;

    public h0(String str, q20 q20Var) {
        this.f44348b = str;
        this.f44349c = q20Var;
    }

    @Override
    public final void run() {
        switch (this.f44347a) {
            case 0:
                this.f44349c.a(this.f44348b);
                return;
            default:
                org.telegram.messenger.i0.g3(new v1(22, this.f44349c, qh.g.c(this.f44348b, org.telegram.messenger.i0.L(240.0f), ac.d.M, 0.75f, null)));
                return;
        }
    }

    public h0(a aVar, String str) {
        this.f44349c = aVar;
        this.f44348b = str;
    }
}
