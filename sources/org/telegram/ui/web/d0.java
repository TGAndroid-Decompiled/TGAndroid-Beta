package org.telegram.ui.web;

import android.os.SystemClock;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zc;
import org.telegram.ui.db1;
import org.telegram.ui.eo;
import yh.p7;
public final class d0 implements Runnable {
    public final int f43227a;
    public final long f43228b;
    public final Object f43229c;

    public d0(Object obj, long j3, int i10) {
        this.f43227a = i10;
        this.f43229c = obj;
        this.f43228b = j3;
    }

    @Override
    public final void run() {
        pi.r rVar;
        switch (this.f43227a) {
            case 0:
                e0 e0Var = (e0) this.f43229c;
                e0Var.getClass();
                e0Var.presentFragment(eo.W9(this.f43228b));
                return;
            case 1:
                pi.t tVar = (pi.t) ((bc.e) this.f43229c).f3855c;
                if (this.f43228b == tVar.f45832o && (rVar = tVar.f45830m) != pi.r.f45817r && rVar != pi.r.f45818s && rVar != pi.r.f45816n) {
                    SystemClock.elapsedRealtime();
                    tVar.f45839w = false;
                    tVar.u(pi.r.f45813c);
                    tVar.h.removeCallbacks(tVar.D);
                    pi.b bVar = tVar.f45825g;
                    bVar.b("recording started: retainedDurationMs=" + pi.t.s(tVar.f45833p));
                    return;
                }
                return;
            case 2:
                tg.z0 z0Var = (tg.z0) this.f43229c;
                HashSet hashSet = z0Var.f48677e0;
                hashSet.remove(Long.valueOf(this.f43228b));
                z0Var.Y.b(true, hashSet, new tg.t0(z0Var, 5), null);
                z0Var.c0(true, false);
                return;
            case 3:
                zc.a0((p7) this.f43229c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) this.f43228b), R.raw.stars_topup).k(true);
                return;
            default:
                zc.a0((db1) this.f43229c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) this.f43228b), R.raw.stars_topup).k(true);
                return;
        }
    }
}
