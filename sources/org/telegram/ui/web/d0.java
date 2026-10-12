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
    public final int f43225a;
    public final long f43226b;
    public final Object f43227c;

    public d0(Object obj, long j3, int i10) {
        this.f43225a = i10;
        this.f43227c = obj;
        this.f43226b = j3;
    }

    @Override
    public final void run() {
        pi.q qVar;
        switch (this.f43225a) {
            case 0:
                e0 e0Var = (e0) this.f43227c;
                e0Var.getClass();
                e0Var.presentFragment(eo.W9(this.f43226b));
                return;
            case 1:
                pi.s sVar = (pi.s) ((bc.e) this.f43227c).f3855c;
                if (this.f43226b == sVar.f45824o && (qVar = sVar.f45822m) != pi.q.f45809r && qVar != pi.q.f45810s && qVar != pi.q.f45808n) {
                    SystemClock.elapsedRealtime();
                    sVar.f45831w = false;
                    sVar.s(pi.q.f45805c);
                    sVar.h.removeCallbacks(sVar.D);
                    pi.b bVar = sVar.f45817g;
                    bVar.b("recording started: retainedDurationMs=" + pi.s.q(sVar.f45825p));
                    return;
                }
                return;
            case 2:
                tg.y0 y0Var = (tg.y0) this.f43227c;
                HashSet hashSet = y0Var.f48643e0;
                hashSet.remove(Long.valueOf(this.f43226b));
                y0Var.Y.b(true, hashSet, new tg.s0(y0Var, 5), null);
                y0Var.c0(true, false);
                return;
            case 3:
                zc.a0((p7) this.f43227c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) this.f43226b), R.raw.stars_topup).k(true);
                return;
            default:
                zc.a0((db1) this.f43227c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) this.f43226b), R.raw.stars_topup).k(true);
                return;
        }
    }
}
