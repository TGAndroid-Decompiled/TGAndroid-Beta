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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.q61;
import org.telegram.ui.r31;
public final class v0 {
    public boolean A;
    public int B;
    public long C;
    public final String f52990a;
    public final String f52991b;
    public final Context f52992c;
    public nb.a f52993e;
    public i1 f52994f;
    public g1 f52995g;
    public p71 h;
    public int f52996i;
    public int f52997j;
    public int f52998k;
    public boolean f52999l;
    public boolean f53001n;
    public boolean f53002o;
    public boolean f53003p;
    public int f53004q;
    public int f53005r;
    public String f53006s;
    public String f53007t;
    public String f53008u;
    public volatile String f53010x;
    public boolean f53011y;
    public boolean f53012z;
    public String v = "{}";
    public String f53009w = "{}";
    public boolean f53000m = false;
    public final int d = 1;

    public v0(Context context, String str, String str2) {
        this.f52992c = context.getApplicationContext();
        this.f52990a = str;
        this.f52991b = str2;
    }

    public final void a() {
        final i1 i1Var;
        boolean z9;
        if (this.f53002o || i1.a()) {
            return;
        }
        this.f53002o = true;
        i1 i1Var2 = this.f52994f;
        if (i1Var2 != null) {
            i1Var2.C = true;
            return;
        }
        String str = this.f53006s;
        String str2 = "light";
        if (str == null && this.f53007t == null && this.f53008u == null) {
            Context context = this.f52992c;
            String str3 = this.f52991b;
            boolean z10 = this.f53000m;
            int i7 = this.d;
            int[] iArr = j1.f52873a;
            StringBuilder sb2 = new StringBuilder("{\"colorScheme\":\"");
            if (z10) {
                str2 = "dark";
            }
            i1Var = new i1(context, str3, a8.p0.s(sb2, str2, "\"}"), i7, null, null);
        } else {
            Context context2 = this.f52992c;
            String str4 = this.f52991b;
            if (str == null) {
                boolean z11 = this.f53000m;
                int[] iArr2 = j1.f52873a;
                StringBuilder sb3 = new StringBuilder("{\"colorScheme\":\"");
                if (z11) {
                    str2 = "dark";
                }
                str = a8.p0.s(sb3, str2, "\"}");
            }
            i1Var = new i1(context2, str4, str, this.d, this.f53007t, this.f53008u);
        }
        StringBuilder sb4 = new StringBuilder("{\"data\":");
        sb4.append(this.v);
        sb4.append(",\"context\":");
        String s5 = a8.p0.s(sb4, this.f53009w, "}");
        if (s5 != null) {
            i1Var.f52855j = s5;
            try {
                i1Var.d = new d0(new JSONObject(s5).optJSONObject("context"));
            } catch (Exception unused) {
                i1Var.d = new d0(null);
            }
        }
        i1Var.e(this.f53010x);
        i1Var.L = this;
        i1Var.M = this;
        if (this.f53001n && !this.f53003p) {
            z9 = true;
        } else {
            z9 = false;
        }
        i1Var.f(z9);
        this.f52994f = i1Var;
        this.f53004q++;
        final int i10 = this.f52997j;
        a1.f52766a.execute(new Runnable() {
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
        i1 i1Var = this.f52994f;
        if (i1Var != null) {
            d0 d0Var = i1Var.d;
            if (i7 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            synchronized (d0Var) {
                try {
                    if (d0Var.f52784j && z9) {
                        d0Var.h = SystemClock.elapsedRealtime();
                    }
                    d0Var.f52784j = false;
                    d0Var.f52783i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = i1Var.v;
            if (!i1Var.f52867w && j10 != 0) {
                r0 r0Var = i1Var.f52850c;
                b bVar = null;
                if (str == null) {
                    bytes = null;
                } else {
                    bytes = str.getBytes(StandardCharsets.UTF_8);
                }
                o0 o0Var = (o0) r0Var.f52971e.get(Long.valueOf(j10));
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
        i1 i1Var = this.f52994f;
        if (i1Var != null && !i1Var.f52867w && i1Var.v != 0 && !i1Var.E) {
            g1 g1Var = i1Var.H;
            if (g1Var == null || (((i7 = i1Var.G) != 0 && Math.abs(g1Var.d - i7) > 1) || !g1Var.a())) {
                i1Var.E = true;
                o0 o0Var = (o0) i1Var.f52850c.f52971e.get(Long.valueOf(i1Var.v));
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
        i1 i1Var = this.f52994f;
        if (i1Var == null) {
            g1Var = null;
        } else {
            g1Var = i1Var.H;
        }
        if (g1Var != null && (this.f52995g == null || i1Var.f52868x)) {
            return g1Var;
        }
        g1 g1Var2 = this.f52995g;
        if (g1Var2 != null && Math.abs(g1Var2.d - this.f52997j) <= 1) {
            return this.f52995g;
        }
        if (g1Var != null) {
            return g1Var;
        }
        return this.f52995g;
    }

    public final void e(float f10, float f11, int i7, int i10) {
        b h12;
        i1 i1Var = this.f52994f;
        if (i1Var != null) {
            long j3 = i1Var.v;
            if (!i1Var.f52867w && j3 != 0) {
                o0 o0Var = (o0) i1Var.f52850c.f52971e.get(Long.valueOf(j3));
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
        if (this.f53005r != this.f53004q && (i1Var = this.f52994f) != null && (g1Var = i1Var.H) != null) {
            if (g1Var.f52808g || i1Var.f52870z) {
                this.f53005r = this.f53004q;
                if (this.f52993e != null) {
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
        if (this.f52993e != null) {
            a8.d("widget " + this.f52990a + ": " + str);
        }
        p71 p71Var = this.h;
        if (p71Var != null) {
            p71Var.f36810a.h();
        }
    }

    public final void h(i1 i1Var) {
        g1 g1Var;
        Object[] objArr;
        k0 h;
        p71 p71Var;
        if (i1Var == this.f52994f && (g1Var = i1Var.H) != null) {
            if (this.f52995g == null || i1Var.f52868x) {
                this.f52995g = null;
                this.f52998k = g1Var.d;
                boolean z9 = g1Var.h;
                boolean z10 = false;
                if (z9 != this.f52999l) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.f52999l = z9;
                int max = Math.max(1, g1Var.f52806e);
                if (max != this.f52996i) {
                    z10 = true;
                }
                this.f52996i = max;
                p71 p71Var2 = this.h;
                if (p71Var2 != null) {
                    o71 o71Var = p71Var2.f36810a;
                    if (z10) {
                        o71Var.j();
                    }
                    o71Var.h();
                }
                if ((z10 || objArr != null) && this.f52993e != null && (h = n0.h(this)) != null && this.f52996i > 0) {
                    int f10 = n0.f(this.f52998k);
                    int max2 = Math.max(50, Math.min(600, n0.f(this.f52996i)));
                    boolean z11 = this.f52999l;
                    if (f10 > 0 && h.f52881f == 0 && !h.f52885k && n0.l(h.a()).a(f10, max2, z11)) {
                        yr a02 = yr.a0(h.f52878b);
                        a02.f26723a.c(new br(a02, h.f52879c, h.d, f10, max2, z11 ? 1 : 0, 1));
                    }
                    ck0 ck0Var = h.f52895u;
                    if (ck0Var != null) {
                        ck0Var.p0("frame off screen");
                    }
                }
                if (f() && !z10 && (p71Var = this.h) != null) {
                    o71 o71Var2 = p71Var.f36810a;
                    o71Var2.j();
                    o71Var2.h();
                }
            }
        }
    }

    public final void i(String str, JSONObject jSONObject) {
        k0 h;
        String str2;
        if (this.f52993e != null && (h = n0.h(this)) != null) {
            String a10 = h.a();
            JSONObject jSONObject2 = (JSONObject) n0.f52930c.get(a10);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            try {
                jSONObject2.put(str, jSONObject);
            } catch (Exception unused) {
            }
            n0.f52930c.put(a10, jSONObject2);
            for (k0 k0Var : n0.f52928a.values()) {
                if (k0Var.f52894t != null && a10.equals(k0Var.a())) {
                    v0 v0Var = k0Var.f52894t;
                    try {
                        str2 = id.E0().f23189y.toLanguageTag();
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    String jSONObject3 = jSONObject2.toString();
                    v0Var.f53007t = str2;
                    v0Var.f53008u = jSONObject3;
                }
            }
            if ("local".equals(str)) {
                n0.d.put(a10, h);
                q61 q61Var = n0.f52931e;
                org.telegram.messenger.g0.r(q61Var);
                org.telegram.messenger.g0.i3(q61Var, 1000L);
            }
        }
    }

    public final void j(String str) {
        b h12;
        if (str != null && !str.equals(this.v)) {
            this.v = str;
            i1 i1Var = this.f52994f;
            if (i1Var != null) {
                long j3 = i1Var.v;
                if (!i1Var.f52867w && j3 != 0) {
                    r0 r0Var = i1Var.f52850c;
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    o0 o0Var = (o0) r0Var.f52971e.get(Long.valueOf(j3));
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
            if (this.f53011y && z10 == this.f53012z) {
                return;
            }
        }
        this.f53011y = z9;
        this.f53012z = z10;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f10), Float.valueOf(f11));
        if (format.equals(this.f53010x)) {
            return;
        }
        this.f53010x = format;
        org.telegram.messenger.g0.h3(new j0(this, 3));
    }

    public final void l(String str) {
        b h12;
        if (str != null && !str.equals(this.f53006s)) {
            this.f53006s = str;
            this.f53000m = str.contains("\"dark\"");
            i1 i1Var = this.f52994f;
            if (i1Var != null && !i1Var.f52867w && !str.equals(i1Var.B)) {
                i1Var.B = str;
                str.contains("\"dark\"");
                long j3 = i1Var.v;
                if (j3 != 0) {
                    r0 r0Var = i1Var.f52850c;
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    o0 o0Var = (o0) r0Var.f52971e.get(Long.valueOf(j3));
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
        this.f53001n = z9;
        i1 i1Var = this.f52994f;
        if (i1Var != null) {
            if (z9 && !this.f53003p) {
                z10 = true;
            } else {
                z10 = false;
            }
            i1Var.f(z10);
        }
    }

    public final void n(int i7) {
        b h12;
        if (i7 > 0 && i7 != this.f52997j) {
            this.f52997j = i7;
            i1 i1Var = this.f52994f;
            if (i1Var != null && i7 > 0 && i7 != i1Var.G && !i1Var.f52867w) {
                i1Var.G = i7;
                long j3 = i1Var.v;
                if (j3 != 0) {
                    r0 r0Var = i1Var.f52850c;
                    float f10 = i7 / i1Var.f52857l;
                    o0 o0Var = (o0) r0Var.f52971e.get(Long.valueOf(j3));
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
        i1 i1Var = this.f52994f;
        if (i1Var != null) {
            if (i7 == 0 && i1Var.F) {
                d0 d0Var = i1Var.d;
                synchronized (d0Var) {
                    d0Var.d++;
                    d0Var.f52781f = SystemClock.elapsedRealtime();
                }
            }
            long j3 = i1Var.v;
            if (!i1Var.f52867w && j3 != 0) {
                o0 o0Var = (o0) i1Var.f52850c.f52971e.get(Long.valueOf(j3));
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
        this.f53002o = false;
        if (this.f52994f != null) {
            g1 d = d();
            if (d != null) {
                this.f52995g = d;
            }
            i1 i1Var = this.f52994f;
            if (!i1Var.f52867w) {
                i1Var.f52867w = true;
                i1Var.L = null;
                i1Var.f52848a.removeCallbacks(i1Var.P);
                i1Var.f52848a.removeCallbacks(i1Var.O);
                i1Var.f52848a.removeCallbacks(i1Var.Q);
                if (i1Var.D) {
                    Choreographer.getInstance().removeFrameCallback(i1Var.R);
                }
                i1Var.D = false;
                synchronized (i1Var.f52864s) {
                    try {
                        g1 g1Var = i1Var.I;
                        if (g1Var != null) {
                            g1Var.f52803a.b();
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
                    a1.f52766a.execute(new r31(i1Var, j3, 2));
                }
            }
            this.f52994f = null;
            if (this.A) {
                this.A = false;
                if (this.f52993e != null) {
                    n0.E();
                }
            }
        }
    }
}
