package org.telegram.utils.twidget;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.Trace;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.ui.n31;
public final class l1 {
    public static boolean U;
    public volatile boolean A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public volatile boolean F;
    public int G;
    public j1 H;
    public j1 I;
    public JSONObject J;
    public boolean K;
    public y0 L;
    public y0 M;
    public String N;
    public final e1 O;
    public final e1 P;
    public final e1 Q;
    public final f1 R;
    public long S;
    public final e1 T;
    public final Context f54302e;
    public final String f54303f;
    public final int f54304g;
    public final String h;
    public final String f54305i;
    public volatile String f54307k;
    public final float f54308l;
    public volatile int f54316t;
    public volatile boolean f54317u;
    public volatile long v;
    public volatile boolean f54318w;
    public volatile boolean f54319x;
    public volatile boolean f54320y;
    public volatile boolean f54321z;
    public final Handler f54299a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f54300b = new WidgetSandboxBackend(this);
    public final u0 f54301c = u0.f54411i;
    public volatile d0 d = new d0(null);
    public volatile String f54306j = "{}";
    public final long f54309m = System.nanoTime();
    public final AtomicBoolean f54310n = new AtomicBoolean();
    public final AtomicBoolean f54311o = new AtomicBoolean();
    public final AtomicBoolean f54312p = new AtomicBoolean();
    public final AtomicBoolean f54313q = new AtomicBoolean();
    public final AtomicBoolean f54314r = new AtomicBoolean();
    public final Object f54315s = new Object();

