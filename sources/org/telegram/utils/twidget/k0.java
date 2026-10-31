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
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.q81;
import org.telegram.ui.web.v1;
public final class k0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public int E;
    public i0 F;
    public i0 G;
    public JSONObject H;
    public boolean I;
    public w J;
    public float[] K;
    public w L;
    public String M;
    public final g0 N;
    public final g0 O;
    public final g0 P;
    public final f0 Q;
    public long R;
    public final g0 S;
    public final Context f44370c;
    public final String d;
    public final int e;
    public final String f44371f;
    public final String f44372g;
    public volatile String f44373i;
    public final float f44374j;
    public volatile int f44382r;
    public volatile boolean f44383s;
    public volatile long f44384t;
    public volatile boolean f44385u;
    public volatile boolean v;
    public volatile boolean f44386w;
    public volatile boolean f44387x;
    public volatile boolean f44388y;
    public String f44389z;
    public final Handler f44368a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f44369b = new WidgetSandboxBackend(this);
    public volatile String h = "{}";
    public final long f44375k = System.nanoTime();
    public final AtomicBoolean f44376l = new AtomicBoolean();
    public final AtomicBoolean f44377m = new AtomicBoolean();
    public final AtomicBoolean f44378n = new AtomicBoolean();
    public final AtomicBoolean f44379o = new AtomicBoolean();
    public final AtomicBoolean f44380p = new AtomicBoolean();
    public final Object f44381q = new Object();

    public k0(Context context, String str, String str2, int i10, String str3, String str4) {
        new JSONObject();
        this.N = new Runnable(this) {
            public final k0 f44345b;

            {
                this.f44345b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                JSONObject jSONObject;
                w wVar;
                q81 q81Var;
                k0 k0Var;
                m h;
                int i11;
                switch (r2) {
                    case 0:
                        k0 k0Var2 = this.f44345b;
                        long j10 = k0Var2.f44384t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.i0.f16027r));
                        if (!k0Var2.f44385u && j10 != 0 && k0Var2.D && k0Var2.f44378n.get() && nanoTime - k0Var2.R >= (max * 9) / 10 && k0Var2.f44377m.compareAndSet(false, true)) {
                            k0Var2.f44378n.set(false);
                            k0Var2.R = nanoTime;
                            WidgetSandboxNative.tick(j10, ((float) (nanoTime - k0Var2.f44375k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        k0Var2.b();
                        return;
                    case 1:
                        k0 k0Var3 = this.f44345b;
                        synchronized (k0Var3.f44381q) {
                            i0Var = k0Var3.G;
                            k0Var3.G = null;
                            jSONObject = k0Var3.H;
                            k0Var3.H = null;
                            k0Var3.I = false;
                        }
                        if (k0Var3.f44385u) {
                            if (i0Var != null) {
                                i0Var.f44353a.c();
                                return;
                            }
                            return;
                        }
                        if (i0Var != null && (i11 = k0Var3.E) != 0 && Math.abs(i0Var.d - i11) > 1) {
                            i0Var.f44353a.c();
                            k0Var3.C = false;
                            i0Var = null;
                        }
                        if (i0Var != null) {
                            k0Var3.F = i0Var;
                            k0Var3.C = false;
                            w wVar2 = k0Var3.J;
                            if (wVar2 != null) {
                                wVar2.g(k0Var3);
                            }
                        }
                        if (jSONObject != null && (wVar = k0Var3.J) != null) {
                            if (wVar.e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(wVar)) != null) {
                                    int i12 = h.D;
                                    int i13 = wVar.f44464q;
                                    if (i12 != i13) {
                                        h.D = i13;
                                        h.C++;
                                        h.E = true;
                                        f8.b("widget " + wVar.f44451a + " stopped (" + h.C + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && wVar.f44455g != null && (k0Var = wVar.f44454f) != null) {
                                wVar.g(k0Var);
                                return;
                            } else if (wVar.e() && (q81Var = wVar.h) != null) {
                                p81 p81Var = q81Var.f29578a;
                                p81Var.j();
                                p81Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f44345b.b();
                        return;
                    default:
                        k0 k0Var4 = this.f44345b;
                        k0Var4.f44380p.set(true);
                        k0Var4.b();
                        return;
                }
            }
        };
        this.O = new Runnable(this) {
            public final k0 f44345b;

            {
                this.f44345b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                JSONObject jSONObject;
                w wVar;
                q81 q81Var;
                k0 k0Var;
                m h;
                int i11;
                switch (r2) {
                    case 0:
                        k0 k0Var2 = this.f44345b;
                        long j10 = k0Var2.f44384t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.i0.f16027r));
                        if (!k0Var2.f44385u && j10 != 0 && k0Var2.D && k0Var2.f44378n.get() && nanoTime - k0Var2.R >= (max * 9) / 10 && k0Var2.f44377m.compareAndSet(false, true)) {
                            k0Var2.f44378n.set(false);
                            k0Var2.R = nanoTime;
                            WidgetSandboxNative.tick(j10, ((float) (nanoTime - k0Var2.f44375k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        k0Var2.b();
                        return;
                    case 1:
                        k0 k0Var3 = this.f44345b;
                        synchronized (k0Var3.f44381q) {
                            i0Var = k0Var3.G;
                            k0Var3.G = null;
                            jSONObject = k0Var3.H;
                            k0Var3.H = null;
                            k0Var3.I = false;
                        }
                        if (k0Var3.f44385u) {
                            if (i0Var != null) {
                                i0Var.f44353a.c();
                                return;
                            }
                            return;
                        }
                        if (i0Var != null && (i11 = k0Var3.E) != 0 && Math.abs(i0Var.d - i11) > 1) {
                            i0Var.f44353a.c();
                            k0Var3.C = false;
                            i0Var = null;
                        }
                        if (i0Var != null) {
                            k0Var3.F = i0Var;
                            k0Var3.C = false;
                            w wVar2 = k0Var3.J;
                            if (wVar2 != null) {
                                wVar2.g(k0Var3);
                            }
                        }
                        if (jSONObject != null && (wVar = k0Var3.J) != null) {
                            if (wVar.e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(wVar)) != null) {
                                    int i12 = h.D;
                                    int i13 = wVar.f44464q;
                                    if (i12 != i13) {
                                        h.D = i13;
                                        h.C++;
                                        h.E = true;
                                        f8.b("widget " + wVar.f44451a + " stopped (" + h.C + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && wVar.f44455g != null && (k0Var = wVar.f44454f) != null) {
                                wVar.g(k0Var);
                                return;
                            } else if (wVar.e() && (q81Var = wVar.h) != null) {
                                p81 p81Var = q81Var.f29578a;
                                p81Var.j();
                                p81Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f44345b.b();
                        return;
                    default:
                        k0 k0Var4 = this.f44345b;
                        k0Var4.f44380p.set(true);
                        k0Var4.b();
                        return;
                }
            }
        };
        this.P = new Runnable(this) {
            public final k0 f44345b;

            {
                this.f44345b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                JSONObject jSONObject;
                w wVar;
                q81 q81Var;
                k0 k0Var;
                m h;
                int i11;
                switch (r2) {
                    case 0:
                        k0 k0Var2 = this.f44345b;
                        long j10 = k0Var2.f44384t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.i0.f16027r));
                        if (!k0Var2.f44385u && j10 != 0 && k0Var2.D && k0Var2.f44378n.get() && nanoTime - k0Var2.R >= (max * 9) / 10 && k0Var2.f44377m.compareAndSet(false, true)) {
                            k0Var2.f44378n.set(false);
                            k0Var2.R = nanoTime;
                            WidgetSandboxNative.tick(j10, ((float) (nanoTime - k0Var2.f44375k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        k0Var2.b();
                        return;
                    case 1:
                        k0 k0Var3 = this.f44345b;
                        synchronized (k0Var3.f44381q) {
                            i0Var = k0Var3.G;
                            k0Var3.G = null;
                            jSONObject = k0Var3.H;
                            k0Var3.H = null;
                            k0Var3.I = false;
                        }
                        if (k0Var3.f44385u) {
                            if (i0Var != null) {
                                i0Var.f44353a.c();
                                return;
                            }
                            return;
                        }
                        if (i0Var != null && (i11 = k0Var3.E) != 0 && Math.abs(i0Var.d - i11) > 1) {
                            i0Var.f44353a.c();
                            k0Var3.C = false;
                            i0Var = null;
                        }
                        if (i0Var != null) {
                            k0Var3.F = i0Var;
                            k0Var3.C = false;
                            w wVar2 = k0Var3.J;
                            if (wVar2 != null) {
                                wVar2.g(k0Var3);
                            }
                        }
                        if (jSONObject != null && (wVar = k0Var3.J) != null) {
                            if (wVar.e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(wVar)) != null) {
                                    int i12 = h.D;
                                    int i13 = wVar.f44464q;
                                    if (i12 != i13) {
                                        h.D = i13;
                                        h.C++;
                                        h.E = true;
                                        f8.b("widget " + wVar.f44451a + " stopped (" + h.C + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && wVar.f44455g != null && (k0Var = wVar.f44454f) != null) {
                                wVar.g(k0Var);
                                return;
                            } else if (wVar.e() && (q81Var = wVar.h) != null) {
                                p81 p81Var = q81Var.f29578a;
                                p81Var.j();
                                p81Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f44345b.b();
                        return;
                    default:
                        k0 k0Var4 = this.f44345b;
                        k0Var4.f44380p.set(true);
                        k0Var4.b();
                        return;
                }
            }
        };
        this.Q = new Choreographer.FrameCallback() {
            @Override
            public final void doFrame(long j10) {
                boolean z10;
                k0 k0Var = k0.this;
                k0Var.B = false;
                long j11 = k0Var.f44384t;
                if (!k0Var.f44385u && j11 != 0) {
                    boolean z11 = true;
                    if (k0Var.f44377m.compareAndSet(false, true)) {
                        if (k0Var.D && (k0Var.f44380p.getAndSet(false) | k0Var.f44379o.get())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!k0Var.D || !k0Var.f44378n.getAndSet(false)) {
                            z11 = false;
                        }
                        if (z11) {
                            k0Var.R = j10;
                        }
                        WidgetSandboxNative.tick(j11, ((float) (j10 - k0Var.f44375k)) / 1000000.0f, z11, z10, k0Var.f44376l.getAndSet(false));
                    }
                }
            }
        };
        this.S = new Runnable(this) {
            public final k0 f44345b;

            {
                this.f44345b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                JSONObject jSONObject;
                w wVar;
                q81 q81Var;
                k0 k0Var;
                m h;
                int i11;
                switch (r2) {
                    case 0:
                        k0 k0Var2 = this.f44345b;
                        long j10 = k0Var2.f44384t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.i0.f16027r));
                        if (!k0Var2.f44385u && j10 != 0 && k0Var2.D && k0Var2.f44378n.get() && nanoTime - k0Var2.R >= (max * 9) / 10 && k0Var2.f44377m.compareAndSet(false, true)) {
                            k0Var2.f44378n.set(false);
                            k0Var2.R = nanoTime;
                            WidgetSandboxNative.tick(j10, ((float) (nanoTime - k0Var2.f44375k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        k0Var2.b();
                        return;
                    case 1:
                        k0 k0Var3 = this.f44345b;
                        synchronized (k0Var3.f44381q) {
                            i0Var = k0Var3.G;
                            k0Var3.G = null;
                            jSONObject = k0Var3.H;
                            k0Var3.H = null;
                            k0Var3.I = false;
                        }
                        if (k0Var3.f44385u) {
                            if (i0Var != null) {
                                i0Var.f44353a.c();
                                return;
                            }
                            return;
                        }
                        if (i0Var != null && (i11 = k0Var3.E) != 0 && Math.abs(i0Var.d - i11) > 1) {
                            i0Var.f44353a.c();
                            k0Var3.C = false;
                            i0Var = null;
                        }
                        if (i0Var != null) {
                            k0Var3.F = i0Var;
                            k0Var3.C = false;
                            w wVar2 = k0Var3.J;
                            if (wVar2 != null) {
                                wVar2.g(k0Var3);
                            }
                        }
                        if (jSONObject != null && (wVar = k0Var3.J) != null) {
                            if (wVar.e != null) {
                                String optString = jSONObject.optString("dead");
                                if (!TextUtils.isEmpty(optString) && (h = p.h(wVar)) != null) {
                                    int i12 = h.D;
                                    int i13 = wVar.f44464q;
                                    if (i12 != i13) {
                                        h.D = i13;
                                        h.C++;
                                        h.E = true;
                                        f8.b("widget " + wVar.f44451a + " stopped (" + h.C + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && wVar.f44455g != null && (k0Var = wVar.f44454f) != null) {
                                wVar.g(k0Var);
                                return;
                            } else if (wVar.e() && (q81Var = wVar.h) != null) {
                                p81 p81Var = q81Var.f29578a;
                                p81Var.j();
                                p81Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f44345b.b();
                        return;
                    default:
                        k0 k0Var4 = this.f44345b;
                        k0Var4.f44380p.set(true);
                        k0Var4.b();
                        return;
                }
            }
        };
        if (i10 >= 1 && i10 <= 4) {
            this.f44370c = context.getApplicationContext();
            this.d = str;
            this.f44389z = str2;
            str2.contains("\"dark\"");
            this.e = i10;
            this.f44371f = str3 == null ? "en-US" : str3;
            this.f44372g = str4 == null ? "{}" : str4;
            this.f44374j = context.getResources().getDisplayMetrics().density;
            return;
        }
        throw new IllegalArgumentException("CPU multiplier must be 1..4");
    }

    public final void a(g gVar, j0[] j0VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, q0 q0Var) {
        Object obj;
        boolean z10 = this.f44386w;
        Object obj2 = this.f44381q;
        synchronized (obj2) {
            try {
                try {
                    if (this.f44385u) {
                        gVar.c();
                        return;
                    }
                    i0 i0Var = this.G;
                    if (i0Var != null) {
                        i0Var.f44353a.c();
                    }
                    try {
                        this.G = new i0(gVar, j0VarArr, d, i10, i11, f7, f10, i12, i13, i14, q0Var, z10, this.f44388y);
                        if (!this.I) {
                            this.I = true;
                            this.f44368a.post(this.N);
                        }
                        this.f44382r = i11;
                        this.f44383s = true;
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
        if (!this.f44385u && this.f44384t != 0 && !this.B && !this.f44377m.get()) {
            if (!this.f44376l.get()) {
                if (this.D) {
                    if (!this.f44378n.get() && !this.f44379o.get() && !this.f44380p.get()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.B = true;
            Choreographer.getInstance().postFrameCallback(this.Q);
        }
    }

    public final void c(String str) {
        if (!this.f44385u && str != null && !str.equals(this.f44373i)) {
            this.f44373i = str;
            long j10 = this.f44384t;
            if (j10 != 0) {
                WidgetSandboxNative.safeArea(j10, str.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    public final void d(boolean z10) {
        if (!this.f44385u && this.D != z10) {
            this.D = z10;
            long j10 = this.f44384t;
            if (j10 != 0) {
                WidgetSandboxNative.visible(j10, z10);
            }
            if (z10) {
                b();
            }
        }
    }

    public final void e(final int i10) {
        final long j10;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.E == 0) {
                this.E = i10;
            }
            Trace.beginSection("WidgetSandbox:Create");
            try {
                try {
                    String absolutePath = b0.a(this.f44370c).getAbsolutePath();
                    if (this.f44385u) {
                        Trace.endSection();
                        return;
                    }
                    final String str = this.f44373i;
                    String str2 = this.h;
                    if (str != null) {
                        str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                    }
                    Charset charset = StandardCharsets.UTF_8;
                    byte[] bytes = absolutePath.getBytes(charset);
                    byte[] bytes2 = this.d.getBytes(charset);
                    byte[] bytes3 = this.f44389z.getBytes(charset);
                    float f7 = this.f44374j;
                    j10 = WidgetSandboxNative.create(bytes, bytes2, bytes3, i10 / f7, f7, this.e, this.f44371f.getBytes(charset), this.f44372g.getBytes(charset), str2.getBytes(charset), cd.L0(2131742892, null).getBytes(charset), this.D, this.f44369b);
                    try {
                        final String str3 = this.f44389z;
                        this.f44368a.post(new Runnable() {
                            @Override
                            public final void run() {
                                k0 k0Var = k0.this;
                                long j11 = j10;
                                int i11 = i10;
                                String str4 = str3;
                                String str5 = str;
                                if (k0Var.f44385u) {
                                    b0.f44315a.execute(new d0(j11));
                                    return;
                                }
                                k0Var.f44384t = j11;
                                int i12 = k0Var.E;
                                if (i12 != i11 && i12 > 0) {
                                    WidgetSandboxNative.width(j11, i12 / k0Var.f44374j);
                                }
                                if (!k0Var.f44389z.equals(str4)) {
                                    WidgetSandboxNative.theme(j11, k0Var.f44389z.getBytes(StandardCharsets.UTF_8));
                                }
                                if (k0Var.f44373i != null && !k0Var.f44373i.equals(str5)) {
                                    WidgetSandboxNative.safeArea(j11, k0Var.f44373i.getBytes(StandardCharsets.UTF_8));
                                }
                                k0Var.A = true;
                                WidgetSandboxNative.visible(j11, k0Var.D);
                                k0Var.b();
                            }
                        });
                        Trace.endSection();
                    } catch (Exception e) {
                        e = e;
                        if (j10 != 0) {
                            b0.f44315a.execute(new d0(j10));
                        }
                        this.f44368a.post(new v1(5, this, e));
                        throw e;
                    }
                } catch (Exception e7) {
                    e = e7;
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
