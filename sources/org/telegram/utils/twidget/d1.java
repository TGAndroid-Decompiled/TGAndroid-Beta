package org.telegram.utils.twidget;

import android.content.Context;
import android.os.SystemClock;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.tr;
import org.telegram.messenger.wq;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.z71;
import org.telegram.ui.qx0;
public final class d1 {
    public boolean A;
    public long B;
    public int C;
    public long D;
    public final String f54691a;
    public final String f54692b;
    public final Context f54693c;
    public sa.d f54694e;
    public p1 f54695f;
    public n1 f54696g;
    public a81 h;
    public int f54697i;
    public int f54698j;
    public int f54699k;
    public boolean f54700l;
    public boolean f54702n;
    public boolean f54703o;
    public boolean f54704p;
    public int f54705q;
    public int f54706r;
    public String f54707s;
    public String f54708t;
    public String f54709u;
    public volatile String f54711x;
    public boolean f54712y;
    public boolean f54713z;
    public String v = "{}";
    public String f54710w = "{}";
    public boolean f54701m = false;
    public final int d = 1;

    public d1(Context context, String str, String str2) {
        this.f54693c = context.getApplicationContext();
        this.f54691a = str;
        this.f54692b = str2;
    }

    public final void a() {
        final p1 p1Var;
        boolean z10;
        if (this.f54703o || p1.a()) {
            return;
        }
        this.f54703o = true;
        p1 p1Var2 = this.f54695f;
        if (p1Var2 != null) {
            p1Var2.I = true;
            return;
        }
        String str = this.f54707s;
        if (str == null && this.f54708t == null && this.f54709u == null) {
            p1Var = new p1(this.f54693c, this.f54692b, q1.d(this.f54701m), this.d, null, null);
        } else {
            Context context = this.f54693c;
            String str2 = this.f54692b;
            if (str == null) {
                str = q1.d(this.f54701m);
            }
            p1Var = new p1(context, str2, str, this.d, this.f54708t, this.f54709u);
        }
        String str3 = "{\"data\":" + this.v + ",\"context\":" + this.f54710w + "}";
        if (str3 != null) {
            p1Var.f54892j = str3;
            try {
                p1Var.d = new e0(new JSONObject(str3).optJSONObject("context"));
            } catch (Exception unused) {
                p1Var.d = new e0(null);
            }
        }
        p1Var.f(this.f54711x);
        p1Var.f54907z = this.B;
        p1Var.R = this;
        p1Var.T = this;
        if (this.f54702n && !this.f54704p) {
            z10 = true;
        } else {
            z10 = false;
        }
        p1Var.g(z10);
        this.f54695f = p1Var;
        this.f54705q++;
        final int i7 = this.f54698j;
        i1.f54788a.execute(new Runnable() {
            @Override
            public final void run() {
                try {
                    p1.this.h(i7);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public final void b(int i7, String str, long j3) {
        boolean z10;
        byte[] bytes;
        p1 p1Var = this.f54695f;
        if (p1Var != null) {
            e0 e0Var = p1Var.d;
            if (i7 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (e0Var) {
                try {
                    if (e0Var.f54722j && z10) {
                        e0Var.h = SystemClock.elapsedRealtime();
                    }
                    e0Var.f54722j = false;
                    e0Var.f54721i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = p1Var.v;
            if (!p1Var.A && j10 != 0) {
                l lVar = p1Var.f54885c;
                if (str == null) {
                    bytes = null;
                } else {
                    bytes = str.getBytes(StandardCharsets.UTF_8);
                }
                lVar.a(j10, j3, i7, bytes);
            }
        }
    }

    public final void c() {
        int i7;
        p1 p1Var = this.f54695f;
        if (p1Var != null && !p1Var.A && p1Var.v != 0 && !p1Var.K) {
            n1 n1Var = p1Var.N;
            if (n1Var == null || (((i7 = p1Var.M) != 0 && Math.abs(n1Var.d - i7) > 1) || !n1Var.a())) {
                p1Var.K = true;
                p1Var.f54885c.i(p1Var.v);
            }
        }
    }

    public final n1 d() {
        n1 n1Var;
        p1 p1Var = this.f54695f;
        if (p1Var == null) {
            n1Var = null;
        } else {
            n1Var = p1Var.N;
        }
        if (n1Var != null && (this.f54696g == null || p1Var.B)) {
            return n1Var;
        }
        n1 n1Var2 = this.f54696g;
        if (n1Var2 != null && Math.abs(n1Var2.d - this.f54698j) <= 1) {
            return this.f54696g;
        }
        if (n1Var != null) {
            return n1Var;
        }
        return this.f54696g;
    }

    public final boolean e() {
        p1 p1Var;
        n1 n1Var;
        if (this.f54706r != this.f54705q && (p1Var = this.f54695f) != null && (n1Var = p1Var.N) != null) {
            if (n1Var.h || p1Var.F) {
                this.f54706r = this.f54705q;
                if (this.f54694e != null) {
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

    public final void f(String str) {
        if (this.f54694e != null) {
            a8.d("widget " + this.f54691a + ": " + str);
        }
        a81 a81Var = this.h;
        if (a81Var != null) {
            a81Var.f33266a.h();
        }
    }

    public final void g(p1 p1Var) {
        n1 n1Var;
        Object[] objArr;
        k0 h;
        a81 a81Var;
        if (p1Var == this.f54695f && (n1Var = p1Var.N) != null) {
            if (this.f54696g == null || p1Var.B) {
                this.f54696g = null;
                this.f54699k = n1Var.d;
                boolean z10 = n1Var.f54863i;
                boolean z11 = false;
                if (z10 != this.f54700l) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.f54700l = z10;
                int max = Math.max(1, n1Var.f54860e);
                if (max != this.f54697i) {
                    z11 = true;
                }
                this.f54697i = max;
                a81 a81Var2 = this.h;
                if (a81Var2 != null) {
                    z71 z71Var = a81Var2.f33266a;
                    if (z11) {
                        z71Var.j();
                    }
                    z71Var.h();
                }
                if ((z11 || objArr != null) && this.f54694e != null && (h = n0.h(this)) != null && this.f54697i > 0) {
                    int f10 = n0.f(this.f54699k);
                    int max2 = Math.max(50, Math.min(600, n0.f(this.f54697i)));
                    boolean z12 = this.f54700l;
                    if (f10 > 0 && h.f54804f == 0 && !h.f54808k && n0.l(h.a()).a(f10, max2, z12)) {
                        tr a02 = tr.a0(h.f54801b);
                        a02.f27052a.c(new wq(a02, h.f54802c, h.d, f10, max2, z12 ? 1 : 0, 1));
                    }
                    pk0 pk0Var = h.f54818u;
                    if (pk0Var != null) {
                        pk0Var.p0("frame off screen");
                    }
                }
                if (e() && !z11 && (a81Var = this.h) != null) {
                    z71 z71Var2 = a81Var.f33266a;
                    z71Var2.j();
                    z71Var2.h();
                }
            }
        }
    }

    public final void h(String str) {
        if (str != null && !str.equals(this.v)) {
            this.v = str;
            p1 p1Var = this.f54695f;
            if (p1Var != null) {
                long j3 = p1Var.v;
                if (!p1Var.A && j3 != 0) {
                    p1Var.f54885c.d(j3, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final synchronized void i(float f10, float f11, boolean z10) {
        boolean z11;
        if (f10 > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            if (this.f54712y && z11 == this.f54713z) {
                return;
            }
        }
        this.f54712y = z10;
        this.f54713z = z11;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f10), Float.valueOf(f11));
        if (format.equals(this.f54711x)) {
            return;
        }
        this.f54711x = format;
        org.telegram.messenger.g0.g3(new j0(this, 3));
    }

    public final void j(String str) {
        if (str != null && !str.equals(this.f54707s)) {
            this.f54707s = str;
            this.f54701m = str.contains("\"dark\"");
            p1 p1Var = this.f54695f;
            if (p1Var != null && !p1Var.A && str != null && !str.equals(p1Var.H)) {
                p1Var.H = str;
                str.contains("\"dark\"");
                long j3 = p1Var.v;
                if (j3 != 0) {
                    p1Var.f54885c.k(j3, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final void k(boolean z10) {
        boolean z11;
        this.f54702n = z10;
        p1 p1Var = this.f54695f;
        if (p1Var != null) {
            if (z10 && !this.f54704p) {
                z11 = true;
            } else {
                z11 = false;
            }
            p1Var.g(z11);
        }
    }

    public final void l(int i7) {
        if (i7 > 0 && i7 != this.f54698j) {
            this.f54698j = i7;
            p1 p1Var = this.f54695f;
            if (p1Var != null && i7 > 0 && i7 != p1Var.M && !p1Var.A) {
                p1Var.M = i7;
                long j3 = p1Var.v;
                if (j3 != 0) {
                    p1Var.f54885c.p(j3, i7 / p1Var.f54894l);
                }
            }
        }
    }

    public final void m() {
        this.f54703o = false;
        if (this.f54695f != null) {
            n1 d = d();
            if (d != null) {
                this.f54696g = d;
            }
            p1 p1Var = this.f54695f;
            if (!p1Var.A) {
                p1Var.A = true;
                p1Var.R = null;
                p1Var.f54881a.removeCallbacks(p1Var.W);
                p1Var.f54881a.removeCallbacks(p1Var.V);
                p1Var.f54881a.removeCallbacks(p1Var.X);
                p1Var.f54881a.removeCallbacks(p1Var.f54884b0);
                if (p1Var.J) {
                    Choreographer.getInstance().removeFrameCallback(p1Var.Y);
                }
                p1Var.J = false;
                synchronized (p1Var.f54901s) {
                    try {
                        n1 n1Var = p1Var.O;
                        if (n1Var != null) {
                            n1Var.f54857a.b();
                        }
                        p1Var.O = null;
                        p1Var.P = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                long j3 = p1Var.v;
                p1Var.v = 0L;
                if (j3 != 0) {
                    i1.f54788a.execute(new qx0(p1Var, j3, 3));
                }
            }
            this.f54695f = null;
            if (this.A) {
                this.A = false;
                sa.d dVar = this.f54694e;
                if (dVar != null) {
                    dVar.getClass();
                    n0.E();
                }
            }
        }
    }
}
