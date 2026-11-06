package org.telegram.utils.twidget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Choreographer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.p71;
public final class h0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public int E;
    public f0 F;
    public f0 G;
    public JSONObject H;
    public boolean I;
    public u J;
    public u K;
    public String L;
    public final d0 M;
    public final d0 N;
    public final d0 O;
    public final c0 P;
    public long Q;
    public final d0 R;
    public final Context f52799c;
    public final String d;
    public final int f52800e;
    public final String f52801f;
    public final String f52802g;
    public volatile String f52803i;
    public final float f52804j;
    public volatile int f52812r;
    public volatile boolean f52813s;
    public volatile long f52814t;
    public volatile boolean f52815u;
    public volatile boolean v;
    public volatile boolean f52816w;
    public volatile boolean f52817x;
    public volatile boolean f52818y;
    public String f52819z;
    public final Handler f52797a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f52798b = new WidgetSandboxBackend(this);
    public volatile String h = "{}";
    public final long f52805k = System.nanoTime();
    public final AtomicBoolean f52806l = new AtomicBoolean();
    public final AtomicBoolean f52807m = new AtomicBoolean();
    public final AtomicBoolean f52808n = new AtomicBoolean();
    public final AtomicBoolean f52809o = new AtomicBoolean();
    public final AtomicBoolean f52810p = new AtomicBoolean();
    public final Object f52811q = new Object();

    public h0(Context context, String str, String str2, int i7, String str3, String str4) {
        new JSONObject();
        this.M = new Runnable(this) {
            public final h0 f52774b;

            {
                this.f52774b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                p71 p71Var;
                h0 h0Var;
                m h;
                int i10;
                switch (r2) {
                    case 0:
                        h0 h0Var2 = this.f52774b;
                        long j3 = h0Var2.f52814t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22545r));
                        if (!h0Var2.f52815u && j3 != 0 && h0Var2.D && h0Var2.f52808n.get() && nanoTime - h0Var2.Q >= (max * 9) / 10 && h0Var2.f52807m.compareAndSet(false, true)) {
                            h0Var2.f52808n.set(false);
                            h0Var2.Q = nanoTime;
                            WidgetSandboxNative.tick(j3, ((float) (nanoTime - h0Var2.f52805k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        h0Var2.c();
                        return;
                    case 1:
                        h0 h0Var3 = this.f52774b;
                        synchronized (h0Var3.f52811q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.f52815u) {
                            if (f0Var != null) {
                                f0Var.f52781a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i10 = h0Var3.E) != 0 && Math.abs(f0Var.d - i10) > 1) {
                            f0Var.f52781a.c();
                            h0Var3.C = false;
                            f0Var = null;
                        }
                        if (f0Var != null) {
                            h0Var3.F = f0Var;
                            h0Var3.C = false;
                            u uVar2 = h0Var3.J;
                            if (uVar2 != null) {
                                uVar2.g(h0Var3);
                            }
                        }
                        if (jSONObject != null && (uVar = h0Var3.J) != null) {
                            if (uVar.f52892e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                    int i11 = h.C;
                                    int i12 = uVar.f52903q;
                                    if (i11 != i12) {
                                        h.C = i12;
                                        h.B++;
                                        h.D = true;
                                        a8.b("widget " + uVar.f52889a + " stopped (" + h.B + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && uVar.f52894g != null && (h0Var = uVar.f52893f) != null) {
                                uVar.g(h0Var);
                                return;
                            } else if (uVar.e() && (p71Var = uVar.h) != null) {
                                o71 o71Var = p71Var.f36788a;
                                o71Var.j();
                                o71Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f52774b.c();
                        return;
                    default:
                        h0 h0Var4 = this.f52774b;
                        h0Var4.f52810p.set(true);
                        h0Var4.c();
                        return;
                }
            }
        };
        this.N = new Runnable(this) {
            public final h0 f52774b;

            {
                this.f52774b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                p71 p71Var;
                h0 h0Var;
                m h;
                int i10;
                switch (r2) {
                    case 0:
                        h0 h0Var2 = this.f52774b;
                        long j3 = h0Var2.f52814t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22545r));
                        if (!h0Var2.f52815u && j3 != 0 && h0Var2.D && h0Var2.f52808n.get() && nanoTime - h0Var2.Q >= (max * 9) / 10 && h0Var2.f52807m.compareAndSet(false, true)) {
                            h0Var2.f52808n.set(false);
                            h0Var2.Q = nanoTime;
                            WidgetSandboxNative.tick(j3, ((float) (nanoTime - h0Var2.f52805k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        h0Var2.c();
                        return;
                    case 1:
                        h0 h0Var3 = this.f52774b;
                        synchronized (h0Var3.f52811q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.f52815u) {
                            if (f0Var != null) {
                                f0Var.f52781a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i10 = h0Var3.E) != 0 && Math.abs(f0Var.d - i10) > 1) {
                            f0Var.f52781a.c();
                            h0Var3.C = false;
                            f0Var = null;
                        }
                        if (f0Var != null) {
                            h0Var3.F = f0Var;
                            h0Var3.C = false;
                            u uVar2 = h0Var3.J;
                            if (uVar2 != null) {
                                uVar2.g(h0Var3);
                            }
                        }
                        if (jSONObject != null && (uVar = h0Var3.J) != null) {
                            if (uVar.f52892e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                    int i11 = h.C;
                                    int i12 = uVar.f52903q;
                                    if (i11 != i12) {
                                        h.C = i12;
                                        h.B++;
                                        h.D = true;
                                        a8.b("widget " + uVar.f52889a + " stopped (" + h.B + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && uVar.f52894g != null && (h0Var = uVar.f52893f) != null) {
                                uVar.g(h0Var);
                                return;
                            } else if (uVar.e() && (p71Var = uVar.h) != null) {
                                o71 o71Var = p71Var.f36788a;
                                o71Var.j();
                                o71Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f52774b.c();
                        return;
                    default:
                        h0 h0Var4 = this.f52774b;
                        h0Var4.f52810p.set(true);
                        h0Var4.c();
                        return;
                }
            }
        };
        this.O = new Runnable(this) {
            public final h0 f52774b;

            {
                this.f52774b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                p71 p71Var;
                h0 h0Var;
                m h;
                int i10;
                switch (r2) {
                    case 0:
                        h0 h0Var2 = this.f52774b;
                        long j3 = h0Var2.f52814t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22545r));
                        if (!h0Var2.f52815u && j3 != 0 && h0Var2.D && h0Var2.f52808n.get() && nanoTime - h0Var2.Q >= (max * 9) / 10 && h0Var2.f52807m.compareAndSet(false, true)) {
                            h0Var2.f52808n.set(false);
                            h0Var2.Q = nanoTime;
                            WidgetSandboxNative.tick(j3, ((float) (nanoTime - h0Var2.f52805k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        h0Var2.c();
                        return;
                    case 1:
                        h0 h0Var3 = this.f52774b;
                        synchronized (h0Var3.f52811q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.f52815u) {
                            if (f0Var != null) {
                                f0Var.f52781a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i10 = h0Var3.E) != 0 && Math.abs(f0Var.d - i10) > 1) {
                            f0Var.f52781a.c();
                            h0Var3.C = false;
                            f0Var = null;
                        }
                        if (f0Var != null) {
                            h0Var3.F = f0Var;
                            h0Var3.C = false;
                            u uVar2 = h0Var3.J;
                            if (uVar2 != null) {
                                uVar2.g(h0Var3);
                            }
                        }
                        if (jSONObject != null && (uVar = h0Var3.J) != null) {
                            if (uVar.f52892e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                    int i11 = h.C;
                                    int i12 = uVar.f52903q;
                                    if (i11 != i12) {
                                        h.C = i12;
                                        h.B++;
                                        h.D = true;
                                        a8.b("widget " + uVar.f52889a + " stopped (" + h.B + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && uVar.f52894g != null && (h0Var = uVar.f52893f) != null) {
                                uVar.g(h0Var);
                                return;
                            } else if (uVar.e() && (p71Var = uVar.h) != null) {
                                o71 o71Var = p71Var.f36788a;
                                o71Var.j();
                                o71Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f52774b.c();
                        return;
                    default:
                        h0 h0Var4 = this.f52774b;
                        h0Var4.f52810p.set(true);
                        h0Var4.c();
                        return;
                }
            }
        };
        this.P = new Choreographer.FrameCallback() {
            @Override
            public final void doFrame(long j3) {
                boolean z9;
                h0 h0Var = h0.this;
                h0Var.B = false;
                long j10 = h0Var.f52814t;
                if (!h0Var.f52815u && j10 != 0) {
                    boolean z10 = true;
                    if (h0Var.f52807m.compareAndSet(false, true)) {
                        if (h0Var.D && (h0Var.f52810p.getAndSet(false) | h0Var.f52809o.get())) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (!h0Var.D || !h0Var.f52808n.getAndSet(false)) {
                            z10 = false;
                        }
                        if (z10) {
                            h0Var.Q = j3;
                        }
                        WidgetSandboxNative.tick(j10, ((float) (j3 - h0Var.f52805k)) / 1000000.0f, z10, z9, h0Var.f52806l.getAndSet(false));
                    }
                }
            }
        };
        this.R = new Runnable(this) {
            public final h0 f52774b;

            {
                this.f52774b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                p71 p71Var;
                h0 h0Var;
                m h;
                int i10;
                switch (r2) {
                    case 0:
                        h0 h0Var2 = this.f52774b;
                        long j3 = h0Var2.f52814t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22545r));
                        if (!h0Var2.f52815u && j3 != 0 && h0Var2.D && h0Var2.f52808n.get() && nanoTime - h0Var2.Q >= (max * 9) / 10 && h0Var2.f52807m.compareAndSet(false, true)) {
                            h0Var2.f52808n.set(false);
                            h0Var2.Q = nanoTime;
                            WidgetSandboxNative.tick(j3, ((float) (nanoTime - h0Var2.f52805k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        h0Var2.c();
                        return;
                    case 1:
                        h0 h0Var3 = this.f52774b;
                        synchronized (h0Var3.f52811q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.f52815u) {
                            if (f0Var != null) {
                                f0Var.f52781a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i10 = h0Var3.E) != 0 && Math.abs(f0Var.d - i10) > 1) {
                            f0Var.f52781a.c();
                            h0Var3.C = false;
                            f0Var = null;
                        }
                        if (f0Var != null) {
                            h0Var3.F = f0Var;
                            h0Var3.C = false;
                            u uVar2 = h0Var3.J;
                            if (uVar2 != null) {
                                uVar2.g(h0Var3);
                            }
                        }
                        if (jSONObject != null && (uVar = h0Var3.J) != null) {
                            if (uVar.f52892e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                    int i11 = h.C;
                                    int i12 = uVar.f52903q;
                                    if (i11 != i12) {
                                        h.C = i12;
                                        h.B++;
                                        h.D = true;
                                        a8.b("widget " + uVar.f52889a + " stopped (" + h.B + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && uVar.f52894g != null && (h0Var = uVar.f52893f) != null) {
                                uVar.g(h0Var);
                                return;
                            } else if (uVar.e() && (p71Var = uVar.h) != null) {
                                o71 o71Var = p71Var.f36788a;
                                o71Var.j();
                                o71Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f52774b.c();
                        return;
                    default:
                        h0 h0Var4 = this.f52774b;
                        h0Var4.f52810p.set(true);
                        h0Var4.c();
                        return;
                }
            }
        };
        if (i7 >= 1 && i7 <= 4) {
            this.f52799c = context.getApplicationContext();
            this.d = str;
            this.f52819z = str2;
            str2.contains("\"dark\"");
            this.f52800e = i7;
            this.f52801f = str3 == null ? "en-US" : str3;
            this.f52802g = str4 == null ? "{}" : str4;
            this.f52804j = context.getResources().getDisplayMetrics().density;
            return;
        }
        throw new IllegalArgumentException("CPU multiplier must be 1..4");
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (p10.i(i7).p() && ((org.telegram.messenger.h0) qp.s1(i7).f24935x7.f24451o0.f13889b).f22774c) {
                return true;
            }
        }
        return false;
    }

    public final void b(g gVar, g0[] g0VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, m0 m0Var) {
        Object obj;
        boolean z9 = this.f52816w;
        Object obj2 = this.f52811q;
        synchronized (obj2) {
            try {
                try {
                    if (this.f52815u) {
                        gVar.c();
                        return;
                    }
                    f0 f0Var = this.G;
                    if (f0Var != null) {
                        f0Var.f52781a.c();
                    }
                    try {
                        this.G = new f0(gVar, g0VarArr, d, i7, i10, f10, f11, i11, i12, i13, m0Var, z9, this.f52818y);
                        if (!this.I) {
                            this.I = true;
                            this.f52797a.post(this.M);
                        }
                        this.f52812r = i10;
                        this.f52813s = true;
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

    public final void c() {
        if (!this.f52815u && this.f52814t != 0 && !this.B && !this.f52807m.get()) {
            if (!this.f52806l.get()) {
                if (this.D) {
                    if (!this.f52808n.get() && !this.f52809o.get() && !this.f52810p.get()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.B = true;
            Choreographer.getInstance().postFrameCallback(this.P);
        }
    }

    public final void d(String str) {
        if (!this.f52815u && str != null && !str.equals(this.f52803i)) {
            this.f52803i = str;
            long j3 = this.f52814t;
            if (j3 != 0) {
                WidgetSandboxNative.safeArea(j3, str.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    public final void e(boolean z9) {
        if (!this.f52815u && this.D != z9) {
            this.D = z9;
            long j3 = this.f52814t;
            if (j3 != 0) {
                WidgetSandboxNative.visible(j3, z9);
            }
            if (z9) {
                c();
            }
        }
    }

    public final void f(final int i7) {
        final long j3;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (!a()) {
                if (this.E == 0) {
                    this.E = i7;
                }
                Trace.beginSection("WidgetSandbox:Create");
                try {
                    try {
                        String absolutePath = z.a(this.f52799c).getAbsolutePath();
                        if (this.f52815u) {
                            Trace.endSection();
                            return;
                        }
                        final String str = this.f52803i;
                        String str2 = this.h;
                        if (str != null) {
                            str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                        }
                        Charset charset = StandardCharsets.UTF_8;
                        byte[] bytes = absolutePath.getBytes(charset);
                        byte[] bytes2 = this.d.getBytes(charset);
                        byte[] bytes3 = this.f52819z.getBytes(charset);
                        float f10 = this.f52804j;
                        j3 = WidgetSandboxNative.create(bytes, bytes2, bytes3, i7 / f10, f10, this.f52800e, this.f52801f.getBytes(charset), this.f52802g.getBytes(charset), str2.getBytes(charset), hd.M0(2131742868, null).getBytes(charset), this.D, this.f52798b);
                        try {
                            final String str3 = this.f52819z;
                            this.f52797a.post(new Runnable() {
                                @Override
                                public final void run() {
                                    h0 h0Var = h0.this;
                                    long j10 = j3;
                                    int i10 = i7;
                                    String str4 = str3;
                                    String str5 = str;
                                    if (h0Var.f52815u) {
                                        z.f52933a.execute(new a0(j10));
                                        return;
                                    }
                                    h0Var.f52814t = j10;
                                    int i11 = h0Var.E;
                                    if (i11 != i10 && i11 > 0) {
                                        WidgetSandboxNative.width(j10, i11 / h0Var.f52804j);
                                    }
                                    if (!h0Var.f52819z.equals(str4)) {
                                        WidgetSandboxNative.theme(j10, h0Var.f52819z.getBytes(StandardCharsets.UTF_8));
                                    }
                                    if (h0Var.f52803i != null && !h0Var.f52803i.equals(str5)) {
                                        WidgetSandboxNative.safeArea(j10, h0Var.f52803i.getBytes(StandardCharsets.UTF_8));
                                    }
                                    h0Var.A = true;
                                    WidgetSandboxNative.visible(j10, h0Var.D);
                                    h0Var.c();
                                }
                            });
                            Trace.endSection();
                        } catch (Exception e10) {
                            e = e10;
                            if (j3 != 0) {
                                z.f52933a.execute(new a0(j3));
                            }
                            this.f52797a.post(new org.telegram.ui.web.w(12, this, e));
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
}
