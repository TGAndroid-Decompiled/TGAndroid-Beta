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
import org.telegram.messenger.a8;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.s2;
import org.telegram.ui.Components.as0;
import org.telegram.utils.twidget.WidgetEngineService;
public final class z0 extends l {
    public int f55127i;
    public long f55128j;
    public Context f55132n;
    public boolean f55133o;
    public int f55135q;
    public int f55136r;
    public long f55137s;
    public long f55138t;
    public boolean f55139u;
    public Boolean v;
    public volatile boolean f55140w;
    public final o0 f55141x;
    public final o0 f55142y;
    public static final z0 f55123z = new z0();
    public static final d3.b A = new d3.b(3);
    public static volatile int B = -1;
    public static volatile boolean C = true;
    public final Object f55124e = new Object();
    public final Handler f55125f = new Handler(Looper.getMainLooper());
    public final ArrayList f55126g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ConcurrentHashMap f55129k = new ConcurrentHashMap();
    public final AtomicLong f55130l = new AtomicLong();
    public final Semaphore f55131m = new Semaphore(12);
    public boolean f55134p = true;

    public z0() {
        this.f55139u = Build.VERSION.SDK_INT >= 29;
        this.f55141x = new Runnable(this) {
            public final z0 f54996b;

            {
                this.f54996b = this;
            }

            private final void a() {
                int i7;
                z0 z0Var = this.f54996b;
                synchronized (z0Var.f55124e) {
                    try {
                        if (SystemClock.elapsedRealtime() < z0Var.f55128j) {
                            i7 = z0Var.f55127i;
                        } else {
                            i7 = 1;
                        }
                        while (z0Var.h.size() > i7) {
                            ArrayList arrayList = z0Var.h;
                            z0Var.t((y0) arrayList.get(arrayList.size() - 1));
                        }
                        z0Var.y();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        a();
                        return;
                    default:
                        z0 z0Var = this.f54996b;
                        synchronized (z0Var.f55124e) {
                            try {
                                if (!z0Var.f55134p) {
                                    ArrayList arrayList = new ArrayList(z0Var.f55126g);
                                    int size = arrayList.size();
                                    int i7 = 0;
                                    while (i7 < size) {
                                        Object obj = arrayList.get(i7);
                                        i7++;
                                        y0 y0Var = (y0) obj;
                                        if (y0Var.d == 0) {
                                            z0Var.t(y0Var);
                                        }
                                    }
                                    return;
                                }
                                return;
                            } finally {
                            }
                        }
                }
            }
        };
        this.f55142y = new Runnable(this) {
            public final z0 f54996b;

            {
                this.f54996b = this;
            }

            private final void a() {
                int i7;
                z0 z0Var = this.f54996b;
                synchronized (z0Var.f55124e) {
                    try {
                        if (SystemClock.elapsedRealtime() < z0Var.f55128j) {
                            i7 = z0Var.f55127i;
                        } else {
                            i7 = 1;
                        }
                        while (z0Var.h.size() > i7) {
                            ArrayList arrayList = z0Var.h;
                            z0Var.t((y0) arrayList.get(arrayList.size() - 1));
                        }
                        z0Var.y();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        a();
                        return;
                    default:
                        z0 z0Var = this.f54996b;
                        synchronized (z0Var.f55124e) {
                            try {
                                if (!z0Var.f55134p) {
                                    ArrayList arrayList = new ArrayList(z0Var.f55126g);
                                    int size = arrayList.size();
                                    int i7 = 0;
                                    while (i7 < size) {
                                        Object obj = arrayList.get(i7);
                                        i7++;
                                        y0 y0Var = (y0) obj;
                                        if (y0Var.d == 0) {
                                            z0Var.t(y0Var);
                                        }
                                    }
                                    return;
                                }
                                return;
                            } finally {
                            }
                        }
                }
            }
        };
    }

    public static void r(z0 z0Var, y0 y0Var, String str) {
        String str2 = "";
        try {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) z0Var.f55132n.getSystemService("activity")).getHistoricalProcessExitReasons(z0Var.f55132n.getPackageName(), y0Var.f55118s, 1);
            if (!historicalProcessExitReasons.isEmpty()) {
                ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(0);
                str2 = ": exit reason " + applicationExitInfo.getReason() + ", status " + applicationExitInfo.getStatus() + ", " + applicationExitInfo.getDescription() + ", rss " + (applicationExitInfo.getRss() >> 10) + " MB";
            }
        } catch (Exception unused) {
        }
        Log.w("WidgetEngine", "process " + y0Var.f55111a + str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        p5.c.s(str2, sb2);
    }

    @Override
    public final void a(long j3, long j10, int i7, byte[] bArr) {
        b bVar;
        x0 x0Var = (x0) this.f55129k.get(Long.valueOf(j3));
        if (x0Var == null) {
            bVar = null;
        } else {
            bVar = x0Var.f55104a.f55113c;
        }
        b bVar2 = bVar;
        if (bVar2 != null) {
            try {
                bVar2.u(x0Var.f55106c, j10, i7, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final long c(android.content.Context r25, java.lang.String r26, java.lang.String r27, float r28, float r29, int r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, boolean r35, org.telegram.utils.twidget.WidgetSandboxBackend r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.utils.twidget.z0.c(android.content.Context, java.lang.String, java.lang.String, float, float, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, org.telegram.utils.twidget.WidgetSandboxBackend):long");
    }

    @Override
    public final void d(long j3, byte[] bArr) {
        b bVar;
        x0 x0Var = (x0) this.f55129k.get(Long.valueOf(j3));
        if (x0Var == null) {
            bVar = null;
        } else {
            bVar = x0Var.f55104a.f55113c;
        }
        if (bVar != null) {
            try {
                bVar.R(x0Var.f55106c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void e(long j3) {
        x0 x0Var = (x0) this.f55129k.remove(Long.valueOf(j3));
        if (x0Var != null) {
            b bVar = x0Var.f55104a.f55113c;
            if (bVar != null) {
                try {
                    bVar.J(x0Var.f55106c);
                } catch (RemoteException unused) {
                }
            }
            synchronized (this.f55124e) {
                w(x0Var.f55104a);
            }
        }
    }

    @Override
    public final void f(long j3, int i7, float f10, float f11, int i10) {
        b bVar;
        x0 x0Var = (x0) this.f55129k.get(Long.valueOf(j3));
        if (x0Var == null) {
            bVar = null;
        } else {
            bVar = x0Var.f55104a.f55113c;
        }
        b bVar2 = bVar;
        if (bVar2 != null) {
            try {
                bVar2.Z0(x0Var.f55106c, i7, f10, f11, i10);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void g(long j3) {
        x0 x0Var = (x0) this.f55129k.get(Long.valueOf(j3));
        if (x0Var != null) {
            u(x0Var.f55104a, "did not answer a tick");
        }
    }

    @Override
    public final void i(long j3) {
        b bVar;
        x0 x0Var = (x0) this.f55129k.get(Long.valueOf(j3));
        if (x0Var == null) {
            bVar = null;
        } else {
            bVar = x0Var.f55104a.f55113c;
        }
        if (bVar != null) {
            try {
                bVar.M0(x0Var.f55106c);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void j(long j3, byte[] bArr) {
        b bVar;
        x0 x0Var = (x0) this.f55129k.get(Long.valueOf(j3));
        if (x0Var == null) {
            bVar = null;
        } else {
            bVar = x0Var.f55104a.f55113c;
        }
        if (bVar != null) {
            try {
                bVar.d1(x0Var.f55106c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void k(long j3, byte[] bArr) {
        b bVar;
        x0 x0Var = (x0) this.f55129k.get(Long.valueOf(j3));
        if (x0Var == null) {
            bVar = null;
        } else {
            bVar = x0Var.f55104a.f55113c;
        }
        if (bVar != null) {
            try {
                bVar.e0(x0Var.f55106c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void l(long j3, float f10, boolean z10, boolean z11, boolean z12) {
        b bVar;
        x0 x0Var = (x0) this.f55129k.get(Long.valueOf(j3));
        if (x0Var == null) {
            bVar = null;
        } else {
            bVar = x0Var.f55104a.f55113c;
        }
        b bVar2 = bVar;
        if (bVar2 != null) {
            try {
                bVar2.s(x0Var.f55106c, f10, z10, z11, z12);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void m(long j3, int i7, float f10, float f11, int i10, boolean z10, boolean z11, int i11, int i12) {
        b bVar;
        x0 x0Var = (x0) this.f55129k.get(Long.valueOf(j3));
        if (x0Var == null) {
            bVar = null;
        } else {
            bVar = x0Var.f55104a.f55113c;
        }
        b bVar2 = bVar;
        if (bVar2 != null) {
            try {
                bVar2.j0(x0Var.f55106c, i7, f10, f11, i10, z10, z11, i11, i12);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void o(long j3, boolean z10) {
        b bVar;
        x0 x0Var = (x0) this.f55129k.get(Long.valueOf(j3));
        if (x0Var == null) {
            bVar = null;
        } else {
            bVar = x0Var.f55104a.f55113c;
        }
        if (bVar != null) {
            try {
                bVar.u0(x0Var.f55106c, z10);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override
    public final void p(long j3, float f10) {
        b bVar;
        x0 x0Var = (x0) this.f55129k.get(Long.valueOf(j3));
        if (x0Var == null) {
            bVar = null;
        } else {
            bVar = x0Var.f55104a.f55113c;
        }
        if (bVar != null) {
            try {
                bVar.G0(x0Var.f55106c, f10);
            } catch (RemoteException unused) {
            }
        }
    }

    public final y0 s(ArrayList arrayList, long j3) {
        long j10;
        y0 y0Var;
        y0 y0Var2;
        long j11;
        int i7;
        int i10;
        int v = v();
        long j12 = 0;
        int i11 = 0;
        int i12 = 1;
        if (v > 1) {
            int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i13 != 0) {
                ArrayList arrayList2 = this.f55126g;
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList2.get(i14);
                    i14++;
                    y0Var2 = (y0) obj;
                    if (y0Var2.d == 0 && y0Var2.f55115f && y0Var2.f55117r == j3 && y0Var2.f55113c != null) {
                        break;
                    }
                }
            }
            y0Var2 = null;
            if (y0Var2 == null && !this.h.isEmpty()) {
                y0 y0Var3 = (y0) this.h.get(0);
                ArrayList arrayList3 = this.h;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size2) {
                        Object obj2 = arrayList3.get(i15);
                        i15++;
                        y0 y0Var4 = (y0) obj2;
                        if (y0Var4.f55113c != null) {
                            y0Var2 = y0Var4;
                            break;
                        }
                    } else {
                        y0Var2 = y0Var3;
                        break;
                    }
                }
                this.h.remove(y0Var2);
            }
            if (y0Var2 == null) {
                if (this.f55126g.size() >= v) {
                    ArrayList arrayList4 = this.f55126g;
                    int size3 = arrayList4.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size3) {
                            break;
                        }
                        Object obj3 = arrayList4.get(i16);
                        i16++;
                        y0 y0Var5 = (y0) obj3;
                        if (y0Var5.d == 0 && y0Var5.f55115f) {
                            t(y0Var5);
                            break;
                        }
                    }
                }
                if (this.f55126g.size() < v) {
                    y0Var2 = x(false);
                }
            }
            if (y0Var2 == null && i13 != 0) {
                ArrayList arrayList5 = this.f55126g;
                int size4 = arrayList5.size();
                int i17 = 0;
                while (i17 < size4) {
                    Object obj4 = arrayList5.get(i17);
                    i17++;
                    y0 y0Var6 = (y0) obj4;
                    if (y0Var6.f55115f && y0Var6.f55117r == j3 && (y0Var2 == null || y0Var6.d < y0Var2.d)) {
                        y0Var2 = y0Var6;
                    }
                }
            }
            if (y0Var2 == null) {
                ArrayList arrayList6 = this.f55126g;
                int size5 = arrayList6.size();
                int i18 = 0;
                y0 y0Var7 = null;
                y0 y0Var8 = null;
                while (i18 < size5) {
                    Object obj5 = arrayList6.get(i18);
                    i18++;
                    y0 y0Var9 = (y0) obj5;
                    if (!y0Var9.f55115f || y0Var9.d == 0 || y0Var9.f55114e > 0) {
                        j11 = j12;
                        i7 = size5;
                    } else {
                        Iterator it = this.f55129k.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                x0 x0Var = (x0) it.next();
                                if (x0Var.f55104a == y0Var9) {
                                    p1 session = x0Var.f55105b.session();
                                    if (session.L && !session.A) {
                                        if (y0Var9.f55117r == j12) {
                                            j11 = j12;
                                            i7 = size5;
                                        } else {
                                            ArrayList arrayList7 = this.f55126g;
                                            int size6 = arrayList7.size();
                                            j11 = j12;
                                            int i19 = i11;
                                            int i20 = i19;
                                            while (i19 < size6) {
                                                Object obj6 = arrayList7.get(i19);
                                                i19++;
                                                y0 y0Var10 = (y0) obj6;
                                                if (y0Var10.f55115f) {
                                                    i10 = size5;
                                                    if (y0Var10.f55117r == y0Var9.f55117r) {
                                                        i20++;
                                                    }
                                                } else {
                                                    i10 = size5;
                                                }
                                                size5 = i10;
                                                i12 = 1;
                                            }
                                            i7 = size5;
                                            if (i20 > i12 && (y0Var8 == null || y0Var9.d < y0Var8.d)) {
                                                y0Var8 = y0Var9;
                                            }
                                        }
                                    }
                                }
                                j12 = j12;
                                size5 = size5;
                                i11 = 0;
                                i12 = 1;
                            } else {
                                j11 = j12;
                                i7 = size5;
                                if (y0Var7 == null || y0Var9.d < y0Var7.d) {
                                    y0Var7 = y0Var9;
                                }
                            }
                        }
                    }
                    j12 = j11;
                    size5 = i7;
                    i11 = 0;
                    i12 = 1;
                }
                j10 = j12;
                if (y0Var7 == null) {
                    y0Var7 = y0Var8;
                }
                if (y0Var7 == null) {
                    return null;
                }
                Iterator it2 = this.f55129k.entrySet().iterator();
                while (it2.hasNext()) {
                    x0 x0Var2 = (x0) ((Map.Entry) it2.next()).getValue();
                    if (x0Var2.f55104a == y0Var7) {
                        arrayList.add(x0Var2);
                        it2.remove();
                    }
                }
                if (s2.f26829a) {
                    Log.d("WidgetEngine", "process " + y0Var7.f55111a + " with " + y0Var7.d + " sessions makes room for another bot");
                }
                t(y0Var7);
                y0Var2 = x(false);
            } else {
                j10 = 0;
            }
        } else {
            j10 = 0;
            if (!this.f55126g.isEmpty()) {
                y0Var = (y0) this.f55126g.get(0);
            } else {
                y0Var = null;
            }
            if (y0Var == null) {
                while (Build.VERSION.SDK_INT < 29) {
                    long elapsedRealtime = this.f55138t - SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 0) {
                        break;
                    }
                    try {
                        this.f55124e.wait(elapsedRealtime);
                        if (!this.f55126g.isEmpty()) {
                            return s(arrayList, j3);
                        }
                    } catch (InterruptedException unused) {
                        throw new IllegalStateException("Widget engine did not start");
                    }
                }
                y0Var2 = x(false);
            } else {
                y0Var2 = y0Var;
            }
        }
        this.f55125f.removeCallbacks(y0Var2.f55120x);
        if (!y0Var2.f55115f) {
            y0Var2.f55117r = j3;
        } else if (y0Var2.f55117r != j3) {
            y0Var2.f55117r = j10;
        }
        y0Var2.f55115f = true;
        y0Var2.d++;
        y0Var2.f55114e++;
        return y0Var2;
    }

    public final void t(y0 y0Var) {
        if (y0Var.h) {
            return;
        }
        y0Var.h = true;
        if (y0Var.f55113c != null && y0Var.f55113c.asBinder().isBinderAlive()) {
            this.f55138t = SystemClock.elapsedRealtime() + 1000;
        }
        y0Var.f55113c = null;
        this.f55126g.remove(y0Var);
        this.h.remove(y0Var);
        this.f55125f.removeCallbacks(y0Var.f55120x);
        try {
            this.f55132n.unbindService(y0Var);
        } catch (RuntimeException unused) {
        }
        this.f55124e.notifyAll();
    }

    public final void u(y0 y0Var, String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f55124e) {
            try {
                if (y0Var.h) {
                    return;
                }
                Iterator it = this.f55129k.entrySet().iterator();
                while (it.hasNext()) {
                    x0 x0Var = (x0) ((Map.Entry) it.next()).getValue();
                    if (x0Var.f55104a == y0Var) {
                        arrayList.add(x0Var);
                        it.remove();
                    }
                }
                if (str != null) {
                    if (y0Var.f55113c == null && y0Var.f55112b) {
                        this.f55139u = false;
                    }
                    if (!y0Var.f55115f) {
                        int i7 = this.f55136r + 1;
                        this.f55136r = i7;
                        if (i7 >= 3) {
                            this.f55137s = SystemClock.elapsedRealtime() + 60000;
                        }
                    }
                }
                t(y0Var);
                y();
                if (str != null) {
                    String str2 = "widget engine process " + y0Var.f55111a + " " + str + " with " + arrayList.size() + " sessions";
                    Log.w("WidgetEngine", str2);
                    if (Build.VERSION.SDK_INT >= 30 && y0Var.f55118s != 0 && this.f55132n != null) {
                        Utilities.f22877e.d(new as0(this, y0Var, str2, 17), 700L);
                    } else {
                        a8.b(str2);
                    }
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((x0) obj).f55105b.session().b(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int v() {
        int i7;
        Context context;
        boolean z10;
        if (Build.VERSION.SDK_INT < 29) {
            return 1;
        }
        int i10 = B;
        if (i10 >= 0) {
            return Math.max(1, Math.min(8, i10));
        }
        if (this.v == null && (context = this.f55132n) != null) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && activityManager.isLowRamDevice()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.v = Boolean.valueOf(z10);
        }
        Boolean bool = this.v;
        if (bool != null && bool.booleanValue()) {
            return 1;
        }
        try {
            i7 = ((org.telegram.messenger.j0) mp.u1(i10.f24637t0).A7.f26265v0.f15482b).f24899c;
        } catch (Exception unused) {
            i7 = 6;
        }
        return Math.max(1, Math.min(8, i7));
    }

    public final void w(y0 y0Var) {
        boolean z10 = y0Var.h;
        j0 j0Var = y0Var.f55120x;
        if (!z10) {
            int i7 = y0Var.d - 1;
            y0Var.d = i7;
            if (i7 <= 0) {
                this.f55124e.notifyAll();
                Handler handler = this.f55125f;
                handler.removeCallbacks(j0Var);
                if (v() <= 1) {
                    if (!this.f55133o || !this.f55134p) {
                        handler.postDelayed(j0Var, 30000L);
                    }
                } else if (y0Var.f55117r != 0) {
                    handler.postDelayed(j0Var, 5000L);
                } else {
                    t(y0Var);
                    y();
                }
            }
        }
    }

    public final y0 x(boolean z10) {
        boolean z11;
        Class cls;
        boolean z12;
        if (this.f55139u && C) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i7 = this.f55135q + 1;
        this.f55135q = i7;
        y0 y0Var = new y0(this, i7, z11);
        y0Var.f55116n = z10;
        Context context = this.f55132n;
        if (z11) {
            cls = WidgetEngineService.Forked.class;
        } else {
            cls = WidgetEngineService.class;
        }
        Intent intent = new Intent(context, cls);
        boolean z13 = s2.f26829a;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                z12 = this.f55132n.bindIsolatedService(intent, 65, "w" + y0Var.f55111a, A, y0Var);
            } else {
                z12 = this.f55132n.bindService(intent, y0Var, 65);
            }
        } catch (RuntimeException e10) {
            a8.g(e10, true);
            z12 = false;
        }
        if (!z12) {
            try {
                this.f55132n.unbindService(y0Var);
            } catch (RuntimeException unused) {
            }
            if (z11) {
                this.f55139u = false;
                return x(z10);
            }
            throw new IllegalStateException("Widget engine service is unavailable");
        }
        this.f55126g.add(y0Var);
        return y0Var;
    }

    public final void y() {
        int i7;
        if (this.f55132n != null && this.f55133o && this.f55134p && !this.f55140w) {
            int v = v();
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Build.VERSION.SDK_INT < 29 && elapsedRealtime < this.f55138t) {
                    this.f55125f.removeCallbacks(this.f55141x);
                    this.f55125f.postDelayed(this.f55141x, (this.f55138t - elapsedRealtime) + 20);
                } else if (v <= 1) {
                    if (this.f55126g.isEmpty()) {
                        x(true);
                    }
                } else {
                    if (elapsedRealtime < this.f55128j) {
                        i7 = this.f55127i;
                    } else {
                        i7 = 1;
                    }
                    while (this.h.size() < i7 && this.f55126g.size() < v) {
                        if (this.f55136r < 3 || elapsedRealtime >= this.f55137s) {
                            this.h.add(x(true));
                        } else {
                            return;
                        }
                    }
                }
            } catch (RuntimeException e10) {
                a8.g(e10, true);
            }
        }
    }
}
