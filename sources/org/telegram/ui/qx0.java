package org.telegram.ui;

import android.os.SystemClock;
import android.os.Trace;
import java.util.HashSet;
public final class qx0 implements Runnable {
    public final int f51343a;
    public final long f51344b;
    public final Object f51345c;

    public qx0(Object obj, long j3, int i7) {
        this.f51343a = i7;
        this.f51345c = obj;
        this.f51344b = j3;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f51343a;
        long j3 = this.f51344b;
        Object obj = this.f51345c;
        switch (i10) {
            case 0:
                org.telegram.messenger.bz bzVar = (org.telegram.messenger.bz) obj;
                bzVar.f23164e = SystemClock.elapsedRealtime();
                bzVar.f23163c = false;
                if (j3 == -1) {
                    bzVar.d = false;
                    bzVar.f23162b = 0L;
                } else {
                    bzVar.f23162b = j3;
                    bzVar.d = true;
                }
                org.telegram.messenger.ls.e().k(281, bzVar);
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
                    p1Var.f54895c.e(j3);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 4:
                wg.w0 w0Var = (wg.w0) obj;
                HashSet hashSet = w0Var.f59844a2;
                hashSet.remove(Long.valueOf(j3));
                w0Var.U1.b(true, hashSet, new wg.r0(w0Var, 5), null);
                w0Var.o1(true, false);
                return;
            default:
                yi.j jVar = (yi.j) ((ac.e) obj).f1022c;
                if (j3 == jVar.f61339o && (i7 = jVar.G) != 9 && i7 != 10 && i7 != 8) {
                    SystemClock.elapsedRealtime();
                    jVar.f61346w = false;
                    jVar.s(3);
                    jVar.f61333i.removeCallbacks(jVar.D);
                    yi.b bVar = jVar.h;
                    bVar.b("recording started: retainedDurationMs=" + yi.j.r(jVar.f61340p));
                    return;
                }
                return;
        }
    }
}
