package u2;

import android.content.Context;
import android.net.Uri;
import e9.x1;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
        if (bVar != ((qf.b) fVar.f13012f)) {
            fVar.f13012f = bVar;
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
        p0Var2.f2278b.getClass();
        String scheme = p0Var2.f2278b.f2188a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(p0Var2.f2278b.f2189b, "application/x-image-uri")) {
            b2.k0 k0Var5 = p0Var2.f2278b;
            int K = e2.m0.K(k0Var5.f2188a, k0Var5.f2189b);
            if (p0Var2.f2278b.h != -9223372036854775807L) {
                c3.m mVar = (c3.m) this.f46022a.f13011c;
                synchronized (mVar) {
                    mVar.e = 1;
                }
                jg.f.a(this.f46022a);
            }
            try {
                f0 b10 = this.f46022a.b(K);
                b2.i0 a2 = p0Var2.f2279c.a();
                b2.j0 j0Var = p0Var2.f2279c;
                if (j0Var.f2172a == -9223372036854775807L) {
                    a2.f2161a = this.d;
                }
                if (j0Var.d == -3.4028235E38f) {
                    a2.d = this.f46026g;
                }
                if (j0Var.e == -3.4028235E38f) {
                    a2.e = this.h;
                }
                if (j0Var.f2173b == -9223372036854775807L) {
                    a2.f2162b = this.e;
                }
                if (j0Var.f2174c == -9223372036854775807L) {
                    a2.f2163c = this.f46025f;
                }
                b2.j0 j0Var2 = new b2.j0(a2);
                if (!j0Var2.equals(p0Var2.f2279c)) {
                    b2.g0 g0Var2 = new b2.g0();
                    List list = Collections.EMPTY_LIST;
                    e9.n0 n0Var = x1.e;
                    b2.l0 l0Var = b2.l0.d;
                    b2.f0 f0Var = p0Var2.e;
                    ?? obj = new Object();
                    obj.f2094a = f0Var.f2109b;
                    obj.f2095b = f0Var.d;
                    obj.f2096c = f0Var.e;
                    obj.d = f0Var.f2111f;
                    obj.e = f0Var.f2112g;
                    obj.f2097f = f0Var.h;
                    String str3 = p0Var2.f2277a;
                    b2.s0 s0Var = p0Var2.d;
                    p0Var2.f2279c.a();
                    b2.l0 l0Var2 = p0Var2.f2280f;
                    b2.k0 k0Var6 = p0Var2.f2278b;
                    if (k0Var6 != null) {
                        String str4 = k0Var6.f2191f;
                        String str5 = k0Var6.f2189b;
                        Uri uri2 = k0Var6.f2188a;
                        list = k0Var6.e;
                        n0Var = k0Var6.f2192g;
                        k0Var3 = null;
                        b2.h0 h0Var3 = k0Var6.f2190c;
                        if (h0Var3 != null) {
                            z11 = false;
                            ?? obj2 = new Object();
                            z10 = true;
                            obj2.f2140a = h0Var3.f2154a;
                            obj2.f2141b = h0Var3.f2155b;
                            obj2.f2142c = h0Var3.f2156c;
                            obj2.d = h0Var3.d;
                            obj2.e = h0Var3.e;
                            obj2.f2143f = h0Var3.f2157f;
                            obj2.f2144g = h0Var3.f2158g;
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
                    if (g0Var2.f2141b != null && g0Var2.f2140a == null) {
                        z13 = z11 ? 1 : 0;
                    } else {
                        z13 = z10;
                    }
                    u6.p(z13);
                    if (uri != null) {
                        if (g0Var2.f2140a != null) {
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
                e9.n0 n0Var3 = p0Var2.f2278b.f2192g;
                if (!n0Var3.isEmpty()) {
                    a[] aVarArr = new a[n0Var3.size() + 1];
                    aVarArr[z11 ? 1 : 0] = a11;
                    for (int i10 = z11 ? 1 : 0; i10 < n0Var3.size(); i10++) {
                        if (this.f46027i) {
                            b2.w wVar = new b2.w();
                            wVar.f2466r = b2.w0.n(((b2.o0) n0Var3.get(i10)).f2245b);
                            wVar.d = ((b2.o0) n0Var3.get(i10)).f2246c;
                            wVar.e = ((b2.o0) n0Var3.get(i10)).d;
                            wVar.f2455f = ((b2.o0) n0Var3.get(i10)).e;
                            wVar.f2453b = ((b2.o0) n0Var3.get(i10)).f2247f;
                            wVar.f2452a = ((b2.o0) n0Var3.get(i10)).f2248g;
                            b2.x xVar = new b2.x(wVar);
                            org.telegram.ui.web.c0 c0Var3 = new org.telegram.ui.web.c0(9, this, xVar);
                            qf.b bVar = this.f46023b;
                            rg.b0 b0Var = new rg.b0(c0Var3, 8);
                            li.k kVar = new li.k(6);
                            oa.d dVar = new oa.d(27);
                            if (this.f46024c.b0(xVar)) {
                                b2.w a12 = xVar.a();
                                a12.f2466r = b2.w0.n("application/x-media3-cues");
                                a12.f2458j = xVar.f2519s;
                                a12.P = this.f46024c.J(xVar);
                                xVar = new b2.x(a12);
                            }
                            b2.x xVar2 = xVar;
                            int i11 = i10 + 1;
                            String uri3 = ((b2.o0) n0Var3.get(i10)).f2244a.toString();
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
                            if (g0Var3.f2141b != null && g0Var3.f2140a == null) {
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = z10;
                            }
                            u6.p(z12);
                            if (parse != null) {
                                if (g0Var3.f2140a != null) {
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
                            aVarArr[i11] = new y0(p0Var3, bVar, b0Var, kVar.A(p0Var3), dVar, 1048576, xVar2);
                        } else {
                            qf.b bVar2 = this.f46023b;
                            bVar2.getClass();
                            aVarArr[i10 + 1] = new n1((b2.o0) n0Var3.get(i10), bVar2, new oa.d(27));
                        }
                    }
                    a11 = new o0(aVarArr);
                }
                b2.f0 f0Var2 = p0Var2.e;
                if (f0Var2.f2109b != 0 || f0Var2.d != Long.MIN_VALUE || f0Var2.f2111f) {
                    f fVar = new f(a11);
                    long j11 = f0Var2.f2109b;
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
                    fVar.d = !f0Var2.f2112g;
                    boolean z14 = f0Var2.e;
                    u6.p(!fVar.h);
                    fVar.e = z14;
                    boolean z15 = f0Var2.f2111f;
                    u6.p(!fVar.h);
                    fVar.f45915f = z15;
                    boolean z16 = f0Var2.h;
                    u6.p(!fVar.h);
                    fVar.f45916g = z16;
                    u6.p(!fVar.h);
                    fVar.h = z10;
                    a11 = new i(fVar);
                }
                p0Var2.f2278b.getClass();
                if (p0Var2.f2278b.d == null) {
                    return a11;
                }
                e2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return a11;
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }
        long j13 = p0Var2.f2278b.h;
        String str7 = e2.m0.f8372a;
        throw null;
    }

    @Override
    public final f0 b(boolean z10) {
        this.f46027i = z10;
        jg.f fVar = this.f46022a;
        fVar.f13009a = z10;
        c3.m mVar = (c3.m) fVar.f13011c;
        synchronized (mVar) {
            mVar.f4274b = z10;
        }
        for (f0 f0Var : ((HashMap) fVar.e).values()) {
            f0Var.b(z10);
        }
        return this;
    }

    @Override
    public final f0 c(int i10) {
        jg.f fVar = this.f46022a;
        fVar.f13010b = i10;
        c3.m mVar = (c3.m) fVar.f13011c;
        synchronized (mVar) {
            mVar.d = i10;
        }
        return this;
    }

    @Override
    public final f0 d(t7.u uVar) {
        this.f46024c = uVar;
        jg.f fVar = this.f46022a;
        fVar.f13013g = uVar;
        c3.m mVar = (c3.m) fVar.f13011c;
        synchronized (mVar) {
            mVar.f4275c = uVar;
        }
        for (f0 f0Var : ((HashMap) fVar.e).values()) {
            f0Var.d(uVar);
        }
        return this;
    }
}
