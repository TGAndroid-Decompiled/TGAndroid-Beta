package org.telegram.utils.twidget;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.vr;
import org.telegram.messenger.wq;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.q71;
import org.telegram.ui.ah0;
import org.telegram.ui.n31;
public final class y0 {
    public boolean A;
    public int B;
    public long C;
    public final String f54423a;
    public final String f54424b;
    public final Context f54425c;
    public sa.d f54426e;
    public l1 f54427f;
    public j1 f54428g;
    public q71 h;
    public int f54429i;
    public int f54430j;
    public int f54431k;
    public boolean f54432l;
    public boolean f54434n;
    public boolean f54435o;
    public boolean f54436p;
    public int f54437q;
    public int f54438r;
    public String f54439s;
    public String f54440t;
    public String f54441u;
    public volatile String f54443x;
    public boolean f54444y;
    public boolean f54445z;
    public String v = "{}";
    public String f54442w = "{}";
    public boolean f54433m = false;
    public final int d = 1;

    public y0(Context context, String str, String str2) {
        this.f54425c = context.getApplicationContext();
        this.f54423a = str;
        this.f54424b = str2;
    }

    public final void a() {
        final l1 l1Var;
        boolean z10;
        if (this.f54435o || l1.a()) {
            return;
        }
        this.f54435o = true;
        l1 l1Var2 = this.f54427f;
        if (l1Var2 != null) {
            l1Var2.C = true;
            return;
        }
        String str = this.f54439s;
        String str2 = "light";
        if (str == null && this.f54440t == null && this.f54441u == null) {
            Context context = this.f54425c;
            String str3 = this.f54424b;
            boolean z11 = this.f54433m;
            int i7 = this.d;
            int[] iArr = m1.f54332a;
            StringBuilder sb2 = new StringBuilder("{\"colorScheme\":\"");
            if (z11) {
                str2 = "dark";
            }
            l1Var = new l1(context, str3, a8.p0.s(sb2, str2, "\"}"), i7, null, null);
        } else {
            Context context2 = this.f54425c;
            String str4 = this.f54424b;
            if (str == null) {
                boolean z12 = this.f54433m;
                int[] iArr2 = m1.f54332a;
                StringBuilder sb3 = new StringBuilder("{\"colorScheme\":\"");
                if (z12) {
                    str2 = "dark";
                }
                str = a8.p0.s(sb3, str2, "\"}");
            }
            l1Var = new l1(context2, str4, str, this.d, this.f54440t, this.f54441u);
        }
        StringBuilder sb4 = new StringBuilder("{\"data\":");
        sb4.append(this.v);
        sb4.append(",\"context\":");
        String s5 = a8.p0.s(sb4, this.f54442w, "}");
        if (s5 != null) {
            l1Var.f54306j = s5;
            try {
                l1Var.d = new d0(new JSONObject(s5).optJSONObject("context"));
            } catch (Exception unused) {
                l1Var.d = new d0(null);
            }
        }
        l1Var.e(this.f54443x);
        l1Var.L = this;
        l1Var.M = this;
        if (this.f54434n && !this.f54436p) {
            z10 = true;
        } else {
            z10 = false;
        }
        l1Var.f(z10);
        this.f54427f = l1Var;
        this.f54437q++;
        final int i10 = this.f54430j;
        d1.f54204a.execute(new Runnable() {
            @Override
            public final void run() {
                try {
                    l1.this.g(i10);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public final void b(int i7, String str, long j3) {
        boolean z10;
        byte[] bytes;
        l1 l1Var = this.f54427f;
        if (l1Var != null) {
            d0 d0Var = l1Var.d;
            if (i7 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (d0Var) {
                try {
                    if (d0Var.f54201j && z10) {
                        d0Var.h = SystemClock.elapsedRealtime();
                    }
                    d0Var.f54201j = false;
                    d0Var.f54200i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = l1Var.v;
            if (!l1Var.f54318w && j10 != 0) {
                u0 u0Var = l1Var.f54301c;
                b bVar = null;
                if (str == null) {
                    bytes = null;
                } else {
                    bytes = str.getBytes(StandardCharsets.UTF_8);
                }
                r0 r0Var = (r0) u0Var.f54414e.get(Long.valueOf(j10));
                if (r0Var != null) {
                    bVar = r0Var.h1();
                }
                b bVar2 = bVar;
                if (bVar2 != null) {
                    try {
                        bVar2.u(r0Var.d, j3, i7, bytes);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }
    }

    public final void c() {
        b h12;
        int i7;
        l1 l1Var = this.f54427f;
        if (l1Var != null && !l1Var.f54318w && l1Var.v != 0 && !l1Var.E) {
            j1 j1Var = l1Var.H;
            if (j1Var == null || (((i7 = l1Var.G) != 0 && Math.abs(j1Var.d - i7) > 1) || !j1Var.a())) {
                l1Var.E = true;
                r0 r0Var = (r0) l1Var.f54301c.f54414e.get(Long.valueOf(l1Var.v));
                if (r0Var == null) {
                    h12 = null;
                } else {
                    h12 = r0Var.h1();
                }
                if (h12 != null) {
                    try {
                        h12.N0(r0Var.d);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }
    }

    public final j1 d() {
        j1 j1Var;
        l1 l1Var = this.f54427f;
        if (l1Var == null) {
            j1Var = null;
        } else {
            j1Var = l1Var.H;
        }
        if (j1Var != null && (this.f54428g == null || l1Var.f54319x)) {
            return j1Var;
        }
        j1 j1Var2 = this.f54428g;
        if (j1Var2 != null && Math.abs(j1Var2.d - this.f54430j) <= 1) {
            return this.f54428g;
        }
        if (j1Var != null) {
            return j1Var;
        }
        return this.f54428g;
    }

    public final void e(float f10, float f11, int i7, int i10) {
        b h12;
        l1 l1Var = this.f54427f;
        if (l1Var != null) {
            long j3 = l1Var.v;
            if (!l1Var.f54318w && j3 != 0) {
                r0 r0Var = (r0) l1Var.f54301c.f54414e.get(Long.valueOf(j3));
                if (r0Var == null) {
                    h12 = null;
                } else {
                    h12 = r0Var.h1();
                }
                b bVar = h12;
                if (bVar != null) {
                    try {
                        bVar.Z0(r0Var.d, i7, f10, f11, i10);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }
    }

    public final boolean f() {
        l1 l1Var;
        j1 j1Var;
        if (this.f54438r != this.f54437q && (l1Var = this.f54427f) != null && (j1Var = l1Var.H) != null) {
            if (j1Var.f54264g || l1Var.f54321z) {
                this.f54438r = this.f54437q;
                if (this.f54426e != null) {
                    n0.b();
                    k0 h = n0.h(this);
                    if (h != null) {
                        n0.a(h);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g(String str) {
        if (this.f54426e != null) {
            a8.d("widget " + this.f54423a + ": " + str);
        }
        q71 q71Var = this.h;
        if (q71Var != null) {
            q71Var.f38537a.h();
        }
    }

    public final void h(l1 l1Var) {
        j1 j1Var;
        Object[] objArr;
        k0 h;
        q71 q71Var;
        if (l1Var == this.f54427f && (j1Var = l1Var.H) != null) {
            if (this.f54428g == null || l1Var.f54319x) {
                this.f54428g = null;
                this.f54431k = j1Var.d;
                boolean z10 = j1Var.h;
                boolean z11 = false;
                if (z10 != this.f54432l) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.f54432l = z10;
                int max = Math.max(1, j1Var.f54262e);
                if (max != this.f54429i) {
                    z11 = true;
                }
                this.f54429i = max;
                q71 q71Var2 = this.h;
                if (q71Var2 != null) {
                    p71 p71Var = q71Var2.f38537a;
                    if (z11) {
                        p71Var.j();
                    }
                    p71Var.h();
                }
                if ((z11 || objArr != null) && this.f54426e != null && (h = n0.h(this)) != null && this.f54429i > 0) {
                    int f10 = n0.f(this.f54431k);
                    int max2 = Math.max(50, Math.min(600, n0.f(this.f54429i)));
                    boolean z12 = this.f54432l;
                    if (f10 > 0 && h.f54270f == 0 && !h.f54274k && n0.l(h.a()).a(f10, max2, z12)) {
                        vr a02 = vr.a0(h.f54267b);
                        a02.f27219a.c(new wq(a02, h.f54268c, h.d, f10, max2, z12 ? 1 : 0, 1));
                    }
                    hk0 hk0Var = h.f54284u;
                    if (hk0Var != null) {
                        hk0Var.p0("frame off screen");
                    }
                }
                if (f() && !z11 && (q71Var = this.h) != null) {
                    p71 p71Var2 = q71Var.f38537a;
                    p71Var2.j();
                    p71Var2.h();
                }
            }
        }
    }

    public final void i(String str, JSONObject jSONObject) {
        k0 h;
        String str2;
        if (this.f54426e != null && (h = n0.h(this)) != null) {
            String a10 = h.a();
            JSONObject jSONObject2 = (JSONObject) n0.f54340c.get(a10);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            try {
                jSONObject2.put(str, jSONObject);
            } catch (Exception unused) {
            }
            n0.f54340c.put(a10, jSONObject2);
            for (k0 k0Var : n0.f54338a.values()) {
                if (k0Var.f54283t != null && a10.equals(k0Var.a())) {
                    y0 y0Var = k0Var.f54283t;
                    try {
                        str2 = hd.E0().f24132y.toLanguageTag();
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    String jSONObject3 = jSONObject2.toString();
                    y0Var.f54440t = str2;
                    y0Var.f54441u = jSONObject3;
                }
            }
            if ("local".equals(str)) {
                n0.d.put(a10, h);
                ah0 ah0Var = n0.f54341e;
                org.telegram.messenger.g0.r(ah0Var);
                org.telegram.messenger.g0.i3(ah0Var, 1000L);
            }
        }
    }

    public final void j(String str) {
        b h12;
        if (str != null && !str.equals(this.v)) {
            this.v = str;
            l1 l1Var = this.f54427f;
            if (l1Var != null) {
                long j3 = l1Var.v;
                if (!l1Var.f54318w && j3 != 0) {
                    u0 u0Var = l1Var.f54301c;
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    r0 r0Var = (r0) u0Var.f54414e.get(Long.valueOf(j3));
                    if (r0Var == null) {
                        h12 = null;
                    } else {
                        h12 = r0Var.h1();
                    }
                    if (h12 != null) {
                        try {
                            h12.S(r0Var.d, bytes);
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }
        }
    }

    public final synchronized void k(float f10, float f11, boolean z10) {
        boolean z11;
        if (f10 > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (this.f54444y && z11 == this.f54445z) {
                return;
            }
        }
        this.f54444y = z10;
        this.f54445z = z11;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f10), Float.valueOf(f11));
        if (format.equals(this.f54443x)) {
            return;
        }
        this.f54443x = format;
        org.telegram.messenger.g0.h3(new j0(this, 3));
    }

    public final void l(String str) {
        b h12;
        if (str != null && !str.equals(this.f54439s)) {
            this.f54439s = str;
            this.f54433m = str.contains("\"dark\"");
            l1 l1Var = this.f54427f;
            if (l1Var != null && !l1Var.f54318w && !str.equals(l1Var.B)) {
                l1Var.B = str;
                str.contains("\"dark\"");
                long j3 = l1Var.v;
                if (j3 != 0) {
                    u0 u0Var = l1Var.f54301c;
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    r0 r0Var = (r0) u0Var.f54414e.get(Long.valueOf(j3));
                    if (r0Var == null) {
                        h12 = null;
                    } else {
                        h12 = r0Var.h1();
                    }
                    if (h12 != null) {
                        try {
                            h12.f0(r0Var.d, bytes);
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }
        }
    }

    public final void m(boolean z10) {
        boolean z11;
        this.f54434n = z10;
        l1 l1Var = this.f54427f;
        if (l1Var != null) {
            if (z10 && !this.f54436p) {
                z11 = true;
            } else {
                z11 = false;
            }
            l1Var.f(z11);
        }
    }

    public final void n(int i7) {
        b h12;
        if (i7 > 0 && i7 != this.f54430j) {
            this.f54430j = i7;
            l1 l1Var = this.f54427f;
            if (l1Var != null && i7 > 0 && i7 != l1Var.G && !l1Var.f54318w) {
                l1Var.G = i7;
                long j3 = l1Var.v;
                if (j3 != 0) {
                    u0 u0Var = l1Var.f54301c;
                    float f10 = i7 / l1Var.f54308l;
                    r0 r0Var = (r0) u0Var.f54414e.get(Long.valueOf(j3));
                    if (r0Var == null) {
                        h12 = null;
                    } else {
                        h12 = r0Var.h1();
                    }
                    if (h12 != null) {
                        try {
                            h12.H0(r0Var.d, f10);
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }
        }
    }

    public final void o(int i7, float f10, float f11, int i10, boolean z10, boolean z11, int i11, int i12) {
        b h12;
        l1 l1Var = this.f54427f;
        if (l1Var != null) {
            if (i7 == 0 && l1Var.F) {
                d0 d0Var = l1Var.d;
                synchronized (d0Var) {
                    d0Var.d++;
                    d0Var.f54198f = SystemClock.elapsedRealtime();
                }
            }
            long j3 = l1Var.v;
            if (!l1Var.f54318w && j3 != 0) {
                r0 r0Var = (r0) l1Var.f54301c.f54414e.get(Long.valueOf(j3));
                if (r0Var == null) {
                    h12 = null;
                } else {
                    h12 = r0Var.h1();
                }
                b bVar = h12;
                if (bVar != null) {
                    try {
                        bVar.k0(r0Var.d, i7, f10, f11, i10, z10, z11, i11, i12);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }
    }

    public final void p() {
        this.f54435o = false;
        if (this.f54427f != null) {
            j1 d = d();
            if (d != null) {
                this.f54428g = d;
            }
            l1 l1Var = this.f54427f;
            if (!l1Var.f54318w) {
                l1Var.f54318w = true;
                l1Var.L = null;
                l1Var.f54299a.removeCallbacks(l1Var.P);
                l1Var.f54299a.removeCallbacks(l1Var.O);
                l1Var.f54299a.removeCallbacks(l1Var.Q);
                if (l1Var.D) {
                    Choreographer.getInstance().removeFrameCallback(l1Var.R);
                }
                l1Var.D = false;
                synchronized (l1Var.f54315s) {
                    try {
                        j1 j1Var = l1Var.I;
                        if (j1Var != null) {
                            j1Var.f54259a.b();
                        }
                        l1Var.I = null;
                        l1Var.J = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                long j3 = l1Var.v;
                l1Var.v = 0L;
                if (j3 != 0) {
                    d1.f54204a.execute(new n31(l1Var, j3, 2));
                }
            }
            this.f54427f = null;
            if (this.A) {
                this.A = false;
                if (this.f54426e != null) {
                    n0.E();
                }
            }
        }
    }
}
