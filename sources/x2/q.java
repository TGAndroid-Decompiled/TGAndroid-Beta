package x2;

import a8.ma;
import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.md0;
import org.telegram.ui.wc1;
public final class q implements f0 {
    public final p f60210a;
    public final wf.b f60211b;
    public nb.a f60212c;
    public final long d;
    public final long f60213e;
    public final long f60214f;
    public final float f60215g;
    public final float h;
    public boolean f60216i;

    public q(Context context, f3.m mVar) {
        wf.b bVar = new wf.b(context);
        nb.a aVar = new nb.a(6);
        this.f60211b = bVar;
        this.f60212c = aVar;
        p pVar = new p(mVar, aVar);
        this.f60210a = pVar;
        if (bVar != pVar.d) {
            pVar.d = bVar;
            pVar.f60200b.clear();
            pVar.f60201c.clear();
        }
        this.d = -9223372036854775807L;
        this.f60213e = -9223372036854775807L;
        this.f60214f = -9223372036854775807L;
        this.f60215g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f60216i = true;
    }

    public static f0 e(Class cls, j2.g gVar) {
        try {
            return (f0) cls.getConstructor(j2.g.class).newInstance(gVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override
    public final f0 a(nb.a aVar) {
        this.f60212c = aVar;
        p pVar = this.f60210a;
        pVar.f60203f = aVar;
        f3.m mVar = pVar.f60199a;
        synchronized (mVar) {
            mVar.f11186c = aVar;
        }
        for (f0 f0Var : pVar.f60201c.values()) {
            f0Var.a(aVar);
        }
        return this;
    }

    @Override
    public final a b(e2.l0 l0Var) {
        e2.g0 g0Var;
        boolean z10;
        boolean z11;
        Uri parse;
        boolean z12;
        e2.g0 g0Var2;
        e2.d0 d0Var;
        e2.g0 g0Var3;
        long j3;
        Uri uri;
        String str;
        e2.y yVar;
        String str2;
        boolean z13;
        e2.g0 g0Var4;
        e2.d0 d0Var2;
        e2.c0 c0Var;
        e2.l0 l0Var2 = l0Var;
        l0Var2.f10496b.getClass();
        String scheme = l0Var2.f10496b.f10405a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(l0Var2.f10496b.f10406b, "application/x-image-uri")) {
            e2.g0 g0Var5 = l0Var2.f10496b;
            int K = h2.l0.K(g0Var5.f10405a, g0Var5.f10406b);
            if (l0Var2.f10496b.h != -9223372036854775807L) {
                f3.m mVar = this.f60210a.f60199a;
                synchronized (mVar) {
                    mVar.f11187e = 1;
                }
                p.a(this.f60210a);
            }
            try {
                f0 b10 = this.f60210a.b(K);
                e2.e0 a10 = l0Var2.f10497c.a();
                e2.f0 f0Var = l0Var2.f10497c;
                if (f0Var.f10387a == -9223372036854775807L) {
                    a10.f10375a = this.d;
                }
                if (f0Var.d == -3.4028235E38f) {
                    a10.d = this.f60215g;
                }
                if (f0Var.f10390e == -3.4028235E38f) {
                    a10.f10378e = this.h;
                }
                if (f0Var.f10388b == -9223372036854775807L) {
                    a10.f10376b = this.f60213e;
                }
                if (f0Var.f10389c == -9223372036854775807L) {
                    a10.f10377c = this.f60214f;
                }
                e2.f0 f0Var2 = new e2.f0(a10);
                if (!f0Var2.equals(l0Var2.f10497c)) {
                    e2.c0 c0Var2 = new e2.c0();
                    List list = Collections.EMPTY_LIST;
                    h9.i0 i0Var = h9.t1.f14066e;
                    e2.h0 h0Var = e2.h0.d;
                    e2.b0 b0Var = l0Var2.f10498e;
                    ?? obj = new Object();
                    obj.f10803a = b0Var.f10316b;
                    obj.f10804b = b0Var.d;
                    obj.f10805c = b0Var.f10318e;
                    obj.d = b0Var.f10319f;
                    obj.f10806e = b0Var.f10320g;
                    obj.f10807f = b0Var.h;
                    String str3 = l0Var2.f10495a;
                    e2.o0 o0Var = l0Var2.d;
                    l0Var2.f10497c.a();
                    e2.h0 h0Var2 = l0Var2.f10499f;
                    e2.g0 g0Var6 = l0Var2.f10496b;
                    if (g0Var6 != null) {
                        String str4 = g0Var6.f10409f;
                        String str5 = g0Var6.f10406b;
                        Uri uri2 = g0Var6.f10405a;
                        list = g0Var6.f10408e;
                        i0Var = g0Var6.f10410g;
                        g0Var3 = null;
                        e2.d0 d0Var3 = g0Var6.f10407c;
                        if (d0Var3 != null) {
                            z11 = false;
                            ?? obj2 = new Object();
                            z10 = true;
                            obj2.f10340a = d0Var3.f10354a;
                            obj2.f10341b = d0Var3.f10355b;
                            obj2.f10342c = d0Var3.f10356c;
                            obj2.d = d0Var3.d;
                            obj2.f10343e = d0Var3.f10357e;
                            obj2.f10344f = d0Var3.f10358f;
                            obj2.f10345g = d0Var3.f10359g;
                            obj2.h = d0Var3.h;
                            c0Var = obj2;
                        } else {
                            z10 = true;
                            z11 = false;
                            c0Var = new e2.c0();
                        }
                        e2.y yVar2 = g0Var6.d;
                        j3 = g0Var6.h;
                        yVar = yVar2;
                        str = str5;
                        uri = uri2;
                        str2 = str4;
                        c0Var2 = c0Var;
                    } else {
                        g0Var3 = null;
                        z10 = true;
                        z11 = false;
                        j3 = -9223372036854775807L;
                        uri = null;
                        str = null;
                        yVar = null;
                        str2 = null;
                    }
                    List list2 = list;
                    h9.i0 i0Var2 = i0Var;
                    e2.e0 a11 = f0Var2.a();
                    if (c0Var2.f10341b != null && c0Var2.f10340a == null) {
                        z13 = z11 ? 1 : 0;
                    } else {
                        z13 = z10;
                    }
                    ma.p(z13);
                    if (uri != null) {
                        if (c0Var2.f10340a != null) {
                            d0Var2 = new e2.d0(c0Var2);
                        } else {
                            d0Var2 = g0Var3;
                        }
                        g0Var4 = new e2.g0(uri, str, d0Var2, yVar, list2, str2, i0Var2, j3);
                    } else {
                        g0Var4 = g0Var3;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str6 = str3;
                    ?? a0Var = new e2.a0(obj);
                    e2.f0 f0Var3 = new e2.f0(a11);
                    if (o0Var == null) {
                        o0Var = e2.o0.L;
                    }
                    l0Var2 = new e2.l0(str6, a0Var, g0Var4, f0Var3, o0Var, h0Var2);
                    g0Var = g0Var3;
                } else {
                    g0Var = null;
                    z10 = true;
                    z11 = false;
                }
                a b11 = b10.b(l0Var2);
                h9.i0 i0Var3 = l0Var2.f10496b.f10410g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[z11 ? 1 : 0] = b11;
                    for (int i7 = z11 ? 1 : 0; i7 < i0Var3.size(); i7++) {
                        if (this.f60216i) {
                            e2.t tVar = new e2.t();
                            tVar.f10709r = e2.s0.n(((e2.k0) i0Var3.get(i7)).f10456b);
                            tVar.d = ((e2.k0) i0Var3.get(i7)).f10457c;
                            tVar.f10697e = ((e2.k0) i0Var3.get(i7)).d;
                            tVar.f10698f = ((e2.k0) i0Var3.get(i7)).f10458e;
                            tVar.f10695b = ((e2.k0) i0Var3.get(i7)).f10459f;
                            tVar.f10694a = ((e2.k0) i0Var3.get(i7)).f10460g;
                            e2.u uVar = new e2.u(tVar);
                            wc1 wc1Var = new wc1(26, this, uVar);
                            wf.b bVar = this.f60211b;
                            tg.o1 o1Var = new tg.o1(wc1Var, 16);
                            md0 md0Var = new md0(7);
                            qb.a aVar = new qb.a(4);
                            if (this.f60212c.H(uVar)) {
                                e2.t a12 = uVar.a();
                                a12.f10709r = e2.s0.n("application/x-media3-cues");
                                a12.f10701j = uVar.f10761s;
                                a12.P = this.f60212c.O(uVar);
                                uVar = new e2.u(a12);
                            }
                            e2.u uVar2 = uVar;
                            int i10 = i7 + 1;
                            String uri3 = ((e2.k0) i0Var3.get(i7)).f10455a.toString();
                            e2.z zVar = new e2.z();
                            e2.c0 c0Var3 = new e2.c0();
                            List list3 = Collections.EMPTY_LIST;
                            h9.t1 t1Var = h9.t1.f14066e;
                            e2.e0 e0Var = new e2.e0();
                            e2.h0 h0Var3 = e2.h0.d;
                            if (uri3 == null) {
                                parse = g0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (c0Var3.f10341b != null && c0Var3.f10340a == null) {
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = z10;
                            }
                            ma.p(z12);
                            if (parse != null) {
                                if (c0Var3.f10340a != null) {
                                    d0Var = new e2.d0(c0Var3);
                                } else {
                                    d0Var = g0Var;
                                }
                                g0Var2 = new e2.g0(parse, null, d0Var, null, list3, null, t1Var, -9223372036854775807L);
                            } else {
                                g0Var2 = g0Var;
                            }
                            e2.l0 l0Var3 = new e2.l0("", new e2.a0(zVar), g0Var2, new e2.f0(e0Var), e2.o0.L, h0Var3);
                            g0Var2.getClass();
                            aVarArr[i10] = new y0(l0Var3, bVar, o1Var, md0Var.s(l0Var3), aVar, 1048576, uVar2);
                        } else {
                            wf.b bVar2 = this.f60211b;
                            bVar2.getClass();
                            aVarArr[i7 + 1] = new n1((e2.k0) i0Var3.get(i7), bVar2, new qb.a(4));
                        }
                    }
                    b11 = new o0(aVarArr);
                }
                e2.b0 b0Var2 = l0Var2.f10498e;
                if (b0Var2.f10316b != 0 || b0Var2.d != Long.MIN_VALUE || b0Var2.f10319f) {
                    e eVar = new e(b11);
                    long j10 = b0Var2.f10316b;
                    if (j10 >= 0) {
                        z11 = z10;
                    }
                    ma.f(z11);
                    ma.p(!eVar.h);
                    eVar.f60090b = j10;
                    long j11 = b0Var2.d;
                    ma.p(!eVar.h);
                    eVar.f60091c = j11;
                    ma.p(!eVar.h);
                    eVar.d = !b0Var2.f10320g;
                    boolean z14 = b0Var2.f10318e;
                    ma.p(!eVar.h);
                    eVar.f60092e = z14;
                    boolean z15 = b0Var2.f10319f;
                    ma.p(!eVar.h);
                    eVar.f60093f = z15;
                    boolean z16 = b0Var2.h;
                    ma.p(!eVar.h);
                    eVar.f60094g = z16;
                    ma.p(!eVar.h);
                    eVar.h = z10;
                    b11 = new h(eVar);
                }
                l0Var2.f10496b.getClass();
                if (l0Var2.f10496b.d == null) {
                    return b11;
                }
                h2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return b11;
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(e10);
            }
        }
        long j12 = l0Var2.f10496b.h;
        String str7 = h2.l0.f13778a;
        throw null;
    }

    @Override
    public final f0 c(boolean z10) {
        this.f60216i = z10;
        p pVar = this.f60210a;
        pVar.f60202e = z10;
        f3.m mVar = pVar.f60199a;
        synchronized (mVar) {
            mVar.f11185b = z10;
        }
        for (f0 f0Var : pVar.f60201c.values()) {
            f0Var.c(z10);
        }
        return this;
    }

    @Override
    public final f0 d(int i7) {
        p pVar = this.f60210a;
        pVar.f60204g = i7;
        f3.m mVar = pVar.f60199a;
        synchronized (mVar) {
            mVar.d = i7;
        }
        return this;
    }
}
