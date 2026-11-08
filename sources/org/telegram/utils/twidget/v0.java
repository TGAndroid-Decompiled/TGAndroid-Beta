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
import org.telegram.ui.o61;
import org.telegram.ui.p31;
public final class v0 {
    public boolean A;
    public int B;
    public long C;
    public final String f52976a;
    public final String f52977b;
    public final Context f52978c;
    public nb.a f52979e;
    public h1 f52980f;
    public f1 f52981g;
    public p71 h;
    public int f52982i;
    public int f52983j;
    public int f52984k;
    public boolean f52985l;
    public boolean f52987n;
    public boolean f52988o;
    public boolean f52989p;
    public int f52990q;
    public int f52991r;
    public String f52992s;
    public String f52993t;
    public String f52994u;
    public volatile String f52996x;
    public boolean f52997y;
    public boolean f52998z;
    public String v = "{}";
    public String f52995w = "{}";
    public boolean f52986m = false;
    public final int d = 1;

    public v0(Context context, String str, String str2) {
        this.f52978c = context.getApplicationContext();
        this.f52976a = str;
        this.f52977b = str2;
    }

    public final void a() {
        final h1 h1Var;
        boolean z9;
        if (this.f52988o || h1.a()) {
            return;
        }
        this.f52988o = true;
        h1 h1Var2 = this.f52980f;
        if (h1Var2 != null) {
            h1Var2.C = true;
            return;
        }
        String str = this.f52992s;
        String str2 = "light";
        if (str == null && this.f52993t == null && this.f52994u == null) {
            Context context = this.f52978c;
            String str3 = this.f52977b;
            boolean z10 = this.f52986m;
            int i7 = this.d;
            int[] iArr = i1.f52857a;
            StringBuilder sb2 = new StringBuilder("{\"colorScheme\":\"");
            if (z10) {
                str2 = "dark";
            }
            h1Var = new h1(context, str3, a8.p0.s(sb2, str2, "\"}"), i7, null, null);
        } else {
            Context context2 = this.f52978c;
            String str4 = this.f52977b;
            if (str == null) {
                boolean z11 = this.f52986m;
                int[] iArr2 = i1.f52857a;
                StringBuilder sb3 = new StringBuilder("{\"colorScheme\":\"");
                if (z11) {
                    str2 = "dark";
                }
                str = a8.p0.s(sb3, str2, "\"}");
            }
            h1Var = new h1(context2, str4, str, this.d, this.f52993t, this.f52994u);
        }
        StringBuilder sb4 = new StringBuilder("{\"data\":");
        sb4.append(this.v);
        sb4.append(",\"context\":");
        String s5 = a8.p0.s(sb4, this.f52995w, "}");
        if (s5 != null) {
            h1Var.f52832j = s5;
            try {
                h1Var.d = new d0(new JSONObject(s5).optJSONObject("context"));
            } catch (Exception unused) {
                h1Var.d = new d0(null);
            }
        }
        h1Var.d(this.f52996x);
        h1Var.L = this;
        h1Var.M = this;
        if (this.f52987n && !this.f52989p) {
            z9 = true;
        } else {
            z9 = false;
        }
        h1Var.e(z9);
        this.f52980f = h1Var;
        this.f52990q++;
        final int i10 = this.f52983j;
        a1.f52753a.execute(new Runnable() {
            @Override
            public final void run() {
                try {
                    h1.this.f(i10);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public final void b(int i7, String str, long j3) {
        boolean z9;
        byte[] bytes;
        h1 h1Var = this.f52980f;
        if (h1Var != null) {
            d0 d0Var = h1Var.d;
            if (i7 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            synchronized (d0Var) {
                try {
                    if (d0Var.f52771j && z9) {
                        d0Var.h = SystemClock.elapsedRealtime();
                    }
                    d0Var.f52771j = false;
                    d0Var.f52770i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = h1Var.v;
            if (!h1Var.f52844w && j10 != 0) {
                r0 r0Var = h1Var.f52827c;
                b bVar = null;
                if (str == null) {
                    bytes = null;
                } else {
                    bytes = str.getBytes(StandardCharsets.UTF_8);
                }
                o0 o0Var = (o0) r0Var.f52957e.get(Long.valueOf(j10));
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
        h1 h1Var = this.f52980f;
        if (h1Var != null && !h1Var.f52844w && h1Var.v != 0 && !h1Var.E) {
            f1 f1Var = h1Var.H;
            if (f1Var == null || (((i7 = h1Var.G) != 0 && Math.abs(f1Var.d - i7) > 1) || !f1Var.a())) {
                h1Var.E = true;
                o0 o0Var = (o0) h1Var.f52827c.f52957e.get(Long.valueOf(h1Var.v));
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

    public final f1 d() {
        f1 f1Var;
        h1 h1Var = this.f52980f;
        if (h1Var == null) {
            f1Var = null;
        } else {
            f1Var = h1Var.H;
        }
        if (f1Var != null && (this.f52981g == null || h1Var.f52845x)) {
            return f1Var;
        }
        f1 f1Var2 = this.f52981g;
        if (f1Var2 != null && Math.abs(f1Var2.d - this.f52983j) <= 1) {
            return this.f52981g;
        }
        if (f1Var != null) {
            return f1Var;
        }
        return this.f52981g;
    }

    public final void e(float f10, float f11, int i7, int i10) {
        b h12;
        h1 h1Var = this.f52980f;
        if (h1Var != null) {
            long j3 = h1Var.v;
            if (!h1Var.f52844w && j3 != 0) {
                o0 o0Var = (o0) h1Var.f52827c.f52957e.get(Long.valueOf(j3));
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
        h1 h1Var;
        f1 f1Var;
        if (this.f52991r != this.f52990q && (h1Var = this.f52980f) != null && (f1Var = h1Var.H) != null) {
            if (f1Var.f52791g || h1Var.f52847z) {
                this.f52991r = this.f52990q;
                if (this.f52979e != null) {
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
        if (this.f52979e != null) {
            a8.d("widget " + this.f52976a + ": " + str);
        }
        p71 p71Var = this.h;
        if (p71Var != null) {
            p71Var.f36814a.h();
        }
    }

    public final void h(h1 h1Var) {
        f1 f1Var;
        Object[] objArr;
        k0 h;
        p71 p71Var;
        if (h1Var == this.f52980f && (f1Var = h1Var.H) != null) {
            if (this.f52981g == null || h1Var.f52845x) {
                this.f52981g = null;
                this.f52984k = f1Var.d;
                boolean z9 = f1Var.h;
                boolean z10 = false;
                if (z9 != this.f52985l) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.f52985l = z9;
                int max = Math.max(1, f1Var.f52789e);
                if (max != this.f52982i) {
                    z10 = true;
                }
                this.f52982i = max;
                p71 p71Var2 = this.h;
                if (p71Var2 != null) {
                    o71 o71Var = p71Var2.f36814a;
                    if (z10) {
                        o71Var.j();
                    }
                    o71Var.h();
                }
                if ((z10 || objArr != null) && this.f52979e != null && (h = n0.h(this)) != null && this.f52982i > 0) {
                    int f10 = n0.f(this.f52984k);
                    int max2 = Math.max(50, Math.min(600, n0.f(this.f52982i)));
                    boolean z11 = this.f52985l;
                    if (f10 > 0 && h.f52871f == 0 && !h.f52875k && n0.l(h.a()).a(f10, max2, z11)) {
                        yr a02 = yr.a0(h.f52868b);
                        a02.f26719a.c(new br(a02, h.f52869c, h.d, f10, max2, z11 ? 1 : 0, 1));
                    }
                    ck0 ck0Var = h.f52885u;
                    if (ck0Var != null) {
                        ck0Var.p0("frame off screen");
                    }
                }
                if (f() && !z10 && (p71Var = this.h) != null) {
                    o71 o71Var2 = p71Var.f36814a;
                    o71Var2.j();
                    o71Var2.h();
                }
            }
        }
    }

    public final void i(String str, JSONObject jSONObject) {
        k0 h;
        String str2;
        if (this.f52979e != null && (h = n0.h(this)) != null) {
            String a10 = h.a();
            JSONObject jSONObject2 = (JSONObject) n0.f52918c.get(a10);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            try {
                jSONObject2.put(str, jSONObject);
            } catch (Exception unused) {
            }
            n0.f52918c.put(a10, jSONObject2);
            for (k0 k0Var : n0.f52916a.values()) {
                if (k0Var.f52884t != null && a10.equals(k0Var.a())) {
                    v0 v0Var = k0Var.f52884t;
                    try {
                        str2 = id.E0().f23185y.toLanguageTag();
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    String jSONObject3 = jSONObject2.toString();
                    v0Var.f52993t = str2;
                    v0Var.f52994u = jSONObject3;
                }
            }
            if ("local".equals(str)) {
                n0.d.put(a10, h);
                o61 o61Var = n0.f52919e;
                org.telegram.messenger.g0.r(o61Var);
                org.telegram.messenger.g0.i3(o61Var, 1000L);
            }
        }
    }

    public final void j(String str) {
        b h12;
        if (str != null && !str.equals(this.v)) {
            this.v = str;
            h1 h1Var = this.f52980f;
            if (h1Var != null) {
                long j3 = h1Var.v;
                if (!h1Var.f52844w && j3 != 0) {
                    r0 r0Var = h1Var.f52827c;
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    o0 o0Var = (o0) r0Var.f52957e.get(Long.valueOf(j3));
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
            if (this.f52997y && z10 == this.f52998z) {
                return;
            }
        }
        this.f52997y = z9;
        this.f52998z = z10;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f10), Float.valueOf(f11));
        if (format.equals(this.f52996x)) {
            return;
        }
        this.f52996x = format;
        org.telegram.messenger.g0.h3(new j0(this, 3));
    }

    public final void l(String str) {
        b h12;
        if (str != null && !str.equals(this.f52992s)) {
            this.f52992s = str;
            this.f52986m = str.contains("\"dark\"");
            h1 h1Var = this.f52980f;
            if (h1Var != null && !h1Var.f52844w && !str.equals(h1Var.B)) {
                h1Var.B = str;
                str.contains("\"dark\"");
                long j3 = h1Var.v;
                if (j3 != 0) {
                    r0 r0Var = h1Var.f52827c;
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    o0 o0Var = (o0) r0Var.f52957e.get(Long.valueOf(j3));
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
        this.f52987n = z9;
        h1 h1Var = this.f52980f;
        if (h1Var != null) {
            if (z9 && !this.f52989p) {
                z10 = true;
            } else {
                z10 = false;
            }
            h1Var.e(z10);
        }
    }

    public final void n(int i7) {
        b h12;
        if (i7 > 0 && i7 != this.f52983j) {
            this.f52983j = i7;
            h1 h1Var = this.f52980f;
            if (h1Var != null && i7 > 0 && i7 != h1Var.G && !h1Var.f52844w) {
                h1Var.G = i7;
                long j3 = h1Var.v;
                if (j3 != 0) {
                    r0 r0Var = h1Var.f52827c;
                    float f10 = i7 / h1Var.f52834l;
                    o0 o0Var = (o0) r0Var.f52957e.get(Long.valueOf(j3));
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
        h1 h1Var = this.f52980f;
        if (h1Var != null) {
            if (i7 == 0 && h1Var.F) {
                d0 d0Var = h1Var.d;
                synchronized (d0Var) {
                    d0Var.d++;
                    d0Var.f52768f = SystemClock.elapsedRealtime();
                }
            }
            long j3 = h1Var.v;
            if (!h1Var.f52844w && j3 != 0) {
                o0 o0Var = (o0) h1Var.f52827c.f52957e.get(Long.valueOf(j3));
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
        this.f52988o = false;
        if (this.f52980f != null) {
            f1 d = d();
            if (d != null) {
                this.f52981g = d;
            }
            h1 h1Var = this.f52980f;
            if (!h1Var.f52844w) {
                h1Var.f52844w = true;
                h1Var.L = null;
                h1Var.f52825a.removeCallbacks(h1Var.P);
                h1Var.f52825a.removeCallbacks(h1Var.O);
                h1Var.f52825a.removeCallbacks(h1Var.Q);
                if (h1Var.D) {
                    Choreographer.getInstance().removeFrameCallback(h1Var.R);
                }
                h1Var.D = false;
                synchronized (h1Var.f52841s) {
                    try {
                        f1 f1Var = h1Var.I;
                        if (f1Var != null) {
                            f1Var.f52786a.b();
                        }
                        h1Var.I = null;
                        h1Var.J = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                long j3 = h1Var.v;
                h1Var.v = 0L;
                if (j3 != 0) {
                    a1.f52753a.execute(new p31(h1Var, j3, 2));
                }
            }
            this.f52980f = null;
            if (this.A) {
                this.A = false;
                if (this.f52979e != null) {
                    n0.E();
                }
            }
        }
    }
}
