package org.telegram.ui.web;

import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.bb1;
import org.telegram.ui.zn;
import yh.p7;
public final class d0 implements Runnable {
    public final int f43284a;
    public final long f43285b;
    public final Object f43286c;

    public d0(Object obj, long j3, int i10) {
        this.f43284a = i10;
        this.f43286c = obj;
        this.f43285b = j3;
    }

    @Override
    public final void run() {
        switch (this.f43284a) {
            case 0:
                e0 e0Var = (e0) this.f43286c;
                e0Var.getClass();
                e0Var.presentFragment(zn.W9(this.f43285b));
                return;
            case 1:
                tg.z0 z0Var = (tg.z0) this.f43286c;
                HashSet hashSet = z0Var.f48438e0;
                hashSet.remove(Long.valueOf(this.f43285b));
                z0Var.Y.b(true, hashSet, new tg.t0(z0Var, 5), null);
                z0Var.c0(true, false);
                return;
            case 2:
                ad.a0((p7) this.f43286c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) this.f43285b), R.raw.stars_topup).k(true);
                return;
            default:
                ad.a0((bb1) this.f43286c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) this.f43285b), R.raw.stars_topup).k(true);
                return;
        }
    }
}
