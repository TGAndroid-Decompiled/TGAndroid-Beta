package org.telegram.ui.web;

import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.ab1;
import org.telegram.ui.zn;
import yh.p7;
public final class d0 implements Runnable {
    public final int f43472a;
    public final long f43473b;
    public final Object f43474c;

    public d0(Object obj, long j3, int i10) {
        this.f43472a = i10;
        this.f43474c = obj;
        this.f43473b = j3;
    }

    @Override
    public final void run() {
        switch (this.f43472a) {
            case 0:
                e0 e0Var = (e0) this.f43474c;
                e0Var.getClass();
                e0Var.presentFragment(zn.W9(this.f43473b));
                return;
            case 1:
                tg.y0 y0Var = (tg.y0) this.f43474c;
                HashSet hashSet = y0Var.f48502e0;
                hashSet.remove(Long.valueOf(this.f43473b));
                y0Var.Y.b(true, hashSet, new tg.s0(y0Var, 5), null);
                y0Var.c0(true, false);
                return;
            case 2:
                ad.a0((p7) this.f43474c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) this.f43473b), R.raw.stars_topup).k(true);
                return;
            default:
                ad.a0((ab1) this.f43474c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) this.f43473b), R.raw.stars_topup).k(true);
                return;
        }
    }
}
