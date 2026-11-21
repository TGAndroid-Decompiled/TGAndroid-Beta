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
    public final p f60241a;
    public final wf.b f60242b;
    public nb.a f60243c;
    public final long d;
    public final long f60244e;
    public final long f60245f;
    public final float f60246g;
    public final float h;
    public boolean f60247i;

    public q(Context context, f3.m mVar) {
        wf.b bVar = new wf.b(context);
        nb.a aVar = new nb.a(6);
        this.f60242b = bVar;
        this.f60243c = aVar;
        p pVar = new p(mVar, aVar);
        this.f60241a = pVar;
        if (bVar != pVar.d) {
            pVar.d = bVar;
            pVar.f60231b.clear();
            pVar.f60232c.clear();
        }
        this.d = -9223372036854775807L;
        this.f60244e = -9223372036854775807L;
        this.f60245f = -9223372036854775807L;
        this.f60246g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f60247i = true;
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
        this.f60243c = aVar;
        p pVar = this.f60241a;
        pVar.f60234f = aVar;
        f3.m mVar = pVar.f60230a;
        synchronized (mVar) {
            mVar.f11220c = aVar;
        }
        for (f0 f0Var : pVar.f60232c.values()) {
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
        l0Var2.f10530b.getClass();
        String scheme = l0Var2.f10530b.f10439a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(l0Var2.f10530b.f10440b, "application/x-image-uri")) {
            e2.g0 g0Var5 = l0Var2.f10530b;
            int K = h2.l0.K(g0Var5.f10439a, g0Var5.f10440b);
            if (l0Var2.f10530b.h != -9223372036854775807L) {
                f3.m mVar = this.f60241a.f60230a;
                synchronized (mVar) {
                    mVar.f11221e = 1;
                }
                p.a(this.f60241a);
            }
            try {
                f0 b10 = this.f60241a.b(K);
                e2.e0 a10 = l0Var2.f10531c.a();
                e2.f0 f0Var = l0Var2.f10531c;
                if (f0Var.f10421a == -9223372036854775807L) {
                    a10.f10409a = this.d;
                }
                if (f0Var.d == -3.4028235E38f) {
                    a10.d = this.f60246g;
                }
                if (f0Var.f10424e == -3.4028235E38f) {
                    a10.f10412e = this.h;
                }
                if (f0Var.f10422b == -9223372036854775807L) {
                    a10.f10410b = this.f60244e;
                }
                if (f0Var.f10423c == -9223372036854775807L) {
                    a10.f10411c = this.f60245f;
                }
                e2.f0 f0Var2 = new e2.f0(a10);
                if (!f0Var2.equals(l0Var2.f10531c)) {
                    e2.c0 c0Var2 = new e2.c0();
                    List list = Collections.EMPTY_LIST;
                    h9.i0 i0Var = h9.t1.f14100e;
                    e2.h0 h0Var = e2.h0.d;
                    e2.b0 b0Var = l0Var2.f10532e;
                    ?? obj = new Object();
                    obj.f10837a = b0Var.f10350b;
                    obj.f10838b = b0Var.d;
                    obj.f10839c = b0Var.f10352e;
                    obj.d = b0Var.f10353f;
                    obj.f10840e = b0Var.f10354g;
                    obj.f10841f = b0Var.h;
                    String str3 = l0Var2.f10529a;
                    e2.o0 o0Var = l0Var2.d;
                    l0Var2.f10531c.a();
                    e2.h0 h0Var2 = l0Var2.f10533f;
                    e2.g0 g0Var6 = l0Var2.f10530b;
                    if (g0Var6 != null) {
                        String str4 = g0Var6.f10443f;
                        String str5 = g0Var6.f10440b;
                        Uri uri2 = g0Var6.f10439a;
                        list = g0Var6.f10442e;
                        i0Var = g0Var6.f10444g;
                        g0Var3 = null;
                        e2.d0 d0Var3 = g0Var6.f10441c;
                        if (d0Var3 != null) {
                            z11 = false;
                            ?? obj2 = new Object();
                            z10 = true;
                            obj2.f10374a = d0Var3.f10388a;
                            obj2.f10375b = d0Var3.f10389b;
                            obj2.f10376c = d0Var3.f10390c;
                            obj2.d = d0Var3.d;
                            obj2.f10377e = d0Var3.f10391e;
                            obj2.f10378f = d0Var3.f10392f;
                            obj2.f10379g = d0Var3.f10393g;
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
                    if (c0Var2.f10375b != null && c0Var2.f10374a == null) {
                        z13 = z11 ? 1 : 0;
                    } else {
                        z13 = z10;
                    }
                    la.p(z13);
                    if (uri != null) {
                        if (c0Var2.f10374a != null) {
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
                h9.i0 i0Var3 = l0Var2.f10530b.f10444g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[z11 ? 1 : 0] = b11;
                    for (int i7 = z11 ? 1 : 0; i7 < i0Var3.size(); i7++) {
                        if (this.f60247i) {
                            e2.t tVar = new e2.t();
                            tVar.f10743r = e2.s0.n(((e2.k0) i0Var3.get(i7)).f10490b);
                            tVar.d = ((e2.k0) i0Var3.get(i7)).f10491c;
                            tVar.f10731e = ((e2.k0) i0Var3.get(i7)).d;
                            tVar.f10732f = ((e2.k0) i0Var3.get(i7)).f10492e;
                            tVar.f10729b = ((e2.k0) i0Var3.get(i7)).f10493f;
                            tVar.f10728a = ((e2.k0) i0Var3.get(i7)).f10494g;
                            e2.u uVar = new e2.u(tVar);
                            wc1 wc1Var = new wc1(26, this, uVar);
                            wf.b bVar = this.f60242b;
                            tg.o1 o1Var = new tg.o1(wc1Var, 16);
                            md0 md0Var = new md0(7);
                            qb.a aVar = new qb.a(4);
                            if (this.f60243c.H(uVar)) {
                                e2.t a12 = uVar.a();
                                a12.f10743r = e2.s0.n("application/x-media3-cues");
                                a12.f10735j = uVar.f10795s;
                                a12.P = this.f60243c.O(uVar);
                                uVar = new e2.u(a12);
                            }
                            e2.u uVar2 = uVar;
                            int i10 = i7 + 1;
                            String uri3 = ((e2.k0) i0Var3.get(i7)).f10489a.toString();
                            e2.z zVar = new e2.z();
                            e2.c0 c0Var3 = new e2.c0();
                            List list3 = Collections.EMPTY_LIST;
                            h9.t1 t1Var = h9.t1.f14100e;
                            e2.e0 e0Var = new e2.e0();
                            e2.h0 h0Var3 = e2.h0.d;
                            if (uri3 == null) {
                                parse = g0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (c0Var3.f10375b != null && c0Var3.f10374a == null) {
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = z10;
                            }
                            la.p(z12);
                            if (parse != null) {
                                if (c0Var3.f10374a != null) {
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
                            wf.b bVar2 = this.f60242b;
                            bVar2.getClass();
                            aVarArr[i7 + 1] = new n1((e2.k0) i0Var3.get(i7), bVar2, new qb.a(4));
                        }
                    }
                    b11 = new o0(aVarArr);
                }
                e2.b0 b0Var2 = l0Var2.f10532e;
                if (b0Var2.f10350b != 0 || b0Var2.d != Long.MIN_VALUE || b0Var2.f10353f) {
                    e eVar = new e(b11);
                    long j10 = b0Var2.f10350b;
                    if (j10 >= 0) {
                        z11 = z10;
                    }
                    la.f(z11);
                    la.p(!eVar.h);
                    eVar.f60121b = j10;
                    long j11 = b0Var2.d;
                    la.p(!eVar.h);
                    eVar.f60122c = j11;
                    la.p(!eVar.h);
                    eVar.d = !b0Var2.f10354g;
                    boolean z14 = b0Var2.f10352e;
                    la.p(!eVar.h);
                    eVar.f60123e = z14;
                    boolean z15 = b0Var2.f10353f;
                    la.p(!eVar.h);
                    eVar.f60124f = z15;
                    boolean z16 = b0Var2.h;
                    la.p(!eVar.h);
                    eVar.f60125g = z16;
                    la.p(!eVar.h);
                    eVar.h = z10;
                    b11 = new h(eVar);
                }
                l0Var2.f10530b.getClass();
                if (l0Var2.f10530b.d == null) {
                    return b11;
                }
                h2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return b11;
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(e10);
            }
        }
        long j12 = l0Var2.f10530b.h;
        String str7 = h2.l0.f13812a;
        throw null;
    }

    @Override
    public final f0 c(boolean z10) {
        this.f60247i = z10;
        p pVar = this.f60241a;
        pVar.f60233e = z10;
        f3.m mVar = pVar.f60230a;
        synchronized (mVar) {
            mVar.f11219b = z10;
        }
        for (f0 f0Var : pVar.f60232c.values()) {
            f0Var.c(z10);
        }
        return this;
    }

    @Override
    public final f0 d(int i7) {
        p pVar = this.f60241a;
        pVar.f60235g = i7;
        f3.m mVar = pVar.f60230a;
        synchronized (mVar) {
            mVar.d = i7;
        }
        return this;
    }
}
