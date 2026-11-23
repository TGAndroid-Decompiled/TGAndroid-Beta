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
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.ox0;
public final class p1 {
    public static boolean f55006e0;
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
    public boolean f55008a0;
    public final j1 f55010b0;
    public long f55012c0;
    public final j1 f55013d0;
    public final Context f55014e;
    public final String f55015f;
    public final int f55016g;
    public final String h;
    public final String f55017i;
    public volatile String f55019k;
    public final float f55020l;
    public volatile int f55028t;
    public volatile boolean f55029u;
    public volatile long v;
    public volatile float f55031x;
    public volatile long f55033z;
    public final Handler f55007a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f55009b = new WidgetSandboxBackend(this);
    public final l f55011c = z0.f55123z;
    public volatile e0 d = new e0(null);
    public volatile String f55018j = "{}";
    public final long f55021m = System.nanoTime();
    public final AtomicBoolean f55022n = new AtomicBoolean();
    public final AtomicBoolean f55023o = new AtomicBoolean();
    public final AtomicBoolean f55024p = new AtomicBoolean();
    public final AtomicBoolean f55025q = new AtomicBoolean();
    public final AtomicBoolean f55026r = new AtomicBoolean();
    public final Object f55027s = new Object();
    public final HashMap f55030w = new HashMap();
    public final AtomicBoolean f55032y = new AtomicBoolean();

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
                if (!p1Var.A && j10 != 0 && p1Var.f55023o.compareAndSet(false, true)) {
                    if (p1Var.L && (p1Var.f55026r.getAndSet(false) | p1Var.f55025q.get())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (p1Var.L && p1Var.f55024p.getAndSet(false)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        p1Var.f55012c0 = j3;
                    }
                    p1Var.Z = SystemClock.uptimeMillis();
                    if (!p1Var.f55008a0) {
                        p1Var.f55008a0 = true;
                        p1Var.f55007a.postDelayed(p1Var.f55010b0, 5000L);
                    }
                    p1Var.f55011c.l(j10, ((float) (j3 - p1Var.f55021m)) / 1000000.0f, z11, z10, p1Var.f55022n.getAndSet(false));
                }
            }
        };
        this.f55010b0 = new j1(this, 3);
        this.f55013d0 = new j1(this, 4);
        if (i7 >= 1 && i7 <= 4) {
            this.f55014e = context.getApplicationContext();
            this.f55015f = str;
            this.H = str2;
            str2.contains("\"dark\"");
            this.f55016g = i7;
            this.h = str3 == null ? "en-US" : str3;
            this.f55017i = str4 == null ? "{}" : str4;
            this.f55020l = context.getResources().getDisplayMetrics().density;
            return;
        }
        throw new IllegalArgumentException("CPU multiplier must be 1..4");
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (i10.i(i7).p() && ((org.telegram.messenger.h0) mp.u1(i7).A7.f26264u0.f17372b).f24439c) {
                return true;
            }
        }
        return false;
    }

    public static void d(Context context) {
        ActivityManager activityManager;
        if (!a() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && !activityManager.isLowRamDevice()) {
            org.telegram.messenger.r0 r0Var = org.telegram.messenger.r0.f26613f;
            if (r0Var == null || r0Var.f26614a > 0) {
                try {
                    z0 z0Var = z0.f55123z;
                    synchronized (z0Var.f55124e) {
                        if (z0Var.f55132n == null) {
                            z0Var.f55132n = context.getApplicationContext();
                        }
                        z0Var.f55133o = true;
                        z0Var.f55134p = true;
                        z0Var.f55125f.removeCallbacks(z0Var.f55142y);
                        z0Var.y();
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
            if (!f55006e0 && r0Var != null) {
                f55006e0 = true;
                r0Var.d.add(new m1(context));
            }
        }
    }

    public final void b(boolean z10) {
        this.f55007a.post(new qp0(17, this, z10));
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
        Object obj2 = this.f55027s;
        synchronized (obj2) {
            try {
                try {
                    if (this.A) {
                        d0Var.b();
                        return;
                    }
                    n1 n1Var = this.O;
                    if (n1Var != null) {
                        n1Var.f54983a.b();
                    }
                    try {
                        this.O = new n1(d0Var, o1VarArr, d, i7, i10, f10, f11, i11, i12, i13, v1Var, z10, this.G);
                        if (!this.Q) {
                            this.Q = true;
                            this.f55007a.post(this.V);
                        }
                        this.f55028t = i10;
                        this.f55029u = true;
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
        if (!this.A && this.v != 0 && !this.J && !this.f55023o.get()) {
            if (!this.f55022n.get()) {
                if (this.L) {
                    if (!this.f55024p.get() && !this.f55025q.get() && !this.f55026r.get()) {
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
        if (!this.A && str != null && !str.equals(this.f55019k)) {
            this.f55019k = str;
            long j3 = this.v;
            if (j3 != 0) {
                this.f55011c.j(j3, str.getBytes(StandardCharsets.UTF_8));
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
                this.f55011c.o(j3, z10);
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
                        String str = this.f55019k;
                        String str2 = this.f55018j;
                        if (str != null) {
                            str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                        }
                        String str3 = str2;
                        l lVar = this.f55011c;
                        Context context = this.f55014e;
                        String str4 = this.f55015f;
                        String str5 = this.H;
                        float f10 = this.f55020l;
                        j3 = lVar.c(context, str4, str5, i7 / f10, f10, this.f55016g, this.h, this.f55017i, str3, gd.N0(2131742596, null), this.L, this.f55009b);
                        try {
                            SystemClock.uptimeMillis();
                            this.f55007a.post(new bi.e0(this, j3, i7, this.H, str));
                            Trace.endSection();
                        } catch (Exception e10) {
                            e = e10;
                            if (j3 != 0) {
                                i1.f54914a.execute(new ox0(this, j3, 3));
                            }
                            this.f55007a.post(new g0(8, this, e));
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
                e0Var.f54845f = SystemClock.elapsedRealtime();
            }
        }
        long j3 = this.v;
        if (!this.A && j3 != 0) {
            this.f55011c.m(j3, i7, f10, f11, i10, z10, z11, i11, i12);
        }
    }
}
