package u2;

import android.content.Context;
import android.net.Uri;
import e9.x1;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import m.h3;
import v7.u6;
public final class q implements f0 {
    public final jg.f f46022a;
    public final qf.b f46023b;
    public t7.u f46024c;
    public final long d;
    public final long e;
    public final long f46025f;
    public final float f46026g;
    public final float h;
    public boolean f46027i;

    public q(Context context, c3.m mVar) {
        qf.b bVar = new qf.b(context, 20);
        t7.u uVar = new t7.u(28);
        this.f46023b = bVar;
        this.f46024c = uVar;
        jg.f fVar = new jg.f(mVar, uVar);
        this.f46022a = fVar;
        if (bVar != ((qf.b) fVar.f13016f)) {
            fVar.f13016f = bVar;
            ((HashMap) fVar.d).clear();
            ((HashMap) fVar.e).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f46025f = -9223372036854775807L;
        this.f46026g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f46027i = true;
    }

    public static f0 e(Class cls, g2.g gVar) {
        try {
            return (f0) cls.getConstructor(g2.g.class).newInstance(gVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public final a a(b2.p0 p0Var) {
        b2.k0 k0Var;
        boolean z10;
        boolean z11;
        Uri parse;
        boolean z12;
        b2.k0 k0Var2;
        b2.h0 h0Var;
        b2.k0 k0Var3;
        long j10;
        Uri uri;
        String str;
        b2.c0 c0Var;
        String str2;
        boolean z13;
        b2.k0 k0Var4;
        b2.h0 h0Var2;
        b2.g0 g0Var;
        b2.p0 p0Var2 = p0Var;
        p0Var2.f2282b.getClass();
        String scheme = p0Var2.f2282b.f2192a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(p0Var2.f2282b.f2193b, "application/x-image-uri")) {
            b2.k0 k0Var5 = p0Var2.f2282b;
            int K = e2.m0.K(k0Var5.f2192a, k0Var5.f2193b);
            if (p0Var2.f2282b.h != -9223372036854775807L) {
                c3.m mVar = (c3.m) this.f46022a.f13015c;
                synchronized (mVar) {
                    mVar.e = 1;
                }
                jg.f.a(this.f46022a);
            }
            try {
                f0 b10 = this.f46022a.b(K);
                b2.i0 a2 = p0Var2.f2283c.a();
                b2.j0 j0Var = p0Var2.f2283c;
                if (j0Var.f2176a == -9223372036854775807L) {
                    a2.f2165a = this.d;
                }
                if (j0Var.d == -3.4028235E38f) {
                    a2.d = this.f46026g;
                }
                if (j0Var.e == -3.4028235E38f) {
                    a2.e = this.h;
                }
                if (j0Var.f2177b == -9223372036854775807L) {
                    a2.f2166b = this.e;
                }
                if (j0Var.f2178c == -9223372036854775807L) {
                    a2.f2167c = this.f46025f;
                }
                b2.j0 j0Var2 = new b2.j0(a2);
                if (!j0Var2.equals(p0Var2.f2283c)) {
                    b2.g0 g0Var2 = new b2.g0();
                    List list = Collections.EMPTY_LIST;
                    e9.n0 n0Var = x1.e;
                    b2.l0 l0Var = b2.l0.d;
                    b2.f0 f0Var = p0Var2.e;
                    ?? obj = new Object();
                    obj.f2098a = f0Var.f2113b;
                    obj.f2099b = f0Var.d;
                    obj.f2100c = f0Var.e;
                    obj.d = f0Var.f2115f;
                    obj.e = f0Var.f2116g;
                    obj.f2101f = f0Var.h;
                    String str3 = p0Var2.f2281a;
                    b2.s0 s0Var = p0Var2.d;
                    p0Var2.f2283c.a();
                    b2.l0 l0Var2 = p0Var2.f2284f;
                    b2.k0 k0Var6 = p0Var2.f2282b;
                    if (k0Var6 != null) {
                        String str4 = k0Var6.f2195f;
                        String str5 = k0Var6.f2193b;
                        Uri uri2 = k0Var6.f2192a;
                        list = k0Var6.e;
                        n0Var = k0Var6.f2196g;
                        k0Var3 = null;
                        b2.h0 h0Var3 = k0Var6.f2194c;
                        if (h0Var3 != null) {
                            z11 = false;
                            ?? obj2 = new Object();
                            z10 = true;
                            obj2.f2144a = h0Var3.f2158a;
                            obj2.f2145b = h0Var3.f2159b;
                            obj2.f2146c = h0Var3.f2160c;
                            obj2.d = h0Var3.d;
                            obj2.e = h0Var3.e;
                            obj2.f2147f = h0Var3.f2161f;
                            obj2.f2148g = h0Var3.f2162g;
                            obj2.h = h0Var3.h;
                            g0Var = obj2;
                        } else {
                            z10 = true;
                            z11 = false;
                            g0Var = new b2.g0();
                        }
                        b2.c0 c0Var2 = k0Var6.d;
                        j10 = k0Var6.h;
                        c0Var = c0Var2;
                        str = str5;
                        uri = uri2;
                        str2 = str4;
                        g0Var2 = g0Var;
                    } else {
                        k0Var3 = null;
                        z10 = true;
                        z11 = false;
                        j10 = -9223372036854775807L;
                        uri = null;
                        str = null;
                        c0Var = null;
                        str2 = null;
                    }
                    List list2 = list;
                    e9.n0 n0Var2 = n0Var;
                    b2.i0 a10 = j0Var2.a();
                    if (g0Var2.f2145b != null && g0Var2.f2144a == null) {
                        z13 = z11 ? 1 : 0;
                    } else {
                        z13 = z10;
                    }
                    u6.p(z13);
                    if (uri != null) {
                        if (g0Var2.f2144a != null) {
                            h0Var2 = new b2.h0(g0Var2);
                        } else {
                            h0Var2 = k0Var3;
                        }
                        k0Var4 = new b2.k0(uri, str, h0Var2, c0Var, list2, str2, n0Var2, j10);
                    } else {
                        k0Var4 = k0Var3;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str6 = str3;
                    ?? e0Var = new b2.e0(obj);
                    b2.j0 j0Var3 = new b2.j0(a10);
                    if (s0Var == null) {
                        s0Var = b2.s0.L;
                    }
                    p0Var2 = new b2.p0(str6, e0Var, k0Var4, j0Var3, s0Var, l0Var2);
                    k0Var = k0Var3;
                } else {
                    k0Var = null;
                    z10 = true;
                    z11 = false;
                }
                a a11 = b10.a(p0Var2);
                e9.n0 n0Var3 = p0Var2.f2282b.f2196g;
                if (!n0Var3.isEmpty()) {
                    a[] aVarArr = new a[n0Var3.size() + 1];
                    aVarArr[z11 ? 1 : 0] = a11;
                    for (int i10 = z11 ? 1 : 0; i10 < n0Var3.size(); i10++) {
                        if (this.f46027i) {
                            b2.w wVar = new b2.w();
                            wVar.f2470r = b2.w0.n(((b2.o0) n0Var3.get(i10)).f2249b);
                            wVar.d = ((b2.o0) n0Var3.get(i10)).f2250c;
                            wVar.e = ((b2.o0) n0Var3.get(i10)).d;
                            wVar.f2459f = ((b2.o0) n0Var3.get(i10)).e;
                            wVar.f2457b = ((b2.o0) n0Var3.get(i10)).f2251f;
                            wVar.f2456a = ((b2.o0) n0Var3.get(i10)).f2252g;
                            b2.x xVar = new b2.x(wVar);
                            org.telegram.ui.web.o0 o0Var = new org.telegram.ui.web.o0(9, this, xVar);
                            qf.b bVar = this.f46023b;
                            rg.b0 b0Var = new rg.b0(o0Var, 8);
                            h3 h3Var = new h3(5);
                            oa.d dVar = new oa.d(27);
                            if (this.f46024c.a0(xVar)) {
                                b2.w a12 = xVar.a();
                                a12.f2470r = b2.w0.n("application/x-media3-cues");
                                a12.f2462j = xVar.f2523s;
                                a12.P = this.f46024c.H(xVar);
                                xVar = new b2.x(a12);
                            }
                            b2.x xVar2 = xVar;
                            int i11 = i10 + 1;
                            String uri3 = ((b2.o0) n0Var3.get(i10)).f2248a.toString();
                            b2.d0 d0Var = new b2.d0();
                            b2.g0 g0Var3 = new b2.g0();
                            List list3 = Collections.EMPTY_LIST;
                            x1 x1Var = x1.e;
                            b2.i0 i0Var = new b2.i0();
                            b2.l0 l0Var3 = b2.l0.d;
                            if (uri3 == null) {
                                parse = k0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (g0Var3.f2145b != null && g0Var3.f2144a == null) {
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = z10;
                            }
                            u6.p(z12);
                            if (parse != null) {
                                if (g0Var3.f2144a != null) {
                                    h0Var = new b2.h0(g0Var3);
                                } else {
                                    h0Var = k0Var;
                                }
                                k0Var2 = new b2.k0(parse, null, h0Var, null, list3, null, x1Var, -9223372036854775807L);
                            } else {
                                k0Var2 = k0Var;
                            }
                            b2.p0 p0Var3 = new b2.p0("", new b2.e0(d0Var), k0Var2, new b2.j0(i0Var), b2.s0.L, l0Var3);
                            k0Var2.getClass();
                            aVarArr[i11] = new y0(p0Var3, bVar, b0Var, h3Var.B(p0Var3), dVar, 1048576, xVar2);
                        } else {
                            qf.b bVar2 = this.f46023b;
                            bVar2.getClass();
                            aVarArr[i10 + 1] = new n1((b2.o0) n0Var3.get(i10), bVar2, new oa.d(27));
                        }
                    }
                    a11 = new o0(aVarArr);
                }
                b2.f0 f0Var2 = p0Var2.e;
                if (f0Var2.f2113b != 0 || f0Var2.d != Long.MIN_VALUE || f0Var2.f2115f) {
                    f fVar = new f(a11);
                    long j11 = f0Var2.f2113b;
                    if (j11 >= 0) {
                        z11 = z10;
                    }
                    u6.g(z11);
                    u6.p(!fVar.h);
                    fVar.f45913b = j11;
                    long j12 = f0Var2.d;
                    u6.p(!fVar.h);
                    fVar.f45914c = j12;
                    u6.p(!fVar.h);
                    fVar.d = !f0Var2.f2116g;
                    boolean z14 = f0Var2.e;
                    u6.p(!fVar.h);
                    fVar.e = z14;
                    boolean z15 = f0Var2.f2115f;
                    u6.p(!fVar.h);
                    fVar.f45915f = z15;
                    boolean z16 = f0Var2.h;
                    u6.p(!fVar.h);
                    fVar.f45916g = z16;
                    u6.p(!fVar.h);
                    fVar.h = z10;
                    a11 = new i(fVar);
                }
                p0Var2.f2282b.getClass();
                if (p0Var2.f2282b.d == null) {
                    return a11;
                }
                e2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return a11;
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }
        long j13 = p0Var2.f2282b.h;
        String str7 = e2.m0.f8375a;
        throw null;
    }

    @Override
    public final f0 b(boolean z10) {
        this.f46027i = z10;
        jg.f fVar = this.f46022a;
        fVar.f13013a = z10;
        c3.m mVar = (c3.m) fVar.f13015c;
        synchronized (mVar) {
            mVar.f4278b = z10;
        }
        for (f0 f0Var : ((HashMap) fVar.e).values()) {
            f0Var.b(z10);
        }
        return this;
    }

    @Override
    public final f0 c(int i10) {
        jg.f fVar = this.f46022a;
        fVar.f13014b = i10;
        c3.m mVar = (c3.m) fVar.f13015c;
        synchronized (mVar) {
            mVar.d = i10;
        }
        return this;
    }

    @Override
    public final f0 d(t7.u uVar) {
        this.f46024c = uVar;
        jg.f fVar = this.f46022a;
        fVar.f13017g = uVar;
        c3.m mVar = (c3.m) fVar.f13015c;
        synchronized (mVar) {
            mVar.f4279c = uVar;
        }
        for (f0 f0Var : ((HashMap) fVar.e).values()) {
            f0Var.d(uVar);
        }
        return this;
    }
}
