package x2;

import a8.la;
import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.md0;
import org.telegram.ui.wc1;
public final class q implements f0 {
    public final p f60245a;
    public final wf.b f60246b;
    public nb.a f60247c;
    public final long d;
    public final long f60248e;
    public final long f60249f;
    public final float f60250g;
    public final float h;
    public boolean f60251i;

    public q(Context context, f3.m mVar) {
        wf.b bVar = new wf.b(context);
        nb.a aVar = new nb.a(6);
        this.f60246b = bVar;
        this.f60247c = aVar;
        p pVar = new p(mVar, aVar);
        this.f60245a = pVar;
        if (bVar != pVar.d) {
            pVar.d = bVar;
            pVar.f60235b.clear();
            pVar.f60236c.clear();
        }
        this.d = -9223372036854775807L;
        this.f60248e = -9223372036854775807L;
        this.f60249f = -9223372036854775807L;
        this.f60250g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f60251i = true;
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
        this.f60247c = aVar;
        p pVar = this.f60245a;
        pVar.f60238f = aVar;
        f3.m mVar = pVar.f60234a;
        synchronized (mVar) {
            mVar.f11223c = aVar;
        }
        for (f0 f0Var : pVar.f60236c.values()) {
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
        l0Var2.f10533b.getClass();
        String scheme = l0Var2.f10533b.f10442a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(l0Var2.f10533b.f10443b, "application/x-image-uri")) {
            e2.g0 g0Var5 = l0Var2.f10533b;
            int K = h2.l0.K(g0Var5.f10442a, g0Var5.f10443b);
            if (l0Var2.f10533b.h != -9223372036854775807L) {
                f3.m mVar = this.f60245a.f60234a;
                synchronized (mVar) {
                    mVar.f11224e = 1;
                }
                p.a(this.f60245a);
            }
            try {
                f0 b10 = this.f60245a.b(K);
                e2.e0 a10 = l0Var2.f10534c.a();
                e2.f0 f0Var = l0Var2.f10534c;
                if (f0Var.f10424a == -9223372036854775807L) {
                    a10.f10412a = this.d;
                }
                if (f0Var.d == -3.4028235E38f) {
                    a10.d = this.f60250g;
                }
                if (f0Var.f10427e == -3.4028235E38f) {
                    a10.f10415e = this.h;
                }
                if (f0Var.f10425b == -9223372036854775807L) {
                    a10.f10413b = this.f60248e;
                }
                if (f0Var.f10426c == -9223372036854775807L) {
                    a10.f10414c = this.f60249f;
                }
                e2.f0 f0Var2 = new e2.f0(a10);
                if (!f0Var2.equals(l0Var2.f10534c)) {
                    e2.c0 c0Var2 = new e2.c0();
                    List list = Collections.EMPTY_LIST;
                    h9.i0 i0Var = h9.t1.f14103e;
                    e2.h0 h0Var = e2.h0.d;
                    e2.b0 b0Var = l0Var2.f10535e;
                    ?? obj = new Object();
                    obj.f10840a = b0Var.f10353b;
                    obj.f10841b = b0Var.d;
                    obj.f10842c = b0Var.f10355e;
                    obj.d = b0Var.f10356f;
                    obj.f10843e = b0Var.f10357g;
                    obj.f10844f = b0Var.h;
                    String str3 = l0Var2.f10532a;
                    e2.o0 o0Var = l0Var2.d;
                    l0Var2.f10534c.a();
                    e2.h0 h0Var2 = l0Var2.f10536f;
                    e2.g0 g0Var6 = l0Var2.f10533b;
                    if (g0Var6 != null) {
                        String str4 = g0Var6.f10446f;
                        String str5 = g0Var6.f10443b;
                        Uri uri2 = g0Var6.f10442a;
                        list = g0Var6.f10445e;
                        i0Var = g0Var6.f10447g;
                        g0Var3 = null;
                        e2.d0 d0Var3 = g0Var6.f10444c;
                        if (d0Var3 != null) {
                            z11 = false;
                            ?? obj2 = new Object();
                            z10 = true;
                            obj2.f10377a = d0Var3.f10391a;
                            obj2.f10378b = d0Var3.f10392b;
                            obj2.f10379c = d0Var3.f10393c;
                            obj2.d = d0Var3.d;
                            obj2.f10380e = d0Var3.f10394e;
                            obj2.f10381f = d0Var3.f10395f;
                            obj2.f10382g = d0Var3.f10396g;
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
                    if (c0Var2.f10378b != null && c0Var2.f10377a == null) {
                        z13 = z11 ? 1 : 0;
                    } else {
                        z13 = z10;
                    }
                    la.p(z13);
                    if (uri != null) {
                        if (c0Var2.f10377a != null) {
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
                h9.i0 i0Var3 = l0Var2.f10533b.f10447g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[z11 ? 1 : 0] = b11;
                    for (int i7 = z11 ? 1 : 0; i7 < i0Var3.size(); i7++) {
                        if (this.f60251i) {
                            e2.t tVar = new e2.t();
                            tVar.f10746r = e2.s0.n(((e2.k0) i0Var3.get(i7)).f10493b);
                            tVar.d = ((e2.k0) i0Var3.get(i7)).f10494c;
                            tVar.f10734e = ((e2.k0) i0Var3.get(i7)).d;
                            tVar.f10735f = ((e2.k0) i0Var3.get(i7)).f10495e;
                            tVar.f10732b = ((e2.k0) i0Var3.get(i7)).f10496f;
                            tVar.f10731a = ((e2.k0) i0Var3.get(i7)).f10497g;
                            e2.u uVar = new e2.u(tVar);
                            wc1 wc1Var = new wc1(26, this, uVar);
                            wf.b bVar = this.f60246b;
                            tg.o1 o1Var = new tg.o1(wc1Var, 16);
                            md0 md0Var = new md0(7);
                            qb.a aVar = new qb.a(4);
                            if (this.f60247c.H(uVar)) {
                                e2.t a12 = uVar.a();
                                a12.f10746r = e2.s0.n("application/x-media3-cues");
                                a12.f10738j = uVar.f10798s;
                                a12.P = this.f60247c.O(uVar);
                                uVar = new e2.u(a12);
                            }
                            e2.u uVar2 = uVar;
                            int i10 = i7 + 1;
                            String uri3 = ((e2.k0) i0Var3.get(i7)).f10492a.toString();
                            e2.z zVar = new e2.z();
                            e2.c0 c0Var3 = new e2.c0();
                            List list3 = Collections.EMPTY_LIST;
                            h9.t1 t1Var = h9.t1.f14103e;
                            e2.e0 e0Var = new e2.e0();
                            e2.h0 h0Var3 = e2.h0.d;
                            if (uri3 == null) {
                                parse = g0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (c0Var3.f10378b != null && c0Var3.f10377a == null) {
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = z10;
                            }
                            la.p(z12);
                            if (parse != null) {
                                if (c0Var3.f10377a != null) {
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
                            wf.b bVar2 = this.f60246b;
                            bVar2.getClass();
                            aVarArr[i7 + 1] = new n1((e2.k0) i0Var3.get(i7), bVar2, new qb.a(4));
                        }
                    }
                    b11 = new o0(aVarArr);
                }
                e2.b0 b0Var2 = l0Var2.f10535e;
                if (b0Var2.f10353b != 0 || b0Var2.d != Long.MIN_VALUE || b0Var2.f10356f) {
                    e eVar = new e(b11);
                    long j10 = b0Var2.f10353b;
                    if (j10 >= 0) {
                        z11 = z10;
                    }
                    la.f(z11);
                    la.p(!eVar.h);
                    eVar.f60125b = j10;
                    long j11 = b0Var2.d;
                    la.p(!eVar.h);
                    eVar.f60126c = j11;
                    la.p(!eVar.h);
                    eVar.d = !b0Var2.f10357g;
                    boolean z14 = b0Var2.f10355e;
                    la.p(!eVar.h);
                    eVar.f60127e = z14;
                    boolean z15 = b0Var2.f10356f;
                    la.p(!eVar.h);
                    eVar.f60128f = z15;
                    boolean z16 = b0Var2.h;
                    la.p(!eVar.h);
                    eVar.f60129g = z16;
                    la.p(!eVar.h);
                    eVar.h = z10;
                    b11 = new h(eVar);
                }
                l0Var2.f10533b.getClass();
                if (l0Var2.f10533b.d == null) {
                    return b11;
                }
                h2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return b11;
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(e10);
            }
        }
        long j12 = l0Var2.f10533b.h;
        String str7 = h2.l0.f13815a;
        throw null;
    }

    @Override
    public final f0 c(boolean z10) {
        this.f60251i = z10;
        p pVar = this.f60245a;
        pVar.f60237e = z10;
        f3.m mVar = pVar.f60234a;
        synchronized (mVar) {
            mVar.f11222b = z10;
        }
        for (f0 f0Var : pVar.f60236c.values()) {
            f0Var.c(z10);
        }
        return this;
    }

    @Override
    public final f0 d(int i7) {
        p pVar = this.f60245a;
        pVar.f60239g = i7;
        f3.m mVar = pVar.f60234a;
        synchronized (mVar) {
            mVar.d = i7;
        }
        return this;
    }
}
