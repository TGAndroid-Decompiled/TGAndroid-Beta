package u2;

import android.content.Context;
import android.net.Uri;
import e9.x1;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import v7.t6;
public final class q implements f0 {
    public final p f49982a;
    public final hf.b f49983b;
    public t7.u f49984c;
    public final long d;
    public final long e;
    public final long f49985f;
    public final float f49986g;
    public final float h;
    public boolean f49987i;

    public q(Context context, c3.m mVar) {
        hf.b bVar = new hf.b(context);
        t7.u uVar = new t7.u(28);
        this.f49983b = bVar;
        this.f49984c = uVar;
        p pVar = new p(mVar, uVar);
        this.f49982a = pVar;
        if (bVar != pVar.d) {
            pVar.d = bVar;
            pVar.f49973b.clear();
            pVar.f49974c.clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f49985f = -9223372036854775807L;
        this.f49986g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f49987i = true;
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
        p0Var2.f2182b.getClass();
        String scheme = p0Var2.f2182b.f2091a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(p0Var2.f2182b.f2092b, "application/x-image-uri")) {
            b2.k0 k0Var5 = p0Var2.f2182b;
            int K = e2.l0.K(k0Var5.f2091a, k0Var5.f2092b);
            if (p0Var2.f2182b.h != -9223372036854775807L) {
                c3.m mVar = this.f49982a.f49972a;
                synchronized (mVar) {
                    mVar.e = 1;
                }
                p.a(this.f49982a);
            }
            try {
                f0 b10 = this.f49982a.b(K);
                b2.i0 a2 = p0Var2.f2183c.a();
                b2.j0 j0Var = p0Var2.f2183c;
                if (j0Var.f2077a == -9223372036854775807L) {
                    a2.f2064a = this.d;
                }
                if (j0Var.d == -3.4028235E38f) {
                    a2.d = this.f49986g;
                }
                if (j0Var.e == -3.4028235E38f) {
                    a2.e = this.h;
                }
                if (j0Var.f2078b == -9223372036854775807L) {
                    a2.f2065b = this.e;
                }
                if (j0Var.f2079c == -9223372036854775807L) {
                    a2.f2066c = this.f49985f;
                }
                b2.j0 j0Var2 = new b2.j0(a2);
                if (!j0Var2.equals(p0Var2.f2183c)) {
                    b2.g0 g0Var2 = new b2.g0();
                    List list = Collections.EMPTY_LIST;
                    e9.n0 n0Var = x1.e;
                    b2.l0 l0Var = b2.l0.d;
                    b2.f0 f0Var = p0Var2.e;
                    ?? obj = new Object();
                    obj.f1996a = f0Var.f2010b;
                    obj.f1997b = f0Var.d;
                    obj.f1998c = f0Var.e;
                    obj.d = f0Var.f2012f;
                    obj.e = f0Var.f2013g;
                    obj.f1999f = f0Var.h;
                    String str3 = p0Var2.f2181a;
                    b2.s0 s0Var = p0Var2.d;
                    p0Var2.f2183c.a();
                    b2.l0 l0Var2 = p0Var2.f2184f;
                    b2.k0 k0Var6 = p0Var2.f2182b;
                    if (k0Var6 != null) {
                        String str4 = k0Var6.f2094f;
                        String str5 = k0Var6.f2092b;
                        Uri uri2 = k0Var6.f2091a;
                        list = k0Var6.e;
                        n0Var = k0Var6.f2095g;
                        k0Var3 = null;
                        b2.h0 h0Var3 = k0Var6.f2093c;
                        if (h0Var3 != null) {
                            z11 = false;
                            ?? obj2 = new Object();
                            z10 = true;
                            obj2.f2041a = h0Var3.f2056a;
                            obj2.f2042b = h0Var3.f2057b;
                            obj2.f2043c = h0Var3.f2058c;
                            obj2.d = h0Var3.d;
                            obj2.e = h0Var3.e;
                            obj2.f2044f = h0Var3.f2059f;
                            obj2.f2045g = h0Var3.f2060g;
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
                    if (g0Var2.f2042b != null && g0Var2.f2041a == null) {
                        z13 = z11 ? 1 : 0;
                    } else {
                        z13 = z10;
                    }
                    t6.p(z13);
                    if (uri != null) {
                        if (g0Var2.f2041a != null) {
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
                e9.n0 n0Var3 = p0Var2.f2182b.f2095g;
                if (!n0Var3.isEmpty()) {
                    a[] aVarArr = new a[n0Var3.size() + 1];
                    aVarArr[z11 ? 1 : 0] = a11;
                    for (int i10 = z11 ? 1 : 0; i10 < n0Var3.size(); i10++) {
                        if (this.f49987i) {
                            b2.w wVar = new b2.w();
                            wVar.f2370r = b2.v0.n(((b2.o0) n0Var3.get(i10)).f2168b);
                            wVar.d = ((b2.o0) n0Var3.get(i10)).f2169c;
                            wVar.e = ((b2.o0) n0Var3.get(i10)).d;
                            wVar.f2359f = ((b2.o0) n0Var3.get(i10)).e;
                            wVar.f2357b = ((b2.o0) n0Var3.get(i10)).f2170f;
                            wVar.f2356a = ((b2.o0) n0Var3.get(i10)).f2171g;
                            b2.x xVar = new b2.x(wVar);
                            org.telegram.ui.web.k0 k0Var7 = new org.telegram.ui.web.k0(21, this, xVar);
                            hf.b bVar = this.f49983b;
                            rh.d0 d0Var = new rh.d0(k0Var7, 19);
                            li.k kVar = new li.k(7);
                            hb.a aVar = new hb.a(27);
                            if (this.f49984c.F(xVar)) {
                                b2.w a12 = xVar.a();
                                a12.f2370r = b2.v0.n("application/x-media3-cues");
                                a12.f2362j = xVar.f2423s;
                                a12.P = this.f49984c.y(xVar);
                                xVar = new b2.x(a12);
                            }
                            b2.x xVar2 = xVar;
                            int i11 = i10 + 1;
                            String uri3 = ((b2.o0) n0Var3.get(i10)).f2167a.toString();
                            b2.d0 d0Var2 = new b2.d0();
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
                            if (g0Var3.f2042b != null && g0Var3.f2041a == null) {
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = z10;
                            }
                            t6.p(z12);
                            if (parse != null) {
                                if (g0Var3.f2041a != null) {
                                    h0Var = new b2.h0(g0Var3);
                                } else {
                                    h0Var = k0Var;
                                }
                                k0Var2 = new b2.k0(parse, null, h0Var, null, list3, null, x1Var, -9223372036854775807L);
                            } else {
                                k0Var2 = k0Var;
                            }
                            b2.p0 p0Var3 = new b2.p0("", new b2.e0(d0Var2), k0Var2, new b2.j0(i0Var), b2.s0.L, l0Var3);
                            k0Var2.getClass();
                            aVarArr[i11] = new y0(p0Var3, bVar, d0Var, kVar.u(p0Var3), aVar, 1048576, xVar2);
                        } else {
                            hf.b bVar2 = this.f49983b;
                            bVar2.getClass();
                            aVarArr[i10 + 1] = new n1((b2.o0) n0Var3.get(i10), bVar2, new hb.a(27));
                        }
                    }
                    a11 = new o0(aVarArr);
                }
                b2.f0 f0Var2 = p0Var2.e;
                if (f0Var2.f2010b != 0 || f0Var2.d != Long.MIN_VALUE || f0Var2.f2012f) {
                    e eVar = new e(a11);
                    long j11 = f0Var2.f2010b;
                    if (j11 >= 0) {
                        z11 = z10;
                    }
                    t6.f(z11);
                    t6.p(!eVar.h);
                    eVar.f49868b = j11;
                    long j12 = f0Var2.d;
                    t6.p(!eVar.h);
                    eVar.f49869c = j12;
                    t6.p(!eVar.h);
                    eVar.d = !f0Var2.f2013g;
                    boolean z14 = f0Var2.e;
                    t6.p(!eVar.h);
                    eVar.e = z14;
                    boolean z15 = f0Var2.f2012f;
                    t6.p(!eVar.h);
                    eVar.f49870f = z15;
                    boolean z16 = f0Var2.h;
                    t6.p(!eVar.h);
                    eVar.f49871g = z16;
                    t6.p(!eVar.h);
                    eVar.h = z10;
                    a11 = new h(eVar);
                }
                p0Var2.f2182b.getClass();
                if (p0Var2.f2182b.d == null) {
                    return a11;
                }
                e2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return a11;
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }
        long j13 = p0Var2.f2182b.h;
        String str7 = e2.l0.f6165a;
        throw null;
    }

    @Override
    public final f0 b(boolean z10) {
        this.f49987i = z10;
        p pVar = this.f49982a;
        pVar.e = z10;
        c3.m mVar = pVar.f49972a;
        synchronized (mVar) {
            mVar.f3681b = z10;
        }
        for (f0 f0Var : pVar.f49974c.values()) {
            f0Var.b(z10);
        }
        return this;
    }

    @Override
    public final f0 c(int i10) {
        p pVar = this.f49982a;
        pVar.f49976g = i10;
        c3.m mVar = pVar.f49972a;
        synchronized (mVar) {
            mVar.d = i10;
        }
        return this;
    }

    @Override
    public final f0 d(t7.u uVar) {
        this.f49984c = uVar;
        p pVar = this.f49982a;
        pVar.f49975f = uVar;
        c3.m mVar = pVar.f49972a;
        synchronized (mVar) {
            mVar.f3682c = uVar;
        }
        for (f0 f0Var : pVar.f49974c.values()) {
            f0Var.d(uVar);
        }
        return this;
    }
}
