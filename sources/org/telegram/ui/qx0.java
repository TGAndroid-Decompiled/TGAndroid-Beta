package org.telegram.ui;

import android.os.SystemClock;
import android.os.Trace;
import java.util.HashSet;
public final class qx0 implements Runnable {
    public final int f51319a;
    public final long f51320b;
    public final Object f51321c;

    public qx0(Object obj, long j3, int i7) {
        this.f51319a = i7;
        this.f51321c = obj;
        this.f51320b = j3;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f51319a;
        long j3 = this.f51320b;
        Object obj = this.f51321c;
        switch (i10) {
            case 0:
                org.telegram.messenger.az azVar = (org.telegram.messenger.az) obj;
                azVar.f22988e = SystemClock.elapsedRealtime();
                azVar.f22987c = false;
                if (j3 == -1) {
                    azVar.d = false;
                    azVar.f22986b = 0L;
                } else {
                    azVar.f22986b = j3;
                    azVar.d = true;
                }
                org.telegram.messenger.ks.e().k(281, azVar);
                return;
            case 1:
                ((li.d) obj).a(Long.valueOf(j3));
                return;
            case 2:
                org.telegram.ui.web.a0 a0Var = (org.telegram.ui.web.a0) obj;
                a0Var.getClass();
                a0Var.presentFragment(bn.ua(j3));
                return;
            case 3:
                org.telegram.utils.twidget.p1 p1Var = (org.telegram.utils.twidget.p1) obj;
                Trace.beginSection("WidgetSandbox:Destroy");
                try {
                    p1Var.f54885c.e(j3);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 4:
                wg.w0 w0Var = (wg.w0) obj;
                HashSet hashSet = w0Var.f59834a2;
                hashSet.remove(Long.valueOf(j3));
                w0Var.U1.b(true, hashSet, new wg.r0(w0Var, 5), null);
                w0Var.o1(true, false);
                return;
            default:
                yi.j jVar = (yi.j) ((ac.e) obj).f1022c;
                if (j3 == jVar.f61329o && (i7 = jVar.G) != 9 && i7 != 10 && i7 != 8) {
                    SystemClock.elapsedRealtime();
                    jVar.f61336w = false;
                    jVar.s(3);
                    jVar.f61323i.removeCallbacks(jVar.D);
                    yi.b bVar = jVar.h;
                    bVar.b("recording started: retainedDurationMs=" + yi.j.r(jVar.f61330p));
                    return;
                }
                return;
        }
    }
}
