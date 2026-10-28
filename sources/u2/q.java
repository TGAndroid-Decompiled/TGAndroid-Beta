package u2;

import a8.yb;
import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.bh1;
public final class q implements f0 {
    public final p f49439a;
    public final rf.b f49440b;
    public qb.a f49441c;
    public final long d;
    public final long e;
    public final long f49442f;
    public final float f49443g;
    public final float h;
    public boolean f49444i;

    public q(Context context, c3.m mVar) {
        rf.b bVar = new rf.b(context, 19);
        qb.a aVar = new qb.a(28);
        this.f49440b = bVar;
        this.f49441c = aVar;
        p pVar = new p(mVar, aVar);
        this.f49439a = pVar;
        if (bVar != pVar.d) {
            pVar.d = bVar;
            pVar.f49430b.clear();
            pVar.f49431c.clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f49442f = -9223372036854775807L;
        this.f49443g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f49444i = true;
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
        p0Var2.f3345b.getClass();
        String scheme = p0Var2.f3345b.f3255a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(p0Var2.f3345b.f3256b, "application/x-image-uri")) {
            b2.k0 k0Var5 = p0Var2.f3345b;
            int K = e2.n0.K(k0Var5.f3255a, k0Var5.f3256b);
            if (p0Var2.f3345b.h != -9223372036854775807L) {
                c3.m mVar = this.f49439a.f49429a;
                synchronized (mVar) {
                    mVar.e = 1;
                }
                p.a(this.f49439a);
            }
            try {
                f0 b10 = this.f49439a.b(K);
                b2.i0 a2 = p0Var2.f3346c.a();
                b2.j0 j0Var = p0Var2.f3346c;
                if (j0Var.f3239a == -9223372036854775807L) {
                    a2.f3228a = this.d;
                }
                if (j0Var.d == -3.4028235E38f) {
                    a2.d = this.f49443g;
                }
                if (j0Var.e == -3.4028235E38f) {
                    a2.e = this.h;
                }
                if (j0Var.f3240b == -9223372036854775807L) {
                    a2.f3229b = this.e;
                }
                if (j0Var.f3241c == -9223372036854775807L) {
                    a2.f3230c = this.f49442f;
                }
                b2.j0 j0Var2 = new b2.j0(a2);
                if (!j0Var2.equals(p0Var2.f3346c)) {
                    b2.g0 g0Var2 = new b2.g0();
                    List list = Collections.EMPTY_LIST;
                    f9.i0 i0Var = f9.s1.e;
                    b2.l0 l0Var = b2.l0.d;
                    b2.f0 f0Var = p0Var2.e;
                    ?? obj = new Object();
                    obj.f3161a = f0Var.f3176b;
                    obj.f3162b = f0Var.d;
                    obj.f3163c = f0Var.e;
                    obj.d = f0Var.f3178f;
                    obj.e = f0Var.f3179g;
                    obj.f3164f = f0Var.h;
                    String str3 = p0Var2.f3344a;
                    b2.s0 s0Var = p0Var2.d;
                    p0Var2.f3346c.a();
                    b2.l0 l0Var2 = p0Var2.f3347f;
                    b2.k0 k0Var6 = p0Var2.f3345b;
                    if (k0Var6 != null) {
                        String str4 = k0Var6.f3258f;
                        String str5 = k0Var6.f3256b;
                        Uri uri2 = k0Var6.f3255a;
                        list = k0Var6.e;
                        i0Var = k0Var6.f3259g;
                        k0Var3 = null;
                        b2.h0 h0Var3 = k0Var6.f3257c;
                        if (h0Var3 != null) {
                            z11 = false;
                            ?? obj2 = new Object();
                            z10 = true;
                            obj2.f3207a = h0Var3.f3221a;
                            obj2.f3208b = h0Var3.f3222b;
                            obj2.f3209c = h0Var3.f3223c;
                            obj2.d = h0Var3.d;
                            obj2.e = h0Var3.e;
                            obj2.f3210f = h0Var3.f3224f;
                            obj2.f3211g = h0Var3.f3225g;
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
                    f9.i0 i0Var2 = i0Var;
                    b2.i0 a10 = j0Var2.a();
                    if (g0Var2.f3208b != null && g0Var2.f3207a == null) {
                        z13 = z11 ? 1 : 0;
                    } else {
                        z13 = z10;
                    }
                    yb.p(z13);
                    if (uri != null) {
                        if (g0Var2.f3207a != null) {
                            h0Var2 = new b2.h0(g0Var2);
                        } else {
                            h0Var2 = k0Var3;
                        }
                        k0Var4 = new b2.k0(uri, str, h0Var2, c0Var, list2, str2, i0Var2, j10);
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
                f9.i0 i0Var3 = p0Var2.f3345b.f3259g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[z11 ? 1 : 0] = a11;
                    for (int i10 = z11 ? 1 : 0; i10 < i0Var3.size(); i10++) {
                        if (this.f49444i) {
                            b2.w wVar = new b2.w();
                            wVar.f3533r = b2.w0.n(((b2.o0) i0Var3.get(i10)).f3312b);
                            wVar.d = ((b2.o0) i0Var3.get(i10)).f3313c;
                            wVar.e = ((b2.o0) i0Var3.get(i10)).d;
                            wVar.f3522f = ((b2.o0) i0Var3.get(i10)).e;
                            wVar.f3520b = ((b2.o0) i0Var3.get(i10)).f3314f;
                            wVar.f3519a = ((b2.o0) i0Var3.get(i10)).f3315g;
                            b2.x xVar = new b2.x(wVar);
                            bh1 bh1Var = new bh1(16, this, xVar);
                            rf.b bVar = this.f49440b;
                            org.telegram.ui.Components.voip.j1 j1Var = new org.telegram.ui.Components.voip.j1(bh1Var, 22);
                            k6.c cVar = new k6.c(8);
                            u7.s sVar = new u7.s(26);
                            if (this.f49441c.i1(xVar)) {
                                b2.w a12 = xVar.a();
                                a12.f3533r = b2.w0.n("application/x-media3-cues");
                                a12.f3525j = xVar.f3586s;
                                a12.P = this.f49441c.B0(xVar);
                                xVar = new b2.x(a12);
                            }
                            b2.x xVar2 = xVar;
                            int i11 = i10 + 1;
                            String uri3 = ((b2.o0) i0Var3.get(i10)).f3311a.toString();
                            b2.d0 d0Var = new b2.d0();
                            b2.g0 g0Var3 = new b2.g0();
                            List list3 = Collections.EMPTY_LIST;
                            f9.s1 s1Var = f9.s1.e;
                            b2.i0 i0Var4 = new b2.i0();
                            b2.l0 l0Var3 = b2.l0.d;
                            if (uri3 == null) {
                                parse = k0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (g0Var3.f3208b != null && g0Var3.f3207a == null) {
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = z10;
                            }
                            yb.p(z12);
                            if (parse != null) {
                                if (g0Var3.f3207a != null) {
                                    h0Var = new b2.h0(g0Var3);
                                } else {
                                    h0Var = k0Var;
                                }
                                k0Var2 = new b2.k0(parse, null, h0Var, null, list3, null, s1Var, -9223372036854775807L);
                            } else {
                                k0Var2 = k0Var;
                            }
                            b2.p0 p0Var3 = new b2.p0("", new b2.e0(d0Var), k0Var2, new b2.j0(i0Var4), b2.s0.L, l0Var3);
                            k0Var2.getClass();
                            aVarArr[i11] = new y0(p0Var3, bVar, j1Var, cVar.u(p0Var3), sVar, 1048576, xVar2);
                        } else {
                            rf.b bVar2 = this.f49440b;
                            bVar2.getClass();
                            aVarArr[i10 + 1] = new n1((b2.o0) i0Var3.get(i10), bVar2, new u7.s(26));
                        }
                    }
                    a11 = new o0(aVarArr);
                }
                b2.f0 f0Var2 = p0Var2.e;
                if (f0Var2.f3176b != 0 || f0Var2.d != Long.MIN_VALUE || f0Var2.f3178f) {
                    e eVar = new e(a11);
                    long j11 = f0Var2.f3176b;
                    if (j11 >= 0) {
                        z11 = z10;
                    }
                    yb.g(z11);
                    yb.p(!eVar.h);
                    eVar.f49325b = j11;
                    long j12 = f0Var2.d;
                    yb.p(!eVar.h);
                    eVar.f49326c = j12;
                    yb.p(!eVar.h);
                    eVar.d = !f0Var2.f3179g;
                    boolean z14 = f0Var2.e;
                    yb.p(!eVar.h);
                    eVar.e = z14;
                    boolean z15 = f0Var2.f3178f;
                    yb.p(!eVar.h);
                    eVar.f49327f = z15;
                    boolean z16 = f0Var2.h;
                    yb.p(!eVar.h);
                    eVar.f49328g = z16;
                    yb.p(!eVar.h);
                    eVar.h = z10;
                    a11 = new h(eVar);
                }
                p0Var2.f3345b.getClass();
                if (p0Var2.f3345b.d == null) {
                    return a11;
                }
                e2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return a11;
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }
        long j13 = p0Var2.f3345b.h;
        String str7 = e2.n0.f9691a;
        throw null;
    }

    @Override
    public final f0 b(qb.a aVar) {
        this.f49441c = aVar;
        p pVar = this.f49439a;
        pVar.f49432f = aVar;
        c3.m mVar = pVar.f49429a;
        synchronized (mVar) {
            mVar.f6087c = aVar;
        }
        for (f0 f0Var : pVar.f49431c.values()) {
            f0Var.b(aVar);
        }
        return this;
    }

    @Override
    public final f0 c(boolean z10) {
        this.f49444i = z10;
        p pVar = this.f49439a;
        pVar.e = z10;
        c3.m mVar = pVar.f49429a;
        synchronized (mVar) {
            mVar.f6086b = z10;
        }
        for (f0 f0Var : pVar.f49431c.values()) {
            f0Var.c(z10);
        }
        return this;
    }

    @Override
    public final f0 d(int i10) {
        p pVar = this.f49439a;
        pVar.f49433g = i10;
        c3.m mVar = pVar.f49429a;
        synchronized (mVar) {
            mVar.d = i10;
        }
        return this;
    }
}
