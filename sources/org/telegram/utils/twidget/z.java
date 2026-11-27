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
public final class z {
    public static boolean g0;
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
    public a1d N;
    public a1d O;
    public JSONObject P;
    public boolean Q;
    public q0d R;
    public float[] S;
    public q0d T;
    public String U;
    public long Z;
    public boolean a0;
    public long c0;
    public final Context e;
    public volatile boolean e0;
    public final String f;
    public boolean f0;
    public final boolean g;
    public final String h;
    public final String i;
    public volatile String k;
    public final float l;
    public volatile int t;
    public volatile boolean u;
    public volatile long v;
    public volatile float x;
    public volatile long z;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend b = new WidgetSandboxBackend(this);
    public final b c = x.v;
    public volatile e0d d = new e0d(null);
    public volatile String j = "{}";
    public final long m = System.nanoTime();
    public final AtomicBoolean n = new AtomicBoolean();
    public final AtomicBoolean o = new AtomicBoolean();
    public final AtomicBoolean p = new AtomicBoolean();
    public final AtomicBoolean q = new AtomicBoolean();
    public final AtomicBoolean r = new AtomicBoolean();
    public final Object s = new Object();
    public final HashMap w = new HashMap();
    public final AtomicBoolean y = new AtomicBoolean();
    public final x0d V = new x0d(this, (byte) 0);
    public final x0d W = new x0d(this, (byte) 1);
    public final x0d X = new x0d(this, (byte) 2);
    public final jr4 Y = new jr4(this, (byte) 5);
    public final x0d b0 = new x0d(this, (byte) 3);
    public final x0d d0 = new x0d(this, (byte) 4);

    public z(Context context, String str, String str2, String str3, String str4) {
        this.e = context.getApplicationContext();
        this.f = str;
        this.H = str2;
        str2.contains("\"dark\"");
        this.g = true;
        this.h = str3 == null ? "en-US" : str3;
        this.i = str4 == null ? "{}" : str4;
        this.l = context.getResources().getDisplayMetrics().density;
    }

    public static boolean a() {
        for (int i = 0; i < 4; i++) {
            if (yac.h(i).o() && uc7.s1(i).l4.A0.f) {
                return true;
            }
        }
        return false;
    }

    public static void d(Context context) {
        ActivityManager activityManager;
        if (!a() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && !activityManager.isLowRamDevice()) {
            vr vrVar = vr.f;
            if (vrVar == null || vrVar.a > 0) {
                try {
                    x xVar = x.v;
                    synchronized (xVar.a) {
                        if (xVar.j == null) {
                            xVar.j = context.getApplicationContext();
                        }
                        xVar.k = true;
                        xVar.l = true;
                        xVar.b.removeCallbacks(xVar.u);
                        xVar.u();
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            if (!g0 && vrVar != null) {
                g0 = true;
                vrVar.d.add(new z0d(context));
            }
        }
    }

    public final void b(boolean z) {
        this.a.post(new y0d((byte) 0, this, z));
    }

    public final void c(d0d d0dVar, b1d[] b1dVarArr, double d, int i, int i2, float f, float f2, int i3, int i4, int i5, h1d h1dVar) {
        Object obj;
        boolean z = this.E;
        if (this.D == 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.C == 0) {
                this.C = uptimeMillis;
            }
            if (z) {
                this.D = uptimeMillis;
            }
        }
        Object obj2 = this.s;
        synchronized (obj2) {
            try {
                try {
                    if (this.A) {
                        d0dVar.b();
                        return;
                    }
                    a1d a1dVar = this.O;
                    if (a1dVar != null) {
                        a1dVar.a.b();
                    }
                    try {
                        this.O = new a1d(d0dVar, b1dVarArr, d, i, i2, f, f2, i3, i4, i5, h1dVar, z, this.G);
                        if (!this.Q) {
                            this.Q = true;
                            this.a.post(this.V);
                        }
                        this.t = i2;
                        this.u = true;
                    } catch (Throwable th) {
                        th = th;
                        obj = obj2;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    public final void e() {
        if (!this.A && this.v != 0 && !this.J && !this.o.get()) {
            if (!this.n.get()) {
                if (this.L) {
                    if (!this.p.get() && !this.q.get() && !this.r.get()) {
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
        if (!this.A && str != null && !str.equals(this.k)) {
            this.k = str;
            long j = this.v;
            if (j != 0) {
                this.c.h(j, str.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    public final void g(boolean z) {
        if (!this.A && this.L != z) {
            this.L = z;
            if (z) {
                this.Z = SystemClock.uptimeMillis();
            }
            long j = this.v;
            if (j != 0) {
                this.c.l(j, z);
            }
            if (z) {
                e();
            }
        }
    }

    public final void h(int i) {
        long j;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (!a()) {
                if (this.M == 0) {
                    this.M = i;
                }
                SystemClock.uptimeMillis();
                Trace.beginSection("WidgetSandbox:Create");
                try {
                    try {
                        if (!this.A) {
                            String str = this.k;
                            String str2 = this.j;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                JSONObject jSONObject2 = new JSONObject(str2);
                                if (jSONObject.has("content")) {
                                    jSONObject2.put("contentSafeArea", jSONObject.optJSONObject("content"));
                                    jSONObject2.put("safeArea", jSONObject.optJSONObject("device"));
                                    jSONObject2.put("viewportHeight", jSONObject.optDouble("viewportHeight", 0.0d));
                                } else {
                                    jSONObject2.put("contentSafeArea", jSONObject);
                                }
                                str2 = jSONObject2.toString();
                            }
                            b bVar = this.c;
                            Context context = this.e;
                            String str3 = this.f;
                            String str4 = this.H;
                            float f = this.l;
                            j = bVar.b(context, str3, str4, i / f, f, this.g ? 1 : 0, this.h, this.i, str2, ob6.M0(2131742498, null), this.L, this.b);
                            try {
                                SystemClock.uptimeMillis();
                                this.a.post(new wy(this, j, i, this.H, str, (byte) 15));
                            } catch (Exception e) {
                                e = e;
                                if (j != 0) {
                                    w0d.a.execute(new pqa(this, j, (byte) 9));
                                }
                                this.a.post(new zwc(this, e, (byte) 18));
                                throw e;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        j = 0;
                    }
                } finally {
                    Trace.endSection();
                }
            } else {
                grb.i("Widgets are disabled by the app config");
            }
        } else {
            grb.i("Start WidgetSandboxSession off UI");
        }
    }

    public final void i(int i, float f, float f2, int i2, boolean z, boolean z2, int i3, int i4) {
        if (i == 0 && this.L) {
            e0d e0dVar = this.d;
            synchronized (e0dVar) {
                e0dVar.d++;
                e0dVar.f = SystemClock.elapsedRealtime();
            }
        }
        long j = this.v;
        if (!this.A && j != 0) {
            this.c.k(j, i, f, f2, i2, z, z2, i3, i4);
        }
    }
}
