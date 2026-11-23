package org.telegram.utils.twidget;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.qx0;
public final class p1 {
    public static boolean f54925e0;
    public volatile boolean A;
    public volatile boolean B;
    public volatile long C;
    public volatile long D;
    public volatile boolean E;
    public volatile boolean F;
    public volatile boolean G;
    public String H;
    public boolean I;
    public boolean J;
    public boolean K;
    public volatile boolean L;
    public int M;
    public n1 N;
    public n1 O;
    public JSONObject P;
    public boolean Q;
    public d1 R;
    public float[] S;
    public d1 T;
    public String U;
    public final j1 V;
    public final j1 W;
    public final j1 X;
    public final l1 Y;
    public long Z;
    public boolean f54927a0;
    public final j1 f54929b0;
    public long f54931c0;
    public final j1 f54932d0;
    public final Context f54933e;
    public final String f54934f;
    public final int f54935g;
    public final String h;
    public final String f54936i;
    public volatile String f54938k;
    public final float f54939l;
    public volatile int f54947t;
    public volatile boolean f54948u;
    public volatile long v;
    public volatile float f54950x;
    public volatile long f54952z;
    public final Handler f54926a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f54928b = new WidgetSandboxBackend(this);
    public final l f54930c = z0.f55042z;
    public volatile e0 d = new e0(null);
    public volatile String f54937j = "{}";
    public final long f54940m = System.nanoTime();
    public final AtomicBoolean f54941n = new AtomicBoolean();
    public final AtomicBoolean f54942o = new AtomicBoolean();
    public final AtomicBoolean f54943p = new AtomicBoolean();
    public final AtomicBoolean f54944q = new AtomicBoolean();
    public final AtomicBoolean f54945r = new AtomicBoolean();
    public final Object f54946s = new Object();
    public final HashMap f54949w = new HashMap();
    public final AtomicBoolean f54951y = new AtomicBoolean();

    public p1(Context context, String str, String str2, int i7, String str3, String str4) {
        new JSONObject();
        this.V = new j1(this, 0);
        this.W = new j1(this, 1);
        this.X = new j1(this, 2);
        this.Y = new Choreographer.FrameCallback() {
            @Override
            public final void doFrame(long j3) {
                boolean z10;
                boolean z11;
                p1 p1Var = p1.this;
                p1Var.J = false;
                long j10 = p1Var.v;
                if (!p1Var.A && j10 != 0 && p1Var.f54942o.compareAndSet(false, true)) {
                    if (p1Var.L && (p1Var.f54945r.getAndSet(false) | p1Var.f54944q.get())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (p1Var.L && p1Var.f54943p.getAndSet(false)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        p1Var.f54931c0 = j3;
                    }
                    p1Var.Z = SystemClock.uptimeMillis();
                    if (!p1Var.f54927a0) {
                        p1Var.f54927a0 = true;
                        p1Var.f54926a.postDelayed(p1Var.f54929b0, 5000L);
                    }
                    p1Var.f54930c.l(j10, ((float) (j3 - p1Var.f54940m)) / 1000000.0f, z11, z10, p1Var.f54941n.getAndSet(false));
                }
            }
        };
        this.f54929b0 = new j1(this, 3);
        this.f54932d0 = new j1(this, 4);
        if (i7 >= 1 && i7 <= 4) {
            this.f54933e = context.getApplicationContext();
            this.f54934f = str;
            this.H = str2;
            str2.contains("\"dark\"");
            this.f54935g = i7;
            this.h = str3 == null ? "en-US" : str3;
            this.f54936i = str4 == null ? "{}" : str4;
            this.f54939l = context.getResources().getDisplayMetrics().density;
            return;
        }
        throw new IllegalArgumentException("CPU multiplier must be 1..4");
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (k10.i(i7).p() && ((org.telegram.messenger.h0) np.u1(i7).A7.f26249u0.f14030b).f24341c) {
                return true;
            }
        }
        return false;
    }

