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
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.o71;
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
    public final Context f52801c;
    public final String d;
    public final int f52802e;
    public final String f52803f;
    public final String f52804g;
    public volatile String f52805i;
    public final float f52806j;
    public volatile int f52814r;
    public volatile boolean f52815s;
    public volatile long f52816t;
    public volatile boolean f52817u;
    public volatile boolean v;
    public volatile boolean f52818w;
    public volatile boolean f52819x;
    public volatile boolean f52820y;
    public String f52821z;
    public final Handler f52799a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f52800b = new WidgetSandboxBackend(this);
    public volatile String h = "{}";
    public final long f52807k = System.nanoTime();
    public final AtomicBoolean f52808l = new AtomicBoolean();
    public final AtomicBoolean f52809m = new AtomicBoolean();
    public final AtomicBoolean f52810n = new AtomicBoolean();
    public final AtomicBoolean f52811o = new AtomicBoolean();
    public final AtomicBoolean f52812p = new AtomicBoolean();
    public final Object f52813q = new Object();

    public h0(Context context, String str, String str2, int i7, String str3, String str4) {
        new JSONObject();
        this.M = new Runnable(this) {
            public final h0 f52776b;

            {
                this.f52776b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                o71 o71Var;
                h0 h0Var;
                m h;
                int i10;
                switch (r2) {
                    case 0:
                        h0 h0Var2 = this.f52776b;
                        long j3 = h0Var2.f52816t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22538r));
                        if (!h0Var2.f52817u && j3 != 0 && h0Var2.D && h0Var2.f52810n.get() && nanoTime - h0Var2.Q >= (max * 9) / 10 && h0Var2.f52809m.compareAndSet(false, true)) {
                            h0Var2.f52810n.set(false);
                            h0Var2.Q = nanoTime;
                            WidgetSandboxNative.tick(j3, ((float) (nanoTime - h0Var2.f52807k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        h0Var2.b();
                        return;
                    case 1:
                        h0 h0Var3 = this.f52776b;
                        synchronized (h0Var3.f52813q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.f52817u) {
                            if (f0Var != null) {
                                f0Var.f52783a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i10 = h0Var3.E) != 0 && Math.abs(f0Var.d - i10) > 1) {
                            f0Var.f52783a.c();
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
                            if (uVar.f52894e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                    int i11 = h.C;
                                    int i12 = uVar.f52905q;
                                    if (i11 != i12) {
                                        h.C = i12;
                                        h.B++;
                                        h.D = true;
                                        a8.b("widget " + uVar.f52891a + " stopped (" + h.B + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && uVar.f52896g != null && (h0Var = uVar.f52895f) != null) {
                                uVar.g(h0Var);
                                return;
                            } else if (uVar.e() && (o71Var = uVar.h) != null) {
                                n71 n71Var = o71Var.f36524a;
                                n71Var.j();
                                n71Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f52776b.b();
                        return;
                    default:
                        h0 h0Var4 = this.f52776b;
                        h0Var4.f52812p.set(true);
                        h0Var4.b();
                        return;
                }
            }
        };
        this.N = new Runnable(this) {
            public final h0 f52776b;

            {
                this.f52776b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                o71 o71Var;
                h0 h0Var;
                m h;
                int i10;
                switch (r2) {
                    case 0:
                        h0 h0Var2 = this.f52776b;
                        long j3 = h0Var2.f52816t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22538r));
                        if (!h0Var2.f52817u && j3 != 0 && h0Var2.D && h0Var2.f52810n.get() && nanoTime - h0Var2.Q >= (max * 9) / 10 && h0Var2.f52809m.compareAndSet(false, true)) {
                            h0Var2.f52810n.set(false);
                            h0Var2.Q = nanoTime;
                            WidgetSandboxNative.tick(j3, ((float) (nanoTime - h0Var2.f52807k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        h0Var2.b();
                        return;
                    case 1:
                        h0 h0Var3 = this.f52776b;
                        synchronized (h0Var3.f52813q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.f52817u) {
                            if (f0Var != null) {
                                f0Var.f52783a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i10 = h0Var3.E) != 0 && Math.abs(f0Var.d - i10) > 1) {
                            f0Var.f52783a.c();
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
                            if (uVar.f52894e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                    int i11 = h.C;
                                    int i12 = uVar.f52905q;
                                    if (i11 != i12) {
                                        h.C = i12;
                                        h.B++;
                                        h.D = true;
                                        a8.b("widget " + uVar.f52891a + " stopped (" + h.B + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && uVar.f52896g != null && (h0Var = uVar.f52895f) != null) {
                                uVar.g(h0Var);
                                return;
                            } else if (uVar.e() && (o71Var = uVar.h) != null) {
                                n71 n71Var = o71Var.f36524a;
                                n71Var.j();
                                n71Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f52776b.b();
                        return;
                    default:
                        h0 h0Var4 = this.f52776b;
                        h0Var4.f52812p.set(true);
                        h0Var4.b();
                        return;
                }
            }
        };
        this.O = new Runnable(this) {
            public final h0 f52776b;

            {
                this.f52776b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                o71 o71Var;
                h0 h0Var;
                m h;
                int i10;
                switch (r2) {
                    case 0:
                        h0 h0Var2 = this.f52776b;
                        long j3 = h0Var2.f52816t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22538r));
                        if (!h0Var2.f52817u && j3 != 0 && h0Var2.D && h0Var2.f52810n.get() && nanoTime - h0Var2.Q >= (max * 9) / 10 && h0Var2.f52809m.compareAndSet(false, true)) {
                            h0Var2.f52810n.set(false);
                            h0Var2.Q = nanoTime;
                            WidgetSandboxNative.tick(j3, ((float) (nanoTime - h0Var2.f52807k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        h0Var2.b();
                        return;
                    case 1:
                        h0 h0Var3 = this.f52776b;
                        synchronized (h0Var3.f52813q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.f52817u) {
                            if (f0Var != null) {
                                f0Var.f52783a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i10 = h0Var3.E) != 0 && Math.abs(f0Var.d - i10) > 1) {
                            f0Var.f52783a.c();
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
                            if (uVar.f52894e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                    int i11 = h.C;
                                    int i12 = uVar.f52905q;
                                    if (i11 != i12) {
                                        h.C = i12;
                                        h.B++;
                                        h.D = true;
                                        a8.b("widget " + uVar.f52891a + " stopped (" + h.B + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && uVar.f52896g != null && (h0Var = uVar.f52895f) != null) {
                                uVar.g(h0Var);
                                return;
                            } else if (uVar.e() && (o71Var = uVar.h) != null) {
                                n71 n71Var = o71Var.f36524a;
                                n71Var.j();
                                n71Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f52776b.b();
                        return;
                    default:
                        h0 h0Var4 = this.f52776b;
                        h0Var4.f52812p.set(true);
                        h0Var4.b();
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
                long j10 = h0Var.f52816t;
                if (!h0Var.f52817u && j10 != 0) {
                    boolean z10 = true;
                    if (h0Var.f52809m.compareAndSet(false, true)) {
                        if (h0Var.D && (h0Var.f52812p.getAndSet(false) | h0Var.f52811o.get())) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (!h0Var.D || !h0Var.f52810n.getAndSet(false)) {
                            z10 = false;
                        }
                        if (z10) {
                            h0Var.Q = j3;
                        }
                        WidgetSandboxNative.tick(j10, ((float) (j3 - h0Var.f52807k)) / 1000000.0f, z10, z9, h0Var.f52808l.getAndSet(false));
                    }
                }
            }
        };
        this.R = new Runnable(this) {
            public final h0 f52776b;

            {
                this.f52776b = this;
            }

            @Override
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                o71 o71Var;
                h0 h0Var;
                m h;
                int i10;
                switch (r2) {
                    case 0:
                        h0 h0Var2 = this.f52776b;
                        long j3 = h0Var2.f52816t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.f22538r));
                        if (!h0Var2.f52817u && j3 != 0 && h0Var2.D && h0Var2.f52810n.get() && nanoTime - h0Var2.Q >= (max * 9) / 10 && h0Var2.f52809m.compareAndSet(false, true)) {
                            h0Var2.f52810n.set(false);
                            h0Var2.Q = nanoTime;
                            WidgetSandboxNative.tick(j3, ((float) (nanoTime - h0Var2.f52807k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        h0Var2.b();
                        return;
                    case 1:
                        h0 h0Var3 = this.f52776b;
                        synchronized (h0Var3.f52813q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.f52817u) {
                            if (f0Var != null) {
                                f0Var.f52783a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i10 = h0Var3.E) != 0 && Math.abs(f0Var.d - i10) > 1) {
                            f0Var.f52783a.c();
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
                            if (uVar.f52894e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                    int i11 = h.C;
                                    int i12 = uVar.f52905q;
                                    if (i11 != i12) {
                                        h.C = i12;
                                        h.B++;
                                        h.D = true;
                                        a8.b("widget " + uVar.f52891a + " stopped (" + h.B + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && uVar.f52896g != null && (h0Var = uVar.f52895f) != null) {
                                uVar.g(h0Var);
                                return;
                            } else if (uVar.e() && (o71Var = uVar.h) != null) {
                                n71 n71Var = o71Var.f36524a;
                                n71Var.j();
                                n71Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f52776b.b();
                        return;
                    default:
                        h0 h0Var4 = this.f52776b;
                        h0Var4.f52812p.set(true);
                        h0Var4.b();
                        return;
                }
            }
        };
        if (i7 >= 1 && i7 <= 4) {
            this.f52801c = context.getApplicationContext();
            this.d = str;
            this.f52821z = str2;
            str2.contains("\"dark\"");
            this.f52802e = i7;
            this.f52803f = str3 == null ? "en-US" : str3;
            this.f52804g = str4 == null ? "{}" : str4;
            this.f52806j = context.getResources().getDisplayMetrics().density;
            return;
        }
        throw new IllegalArgumentException("CPU multiplier must be 1..4");
    }

    public final void a(g gVar, g0[] g0VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, m0 m0Var) {
        Object obj;
        boolean z9 = this.f52818w;
        Object obj2 = this.f52813q;
        synchronized (obj2) {
            try {
                try {
                    if (this.f52817u) {
                        gVar.c();
                        return;
                    }
                    f0 f0Var = this.G;
                    if (f0Var != null) {
                        f0Var.f52783a.c();
                    }
                    try {
                        this.G = new f0(gVar, g0VarArr, d, i7, i10, f10, f11, i11, i12, i13, m0Var, z9, this.f52820y);
                        if (!this.I) {
                            this.I = true;
                            this.f52799a.post(this.M);
                        }
                        this.f52814r = i10;
                        this.f52815s = true;
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
        if (!this.f52817u && this.f52816t != 0 && !this.B && !this.f52809m.get()) {
            if (!this.f52808l.get()) {
                if (this.D) {
                    if (!this.f52810n.get() && !this.f52811o.get() && !this.f52812p.get()) {
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
        if (!this.f52817u && str != null && !str.equals(this.f52805i)) {
            this.f52805i = str;
            long j3 = this.f52816t;
            if (j3 != 0) {
                WidgetSandboxNative.safeArea(j3, str.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    public final void d(boolean z9) {
        if (!this.f52817u && this.D != z9) {
            this.D = z9;
            long j3 = this.f52816t;
            if (j3 != 0) {
                WidgetSandboxNative.visible(j3, z9);
            }
            if (z9) {
                b();
            }
        }
    }

    public final void e(final int i7) {
        final long j3;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.E == 0) {
                this.E = i7;
            }
            Trace.beginSection("WidgetSandbox:Create");
            try {
                try {
                    String absolutePath = z.a(this.f52801c).getAbsolutePath();
                    if (this.f52817u) {
                        Trace.endSection();
                        return;
                    }
                    final String str = this.f52805i;
                    String str2 = this.h;
                    if (str != null) {
                        str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                    }
                    Charset charset = StandardCharsets.UTF_8;
                    byte[] bytes = absolutePath.getBytes(charset);
                    byte[] bytes2 = this.d.getBytes(charset);
                    byte[] bytes3 = this.f52821z.getBytes(charset);
                    float f10 = this.f52806j;
                    j3 = WidgetSandboxNative.create(bytes, bytes2, bytes3, i7 / f10, f10, this.f52802e, this.f52803f.getBytes(charset), this.f52804g.getBytes(charset), str2.getBytes(charset), hd.M0(2131742868, null).getBytes(charset), this.D, this.f52800b);
                    try {
                        final String str3 = this.f52821z;
                        this.f52799a.post(new Runnable() {
                            @Override
                            public final void run() {
                                h0 h0Var = h0.this;
                                long j10 = j3;
                                int i10 = i7;
                                String str4 = str3;
                                String str5 = str;
                                if (h0Var.f52817u) {
                                    z.f52935a.execute(new a0(j10));
                                    return;
                                }
                                h0Var.f52816t = j10;
                                int i11 = h0Var.E;
                                if (i11 != i10 && i11 > 0) {
                                    WidgetSandboxNative.width(j10, i11 / h0Var.f52806j);
                                }
                                if (!h0Var.f52821z.equals(str4)) {
                                    WidgetSandboxNative.theme(j10, h0Var.f52821z.getBytes(StandardCharsets.UTF_8));
                                }
                                if (h0Var.f52805i != null && !h0Var.f52805i.equals(str5)) {
                                    WidgetSandboxNative.safeArea(j10, h0Var.f52805i.getBytes(StandardCharsets.UTF_8));
                                }
                                h0Var.A = true;
                                WidgetSandboxNative.visible(j10, h0Var.D);
                                h0Var.b();
                            }
                        });
                        Trace.endSection();
                    } catch (Exception e10) {
                        e = e10;
                        if (j3 != 0) {
                            z.f52935a.execute(new a0(j3));
                        }
                        this.f52799a.post(new org.telegram.ui.web.w(12, this, e));
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
            throw new IllegalStateException("Start WidgetSandboxSession off UI");
        }
    }
}
