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
    public final int f41336a;
    public final long f41337b;
    public final Object f41338c;

    public e0(Object obj, long j10, int i10) {
        this.f41336a = i10;
        this.f41338c = obj;
        this.f41337b = j10;
    }

    @Override
    public final void run() {
        ri.o oVar;
        switch (this.f41336a) {
            case 0:
                f0 f0Var = (f0) this.f41338c;
                f0Var.getClass();
                f0Var.presentFragment(fo.W9(this.f41337b));
                return;
            case 1:
                ri.q qVar = (ri.q) ((cc.e) this.f41338c).f4722c;
                if (this.f41337b == qVar.f44764o && (oVar = qVar.f44762m) != ri.o.f44750r && oVar != ri.o.f44751s && oVar != ri.o.f44749n) {
                    SystemClock.elapsedRealtime();
                    qVar.f44771w = false;
                    qVar.r(ri.o.f44747c);
                    qVar.h.removeCallbacks(qVar.D);
                    ri.b bVar = qVar.f44757g;
                    bVar.b("recording started: retainedDurationMs=" + ri.q.q(qVar.f44765p));
                    return;
                }
                return;
            case 2:
                ug.z0 z0Var = (ug.z0) this.f41338c;
                HashSet hashSet = z0Var.f46418e0;
                hashSet.remove(Long.valueOf(this.f41337b));
                z0Var.Y.b(true, hashSet, new ug.t0(z0Var, 5), null);
                z0Var.c0(true, false);
                return;
            case 3:
                zc.a0((p7) this.f41338c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) this.f41337b), R.raw.stars_topup).k(true);
                return;
            default:
                zc.a0((hb1) this.f41338c).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2ConvertedChannel", (int) this.f41337b), R.raw.stars_topup).k(true);
                return;
        }
    }
}
