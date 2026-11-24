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
    public static final kc w = new kc((byte) 1);
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
    public final xxc t;
    public final xxc u;
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
                        xVar.o((zxc) arrayList.get(arrayList.size() - 1));
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
                                    zxc zxcVar = (zxc) obj;
                                    if (zxcVar.e == 0) {
                                        xVar.o(zxcVar);
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
                        xVar.o((zxc) arrayList.get(arrayList.size() - 1));
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
                                    zxc zxcVar = (zxc) obj;
                                    if (zxcVar.e == 0) {
                                        xVar.o(zxcVar);
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
        gl5 gl5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            gl5Var = null;
        } else {
            gl5Var = wVar.a.d;
        }
        gl5 gl5Var2 = gl5Var;
        if (gl5Var2 != null) {
            try {
                gl5Var2.l(wVar.c, j2, i, bArr);
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
        gl5 gl5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            gl5Var = null;
        } else {
            gl5Var = wVar.a.d;
        }
        if (gl5Var != null) {
            try {
                gl5Var.s(wVar.c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void d(long j) {
        w wVar = (w) this.g.remove(Long.valueOf(j));
        if (wVar != null) {
            gl5 gl5Var = wVar.a.d;
            if (gl5Var != null) {
                try {
                    gl5Var.r(wVar.c);
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
        gl5 gl5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            gl5Var = null;
        } else {
            gl5Var = wVar.a.d;
        }
        gl5 gl5Var2 = gl5Var;
        if (gl5Var2 != null) {
            try {
                gl5Var2.K(wVar.c, i, f, f2, i2);
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
        gl5 gl5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            gl5Var = null;
        } else {
            gl5Var = wVar.a.d;
        }
        if (gl5Var != null) {
            try {
                gl5Var.H(wVar.c);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void h(long j, byte[] bArr) {
        gl5 gl5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            gl5Var = null;
        } else {
            gl5Var = wVar.a.d;
        }
        if (gl5Var != null) {
            try {
                gl5Var.M(wVar.c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void i(long j, byte[] bArr) {
        gl5 gl5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            gl5Var = null;
        } else {
            gl5Var = wVar.a.d;
        }
        if (gl5Var != null) {
            try {
                gl5Var.u(wVar.c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void j(long j, float f, boolean z, boolean z2, boolean z3) {
        gl5 gl5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            gl5Var = null;
        } else {
            gl5Var = wVar.a.d;
        }
        gl5 gl5Var2 = gl5Var;
        if (gl5Var2 != null) {
            try {
                gl5Var2.k(wVar.c, f, z, z2, z3);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void k(long j, int i, float f, float f2, int i2, boolean z, boolean z2, int i3, int i4) {
        gl5 gl5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            gl5Var = null;
        } else {
            gl5Var = wVar.a.d;
        }
        gl5 gl5Var2 = gl5Var;
        if (gl5Var2 != null) {
            try {
                gl5Var2.x(wVar.c, i, f, f2, i2, z, z2, i3, i4);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void l(long j, boolean z) {
        gl5 gl5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            gl5Var = null;
        } else {
            gl5Var = wVar.a.d;
        }
        if (gl5Var != null) {
            try {
                gl5Var.A(wVar.c, z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void m(long j, float f) {
        gl5 gl5Var;
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar == null) {
            gl5Var = null;
        } else {
            gl5Var = wVar.a.d;
        }
        if (gl5Var != null) {
            try {
                gl5Var.D(wVar.c, f);
            } catch (RemoteException unused) {
            }
        }
    }

    public final defpackage.zxc n(java.util.ArrayList r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.x.n(java.util.ArrayList, long):zxc");
    }

    public final void o(zxc zxcVar) {
        if (zxcVar.n) {
            return;
        }
        zxcVar.n = true;
        if (zxcVar.d != null && zxcVar.d.asBinder().isBinderAlive()) {
            this.p = SystemClock.elapsedRealtime() + 1000;
        }
        zxcVar.d = null;
        this.c.remove(zxcVar);
        this.d.remove(zxcVar);
        this.b.removeCallbacks(zxcVar.y);
        try {
            this.j.unbindService(zxcVar);
        } catch (RuntimeException unused) {
        }
        this.a.notifyAll();
    }

    public final void p(zxc zxcVar, String str) {
        String str2 = "";
        try {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.j.getSystemService("activity")).getHistoricalProcessExitReasons(this.j.getPackageName(), zxcVar.w, 1);
            if (!historicalProcessExitReasons.isEmpty()) {
                ApplicationExitInfo a = dq9.a(historicalProcessExitReasons.get(0));
                str2 = ": exit reason " + a.getReason() + ", status " + a.getStatus() + ", " + a.getDescription() + ", rss " + (a.getRss() >> 10) + " MB";
            }
        } catch (Exception unused) {
        }
        Log.w("WidgetEngine", "process " + zxcVar.a + str2);
        fc4.b(str.concat(str2));
    }

    public final void q(zxc zxcVar, String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            if (zxcVar.n) {
                return;
            }
            Iterator it = this.g.entrySet().iterator();
            while (it.hasNext()) {
                w wVar = (w) ((Map.Entry) it.next()).getValue();
                if (wVar.a == zxcVar) {
                    arrayList.add(wVar);
                    it.remove();
                }
            }
            if (str != null) {
                if (zxcVar.d == null && zxcVar.b) {
                    this.q = false;
                }
                if (!zxcVar.h) {
                    int i = this.n + 1;
                    this.n = i;
                    if (i >= 3) {
                        this.o = SystemClock.elapsedRealtime() + 60000;
                    }
                }
            }
            o(zxcVar);
            u();
            if (str != null) {
                String str2 = "widget engine process " + zxcVar.a + " " + str + " with " + arrayList.size() + " sessions";
                Log.w("WidgetEngine", str2);
                if (Build.VERSION.SDK_INT >= 30 && zxcVar.w != 0 && this.j != null) {
                    Utilities.e.d(new gcc(this, zxcVar, str2, (byte) 26), 700L);
                } else {
                    fc4.b(str2);
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
                    i = oc7.r1(z8c.t0).l4.t0.f();
                } catch (Exception unused) {
                    i = 6;
                }
                return Math.max(1, Math.min(8, i));
            }
        }
        return 1;
    }

    public final void s(zxc zxcVar) {
        boolean z = zxcVar.n;
        cpc cpcVar = zxcVar.y;
        if (!z) {
            int i = zxcVar.e - 1;
            zxcVar.e = i;
            if (i <= 0) {
                this.a.notifyAll();
                Handler handler = this.b;
                handler.removeCallbacks(cpcVar);
                if (r() <= 1) {
                    if (!this.k || !this.l) {
                        handler.postDelayed(cpcVar, 30000L);
                    }
                } else if (zxcVar.s != 0) {
                    handler.postDelayed(cpcVar, 5000L);
                } else {
                    o(zxcVar);
                    u();
                }
            }
        }
    }

    public final zxc t(boolean z) {
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
        zxc zxcVar = new zxc(this, i, z2, z3);
        zxcVar.r = z;
        Context context = this.j;
        if (z2) {
            cls = WidgetEngineService.Forked.class;
        } else {
            cls = WidgetEngineService.class;
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra("shared", z3);
        boolean z5 = e21.a;
        try {
            int i2 = Build.VERSION.SDK_INT;
            Context context2 = this.j;
            if (i2 >= 29) {
                z4 = context2.bindIsolatedService(intent, 65, "w" + zxcVar.a, w, zxcVar);
            } else {
                z4 = context2.bindService(intent, zxcVar, 65);
            }
        } catch (RuntimeException e) {
            fc4.g(e, true);
            z4 = false;
        }
        if (!z4) {
            try {
                this.j.unbindService(zxcVar);
            } catch (RuntimeException unused) {
            }
            if (z2) {
                this.q = false;
                return t(z);
            }
            dq9.m("Widget engine service is unavailable");
            return null;
        }
        this.c.add(zxcVar);
        return zxcVar;
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
                fc4.g(e, true);
            }
        }
    }
}
