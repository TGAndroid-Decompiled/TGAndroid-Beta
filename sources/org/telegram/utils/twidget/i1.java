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
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.p31;
public final class i1 {
    public static boolean U;
    public volatile boolean A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public volatile boolean F;
    public int G;
    public g1 H;
    public g1 I;
    public JSONObject J;
    public boolean K;
    public v0 L;
    public v0 M;
    public String N;
    public final b1 O;
    public final b1 P;
    public final b1 Q;
    public final c1 R;
    public long S;
    public final b1 T;
    public final Context f52838e;
    public final String f52839f;
    public final int f52840g;
    public final String h;
    public final String f52841i;
    public volatile String f52843k;
    public final float f52844l;
    public volatile int f52852t;
    public volatile boolean f52853u;
    public volatile long v;
    public volatile boolean f52854w;
    public volatile boolean f52855x;
    public volatile boolean f52856y;
    public volatile boolean f52857z;
    public final Handler f52835a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f52836b = new WidgetSandboxBackend(this);
    public final r0 f52837c = r0.f52955i;
    public volatile d0 d = new d0(null);
    public volatile String f52842j = "{}";
    public final long f52845m = System.nanoTime();
    public final AtomicBoolean f52846n = new AtomicBoolean();
    public final AtomicBoolean f52847o = new AtomicBoolean();
    public final AtomicBoolean f52848p = new AtomicBoolean();
    public final AtomicBoolean f52849q = new AtomicBoolean();
    public final AtomicBoolean f52850r = new AtomicBoolean();
    public final Object f52851s = new Object();

    public i1(Context context, String str, String str2, int i7, String str3, String str4) {
        new JSONObject();
        this.O = new b1(this, 0);
        this.P = new b1(this, 2);
        this.Q = new b1(this, 3);
        this.R = new Choreographer.FrameCallback() {
            @Override
            public final void doFrame(long j3) {
                boolean z9;
                boolean z10;
                b h12;
                i1 i1Var = i1.this;
                i1Var.D = false;
                long j10 = i1Var.v;
                if (!i1Var.f52854w && j10 != 0 && i1Var.f52847o.compareAndSet(false, true)) {
                    if (i1Var.F && (i1Var.f52850r.getAndSet(false) | i1Var.f52849q.get())) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i1Var.F && i1Var.f52848p.getAndSet(false)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i1Var.S = j3;
                    }
                    r0 r0Var = i1Var.f52837c;
                    float f10 = ((float) (j3 - i1Var.f52845m)) / 1000000.0f;
                    boolean andSet = i1Var.f52846n.getAndSet(false);
                    o0 o0Var = (o0) r0Var.f52958e.get(Long.valueOf(j10));
                    if (o0Var == null) {
                        h12 = null;
                    } else {
                        h12 = o0Var.h1();
                    }
                    b bVar = h12;
                    if (bVar != null) {
                        try {
                            bVar.s(o0Var.d, f10, z10, z9, andSet);
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }
        };
        this.T = new b1(this, 4);
        if (i7 >= 1 && i7 <= 4) {
            this.f52838e = context.getApplicationContext();
            this.f52839f = str;
            this.B = str2;
            str2.contains("\"dark\"");
            this.f52840g = i7;
            this.h = str3 == null ? "en-US" : str3;
            this.f52841i = str4 == null ? "{}" : str4;
            this.f52844l = context.getResources().getDisplayMetrics().density;
            return;
        }
        throw new IllegalArgumentException("CPU multiplier must be 1..4");
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (p10.i(i7).p() && ((org.telegram.messenger.h0) qp.s1(i7).f24942x7.f24455o0.f13889b).f22780c) {
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
                r0 r0Var2 = r0.f52955i;
                synchronized (r0Var2.f52956b) {
                    if (r0Var2.f52960g == null) {
                        r0Var2.f52960g = context.getApplicationContext();
                    }
                    r0Var2.h = true;
                    r0Var2.h(r0Var2.e());
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (!U && (r0Var = org.telegram.messenger.r0.f25186f) != null) {
                U = true;
                r0Var.d.add(new f1(context));
            }
        }
    }

    public final void b(c0 c0Var, h1[] h1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, n1 n1Var) {
        Object obj;
        boolean z9 = this.f52856y;
        Object obj2 = this.f52851s;
        synchronized (obj2) {
            try {
                try {
                    if (this.f52854w) {
                        c0Var.b();
                        return;
                    }
                    g1 g1Var = this.I;
                    if (g1Var != null) {
                        g1Var.f52790a.b();
                    }
                    try {
                        this.I = new g1(c0Var, h1VarArr, d, i7, i10, f10, f11, i11, i12, i13, n1Var, z9, this.A);
                        if (!this.K) {
                            this.K = true;
                            this.f52835a.post(this.O);
                        }
                        this.f52852t = i10;
                        this.f52853u = true;
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
        if (!this.f52854w && this.v != 0 && !this.D && !this.f52847o.get()) {
            if (!this.f52846n.get()) {
                if (this.F) {
                    if (!this.f52848p.get() && !this.f52849q.get() && !this.f52850r.get()) {
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
        if (!this.f52854w && str != null && !str.equals(this.f52843k)) {
            this.f52843k = str;
            long j3 = this.v;
            if (j3 != 0) {
                r0 r0Var = this.f52837c;
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                o0 o0Var = (o0) r0Var.f52958e.get(Long.valueOf(j3));
                if (o0Var == null) {
                    h12 = null;
                } else {
                    h12 = o0Var.h1();
                }
                if (h12 != null) {
                    try {
                        h12.d1(o0Var.d, bytes);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }
    }

    public final void f(boolean z9) {
        b h12;
        if (!this.f52854w && this.F != z9) {
            this.F = z9;
            long j3 = this.v;
            if (j3 != 0) {
                o0 o0Var = (o0) this.f52837c.f52958e.get(Long.valueOf(j3));
                if (o0Var == null) {
                    h12 = null;
                } else {
                    h12 = o0Var.h1();
                }
                if (h12 != null) {
                    try {
                        h12.u0(o0Var.d, z9);
                    } catch (RemoteException unused) {
                    }
                }
            }
            if (z9) {
                d();
            }
        }
    }

    public final void g(int i7) {
        long j3;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (!a()) {
                if (WidgetSandboxNative.available()) {
                    if (this.G == 0) {
                        this.G = i7;
                    }
                    Trace.beginSection("WidgetSandbox:Create");
                    try {
                        try {
                            if (this.f52854w) {
                                Trace.endSection();
                                return;
                            }
                            String str = this.f52843k;
                            String str2 = this.f52842j;
                            if (str != null) {
                                str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                            }
                            String str3 = str2;
                            r0 r0Var = this.f52837c;
                            Context context = this.f52838e;
                            String str4 = this.f52839f;
                            String str5 = this.B;
                            float f10 = this.f52844l;
                            j3 = r0Var.f(context, str4, str5, i7 / f10, f10, this.f52840g, this.h, this.f52841i, str3, id.M0(2131742870, null), this.F, this.f52836b);
                            try {
                                this.f52835a.post(new bi.d0(this, j3, i7, this.B, str));
                                Trace.endSection();
                            } catch (Exception e10) {
                                e = e10;
                                if (j3 != 0) {
                                    a1.f52753a.execute(new p31(this, j3, 2));
                                }
                                this.f52835a.post(new f0(5, this, e));
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
                    throw new IllegalStateException("libtwidget is missing");
                }
            } else {
                throw new IllegalStateException("Widgets are disabled by the app config");
            }
        } else {
            throw new IllegalStateException("Start WidgetSandboxSession off UI");
        }
    }
}
