package org.telegram.utils.twidget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.Trace;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.p31;
public final class h1 {
    public volatile boolean A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public volatile boolean F;
    public int G;
    public f1 H;
    public f1 I;
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
    public final Context f52828e;
    public final String f52829f;
    public final int f52830g;
    public final String h;
    public final String f52831i;
    public volatile String f52833k;
    public final float f52834l;
    public volatile int f52842t;
    public volatile boolean f52843u;
    public volatile long v;
    public volatile boolean f52844w;
    public volatile boolean f52845x;
    public volatile boolean f52846y;
    public volatile boolean f52847z;
    public final Handler f52825a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f52826b = new WidgetSandboxBackend(this);
    public final r0 f52827c = r0.f52954i;
    public volatile d0 d = new d0(null);
    public volatile String f52832j = "{}";
    public final long f52835m = System.nanoTime();
    public final AtomicBoolean f52836n = new AtomicBoolean();
    public final AtomicBoolean f52837o = new AtomicBoolean();
    public final AtomicBoolean f52838p = new AtomicBoolean();
    public final AtomicBoolean f52839q = new AtomicBoolean();
    public final AtomicBoolean f52840r = new AtomicBoolean();
    public final Object f52841s = new Object();

    public h1(Context context, String str, String str2, int i7, String str3, String str4) {
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
                h1 h1Var = h1.this;
                h1Var.D = false;
                long j10 = h1Var.v;
                if (!h1Var.f52844w && j10 != 0 && h1Var.f52837o.compareAndSet(false, true)) {
                    if (h1Var.F && (h1Var.f52840r.getAndSet(false) | h1Var.f52839q.get())) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (h1Var.F && h1Var.f52838p.getAndSet(false)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        h1Var.S = j3;
                    }
                    r0 r0Var = h1Var.f52827c;
                    float f10 = ((float) (j3 - h1Var.f52835m)) / 1000000.0f;
                    boolean andSet = h1Var.f52836n.getAndSet(false);
                    o0 o0Var = (o0) r0Var.f52957e.get(Long.valueOf(j10));
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
            this.f52828e = context.getApplicationContext();
            this.f52829f = str;
            this.B = str2;
            str2.contains("\"dark\"");
            this.f52830g = i7;
            this.h = str3 == null ? "en-US" : str3;
            this.f52831i = str4 == null ? "{}" : str4;
            this.f52834l = context.getResources().getDisplayMetrics().density;
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

    public final void b(c0 c0Var, g1[] g1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, m1 m1Var) {
        Object obj;
        boolean z9 = this.f52846y;
        Object obj2 = this.f52841s;
        synchronized (obj2) {
            try {
                try {
                    if (this.f52844w) {
                        c0Var.b();
                        return;
                    }
                    f1 f1Var = this.I;
                    if (f1Var != null) {
                        f1Var.f52786a.b();
                    }
                    try {
                        this.I = new f1(c0Var, g1VarArr, d, i7, i10, f10, f11, i11, i12, i13, m1Var, z9, this.A);
                        if (!this.K) {
                            this.K = true;
                            this.f52825a.post(this.O);
                        }
                        this.f52842t = i10;
                        this.f52843u = true;
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
        if (!this.f52844w && this.v != 0 && !this.D && !this.f52837o.get()) {
            if (!this.f52836n.get()) {
                if (this.F) {
                    if (!this.f52838p.get() && !this.f52839q.get() && !this.f52840r.get()) {
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

    public final void d(String str) {
        b h12;
        if (!this.f52844w && str != null && !str.equals(this.f52833k)) {
            this.f52833k = str;
            long j3 = this.v;
            if (j3 != 0) {
                r0 r0Var = this.f52827c;
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                o0 o0Var = (o0) r0Var.f52957e.get(Long.valueOf(j3));
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

    public final void e(boolean z9) {
        b h12;
        if (!this.f52844w && this.F != z9) {
            this.F = z9;
            long j3 = this.v;
            if (j3 != 0) {
                o0 o0Var = (o0) this.f52827c.f52957e.get(Long.valueOf(j3));
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
                c();
            }
        }
    }

    public final void f(int i7) {
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
                            if (this.f52844w) {
                                Trace.endSection();
                                return;
                            }
                            String str = this.f52833k;
                            String str2 = this.f52832j;
                            if (str != null) {
                                str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                            }
                            String str3 = str2;
                            r0 r0Var = this.f52827c;
                            Context context = this.f52828e;
                            String str4 = this.f52829f;
                            String str5 = this.B;
                            float f10 = this.f52834l;
                            j3 = r0Var.f(context, str4, str5, i7 / f10, f10, this.f52830g, this.h, this.f52831i, str3, id.M0(2131742870, null), this.F, this.f52826b);
                            try {
                                this.f52825a.post(new bi.d0(this, j3, i7, this.B, str));
                                Trace.endSection();
                            } catch (Exception e10) {
                                e = e10;
                                if (j3 != 0) {
                                    a1.f52753a.execute(new p31(this, j3, 2));
                                }
                                this.f52825a.post(new f0(5, this, e));
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
