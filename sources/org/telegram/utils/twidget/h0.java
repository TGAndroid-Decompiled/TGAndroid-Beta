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
import org.telegram.messenger.bd;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.hc1;
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
    public final Context f52866c;
    public final String d;
    public final int f52867e;
    public final String f52868f;
    public final String f52869g;
    public volatile String f52870i;
    public final float f52871j;
    public volatile int f52879r;
    public volatile boolean f52880s;
    public volatile long f52881t;
    public volatile boolean f52882u;
    public volatile boolean v;
    public volatile boolean f52883w;
    public volatile boolean f52884x;
    public volatile boolean f52885y;
    public String f52886z;
    public final Handler f52864a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f52865b = new WidgetSandboxBackend(this);
    public volatile String h = "{}";
    public final long f52872k = System.nanoTime();
    public final AtomicBoolean f52873l = new AtomicBoolean();
    public final AtomicBoolean f52874m = new AtomicBoolean();
    public final AtomicBoolean f52875n = new AtomicBoolean();
    public final AtomicBoolean f52876o = new AtomicBoolean();
    public final AtomicBoolean f52877p = new AtomicBoolean();
    public final Object f52878q = new Object();

    public h0(Context context, String str, String str2, int i3, String str3, String str4) {
        new JSONObject();
        this.M = new Runnable(this) {
            public final h0 f52841b;

            {
                this.f52841b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                h71 h71Var;
                h0 h0Var;
                m h;
                int i10;
                switch (r2) {
                    case 0:
                        h0 h0Var2 = this.f52841b;
                        long j10 = h0Var2.f52881t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22609r));
                        if (!h0Var2.f52882u && j10 != 0 && h0Var2.D && h0Var2.f52875n.get() && nanoTime - h0Var2.Q >= (max * 9) / 10 && h0Var2.f52874m.compareAndSet(false, true)) {
                            h0Var2.f52875n.set(false);
                            h0Var2.Q = nanoTime;
                            WidgetSandboxNative.tick(j10, ((float) (nanoTime - h0Var2.f52872k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        h0Var2.b();
                        return;
                    case 1:
                        h0 h0Var3 = this.f52841b;
                        synchronized (h0Var3.f52878q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.f52882u) {
                            if (f0Var != null) {
                                f0Var.f52848a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i10 = h0Var3.E) != 0 && Math.abs(f0Var.d - i10) > 1) {
                            f0Var.f52848a.c();
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
                            if (uVar.f52959e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                    int i11 = h.C;
                                    int i12 = uVar.f52970q;
                                    if (i11 != i12) {
                                        h.C = i12;
                                        h.B++;
                                        h.D = true;
                                        a8.b("widget " + uVar.f52956a + " stopped (" + h.B + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && uVar.f52961g != null && (h0Var = uVar.f52960f) != null) {
                                uVar.g(h0Var);
                                return;
                            } else if (uVar.e() && (h71Var = uVar.h) != null) {
                                g71 g71Var = h71Var.f34318a;
                                g71Var.j();
                                g71Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f52841b.b();
                        return;
                    default:
                        h0 h0Var4 = this.f52841b;
                        h0Var4.f52877p.set(true);
                        h0Var4.b();
                        return;
                }
            }
        };
        this.N = new Runnable(this) {
            public final h0 f52841b;

            {
                this.f52841b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                h71 h71Var;
                h0 h0Var;
                m h;
                int i10;
                switch (r2) {
                    case 0:
                        h0 h0Var2 = this.f52841b;
                        long j10 = h0Var2.f52881t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22609r));
                        if (!h0Var2.f52882u && j10 != 0 && h0Var2.D && h0Var2.f52875n.get() && nanoTime - h0Var2.Q >= (max * 9) / 10 && h0Var2.f52874m.compareAndSet(false, true)) {
                            h0Var2.f52875n.set(false);
                            h0Var2.Q = nanoTime;
                            WidgetSandboxNative.tick(j10, ((float) (nanoTime - h0Var2.f52872k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        h0Var2.b();
                        return;
                    case 1:
                        h0 h0Var3 = this.f52841b;
                        synchronized (h0Var3.f52878q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.f52882u) {
                            if (f0Var != null) {
                                f0Var.f52848a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i10 = h0Var3.E) != 0 && Math.abs(f0Var.d - i10) > 1) {
                            f0Var.f52848a.c();
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
                            if (uVar.f52959e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                    int i11 = h.C;
                                    int i12 = uVar.f52970q;
                                    if (i11 != i12) {
                                        h.C = i12;
                                        h.B++;
                                        h.D = true;
                                        a8.b("widget " + uVar.f52956a + " stopped (" + h.B + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && uVar.f52961g != null && (h0Var = uVar.f52960f) != null) {
                                uVar.g(h0Var);
                                return;
                            } else if (uVar.e() && (h71Var = uVar.h) != null) {
                                g71 g71Var = h71Var.f34318a;
                                g71Var.j();
                                g71Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f52841b.b();
                        return;
                    default:
                        h0 h0Var4 = this.f52841b;
                        h0Var4.f52877p.set(true);
                        h0Var4.b();
                        return;
                }
            }
        };
        this.O = new Runnable(this) {
            public final h0 f52841b;

            {
                this.f52841b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                h71 h71Var;
                h0 h0Var;
                m h;
                int i10;
                switch (r2) {
                    case 0:
                        h0 h0Var2 = this.f52841b;
                        long j10 = h0Var2.f52881t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22609r));
                        if (!h0Var2.f52882u && j10 != 0 && h0Var2.D && h0Var2.f52875n.get() && nanoTime - h0Var2.Q >= (max * 9) / 10 && h0Var2.f52874m.compareAndSet(false, true)) {
                            h0Var2.f52875n.set(false);
                            h0Var2.Q = nanoTime;
                            WidgetSandboxNative.tick(j10, ((float) (nanoTime - h0Var2.f52872k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        h0Var2.b();
                        return;
                    case 1:
                        h0 h0Var3 = this.f52841b;
                        synchronized (h0Var3.f52878q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.f52882u) {
                            if (f0Var != null) {
                                f0Var.f52848a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i10 = h0Var3.E) != 0 && Math.abs(f0Var.d - i10) > 1) {
                            f0Var.f52848a.c();
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
                            if (uVar.f52959e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                    int i11 = h.C;
                                    int i12 = uVar.f52970q;
                                    if (i11 != i12) {
                                        h.C = i12;
                                        h.B++;
                                        h.D = true;
                                        a8.b("widget " + uVar.f52956a + " stopped (" + h.B + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && uVar.f52961g != null && (h0Var = uVar.f52960f) != null) {
                                uVar.g(h0Var);
                                return;
                            } else if (uVar.e() && (h71Var = uVar.h) != null) {
                                g71 g71Var = h71Var.f34318a;
                                g71Var.j();
                                g71Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f52841b.b();
                        return;
                    default:
                        h0 h0Var4 = this.f52841b;
                        h0Var4.f52877p.set(true);
                        h0Var4.b();
                        return;
                }
            }
        };
        this.P = new Choreographer.FrameCallback() {
            @Override
            public final void doFrame(long j10) {
                boolean z10;
                h0 h0Var = h0.this;
                h0Var.B = false;
                long j11 = h0Var.f52881t;
                if (!h0Var.f52882u && j11 != 0) {
                    boolean z11 = true;
                    if (h0Var.f52874m.compareAndSet(false, true)) {
                        if (h0Var.D && (h0Var.f52877p.getAndSet(false) | h0Var.f52876o.get())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!h0Var.D || !h0Var.f52875n.getAndSet(false)) {
                            z11 = false;
                        }
                        if (z11) {
                            h0Var.Q = j10;
                        }
                        WidgetSandboxNative.tick(j11, ((float) (j10 - h0Var.f52872k)) / 1000000.0f, z11, z10, h0Var.f52873l.getAndSet(false));
                    }
                }
            }
        };
        this.R = new Runnable(this) {
            public final h0 f52841b;

            {
                this.f52841b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                h71 h71Var;
                h0 h0Var;
                m h;
                int i10;
                switch (r2) {
                    case 0:
                        h0 h0Var2 = this.f52841b;
                        long j10 = h0Var2.f52881t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22609r));
                        if (!h0Var2.f52882u && j10 != 0 && h0Var2.D && h0Var2.f52875n.get() && nanoTime - h0Var2.Q >= (max * 9) / 10 && h0Var2.f52874m.compareAndSet(false, true)) {
                            h0Var2.f52875n.set(false);
                            h0Var2.Q = nanoTime;
                            WidgetSandboxNative.tick(j10, ((float) (nanoTime - h0Var2.f52872k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        h0Var2.b();
                        return;
                    case 1:
                        h0 h0Var3 = this.f52841b;
                        synchronized (h0Var3.f52878q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.f52882u) {
                            if (f0Var != null) {
                                f0Var.f52848a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i10 = h0Var3.E) != 0 && Math.abs(f0Var.d - i10) > 1) {
                            f0Var.f52848a.c();
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
                            if (uVar.f52959e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                    int i11 = h.C;
                                    int i12 = uVar.f52970q;
                                    if (i11 != i12) {
                                        h.C = i12;
                                        h.B++;
                                        h.D = true;
                                        a8.b("widget " + uVar.f52956a + " stopped (" + h.B + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && uVar.f52961g != null && (h0Var = uVar.f52960f) != null) {
                                uVar.g(h0Var);
                                return;
                            } else if (uVar.e() && (h71Var = uVar.h) != null) {
                                g71 g71Var = h71Var.f34318a;
                                g71Var.j();
                                g71Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f52841b.b();
                        return;
                    default:
                        h0 h0Var4 = this.f52841b;
                        h0Var4.f52877p.set(true);
                        h0Var4.b();
                        return;
                }
            }
        };
        if (i3 >= 1 && i3 <= 4) {
            this.f52866c = context.getApplicationContext();
            this.d = str;
            this.f52886z = str2;
            str2.contains("\"dark\"");
            this.f52867e = i3;
            this.f52868f = str3 == null ? "en-US" : str3;
            this.f52869g = str4 == null ? "{}" : str4;
            this.f52871j = context.getResources().getDisplayMetrics().density;
            return;
        }
        throw new IllegalArgumentException("CPU multiplier must be 1..4");
    }

    public final void a(g gVar, g0[] g0VarArr, double d, int i3, int i10, float f10, float f11, int i11, int i12, int i13, m0 m0Var) {
        Object obj;
        boolean z10 = this.f52883w;
        Object obj2 = this.f52878q;
        synchronized (obj2) {
            try {
                try {
                    if (this.f52882u) {
                        gVar.c();
                        return;
                    }
                    f0 f0Var = this.G;
                    if (f0Var != null) {
                        f0Var.f52848a.c();
                    }
                    try {
                        this.G = new f0(gVar, g0VarArr, d, i3, i10, f10, f11, i11, i12, i13, m0Var, z10, this.f52885y);
                        if (!this.I) {
                            this.I = true;
                            this.f52864a.post(this.M);
                        }
                        this.f52879r = i10;
                        this.f52880s = true;
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

    public final void b() {
        if (!this.f52882u && this.f52881t != 0 && !this.B && !this.f52874m.get()) {
            if (!this.f52873l.get()) {
                if (this.D) {
                    if (!this.f52875n.get() && !this.f52876o.get() && !this.f52877p.get()) {
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

    public final void c(String str) {
        if (!this.f52882u && str != null && !str.equals(this.f52870i)) {
            this.f52870i = str;
            long j10 = this.f52881t;
            if (j10 != 0) {
                WidgetSandboxNative.safeArea(j10, str.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    public final void d(boolean z10) {
        if (!this.f52882u && this.D != z10) {
            this.D = z10;
            long j10 = this.f52881t;
            if (j10 != 0) {
                WidgetSandboxNative.visible(j10, z10);
            }
            if (z10) {
                b();
            }
        }
    }

    public final void e(final int i3) {
        final long j10;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.E == 0) {
                this.E = i3;
            }
            Trace.beginSection("WidgetSandbox:Create");
            try {
                try {
                    String absolutePath = z.a(this.f52866c).getAbsolutePath();
                    if (this.f52882u) {
                        Trace.endSection();
                        return;
                    }
                    final String str = this.f52870i;
                    String str2 = this.h;
                    if (str != null) {
                        str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                    }
                    Charset charset = StandardCharsets.UTF_8;
                    byte[] bytes = absolutePath.getBytes(charset);
                    byte[] bytes2 = this.d.getBytes(charset);
                    byte[] bytes3 = this.f52886z.getBytes(charset);
                    float f10 = this.f52871j;
                    j10 = WidgetSandboxNative.create(bytes, bytes2, bytes3, i3 / f10, f10, this.f52867e, this.f52868f.getBytes(charset), this.f52869g.getBytes(charset), str2.getBytes(charset), bd.M0(2131742877, null).getBytes(charset), this.D, this.f52865b);
                    try {
                        final String str3 = this.f52886z;
                        this.f52864a.post(new Runnable() {
                            @Override
                            public final void run() {
                                h0 h0Var = h0.this;
                                long j11 = j10;
                                int i10 = i3;
                                String str4 = str3;
                                String str5 = str;
                                if (h0Var.f52882u) {
                                    z.f53000a.execute(new a0(j11));
                                    return;
                                }
                                h0Var.f52881t = j11;
                                int i11 = h0Var.E;
                                if (i11 != i10 && i11 > 0) {
                                    WidgetSandboxNative.width(j11, i11 / h0Var.f52871j);
                                }
                                if (!h0Var.f52886z.equals(str4)) {
                                    WidgetSandboxNative.theme(j11, h0Var.f52886z.getBytes(StandardCharsets.UTF_8));
                                }
                                if (h0Var.f52870i != null && !h0Var.f52870i.equals(str5)) {
                                    WidgetSandboxNative.safeArea(j11, h0Var.f52870i.getBytes(StandardCharsets.UTF_8));
                                }
                                h0Var.A = true;
                                WidgetSandboxNative.visible(j11, h0Var.D);
                                h0Var.b();
                            }
                        });
                        Trace.endSection();
                    } catch (Exception e10) {
                        e = e10;
                        if (j10 != 0) {
                            z.f53000a.execute(new a0(j10));
                        }
                        this.f52864a.post(new hc1(17, this, e));
                        throw e;
                    }
                } catch (Exception e11) {
                    e = e11;
                    j10 = 0;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } else {
            throw new IllegalStateException("Start WidgetSandboxSession off UI");
        }
    }
}
