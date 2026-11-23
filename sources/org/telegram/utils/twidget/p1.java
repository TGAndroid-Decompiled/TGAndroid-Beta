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
    public static boolean f54890e0;
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
    public boolean f54892a0;
    public final j1 f54894b0;
    public long f54896c0;
    public final j1 f54897d0;
    public final Context f54898e;
    public final String f54899f;
    public final int f54900g;
    public final String h;
    public final String f54901i;
    public volatile String f54903k;
    public final float f54904l;
    public volatile int f54912t;
    public volatile boolean f54913u;
    public volatile long v;
    public volatile float f54915x;
    public volatile long f54917z;
    public final Handler f54891a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f54893b = new WidgetSandboxBackend(this);
    public final l f54895c = z0.f55007z;
    public volatile e0 d = new e0(null);
    public volatile String f54902j = "{}";
    public final long f54905m = System.nanoTime();
    public final AtomicBoolean f54906n = new AtomicBoolean();
    public final AtomicBoolean f54907o = new AtomicBoolean();
    public final AtomicBoolean f54908p = new AtomicBoolean();
    public final AtomicBoolean f54909q = new AtomicBoolean();
    public final AtomicBoolean f54910r = new AtomicBoolean();
    public final Object f54911s = new Object();
    public final HashMap f54914w = new HashMap();
    public final AtomicBoolean f54916y = new AtomicBoolean();

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
                if (!p1Var.A && j10 != 0 && p1Var.f54907o.compareAndSet(false, true)) {
                    if (p1Var.L && (p1Var.f54910r.getAndSet(false) | p1Var.f54909q.get())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (p1Var.L && p1Var.f54908p.getAndSet(false)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        p1Var.f54896c0 = j3;
                    }
                    p1Var.Z = SystemClock.uptimeMillis();
                    if (!p1Var.f54892a0) {
                        p1Var.f54892a0 = true;
                        p1Var.f54891a.postDelayed(p1Var.f54894b0, 5000L);
                    }
                    p1Var.f54895c.l(j10, ((float) (j3 - p1Var.f54905m)) / 1000000.0f, z11, z10, p1Var.f54906n.getAndSet(false));
                }
            }
        };
        this.f54894b0 = new j1(this, 3);
        this.f54897d0 = new j1(this, 4);
        if (i7 >= 1 && i7 <= 4) {
            this.f54898e = context.getApplicationContext();
            this.f54899f = str;
            this.H = str2;
            str2.contains("\"dark\"");
            this.f54900g = i7;
            this.h = str3 == null ? "en-US" : str3;
            this.f54901i = str4 == null ? "{}" : str4;
            this.f54904l = context.getResources().getDisplayMetrics().density;
            return;
        }
        throw new IllegalArgumentException("CPU multiplier must be 1..4");
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (k10.i(i7).p() && ((org.telegram.messenger.h0) np.u1(i7).A7.f26213u0.f13993b).f24305c) {
                return true;
            }
        }
        return false;
    }

    public static void d(Context context) {
        ActivityManager activityManager;
        if (!a() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && !activityManager.isLowRamDevice()) {
            org.telegram.messenger.r0 r0Var = org.telegram.messenger.r0.f26500f;
            if (r0Var == null || r0Var.f26501a > 0) {
                try {
                    z0 z0Var = z0.f55007z;
                    synchronized (z0Var.f55008e) {
                        if (z0Var.f55016n == null) {
                            z0Var.f55016n = context.getApplicationContext();
                        }
                        z0Var.f55017o = true;
                        z0Var.f55018p = true;
                        z0Var.f55009f.removeCallbacks(z0Var.f55026y);
                        z0Var.y();
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
            if (!f54890e0 && r0Var != null) {
                f54890e0 = true;
                r0Var.d.add(new m1(context));
            }
        }
    }

    public final void b(boolean z10) {
        this.f54891a.post(new rp0(17, this, z10));
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
        Object obj2 = this.f54911s;
        synchronized (obj2) {
            try {
                try {
                    if (this.A) {
                        d0Var.b();
                        return;
                    }
                    n1 n1Var = this.O;
                    if (n1Var != null) {
                        n1Var.f54867a.b();
                    }
                    try {
                        this.O = new n1(d0Var, o1VarArr, d, i7, i10, f10, f11, i11, i12, i13, v1Var, z10, this.G);
                        if (!this.Q) {
                            this.Q = true;
                            this.f54891a.post(this.V);
                        }
                        this.f54912t = i10;
                        this.f54913u = true;
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
        if (!this.A && this.v != 0 && !this.J && !this.f54907o.get()) {
            if (!this.f54906n.get()) {
                if (this.L) {
                    if (!this.f54908p.get() && !this.f54909q.get() && !this.f54910r.get()) {
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
        if (!this.A && str != null && !str.equals(this.f54903k)) {
            this.f54903k = str;
            long j3 = this.v;
            if (j3 != 0) {
                this.f54895c.j(j3, str.getBytes(StandardCharsets.UTF_8));
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
                this.f54895c.o(j3, z10);
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
                        String str = this.f54903k;
                        String str2 = this.f54902j;
                        if (str != null) {
                            str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                        }
                        String str3 = str2;
                        l lVar = this.f54895c;
                        Context context = this.f54898e;
                        String str4 = this.f54899f;
                        String str5 = this.H;
                        float f10 = this.f54904l;
                        j3 = lVar.c(context, str4, str5, i7 / f10, f10, this.f54900g, this.h, this.f54901i, str3, hd.N0(2131742603, null), this.L, this.f54893b);
                        try {
                            SystemClock.uptimeMillis();
                            this.f54891a.post(new bi.e0(this, j3, i7, this.H, str));
                            Trace.endSection();
                        } catch (Exception e10) {
                            e = e10;
                            if (j3 != 0) {
                                i1.f54798a.execute(new qx0(this, j3, 3));
                            }
                            this.f54891a.post(new g0(8, this, e));
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
                e0Var.f54729f = SystemClock.elapsedRealtime();
            }
        }
        long j3 = this.v;
        if (!this.A && j3 != 0) {
            this.f54895c.m(j3, i7, f10, f11, i10, z10, z11, i11, i12);
        }
    }
}
