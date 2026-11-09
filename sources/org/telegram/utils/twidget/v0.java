package org.telegram.utils.twidget;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.br;
import org.telegram.messenger.id;
import org.telegram.messenger.yr;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.q71;
import org.telegram.ui.p61;
import org.telegram.ui.q31;
public final class v0 {
    public boolean A;
    public int B;
    public long C;
    public final String f52991a;
    public final String f52992b;
    public final Context f52993c;
    public nb.a f52994e;
    public i1 f52995f;
    public g1 f52996g;
    public q71 h;
    public int f52997i;
    public int f52998j;
    public int f52999k;
    public boolean f53000l;
    public boolean f53002n;
    public boolean f53003o;
    public boolean f53004p;
    public int f53005q;
    public int f53006r;
    public String f53007s;
    public String f53008t;
    public String f53009u;
    public volatile String f53011x;
    public boolean f53012y;
    public boolean f53013z;
    public String v = "{}";
    public String f53010w = "{}";
    public boolean f53001m = false;
    public final int d = 1;

    public v0(Context context, String str, String str2) {
        this.f52993c = context.getApplicationContext();
        this.f52991a = str;
        this.f52992b = str2;
    }

    public final void a() {
        final i1 i1Var;
        boolean z9;
        if (this.f53003o || i1.a()) {
            return;
        }
        this.f53003o = true;
        i1 i1Var2 = this.f52995f;
        if (i1Var2 != null) {
            i1Var2.C = true;
            return;
        }
        String str = this.f53007s;
        String str2 = "light";
        if (str == null && this.f53008t == null && this.f53009u == null) {
            Context context = this.f52993c;
            String str3 = this.f52992b;
            boolean z10 = this.f53001m;
            int i7 = this.d;
            int[] iArr = j1.f52874a;
            StringBuilder sb2 = new StringBuilder("{\"colorScheme\":\"");
            if (z10) {
                str2 = "dark";
            }
            i1Var = new i1(context, str3, a8.p0.s(sb2, str2, "\"}"), i7, null, null);
        } else {
            Context context2 = this.f52993c;
            String str4 = this.f52992b;
            if (str == null) {
                boolean z11 = this.f53001m;
                int[] iArr2 = j1.f52874a;
                StringBuilder sb3 = new StringBuilder("{\"colorScheme\":\"");
                if (z11) {
                    str2 = "dark";
                }
                str = a8.p0.s(sb3, str2, "\"}");
            }
            i1Var = new i1(context2, str4, str, this.d, this.f53008t, this.f53009u);
        }
        StringBuilder sb4 = new StringBuilder("{\"data\":");
        sb4.append(this.v);
        sb4.append(",\"context\":");
        String s5 = a8.p0.s(sb4, this.f53010w, "}");
        if (s5 != null) {
            i1Var.f52856j = s5;
            try {
                i1Var.d = new d0(new JSONObject(s5).optJSONObject("context"));
            } catch (Exception unused) {
                i1Var.d = new d0(null);
            }
        }
        i1Var.e(this.f53011x);
        i1Var.L = this;
        i1Var.M = this;
        if (this.f53002n && !this.f53004p) {
            z9 = true;
        } else {
            z9 = false;
        }
        i1Var.f(z9);
        this.f52995f = i1Var;
        this.f53005q++;
        final int i10 = this.f52998j;
        a1.f52767a.execute(new Runnable() {
            @Override
            public final void run() {
                try {
                    i1.this.g(i10);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public final void b(int i7, String str, long j3) {
        boolean z9;
        byte[] bytes;
        i1 i1Var = this.f52995f;
        if (i1Var != null) {
            d0 d0Var = i1Var.d;
            if (i7 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            synchronized (d0Var) {
                try {
                    if (d0Var.f52785j && z9) {
                        d0Var.h = SystemClock.elapsedRealtime();
                    }
                    d0Var.f52785j = false;
                    d0Var.f52784i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = i1Var.v;
            if (!i1Var.f52868w && j10 != 0) {
                r0 r0Var = i1Var.f52851c;
                b bVar = null;
                if (str == null) {
                    bytes = null;
                } else {
                    bytes = str.getBytes(StandardCharsets.UTF_8);
                }
                o0 o0Var = (o0) r0Var.f52972e.get(Long.valueOf(j10));
                if (o0Var != null) {
                    bVar = o0Var.h1();
                }
                b bVar2 = bVar;
                if (bVar2 != null) {
                    try {
                        bVar2.u(o0Var.d, j3, i7, bytes);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }
    }

    public final void c() {
        b h12;
        int i7;
        i1 i1Var = this.f52995f;
        if (i1Var != null && !i1Var.f52868w && i1Var.v != 0 && !i1Var.E) {
            g1 g1Var = i1Var.H;
            if (g1Var == null || (((i7 = i1Var.G) != 0 && Math.abs(g1Var.d - i7) > 1) || !g1Var.a())) {
                i1Var.E = true;
                o0 o0Var = (o0) i1Var.f52851c.f52972e.get(Long.valueOf(i1Var.v));
                if (o0Var == null) {
                    h12 = null;
                } else {
                    h12 = o0Var.h1();
                }
                if (h12 != null) {
                    try {
                        h12.M0(o0Var.d);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }
    }

    public final g1 d() {
        g1 g1Var;
        i1 i1Var = this.f52995f;
        if (i1Var == null) {
            g1Var = null;
        } else {
            g1Var = i1Var.H;
        }
        if (g1Var != null && (this.f52996g == null || i1Var.f52869x)) {
            return g1Var;
        }
        g1 g1Var2 = this.f52996g;
        if (g1Var2 != null && Math.abs(g1Var2.d - this.f52998j) <= 1) {
            return this.f52996g;
        }
        if (g1Var != null) {
            return g1Var;
        }
        return this.f52996g;
    }

    public final void e(float f10, float f11, int i7, int i10) {
        b h12;
        i1 i1Var = this.f52995f;
        if (i1Var != null) {
            long j3 = i1Var.v;
            if (!i1Var.f52868w && j3 != 0) {
                o0 o0Var = (o0) i1Var.f52851c.f52972e.get(Long.valueOf(j3));
                if (o0Var == null) {
                    h12 = null;
                } else {
                    h12 = o0Var.h1();
                }
                b bVar = h12;
                if (bVar != null) {
                    try {
                        bVar.Y0(o0Var.d, i7, f10, f11, i10);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }
    }

    public final boolean f() {
        i1 i1Var;
        g1 g1Var;
        if (this.f53006r != this.f53005q && (i1Var = this.f52995f) != null && (g1Var = i1Var.H) != null) {
            if (g1Var.f52809g || i1Var.f52871z) {
                this.f53006r = this.f53005q;
                if (this.f52994e != null) {
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
        if (this.f52994e != null) {
            a8.d("widget " + this.f52991a + ": " + str);
        }
        q71 q71Var = this.h;
        if (q71Var != null) {
            q71Var.f37211a.h();
        }
    }

    public final void h(i1 i1Var) {
        g1 g1Var;
        Object[] objArr;
        k0 h;
        q71 q71Var;
        if (i1Var == this.f52995f && (g1Var = i1Var.H) != null) {
            if (this.f52996g == null || i1Var.f52869x) {
                this.f52996g = null;
                this.f52999k = g1Var.d;
                boolean z9 = g1Var.h;
                boolean z10 = false;
                if (z9 != this.f53000l) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.f53000l = z9;
                int max = Math.max(1, g1Var.f52807e);
                if (max != this.f52997i) {
                    z10 = true;
                }
                this.f52997i = max;
                q71 q71Var2 = this.h;
                if (q71Var2 != null) {
                    p71 p71Var = q71Var2.f37211a;
                    if (z10) {
                        p71Var.j();
                    }
                    p71Var.h();
                }
                if ((z10 || objArr != null) && this.f52994e != null && (h = n0.h(this)) != null && this.f52997i > 0) {
                    int f10 = n0.f(this.f52999k);
                    int max2 = Math.max(50, Math.min(600, n0.f(this.f52997i)));
                    boolean z11 = this.f53000l;
                    if (f10 > 0 && h.f52882f == 0 && !h.f52886k && n0.l(h.a()).a(f10, max2, z11)) {
                        yr a02 = yr.a0(h.f52879b);
                        a02.f26719a.c(new br(a02, h.f52880c, h.d, f10, max2, z11 ? 1 : 0, 1));
                    }
                    dk0 dk0Var = h.f52896u;
                    if (dk0Var != null) {
                        dk0Var.p0("frame off screen");
                    }
                }
                if (f() && !z10 && (q71Var = this.h) != null) {
                    p71 p71Var2 = q71Var.f37211a;
                    p71Var2.j();
                    p71Var2.h();
                }
            }
        }
    }

    public final void i(String str, JSONObject jSONObject) {
        k0 h;
        String str2;
        if (this.f52994e != null && (h = n0.h(this)) != null) {
            String a10 = h.a();
            JSONObject jSONObject2 = (JSONObject) n0.f52931c.get(a10);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            try {
                jSONObject2.put(str, jSONObject);
            } catch (Exception unused) {
            }
            n0.f52931c.put(a10, jSONObject2);
            for (k0 k0Var : n0.f52929a.values()) {
                if (k0Var.f52895t != null && a10.equals(k0Var.a())) {
                    v0 v0Var = k0Var.f52895t;
                    try {
                        str2 = id.E0().f23185y.toLanguageTag();
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    String jSONObject3 = jSONObject2.toString();
                    v0Var.f53008t = str2;
                    v0Var.f53009u = jSONObject3;
                }
            }
            if ("local".equals(str)) {
                n0.d.put(a10, h);
                p61 p61Var = n0.f52932e;
                org.telegram.messenger.g0.r(p61Var);
                org.telegram.messenger.g0.i3(p61Var, 1000L);
            }
        }
    }

    public final void j(String str) {
        b h12;
        if (str != null && !str.equals(this.v)) {
            this.v = str;
            i1 i1Var = this.f52995f;
            if (i1Var != null) {
                long j3 = i1Var.v;
                if (!i1Var.f52868w && j3 != 0) {
                    r0 r0Var = i1Var.f52851c;
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    o0 o0Var = (o0) r0Var.f52972e.get(Long.valueOf(j3));
                    if (o0Var == null) {
                        h12 = null;
                    } else {
                        h12 = o0Var.h1();
                    }
                    if (h12 != null) {
                        try {
                            h12.R(o0Var.d, bytes);
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }
        }
    }

    public final synchronized void k(float f10, float f11, boolean z9) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z9) {
            if (this.f53012y && z10 == this.f53013z) {
                return;
            }
        }
        this.f53012y = z9;
        this.f53013z = z10;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f10), Float.valueOf(f11));
        if (format.equals(this.f53011x)) {
            return;
        }
        this.f53011x = format;
        org.telegram.messenger.g0.h3(new j0(this, 3));
    }

    public final void l(String str) {
        b h12;
        if (str != null && !str.equals(this.f53007s)) {
            this.f53007s = str;
            this.f53001m = str.contains("\"dark\"");
            i1 i1Var = this.f52995f;
            if (i1Var != null && !i1Var.f52868w && !str.equals(i1Var.B)) {
                i1Var.B = str;
                str.contains("\"dark\"");
                long j3 = i1Var.v;
                if (j3 != 0) {
                    r0 r0Var = i1Var.f52851c;
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    o0 o0Var = (o0) r0Var.f52972e.get(Long.valueOf(j3));
                    if (o0Var == null) {
                        h12 = null;
                    } else {
                        h12 = o0Var.h1();
                    }
                    if (h12 != null) {
                        try {
                            h12.e0(o0Var.d, bytes);
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }
        }
    }

    public final void m(boolean z9) {
        boolean z10;
        this.f53002n = z9;
        i1 i1Var = this.f52995f;
        if (i1Var != null) {
            if (z9 && !this.f53004p) {
                z10 = true;
            } else {
                z10 = false;
            }
            i1Var.f(z10);
        }
    }

    public final void n(int i7) {
        b h12;
        if (i7 > 0 && i7 != this.f52998j) {
            this.f52998j = i7;
            i1 i1Var = this.f52995f;
            if (i1Var != null && i7 > 0 && i7 != i1Var.G && !i1Var.f52868w) {
                i1Var.G = i7;
                long j3 = i1Var.v;
                if (j3 != 0) {
                    r0 r0Var = i1Var.f52851c;
                    float f10 = i7 / i1Var.f52858l;
                    o0 o0Var = (o0) r0Var.f52972e.get(Long.valueOf(j3));
                    if (o0Var == null) {
                        h12 = null;
                    } else {
                        h12 = o0Var.h1();
                    }
                    if (h12 != null) {
                        try {
                            h12.G0(o0Var.d, f10);
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }
        }
    }

    public final void o(int i7, float f10, float f11, int i10, boolean z9, boolean z10, int i11, int i12) {
        b h12;
        i1 i1Var = this.f52995f;
        if (i1Var != null) {
            if (i7 == 0 && i1Var.F) {
                d0 d0Var = i1Var.d;
                synchronized (d0Var) {
                    d0Var.d++;
                    d0Var.f52782f = SystemClock.elapsedRealtime();
                }
            }
            long j3 = i1Var.v;
            if (!i1Var.f52868w && j3 != 0) {
                o0 o0Var = (o0) i1Var.f52851c.f52972e.get(Long.valueOf(j3));
                if (o0Var == null) {
                    h12 = null;
                } else {
                    h12 = o0Var.h1();
                }
                b bVar = h12;
                if (bVar != null) {
                    try {
                        bVar.j0(o0Var.d, i7, f10, f11, i10, z9, z10, i11, i12);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }
    }

    public final void p() {
        this.f53003o = false;
        if (this.f52995f != null) {
            g1 d = d();
            if (d != null) {
                this.f52996g = d;
            }
            i1 i1Var = this.f52995f;
            if (!i1Var.f52868w) {
                i1Var.f52868w = true;
                i1Var.L = null;
                i1Var.f52849a.removeCallbacks(i1Var.P);
                i1Var.f52849a.removeCallbacks(i1Var.O);
                i1Var.f52849a.removeCallbacks(i1Var.Q);
                if (i1Var.D) {
                    Choreographer.getInstance().removeFrameCallback(i1Var.R);
                }
                i1Var.D = false;
                synchronized (i1Var.f52865s) {
                    try {
                        g1 g1Var = i1Var.I;
                        if (g1Var != null) {
                            g1Var.f52804a.b();
                        }
                        i1Var.I = null;
                        i1Var.J = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                long j3 = i1Var.v;
                i1Var.v = 0L;
                if (j3 != 0) {
                    a1.f52767a.execute(new q31(i1Var, j3, 2));
                }
            }
            this.f52995f = null;
            if (this.A) {
                this.A = false;
                if (this.f52994e != null) {
                    n0.E();
                }
            }
        }
    }
}
