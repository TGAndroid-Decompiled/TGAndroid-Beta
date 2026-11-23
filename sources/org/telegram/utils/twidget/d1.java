package org.telegram.utils.twidget;

import android.content.Context;
import android.os.SystemClock;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.ur;
import org.telegram.messenger.xq;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.qx0;
public final class d1 {
    public boolean A;
    public long B;
    public int C;
    public long D;
    public final String f54736a;
    public final String f54737b;
    public final Context f54738c;
    public sa.d f54739e;
    public p1 f54740f;
    public n1 f54741g;
    public d81 h;
    public int f54742i;
    public int f54743j;
    public int f54744k;
    public boolean f54745l;
    public boolean f54747n;
    public boolean f54748o;
    public boolean f54749p;
    public int f54750q;
    public int f54751r;
    public String f54752s;
    public String f54753t;
    public String f54754u;
    public volatile String f54756x;
    public boolean f54757y;
    public boolean f54758z;
    public String v = "{}";
    public String f54755w = "{}";
    public boolean f54746m = false;
    public final int d = 1;

    public d1(Context context, String str, String str2) {
        this.f54738c = context.getApplicationContext();
        this.f54736a = str;
        this.f54737b = str2;
    }

    public final void a() {
        final p1 p1Var;
        boolean z10;
        if (this.f54748o || p1.a()) {
            return;
        }
        this.f54748o = true;
        p1 p1Var2 = this.f54740f;
        if (p1Var2 != null) {
            p1Var2.I = true;
            return;
        }
        String str = this.f54752s;
        if (str == null && this.f54753t == null && this.f54754u == null) {
            p1Var = new p1(this.f54738c, this.f54737b, q1.d(this.f54746m), this.d, null, null);
        } else {
            Context context = this.f54738c;
            String str2 = this.f54737b;
            if (str == null) {
                str = q1.d(this.f54746m);
            }
            p1Var = new p1(context, str2, str, this.d, this.f54753t, this.f54754u);
        }
        String str3 = "{\"data\":" + this.v + ",\"context\":" + this.f54755w + "}";
        if (str3 != null) {
            p1Var.f54937j = str3;
            try {
                p1Var.d = new e0(new JSONObject(str3).optJSONObject("context"));
            } catch (Exception unused) {
                p1Var.d = new e0(null);
            }
        }
        p1Var.f(this.f54756x);
        p1Var.f54952z = this.B;
        p1Var.R = this;
        p1Var.T = this;
        if (this.f54747n && !this.f54749p) {
            z10 = true;
        } else {
            z10 = false;
        }
        p1Var.g(z10);
        this.f54740f = p1Var;
        this.f54750q++;
        final int i7 = this.f54743j;
        i1.f54833a.execute(new Runnable() {
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
        p1 p1Var = this.f54740f;
        if (p1Var != null) {
            e0 e0Var = p1Var.d;
            if (i7 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (e0Var) {
                try {
                    if (e0Var.f54767j && z10) {
                        e0Var.h = SystemClock.elapsedRealtime();
                    }
                    e0Var.f54767j = false;
                    e0Var.f54766i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = p1Var.v;
            if (!p1Var.A && j10 != 0) {
                l lVar = p1Var.f54930c;
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
        p1 p1Var = this.f54740f;
        if (p1Var != null && !p1Var.A && p1Var.v != 0 && !p1Var.K) {
            n1 n1Var = p1Var.N;
            if (n1Var == null || (((i7 = p1Var.M) != 0 && Math.abs(n1Var.d - i7) > 1) || !n1Var.a())) {
                p1Var.K = true;
                p1Var.f54930c.i(p1Var.v);
            }
        }
    }

    public final n1 d() {
        n1 n1Var;
        p1 p1Var = this.f54740f;
        if (p1Var == null) {
            n1Var = null;
        } else {
            n1Var = p1Var.N;
        }
        if (n1Var != null && (this.f54741g == null || p1Var.B)) {
            return n1Var;
        }
        n1 n1Var2 = this.f54741g;
        if (n1Var2 != null && Math.abs(n1Var2.d - this.f54743j) <= 1) {
            return this.f54741g;
        }
        if (n1Var != null) {
            return n1Var;
        }
        return this.f54741g;
    }

    public final boolean e() {
        p1 p1Var;
        n1 n1Var;
        if (this.f54751r != this.f54750q && (p1Var = this.f54740f) != null && (n1Var = p1Var.N) != null) {
            if (n1Var.h || p1Var.F) {
                this.f54751r = this.f54750q;
                if (this.f54739e != null) {
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
        if (this.f54739e != null) {
            a8.d("widget " + this.f54736a + ": " + str);
        }
        d81 d81Var = this.h;
        if (d81Var != null) {
            d81Var.f34401a.h();
        }
    }

    public final void g(p1 p1Var) {
        n1 n1Var;
        Object[] objArr;
        k0 h;
        d81 d81Var;
        if (p1Var == this.f54740f && (n1Var = p1Var.N) != null) {
            if (this.f54741g == null || p1Var.B) {
                this.f54741g = null;
                this.f54744k = n1Var.d;
                boolean z10 = n1Var.f54908i;
                boolean z11 = false;
                if (z10 != this.f54745l) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.f54745l = z10;
                int max = Math.max(1, n1Var.f54905e);
                if (max != this.f54742i) {
                    z11 = true;
                }
                this.f54742i = max;
                d81 d81Var2 = this.h;
                if (d81Var2 != null) {
                    c81 c81Var = d81Var2.f34401a;
                    if (z11) {
                        c81Var.j();
                    }
                    c81Var.h();
                }
                if ((z11 || objArr != null) && this.f54739e != null && (h = n0.h(this)) != null && this.f54742i > 0) {
                    int f10 = n0.f(this.f54744k);
                    int max2 = Math.max(50, Math.min(600, n0.f(this.f54742i)));
                    boolean z12 = this.f54745l;
                    if (f10 > 0 && h.f54849f == 0 && !h.f54853k && n0.l(h.a()).a(f10, max2, z12)) {
                        ur a02 = ur.a0(h.f54846b);
                        a02.f27250a.c(new xq(a02, h.f54847c, h.d, f10, max2, z12 ? 1 : 0, 1));
                    }
                    rk0 rk0Var = h.f54863u;
                    if (rk0Var != null) {
                        rk0Var.p0("frame off screen");
                    }
                }
                if (e() && !z11 && (d81Var = this.h) != null) {
                    c81 c81Var2 = d81Var.f34401a;
                    c81Var2.j();
                    c81Var2.h();
                }
            }
        }
    }

    public final void h(String str) {
        if (str != null && !str.equals(this.v)) {
            this.v = str;
            p1 p1Var = this.f54740f;
            if (p1Var != null) {
                long j3 = p1Var.v;
                if (!p1Var.A && j3 != 0) {
                    p1Var.f54930c.d(j3, str.getBytes(StandardCharsets.UTF_8));
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
            if (this.f54757y && z11 == this.f54758z) {
                return;
            }
        }
        this.f54757y = z10;
        this.f54758z = z11;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f10), Float.valueOf(f11));
        if (format.equals(this.f54756x)) {
            return;
        }
        this.f54756x = format;
        org.telegram.messenger.g0.g3(new j0(this, 3));
    }

    public final void j(String str) {
        if (str != null && !str.equals(this.f54752s)) {
            this.f54752s = str;
            this.f54746m = str.contains("\"dark\"");
            p1 p1Var = this.f54740f;
            if (p1Var != null && !p1Var.A && str != null && !str.equals(p1Var.H)) {
                p1Var.H = str;
                str.contains("\"dark\"");
                long j3 = p1Var.v;
                if (j3 != 0) {
                    p1Var.f54930c.k(j3, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final void k(boolean z10) {
        boolean z11;
        this.f54747n = z10;
        p1 p1Var = this.f54740f;
        if (p1Var != null) {
            if (z10 && !this.f54749p) {
                z11 = true;
            } else {
                z11 = false;
            }
            p1Var.g(z11);
        }
    }

    public final void l(int i7) {
        if (i7 > 0 && i7 != this.f54743j) {
            this.f54743j = i7;
            p1 p1Var = this.f54740f;
            if (p1Var != null && i7 > 0 && i7 != p1Var.M && !p1Var.A) {
                p1Var.M = i7;
                long j3 = p1Var.v;
                if (j3 != 0) {
                    p1Var.f54930c.p(j3, i7 / p1Var.f54939l);
                }
            }
        }
    }

    public final void m() {
        this.f54748o = false;
        if (this.f54740f != null) {
            n1 d = d();
            if (d != null) {
                this.f54741g = d;
            }
            p1 p1Var = this.f54740f;
            if (!p1Var.A) {
                p1Var.A = true;
                p1Var.R = null;
                p1Var.f54926a.removeCallbacks(p1Var.W);
                p1Var.f54926a.removeCallbacks(p1Var.V);
                p1Var.f54926a.removeCallbacks(p1Var.X);
                p1Var.f54926a.removeCallbacks(p1Var.f54929b0);
                if (p1Var.J) {
                    Choreographer.getInstance().removeFrameCallback(p1Var.Y);
                }
                p1Var.J = false;
                synchronized (p1Var.f54946s) {
                    try {
                        n1 n1Var = p1Var.O;
                        if (n1Var != null) {
                            n1Var.f54902a.b();
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
                    i1.f54833a.execute(new qx0(p1Var, j3, 3));
                }
            }
            this.f54740f = null;
            if (this.A) {
                this.A = false;
                sa.d dVar = this.f54739e;
                if (dVar != null) {
                    dVar.getClass();
                    n0.E();
                }
            }
        }
    }
}
