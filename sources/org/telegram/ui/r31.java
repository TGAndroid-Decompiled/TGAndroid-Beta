package org.telegram.ui;

import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import java.util.HashSet;
public final class r31 implements Runnable {
    public final int f49223a;
    public final long f49224b;
    public final Object f49225c;

    public r31(Object obj, long j3, int i7) {
        this.f49223a = i7;
        this.f49225c = obj;
        this.f49224b = j3;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f49223a) {
            case 0:
                ((org.telegram.messenger.voip.k) this.f49225c).a(Long.valueOf(this.f49224b));
                return;
            case 1:
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) this.f49225c;
                long j3 = this.f49224b;
                b0Var.getClass();
                b0Var.presentFragment(cn.ta(j3));
                return;
            case 2:
                org.telegram.utils.twidget.i1 i1Var = (org.telegram.utils.twidget.i1) this.f49225c;
                long j10 = this.f49224b;
                Trace.beginSection("WidgetSandbox:Destroy");
                try {
                    org.telegram.utils.twidget.r0 r0Var = i1Var.f52850c;
                    org.telegram.utils.twidget.o0 o0Var = (org.telegram.utils.twidget.o0) r0Var.f52971e.remove(Long.valueOf(j10));
                    if (o0Var != null) {
                        org.telegram.utils.twidget.b h12 = o0Var.h1();
                        if (h12 != null) {
                            try {
                                h12.J(o0Var.d);
                            } catch (RemoteException unused) {
                            }
                        }
                        synchronized (r0Var.f52969b) {
                            r0Var.j(o0Var.f52942a);
                        }
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 3:
                long j11 = this.f49224b;
                vi.h hVar = (vi.h) ((ac.e) this.f49225c).f1025c;
                if (j11 == hVar.f57564o && (i7 = hVar.G) != 9 && i7 != 10 && i7 != 8) {
                    SystemClock.elapsedRealtime();
                    hVar.f57571w = false;
                    hVar.s(3);
                    hVar.f57558i.removeCallbacks(hVar.D);
                    vi.b bVar = hVar.h;
                    bVar.b("recording started: retainedDurationMs=" + vi.h.r(hVar.f57565p));
                    return;
                }
                return;
            default:
                wg.w0 w0Var = (wg.w0) this.f49225c;
                long j12 = this.f49224b;
                HashSet hashSet = w0Var.Z1;
                hashSet.remove(Long.valueOf(j12));
                w0Var.T1.b(true, hashSet, new wg.r0(w0Var, 5), null);
                w0Var.n1(true, false);
                return;
        }
    }
}
