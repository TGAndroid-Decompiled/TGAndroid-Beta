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
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.ox0;
public final class d1 {
    public boolean A;
    public long B;
    public int C;
    public long D;
    public final String f54817a;
    public final String f54818b;
    public final Context f54819c;
    public sa.d f54820e;
    public p1 f54821f;
    public n1 f54822g;
    public e81 h;
    public int f54823i;
    public int f54824j;
    public int f54825k;
    public boolean f54826l;
    public boolean f54828n;
    public boolean f54829o;
    public boolean f54830p;
    public int f54831q;
    public int f54832r;
    public String f54833s;
    public String f54834t;
    public String f54835u;
    public volatile String f54837x;
    public boolean f54838y;
    public boolean f54839z;
    public String v = "{}";
    public String f54836w = "{}";
    public boolean f54827m = false;
    public final int d = 1;

    public d1(Context context, String str, String str2) {
        this.f54819c = context.getApplicationContext();
        this.f54817a = str;
        this.f54818b = str2;
    }

    public final void a() {
        final p1 p1Var;
        boolean z10;
        if (this.f54829o || p1.a()) {
            return;
        }
        this.f54829o = true;
        p1 p1Var2 = this.f54821f;
        if (p1Var2 != null) {
            p1Var2.I = true;
            return;
        }
        String str = this.f54833s;
        if (str == null && this.f54834t == null && this.f54835u == null) {
            p1Var = new p1(this.f54819c, this.f54818b, q1.d(this.f54827m), this.d, null, null);
        } else {
            Context context = this.f54819c;
            String str2 = this.f54818b;
            if (str == null) {
                str = q1.d(this.f54827m);
            }
            p1Var = new p1(context, str2, str, this.d, this.f54834t, this.f54835u);
        }
        String str3 = "{\"data\":" + this.v + ",\"context\":" + this.f54836w + "}";
        if (str3 != null) {
            p1Var.f55018j = str3;
            try {
                p1Var.d = new e0(new JSONObject(str3).optJSONObject("context"));
            } catch (Exception unused) {
                p1Var.d = new e0(null);
            }
        }
        p1Var.f(this.f54837x);
        p1Var.f55033z = this.B;
        p1Var.R = this;
        p1Var.T = this;
        if (this.f54828n && !this.f54830p) {
            z10 = true;
        } else {
            z10 = false;
        }
        p1Var.g(z10);
        this.f54821f = p1Var;
        this.f54831q++;
        final int i7 = this.f54824j;
        i1.f54914a.execute(new Runnable() {
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
        p1 p1Var = this.f54821f;
        if (p1Var != null) {
            e0 e0Var = p1Var.d;
            if (i7 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (e0Var) {
                try {
                    if (e0Var.f54848j && z10) {
                        e0Var.h = SystemClock.elapsedRealtime();
                    }
                    e0Var.f54848j = false;
                    e0Var.f54847i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = p1Var.v;
            if (!p1Var.A && j10 != 0) {
                l lVar = p1Var.f55011c;
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
        p1 p1Var = this.f54821f;
        if (p1Var != null && !p1Var.A && p1Var.v != 0 && !p1Var.K) {
            n1 n1Var = p1Var.N;
            if (n1Var == null || (((i7 = p1Var.M) != 0 && Math.abs(n1Var.d - i7) > 1) || !n1Var.a())) {
                p1Var.K = true;
                p1Var.f55011c.i(p1Var.v);
            }
        }
    }

    public final n1 d() {
        n1 n1Var;
        p1 p1Var = this.f54821f;
        if (p1Var == null) {
            n1Var = null;
        } else {
            n1Var = p1Var.N;
        }
        if (n1Var != null && (this.f54822g == null || p1Var.B)) {
            return n1Var;
        }
        n1 n1Var2 = this.f54822g;
        if (n1Var2 != null && Math.abs(n1Var2.d - this.f54824j) <= 1) {
            return this.f54822g;
        }
        if (n1Var != null) {
            return n1Var;
        }
        return this.f54822g;
    }

    public final boolean e() {
        p1 p1Var;
        n1 n1Var;
        if (this.f54832r != this.f54831q && (p1Var = this.f54821f) != null && (n1Var = p1Var.N) != null) {
            if (n1Var.h || p1Var.F) {
                this.f54832r = this.f54831q;
                if (this.f54820e != null) {
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
        if (this.f54820e != null) {
            a8.d("widget " + this.f54817a + ": " + str);
        }
        e81 e81Var = this.h;
        if (e81Var != null) {
            e81Var.f34645a.h();
        }
    }

    public final void g(p1 p1Var) {
        n1 n1Var;
        Object[] objArr;
        k0 h;
        e81 e81Var;
        if (p1Var == this.f54821f && (n1Var = p1Var.N) != null) {
            if (this.f54822g == null || p1Var.B) {
                this.f54822g = null;
                this.f54825k = n1Var.d;
                boolean z10 = n1Var.f54989i;
                boolean z11 = false;
                if (z10 != this.f54826l) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                this.f54826l = z10;
                int max = Math.max(1, n1Var.f54986e);
                if (max != this.f54823i) {
                    z11 = true;
                }
                this.f54823i = max;
                e81 e81Var2 = this.h;
                if (e81Var2 != null) {
                    d81 d81Var = e81Var2.f34645a;
                    if (z11) {
                        d81Var.j();
                    }
                    d81Var.h();
                }
                if ((z11 || objArr != null) && this.f54820e != null && (h = n0.h(this)) != null && this.f54823i > 0) {
                    int f10 = n0.f(this.f54825k);
                    int max2 = Math.max(50, Math.min(600, n0.f(this.f54823i)));
                    boolean z12 = this.f54826l;
                    if (f10 > 0 && h.f54930f == 0 && !h.f54934k && n0.l(h.a()).a(f10, max2, z12)) {
                        tr a02 = tr.a0(h.f54927b);
                        a02.f27149a.c(new wq(a02, h.f54928c, h.d, f10, max2, z12 ? 1 : 0, 1));
                    }
                    rk0 rk0Var = h.f54944u;
                    if (rk0Var != null) {
                        rk0Var.p0("frame off screen");
                    }
                }
                if (e() && !z11 && (e81Var = this.h) != null) {
                    d81 d81Var2 = e81Var.f34645a;
                    d81Var2.j();
                    d81Var2.h();
                }
            }
        }
    }

    public final void h(String str) {
        if (str != null && !str.equals(this.v)) {
            this.v = str;
            p1 p1Var = this.f54821f;
            if (p1Var != null) {
                long j3 = p1Var.v;
                if (!p1Var.A && j3 != 0) {
                    p1Var.f55011c.d(j3, str.getBytes(StandardCharsets.UTF_8));
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
            if (this.f54838y && z11 == this.f54839z) {
                return;
            }
        }
        this.f54838y = z10;
        this.f54839z = z11;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f10), Float.valueOf(f11));
        if (format.equals(this.f54837x)) {
            return;
        }
        this.f54837x = format;
        org.telegram.messenger.g0.g3(new j0(this, 3));
    }

    public final void j(String str) {
        if (str != null && !str.equals(this.f54833s)) {
            this.f54833s = str;
            this.f54827m = str.contains("\"dark\"");
            p1 p1Var = this.f54821f;
            if (p1Var != null && !p1Var.A && str != null && !str.equals(p1Var.H)) {
                p1Var.H = str;
                str.contains("\"dark\"");
                long j3 = p1Var.v;
                if (j3 != 0) {
                    p1Var.f55011c.k(j3, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final void k(boolean z10) {
        boolean z11;
        this.f54828n = z10;
        p1 p1Var = this.f54821f;
        if (p1Var != null) {
            if (z10 && !this.f54830p) {
                z11 = true;
            } else {
                z11 = false;
            }
            p1Var.g(z11);
        }
    }

    public final void l(int i7) {
        if (i7 > 0 && i7 != this.f54824j) {
            this.f54824j = i7;
            p1 p1Var = this.f54821f;
            if (p1Var != null && i7 > 0 && i7 != p1Var.M && !p1Var.A) {
                p1Var.M = i7;
                long j3 = p1Var.v;
                if (j3 != 0) {
                    p1Var.f55011c.p(j3, i7 / p1Var.f55020l);
                }
            }
        }
    }

    public final void m() {
        this.f54829o = false;
        if (this.f54821f != null) {
            n1 d = d();
            if (d != null) {
                this.f54822g = d;
            }
            p1 p1Var = this.f54821f;
            if (!p1Var.A) {
                p1Var.A = true;
                p1Var.R = null;
                p1Var.f55007a.removeCallbacks(p1Var.W);
                p1Var.f55007a.removeCallbacks(p1Var.V);
                p1Var.f55007a.removeCallbacks(p1Var.X);
                p1Var.f55007a.removeCallbacks(p1Var.f55010b0);
                if (p1Var.J) {
                    Choreographer.getInstance().removeFrameCallback(p1Var.Y);
                }
                p1Var.J = false;
                synchronized (p1Var.f55027s) {
                    try {
                        n1 n1Var = p1Var.O;
                        if (n1Var != null) {
                            n1Var.f54983a.b();
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
                    i1.f54914a.execute(new ox0(p1Var, j3, 3));
                }
            }
            this.f54821f = null;
            if (this.A) {
                this.A = false;
                sa.d dVar = this.f54820e;
                if (dVar != null) {
                    dVar.getClass();
                    n0.E();
                }
            }
        }
    }
}
