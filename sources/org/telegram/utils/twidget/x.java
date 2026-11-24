package org.telegram.utils.twidget;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.Utilities;
import org.telegram.utils.twidget.WidgetEngineService;
import org.telegram.utils.twidget.x;
public final class x extends b {
    public static final x v = new x();
    public static final hc w = new hc((byte) 1);
    public static volatile int x = -1;
    public static volatile boolean y = true;
    public int e;
    public long f;
    public Context j;
    public boolean k;
    public int m;
    public int n;
    public long o;
    public long p;
    public boolean q;
    public Boolean r;
    public volatile boolean s;
    public final wvc t;
    public final wvc u;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final AtomicLong h = new AtomicLong();
    public final Semaphore i = new Semaphore(12);
    public boolean l = true;

    public x() {
        this.q = Build.VERSION.SDK_INT >= 29;
        this.t = new Runnable(this) {
            public final x b;

            {
                this.b = this;
            }

            private final void a() {
                int i;
                x xVar = this.b;
                synchronized (xVar.a) {
                    if (SystemClock.elapsedRealtime() < xVar.f) {
                        i = xVar.e;
                    } else {
                        i = 1;
                    }
                    while (xVar.d.size() > i) {
                        ArrayList arrayList = xVar.d;
                        xVar.o((yvc) arrayList.get(arrayList.size() - 1));
                    }
                    xVar.u();
                }
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        a();
                        return;
                    default:
                        x xVar = this.b;
                        synchronized (xVar.a) {
                            if (!xVar.l) {
                                ArrayList arrayList = new ArrayList(xVar.c);
                                int size = arrayList.size();
                                int i = 0;
                                while (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    yvc yvcVar = (yvc) obj;
                                    if (yvcVar.e == 0) {
                                        xVar.o(yvcVar);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                }
            }
        };
        this.u = new Runnable(this) {
            public final x b;

            {
                this.b = this;
            }

            private final void a() {
                int i;
                x xVar = this.b;
                synchronized (xVar.a) {
                    if (SystemClock.elapsedRealtime() < xVar.f) {
                        i = xVar.e;
                    } else {
                        i = 1;
                    }
                    while (xVar.d.size() > i) {
                        ArrayList arrayList = xVar.d;
                        xVar.o((yvc) arrayList.get(arrayList.size() - 1));
                    }
                    xVar.u();
                }
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        a();
                        return;
                    default:
                        x xVar = this.b;
                        synchronized (xVar.a) {
                            if (!xVar.l) {
                                ArrayList arrayList = new ArrayList(xVar.c);
                                int size = arrayList.size();
                                int i = 0;
                                while (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    yvc yvcVar = (yvc) obj;
                                    if (yvcVar.e == 0) {
                                        xVar.o(yvcVar);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                }
            }
        };
    }

    @Override
    public final void a(long j, long j2, int i, byte[] bArr) {
        hj5 hj5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            hj5Var = null;
        } else {
            hj5Var = wVar.a.d;
        }
        hj5 hj5Var2 = hj5Var;
        if (hj5Var2 != null) {
            try {
                hj5Var2.l(wVar.c, j2, i, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final long b(android.content.Context r26, java.lang.String r27, java.lang.String r28, float r29, float r30, int r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, boolean r36, org.telegram.utils.twidget.WidgetSandboxBackend r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.x.b(android.content.Context, java.lang.String, java.lang.String, float, float, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, org.telegram.utils.twidget.WidgetSandboxBackend):long");
    }

    @Override
    public final void c(long j, byte[] bArr) {
        hj5 hj5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            hj5Var = null;
        } else {
            hj5Var = wVar.a.d;
        }
        if (hj5Var != null) {
            try {
                hj5Var.s(wVar.c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void d(long j) {
        w wVar = (w) this.g.remove(Long.valueOf(j));
        if (wVar != null) {
            hj5 hj5Var = wVar.a.d;
            if (hj5Var != null) {
                try {
                    hj5Var.r(wVar.c);
                } catch (RemoteException unused) {
                }
            }
            synchronized (this.a) {
                s(wVar.a);
            }
        }
    }

    @Override
    public final void e(long j, int i, float f, float f2, int i2) {
        hj5 hj5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            hj5Var = null;
        } else {
            hj5Var = wVar.a.d;
        }
        hj5 hj5Var2 = hj5Var;
        if (hj5Var2 != null) {
            try {
                hj5Var2.L(wVar.c, i, f, f2, i2);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void f(long j) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar != null) {
            q(wVar.a, "did not answer a tick");
        }
    }

    @Override
    public final void g(long j) {
        hj5 hj5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            hj5Var = null;
        } else {
            hj5Var = wVar.a.d;
        }
        if (hj5Var != null) {
            try {
                hj5Var.I(wVar.c);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void h(long j, byte[] bArr) {
        hj5 hj5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            hj5Var = null;
        } else {
            hj5Var = wVar.a.d;
        }
        if (hj5Var != null) {
            try {
                hj5Var.M(wVar.c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void i(long j, byte[] bArr) {
        hj5 hj5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            hj5Var = null;
        } else {
            hj5Var = wVar.a.d;
        }
        if (hj5Var != null) {
            try {
                hj5Var.u(wVar.c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void j(long j, float f, boolean z, boolean z2, boolean z3) {
        hj5 hj5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            hj5Var = null;
        } else {
            hj5Var = wVar.a.d;
        }
        hj5 hj5Var2 = hj5Var;
        if (hj5Var2 != null) {
            try {
                hj5Var2.k(wVar.c, f, z, z2, z3);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void k(long j, int i, float f, float f2, int i2, boolean z, boolean z2, int i3, int i4) {
        hj5 hj5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            hj5Var = null;
        } else {
            hj5Var = wVar.a.d;
        }
        hj5 hj5Var2 = hj5Var;
        if (hj5Var2 != null) {
            try {
                hj5Var2.y(wVar.c, i, f, f2, i2, z, z2, i3, i4);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void l(long j, boolean z) {
        hj5 hj5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            hj5Var = null;
        } else {
            hj5Var = wVar.a.d;
        }
        if (hj5Var != null) {
            try {
                hj5Var.B(wVar.c, z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void m(long j, float f) {
        hj5 hj5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            hj5Var = null;
        } else {
            hj5Var = wVar.a.d;
        }
        if (hj5Var != null) {
            try {
                hj5Var.E(wVar.c, f);
            } catch (RemoteException unused) {
            }
        }
    }

    public final defpackage.yvc n(java.util.ArrayList r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.x.n(java.util.ArrayList, long):yvc");
    }

    public final void o(yvc yvcVar) {
        if (yvcVar.n) {
            return;
        }
        yvcVar.n = true;
        if (yvcVar.d != null && yvcVar.d.asBinder().isBinderAlive()) {
            this.p = SystemClock.elapsedRealtime() + 1000;
        }
        yvcVar.d = null;
        this.c.remove(yvcVar);
        this.d.remove(yvcVar);
        this.b.removeCallbacks(yvcVar.y);
        try {
            this.j.unbindService(yvcVar);
        } catch (RuntimeException unused) {
        }
        this.a.notifyAll();
    }

    public final void p(yvc yvcVar, String str) {
        String str2 = "";
        try {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.j.getSystemService("activity")).getHistoricalProcessExitReasons(this.j.getPackageName(), yvcVar.w, 1);
            if (!historicalProcessExitReasons.isEmpty()) {
                ApplicationExitInfo a = ho9.a(historicalProcessExitReasons.get(0));
                str2 = ": exit reason " + a.getReason() + ", status " + a.getStatus() + ", " + a.getDescription() + ", rss " + (a.getRss() >> 10) + " MB";
            }
        } catch (Exception unused) {
        }
        Log.w("WidgetEngine", "process " + yvcVar.a + str2);
        fa4.b(str.concat(str2));
    }

    public final void q(yvc yvcVar, String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            if (yvcVar.n) {
                return;
            }
            Iterator it = this.g.entrySet().iterator();
            while (it.hasNext()) {
                w wVar = (w) ((Map.Entry) it.next()).getValue();
                if (wVar.a == yvcVar) {
                    arrayList.add(wVar);
                    it.remove();
                }
            }
            if (str != null) {
                if (yvcVar.d == null && yvcVar.b) {
                    this.q = false;
                }
                if (!yvcVar.h) {
                    int i = this.n + 1;
                    this.n = i;
                    if (i >= 3) {
                        this.o = SystemClock.elapsedRealtime() + 60000;
                    }
                }
            }
            o(yvcVar);
            u();
            if (str != null) {
                String str2 = "widget engine process " + yvcVar.a + " " + str + " with " + arrayList.size() + " sessions";
                Log.w("WidgetEngine", str2);
                if (Build.VERSION.SDK_INT >= 30 && yvcVar.w != 0 && this.j != null) {
                    Utilities.e.d(new wbc(this, yvcVar, str2, (byte) 23), 700L);
                } else {
                    fa4.b(str2);
                }
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((w) obj).b.session().b(false);
            }
        }
    }

    public final int r() {
        int i;
        Context context;
        boolean z;
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = x;
            if (i2 >= 0) {
                return Math.max(1, Math.min(8, i2));
            }
            Boolean bool = this.r;
            if (bool == null && (context = this.j) != null) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null && activityManager.isLowRamDevice()) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
                this.r = bool;
            }
            if (bool == null || !bool.booleanValue()) {
                try {
                    i = na7.q1(y6c.t0).k4.t0.f();
                } catch (Exception unused) {
                    i = 6;
                }
                return Math.max(1, Math.min(8, i));
            }
        }
        return 1;
    }

    public final void s(yvc yvcVar) {
        boolean z = yvcVar.n;
        frc frcVar = yvcVar.y;
        if (!z) {
            int i = yvcVar.e - 1;
            yvcVar.e = i;
            if (i <= 0) {
                this.a.notifyAll();
                Handler handler = this.b;
                handler.removeCallbacks(frcVar);
                if (r() <= 1) {
                    if (!this.k || !this.l) {
                        handler.postDelayed(frcVar, 30000L);
                    }
                } else if (yvcVar.s != 0) {
                    handler.postDelayed(frcVar, 5000L);
                } else {
                    o(yvcVar);
                    u();
                }
            }
        }
    }

    public final yvc t(boolean z) {
        boolean z2;
        boolean z3;
        Class cls;
        boolean z4;
        if (this.q && y) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (r() <= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i = this.m + 1;
        this.m = i;
        yvc yvcVar = new yvc(this, i, z2, z3);
        yvcVar.r = z;
        Context context = this.j;
        if (z2) {
            cls = WidgetEngineService.Forked.class;
        } else {
            cls = WidgetEngineService.class;
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra("shared", z3);
        boolean z5 = w01.a;
        try {
            int i2 = Build.VERSION.SDK_INT;
            Context context2 = this.j;
            if (i2 >= 29) {
                z4 = context2.bindIsolatedService(intent, 65, "w" + yvcVar.a, w, yvcVar);
            } else {
                z4 = context2.bindService(intent, yvcVar, 65);
            }
        } catch (RuntimeException e) {
            fa4.g(e, true);
            z4 = false;
        }
        if (!z4) {
            try {
                this.j.unbindService(yvcVar);
            } catch (RuntimeException unused) {
            }
            if (z2) {
                this.q = false;
                return t(z);
            }
            sc8.j("Widget engine service is unavailable");
            return null;
        }
        this.c.add(yvcVar);
        return yvcVar;
    }

    public final void u() {
        int i;
        if (this.j != null && this.k && this.l && !this.s) {
            int r = r();
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Build.VERSION.SDK_INT < 29 && elapsedRealtime < this.p) {
                    this.b.removeCallbacks(this.t);
                    this.b.postDelayed(this.t, (this.p - elapsedRealtime) + 20);
                } else if (r <= 1) {
                    if (this.c.isEmpty()) {
                        t(true);
                    }
                } else {
                    if (elapsedRealtime < this.f) {
                        i = this.e;
                    } else {
                        i = 1;
                    }
                    while (this.d.size() < i && this.c.size() < r) {
                        if (this.n < 3 || elapsedRealtime >= this.o) {
                            this.d.add(t(true));
                        } else {
                            return;
                        }
                    }
                }
            } catch (RuntimeException e) {
                fa4.g(e, true);
            }
        }
    }
}