    public static void d(Context context) {
        ActivityManager activityManager;
        if (!a() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && !activityManager.isLowRamDevice()) {
            org.telegram.messenger.r0 r0Var = org.telegram.messenger.r0.f26536f;
            if (r0Var == null || r0Var.f26537a > 0) {
                try {
                    z0 z0Var = z0.f55042z;
                    synchronized (z0Var.f55043e) {
                        if (z0Var.f55051n == null) {
                            z0Var.f55051n = context.getApplicationContext();
                        }
                        z0Var.f55052o = true;
                        z0Var.f55053p = true;
                        z0Var.f55044f.removeCallbacks(z0Var.f55061y);
                        z0Var.y();
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
            if (!f54925e0 && r0Var != null) {
                f54925e0 = true;
                r0Var.d.add(new m1(context));
            }
        }
    }

    public final void b(boolean z10) {
        this.f54926a.post(new rp0(17, this, z10));
    }

    public final void c(d0 d0Var, o1[] o1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, v1 v1Var) {
        Object obj;
        boolean z10 = this.E;
        if (this.D == 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.C == 0) {
                this.C = uptimeMillis;
            }
            if (z10) {
                this.D = uptimeMillis;
            }
        }
        Object obj2 = this.f54946s;
        synchronized (obj2) {
            try {
                try {
                    if (this.A) {
                        d0Var.b();
                        return;
                    }
                    n1 n1Var = this.O;
                    if (n1Var != null) {
                        n1Var.f54902a.b();
                    }
                    try {
                        this.O = new n1(d0Var, o1VarArr, d, i7, i10, f10, f11, i11, i12, i13, v1Var, z10, this.G);
                        if (!this.Q) {
                            this.Q = true;
                            this.f54926a.post(this.V);
                        }
                        this.f54947t = i10;
                        this.f54948u = true;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }

    public final void e() {
        if (!this.A && this.v != 0 && !this.J && !this.f54942o.get()) {
            if (!this.f54941n.get()) {
                if (this.L) {
                    if (!this.f54943p.get() && !this.f54944q.get() && !this.f54945r.get()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.J = true;
            Choreographer.getInstance().postFrameCallback(this.Y);
        }
    }

    public final void f(String str) {
        if (!this.A && str != null && !str.equals(this.f54938k)) {
            this.f54938k = str;
            long j3 = this.v;
            if (j3 != 0) {
                this.f54930c.j(j3, str.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    public final void g(boolean z10) {
        if (!this.A && this.L != z10) {
            this.L = z10;
            if (z10) {
                this.Z = SystemClock.uptimeMillis();
            }
            long j3 = this.v;
            if (j3 != 0) {
                this.f54930c.o(j3, z10);
            }
            if (z10) {
                e();
            }
        }
    }

    public final void h(int i7) {
        long j3;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (!a()) {
                if (this.M == 0) {
                    this.M = i7;
                }
                SystemClock.uptimeMillis();
                Trace.beginSection("WidgetSandbox:Create");
                try {
                    try {
                        if (this.A) {
                            Trace.endSection();
                            return;
                        }
                        String str = this.f54938k;
                        String str2 = this.f54937j;
                        if (str != null) {
                            str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                        }
                        String str3 = str2;
                        l lVar = this.f54930c;
                        Context context = this.f54933e;
                        String str4 = this.f54934f;
                        String str5 = this.H;
                        float f10 = this.f54939l;
                        j3 = lVar.c(context, str4, str5, i7 / f10, f10, this.f54935g, this.h, this.f54936i, str3, hd.N0(2131742601, null), this.L, this.f54928b);
                        try {
                            SystemClock.uptimeMillis();
                            this.f54926a.post(new bi.e0(this, j3, i7, this.H, str));
                            Trace.endSection();
                        } catch (Exception e10) {
                            e = e10;
                            if (j3 != 0) {
                                i1.f54833a.execute(new qx0(this, j3, 3));
                            }
                            this.f54926a.post(new g0(8, this, e));
                            throw e;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        j3 = 0;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                throw new IllegalStateException("Widgets are disabled by the app config");
            }
        } else {
            throw new IllegalStateException("Start WidgetSandboxSession off UI");
        }
    }

    public final void i(int i7, float f10, float f11, int i10, boolean z10, boolean z11, int i11, int i12) {
        if (i7 == 0 && this.L) {
            e0 e0Var = this.d;
            synchronized (e0Var) {
                e0Var.d++;
                e0Var.f54764f = SystemClock.elapsedRealtime();
            }
        }
        long j3 = this.v;
        if (!this.A && j3 != 0) {
            this.f54930c.m(j3, i7, f10, f11, i10, z10, z11, i11, i12);
        }
    }
}