    public l1(Context context, String str, String str2, int i7, String str3, String str4) {
        new JSONObject();
        this.O = new e1(this, 0);
        this.P = new e1(this, 2);
        this.Q = new e1(this, 3);
        this.R = new Choreographer.FrameCallback() {
            @Override
            public final void doFrame(long j3) {
                boolean z10;
                boolean z11;
                b h12;
                l1 l1Var = l1.this;
                l1Var.D = false;
                long j10 = l1Var.v;
                if (!l1Var.f54318w && j10 != 0 && l1Var.f54311o.compareAndSet(false, true)) {
                    if (l1Var.F && (l1Var.f54314r.getAndSet(false) | l1Var.f54313q.get())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (l1Var.F && l1Var.f54312p.getAndSet(false)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        l1Var.S = j3;
                    }
                    u0 u0Var = l1Var.f54301c;
                    float f10 = ((float) (j3 - l1Var.f54309m)) / 1000000.0f;
                    boolean andSet = l1Var.f54310n.getAndSet(false);
                    r0 r0Var = (r0) u0Var.f54414e.get(Long.valueOf(j10));
                    if (r0Var == null) {
                        h12 = null;
                    } else {
                        h12 = r0Var.h1();
                    }
                    b bVar = h12;
                    if (bVar != null) {
                        try {
                            bVar.s(r0Var.d, f10, z11, z10, andSet);
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }
        };
        this.T = new e1(this, 4);
        if (i7 >= 1 && i7 <= 4) {
            this.f54302e = context.getApplicationContext();
            this.f54303f = str;
            this.B = str2;
            str2.contains("\"dark\"");
            this.f54304g = i7;
            this.h = str3 == null ? "en-US" : str3;
            this.f54305i = str4 == null ? "{}" : str4;
            this.f54308l = context.getResources().getDisplayMetrics().density;
            return;
        }
        throw new IllegalArgumentException("CPU multiplier must be 1..4");
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (m10.i(i7).p() && ((org.telegram.messenger.h0) np.s1(i7).f25448y7.f25861o0.f14544b).f24006c) {
                return true;
            }
        }
        return false;
    }

    public static void c(Context context) {
        ActivityManager activityManager;
        org.telegram.messenger.r0 r0Var;
        if (!a() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && !activityManager.isLowRamDevice()) {
            try {
                u0 u0Var = u0.f54411i;
                synchronized (u0Var.f54412b) {
                    if (u0Var.f54416g == null) {
                        u0Var.f54416g = context.getApplicationContext();
                    }
                    u0Var.h = true;
                    u0Var.h(u0Var.e());
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (!U && (r0Var = org.telegram.messenger.r0.f26175f) != null) {
                U = true;
                r0Var.d.add(new i1(context));
            }
        }
    }

    public final void b(c0 c0Var, k1[] k1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, q1 q1Var) {
        Object obj;
        boolean z10 = this.f54320y;
        Object obj2 = this.f54315s;
        synchronized (obj2) {
            try {
                try {
                    if (this.f54318w) {
                        c0Var.b();
                        return;
                    }
                    j1 j1Var = this.I;
                    if (j1Var != null) {
                        j1Var.f54259a.b();
                    }
                    try {
                        this.I = new j1(c0Var, k1VarArr, d, i7, i10, f10, f11, i11, i12, i13, q1Var, z10, this.A);
                        if (!this.K) {
                            this.K = true;
                            this.f54299a.post(this.O);
                        }
                        this.f54316t = i10;
                        this.f54317u = true;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void d() {
        if (!this.f54318w && this.v != 0 && !this.D && !this.f54311o.get()) {
            if (!this.f54310n.get()) {
                if (this.F) {
                    if (!this.f54312p.get() && !this.f54313q.get() && !this.f54314r.get()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.D = true;
            Choreographer.getInstance().postFrameCallback(this.R);
        }
    }

    public final void e(String str) {
        b h12;
        if (!this.f54318w && str != null && !str.equals(this.f54307k)) {
            this.f54307k = str;
            long j3 = this.v;
            if (j3 != 0) {
                u0 u0Var = this.f54301c;
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                r0 r0Var = (r0) u0Var.f54414e.get(Long.valueOf(j3));
                if (r0Var == null) {
                    h12 = null;
                } else {
                    h12 = r0Var.h1();
                }
                if (h12 != null) {
                    try {
                        h12.d1(r0Var.d, bytes);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }
    }

    public final void f(boolean z10) {
        b h12;
        if (!this.f54318w && this.F != z10) {
            this.F = z10;
            long j3 = this.v;
            if (j3 != 0) {
                r0 r0Var = (r0) this.f54301c.f54414e.get(Long.valueOf(j3));
                if (r0Var == null) {
                    h12 = null;
                } else {
                    h12 = r0Var.h1();
                }
                if (h12 != null) {
                    try {
                        h12.v0(r0Var.d, z10);
                    } catch (RemoteException unused) {
                    }
                }
            }
            if (z10) {
                d();
            }
        }
    }

    public final void g(int i7) {
        long j3;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (!a()) {
                if (this.G == 0) {
                    this.G = i7;
                }
                Trace.beginSection("WidgetSandbox:Create");
                try {
                    try {
                        if (this.f54318w) {
                            Trace.endSection();
                            return;
                        }
                        String str = this.f54307k;
                        String str2 = this.f54306j;
                        if (str != null) {
                            str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                        }
                        String str3 = str2;
                        u0 u0Var = this.f54301c;
                        Context context = this.f54302e;
                        String str4 = this.f54303f;
                        String str5 = this.B;
                        float f10 = this.f54308l;
                        j3 = u0Var.f(context, str4, str5, i7 / f10, f10, this.f54304g, this.h, this.f54305i, str3, hd.M0(2131742867, null), this.F, this.f54300b);
                        try {
                            this.f54299a.post(new bi.e0(this, j3, i7, this.B, str));
                            Trace.endSection();
                        } catch (Exception e10) {
                            e = e10;
                            if (j3 != 0) {
                                d1.f54204a.execute(new n31(this, j3, 2));
                            }
                            this.f54299a.post(new f0(5, this, e));
                            throw e;
                        }
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } catch (Exception e11) {
                    e = e11;
                    j3 = 0;
                }
            } else {
                throw new IllegalStateException("Widgets are disabled by the app config");
            }
        } else {
            throw new IllegalStateException("Start WidgetSandboxSession off UI");
        }
    }
}
