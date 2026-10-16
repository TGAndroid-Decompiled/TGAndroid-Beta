package org.telegram.ui.web;

import android.os.SystemClock;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
import org.telegram.ui.hb1;
import zh.p7;
public final class e0 implements Runnable {
    public final int f41028a;
    public final long f41029b;
    public final Object f41030c;

    public e0(Object obj, long j10, int i10) {
        this.f41028a = i10;
        this.f41030c = obj;
        this.f41029b = j10;
    }

    @Override
    public final void run() {
        qi.o oVar;
        switch (this.f41028a) {
            case 0:
                f0 f0Var = (f0) this.f41030c;
                f0Var.getClass();
                f0Var.presentFragment(fo.W9(this.f41029b));
                return;
            case 1:
                qi.q qVar = (qi.q) ((cc.e) this.f41030c).f4725c;
                if (this.f41029b == qVar.f43440o && (oVar = qVar.f43438m) != qi.o.f43426r && oVar != qi.o.f43427s && oVar != qi.o.f43425n) {
                    SystemClock.elapsedRealtime();
                    qVar.f43447w = false;
                    qVar.r(qi.o.f43423c);
                    qVar.h.removeCallbacks(qVar.D);
                    qi.b bVar = qVar.f43433g;
                    bVar.b("recording started: retainedDurationMs=" + qi.q.q(qVar.f43441p));
                    return;
                }
                return;
            case 2:
                ug.z0 z0Var = (ug.z0) this.f41030c;
                HashSet hashSet = z0Var.f46417e0;
                hashSet.remove(Long.valueOf(this.f41029b));
                z0Var.Y.b(true, hashSet, new ug.t0(z0Var, 5), null);
                z0Var.c0(true, false);
                return;
            case 3:
                zc.a0((p7) this.f41030c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) this.f41029b), R.raw.stars_topup).k(true);
                return;
            default:
                zc.a0((hb1) this.f41030c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) this.f41029b), R.raw.stars_topup).k(true);
                return;
        }
    }
}
