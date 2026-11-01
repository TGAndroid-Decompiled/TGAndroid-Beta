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
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.r81;
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
    public final Context f44381c;
    public final String d;
    public final int e;
    public final String f44382f;
    public final String f44383g;
    public volatile String f44384i;
    public final float f44385j;
    public volatile int f44393r;
    public volatile boolean f44394s;
    public volatile long f44395t;
    public volatile boolean f44396u;
    public volatile boolean v;
    public volatile boolean f44397w;
    public volatile boolean f44398x;
    public volatile boolean f44399y;
    public String f44400z;
    public final Handler f44379a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f44380b = new WidgetSandboxBackend(this);
    public volatile String h = "{}";
    public final long f44386k = System.nanoTime();
    public final AtomicBoolean f44387l = new AtomicBoolean();
    public final AtomicBoolean f44388m = new AtomicBoolean();
    public final AtomicBoolean f44389n = new AtomicBoolean();
    public final AtomicBoolean f44390o = new AtomicBoolean();
    public final AtomicBoolean f44391p = new AtomicBoolean();
    public final Object f44392q = new Object();

    public k0(Context context, String str, String str2, int i10, String str3, String str4) {
        new JSONObject();
        this.N = new Runnable(this) {
            public final k0 f44356b;

            {
                this.f44356b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                JSONObject jSONObject;
                w wVar;
                r81 r81Var;
                k0 k0Var;
                m h;
                int i11;
                switch (r2) {
                    case 0:
                        k0 k0Var2 = this.f44356b;
                        long j10 = k0Var2.f44395t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.i0.f16173r));
                        if (!k0Var2.f44396u && j10 != 0 && k0Var2.D && k0Var2.f44389n.get() && nanoTime - k0Var2.R >= (max * 9) / 10 && k0Var2.f44388m.compareAndSet(false, true)) {
                            k0Var2.f44389n.set(false);
                            k0Var2.R = nanoTime;
                            WidgetSandboxNative.tick(j10, ((float) (nanoTime - k0Var2.f44386k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        k0Var2.b();
                        return;
                    case 1:
                        k0 k0Var3 = this.f44356b;
                        synchronized (k0Var3.f44392q) {
                            i0Var = k0Var3.G;
                            k0Var3.G = null;
                            jSONObject = k0Var3.H;
                            k0Var3.H = null;
                            k0Var3.I = false;
                        }
                        if (k0Var3.f44396u) {
                            if (i0Var != null) {
                                i0Var.f44364a.c();
                                return;
                            }
                            return;
                        }
                        if (i0Var != null && (i11 = k0Var3.E) != 0 && Math.abs(i0Var.d - i11) > 1) {
                            i0Var.f44364a.c();
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
                                    int i13 = wVar.f44475q;
                                    if (i12 != i13) {
                                        h.D = i13;
                                        h.C++;
                                        h.E = true;
                                        f8.b("widget " + wVar.f44462a + " stopped (" + h.C + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && wVar.f44466g != null && (k0Var = wVar.f44465f) != null) {
                                wVar.g(k0Var);
                                return;
                            } else if (wVar.e() && (r81Var = wVar.h) != null) {
                                q81 q81Var = r81Var.f29940a;
                                q81Var.j();
                                q81Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f44356b.b();
                        return;
                    default:
                        k0 k0Var4 = this.f44356b;
                        k0Var4.f44391p.set(true);
                        k0Var4.b();
                        return;
                }
            }
        };
        this.O = new Runnable(this) {
            public final k0 f44356b;

            {
                this.f44356b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                JSONObject jSONObject;
                w wVar;
                r81 r81Var;
                k0 k0Var;
                m h;
                int i11;
                switch (r2) {
                    case 0:
                        k0 k0Var2 = this.f44356b;
                        long j10 = k0Var2.f44395t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.i0.f16173r));
                        if (!k0Var2.f44396u && j10 != 0 && k0Var2.D && k0Var2.f44389n.get() && nanoTime - k0Var2.R >= (max * 9) / 10 && k0Var2.f44388m.compareAndSet(false, true)) {
                            k0Var2.f44389n.set(false);
                            k0Var2.R = nanoTime;
                            WidgetSandboxNative.tick(j10, ((float) (nanoTime - k0Var2.f44386k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        k0Var2.b();
                        return;
                    case 1:
                        k0 k0Var3 = this.f44356b;
                        synchronized (k0Var3.f44392q) {
                            i0Var = k0Var3.G;
                            k0Var3.G = null;
                            jSONObject = k0Var3.H;
                            k0Var3.H = null;
                            k0Var3.I = false;
                        }
                        if (k0Var3.f44396u) {
                            if (i0Var != null) {
                                i0Var.f44364a.c();
                                return;
                            }
                            return;
                        }
                        if (i0Var != null && (i11 = k0Var3.E) != 0 && Math.abs(i0Var.d - i11) > 1) {
                            i0Var.f44364a.c();
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
                                    int i13 = wVar.f44475q;
                                    if (i12 != i13) {
                                        h.D = i13;
                                        h.C++;
                                        h.E = true;
                                        f8.b("widget " + wVar.f44462a + " stopped (" + h.C + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && wVar.f44466g != null && (k0Var = wVar.f44465f) != null) {
                                wVar.g(k0Var);
                                return;
                            } else if (wVar.e() && (r81Var = wVar.h) != null) {
                                q81 q81Var = r81Var.f29940a;
                                q81Var.j();
                                q81Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f44356b.b();
                        return;
                    default:
                        k0 k0Var4 = this.f44356b;
                        k0Var4.f44391p.set(true);
                        k0Var4.b();
                        return;
                }
            }
        };
        this.P = new Runnable(this) {
            public final k0 f44356b;

            {
                this.f44356b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                JSONObject jSONObject;
                w wVar;
                r81 r81Var;
                k0 k0Var;
                m h;
                int i11;
                switch (r2) {
                    case 0:
                        k0 k0Var2 = this.f44356b;
                        long j10 = k0Var2.f44395t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.i0.f16173r));
                        if (!k0Var2.f44396u && j10 != 0 && k0Var2.D && k0Var2.f44389n.get() && nanoTime - k0Var2.R >= (max * 9) / 10 && k0Var2.f44388m.compareAndSet(false, true)) {
                            k0Var2.f44389n.set(false);
                            k0Var2.R = nanoTime;
                            WidgetSandboxNative.tick(j10, ((float) (nanoTime - k0Var2.f44386k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        k0Var2.b();
                        return;
                    case 1:
                        k0 k0Var3 = this.f44356b;
                        synchronized (k0Var3.f44392q) {
                            i0Var = k0Var3.G;
                            k0Var3.G = null;
                            jSONObject = k0Var3.H;
                            k0Var3.H = null;
                            k0Var3.I = false;
                        }
                        if (k0Var3.f44396u) {
                            if (i0Var != null) {
                                i0Var.f44364a.c();
                                return;
                            }
                            return;
                        }
                        if (i0Var != null && (i11 = k0Var3.E) != 0 && Math.abs(i0Var.d - i11) > 1) {
                            i0Var.f44364a.c();
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
                                    int i13 = wVar.f44475q;
                                    if (i12 != i13) {
                                        h.D = i13;
                                        h.C++;
                                        h.E = true;
                                        f8.b("widget " + wVar.f44462a + " stopped (" + h.C + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && wVar.f44466g != null && (k0Var = wVar.f44465f) != null) {
                                wVar.g(k0Var);
                                return;
                            } else if (wVar.e() && (r81Var = wVar.h) != null) {
                                q81 q81Var = r81Var.f29940a;
                                q81Var.j();
                                q81Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f44356b.b();
                        return;
                    default:
                        k0 k0Var4 = this.f44356b;
                        k0Var4.f44391p.set(true);
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
                long j11 = k0Var.f44395t;
                if (!k0Var.f44396u && j11 != 0) {
                    boolean z11 = true;
                    if (k0Var.f44388m.compareAndSet(false, true)) {
                        if (k0Var.D && (k0Var.f44391p.getAndSet(false) | k0Var.f44390o.get())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!k0Var.D || !k0Var.f44389n.getAndSet(false)) {
                            z11 = false;
                        }
                        if (z11) {
                            k0Var.R = j10;
                        }
                        WidgetSandboxNative.tick(j11, ((float) (j10 - k0Var.f44386k)) / 1000000.0f, z11, z10, k0Var.f44387l.getAndSet(false));
                    }
                }
            }
        };
        this.S = new Runnable(this) {
            public final k0 f44356b;

            {
                this.f44356b = this;
            }

            @Override
            public final void run() {
                i0 i0Var;
                JSONObject jSONObject;
                w wVar;
                r81 r81Var;
                k0 k0Var;
                m h;
                int i11;
                switch (r2) {
                    case 0:
                        k0 k0Var2 = this.f44356b;
                        long j10 = k0Var2.f44395t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.i0.f16173r));
                        if (!k0Var2.f44396u && j10 != 0 && k0Var2.D && k0Var2.f44389n.get() && nanoTime - k0Var2.R >= (max * 9) / 10 && k0Var2.f44388m.compareAndSet(false, true)) {
                            k0Var2.f44389n.set(false);
                            k0Var2.R = nanoTime;
                            WidgetSandboxNative.tick(j10, ((float) (nanoTime - k0Var2.f44386k)) / 1000000.0f, true, false, false);
                            return;
                        }
                        k0Var2.b();
                        return;
                    case 1:
                        k0 k0Var3 = this.f44356b;
                        synchronized (k0Var3.f44392q) {
                            i0Var = k0Var3.G;
                            k0Var3.G = null;
                            jSONObject = k0Var3.H;
                            k0Var3.H = null;
                            k0Var3.I = false;
                        }
                        if (k0Var3.f44396u) {
                            if (i0Var != null) {
                                i0Var.f44364a.c();
                                return;
                            }
                            return;
                        }
                        if (i0Var != null && (i11 = k0Var3.E) != 0 && Math.abs(i0Var.d - i11) > 1) {
                            i0Var.f44364a.c();
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
                                    int i13 = wVar.f44475q;
                                    if (i12 != i13) {
                                        h.D = i13;
                                        h.C++;
                                        h.E = true;
                                        f8.b("widget " + wVar.f44462a + " stopped (" + h.C + "): " + optString);
                                        p.a(h);
                                        p.b();
                                    }
                                }
                            }
                            if (jSONObject.optBoolean("loaded") && wVar.f44466g != null && (k0Var = wVar.f44465f) != null) {
                                wVar.g(k0Var);
                                return;
                            } else if (wVar.e() && (r81Var = wVar.h) != null) {
                                q81 q81Var = r81Var.f29940a;
                                q81Var.j();
                                q81Var.h();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 2:
                        this.f44356b.b();
                        return;
                    default:
                        k0 k0Var4 = this.f44356b;
                        k0Var4.f44391p.set(true);
                        k0Var4.b();
                        return;
                }
            }
        };
        if (i10 >= 1 && i10 <= 4) {
            this.f44381c = context.getApplicationContext();
            this.d = str;
            this.f44400z = str2;
            str2.contains("\"dark\"");
            this.e = i10;
            this.f44382f = str3 == null ? "en-US" : str3;
            this.f44383g = str4 == null ? "{}" : str4;
            this.f44385j = context.getResources().getDisplayMetrics().density;
            return;
        }
        throw new IllegalArgumentException("CPU multiplier must be 1..4");
    }

    public final void a(g gVar, j0[] j0VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, q0 q0Var) {
        Object obj;
        boolean z10 = this.f44397w;
        Object obj2 = this.f44392q;
        synchronized (obj2) {
            try {
                try {
                    if (this.f44396u) {
                        gVar.c();
                        return;
                    }
                    i0 i0Var = this.G;
                    if (i0Var != null) {
                        i0Var.f44364a.c();
                    }
                    try {
                        this.G = new i0(gVar, j0VarArr, d, i10, i11, f7, f10, i12, i13, i14, q0Var, z10, this.f44399y);
                        if (!this.I) {
                            this.I = true;
                            this.f44379a.post(this.N);
                        }
                        this.f44393r = i11;
                        this.f44394s = true;
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
        if (!this.f44396u && this.f44395t != 0 && !this.B && !this.f44388m.get()) {
            if (!this.f44387l.get()) {
                if (this.D) {
                    if (!this.f44389n.get() && !this.f44390o.get() && !this.f44391p.get()) {
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
        if (!this.f44396u && str != null && !str.equals(this.f44384i)) {
            this.f44384i = str;
            long j10 = this.f44395t;
            if (j10 != 0) {
                WidgetSandboxNative.safeArea(j10, str.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    public final void d(boolean z10) {
        if (!this.f44396u && this.D != z10) {
            this.D = z10;
            long j10 = this.f44395t;
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
                    String absolutePath = b0.a(this.f44381c).getAbsolutePath();
                    if (this.f44396u) {
                        Trace.endSection();
                        return;
                    }
                    final String str = this.f44384i;
                    String str2 = this.h;
                    if (str != null) {
                        str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                    }
                    Charset charset = StandardCharsets.UTF_8;
                    byte[] bytes = absolutePath.getBytes(charset);
                    byte[] bytes2 = this.d.getBytes(charset);
                    byte[] bytes3 = this.f44400z.getBytes(charset);
                    float f7 = this.f44385j;
                    j10 = WidgetSandboxNative.create(bytes, bytes2, bytes3, i10 / f7, f7, this.e, this.f44382f.getBytes(charset), this.f44383g.getBytes(charset), str2.getBytes(charset), dd.L0(2131742892, null).getBytes(charset), this.D, this.f44380b);
                    try {
                        final String str3 = this.f44400z;
                        this.f44379a.post(new Runnable() {
                            @Override
                            public final void run() {
                                k0 k0Var = k0.this;
                                long j11 = j10;
                                int i11 = i10;
                                String str4 = str3;
                                String str5 = str;
                                if (k0Var.f44396u) {
                                    b0.f44319a.execute(new d0(j11));
                                    return;
                                }
                                k0Var.f44395t = j11;
                                int i12 = k0Var.E;
                                if (i12 != i11 && i12 > 0) {
                                    WidgetSandboxNative.width(j11, i12 / k0Var.f44385j);
                                }
                                if (!k0Var.f44400z.equals(str4)) {
                                    WidgetSandboxNative.theme(j11, k0Var.f44400z.getBytes(StandardCharsets.UTF_8));
                                }
                                if (k0Var.f44384i != null && !k0Var.f44384i.equals(str5)) {
                                    WidgetSandboxNative.safeArea(j11, k0Var.f44384i.getBytes(StandardCharsets.UTF_8));
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
                            b0.f44319a.execute(new d0(j10));
                        }
                        this.f44379a.post(new v1(6, this, e));
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
