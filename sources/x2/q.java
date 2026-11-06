package x2;

import a8.ia;
import android.content.Context;
import android.net.Uri;
import h9.t1;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.hy0;
public final class q implements f0 {
    public final p f58345a;
    public final j2.n f58346b;
    public w7.s f58347c;
    public final long d;
    public final long f58348e;
    public final long f58349f;
    public final float f58350g;
    public final float h;
    public boolean f58351i;

    public q(Context context, f3.m mVar) {
        j2.n nVar = new j2.n(context);
        w7.s sVar = new w7.s(5, false);
        this.f58346b = nVar;
        this.f58347c = sVar;
        p pVar = new p(mVar, sVar);
        this.f58345a = pVar;
        if (nVar != pVar.d) {
            pVar.d = nVar;
            pVar.f58337b.clear();
            pVar.f58338c.clear();
        }
        this.d = -9223372036854775807L;
        this.f58348e = -9223372036854775807L;
        this.f58349f = -9223372036854775807L;
        this.f58350g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f58351i = true;
    }

    public static f0 e(Class cls, j2.g gVar) {
        try {
            return (f0) cls.getConstructor(j2.g.class).newInstance(gVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override
    public final f0 a(w7.s sVar) {
        this.f58347c = sVar;
        p pVar = this.f58345a;
        pVar.f58340f = sVar;
        f3.m mVar = pVar.f58336a;
        synchronized (mVar) {
            mVar.f11065c = sVar;
        }
        for (f0 f0Var : pVar.f58338c.values()) {
            f0Var.a(sVar);
        }
        return this;
    }

    @Override
    public final a b(e2.l0 l0Var) {
        e2.g0 g0Var;
        boolean z9;
        boolean z10;
        Uri parse;
        boolean z11;
        e2.g0 g0Var2;
        e2.d0 d0Var;
        e2.g0 g0Var3;
        long j3;
        Uri uri;
        String str;
        e2.y yVar;
        String str2;
        boolean z12;
        e2.g0 g0Var4;
        e2.d0 d0Var2;
        e2.c0 c0Var;
        e2.l0 l0Var2 = l0Var;
        l0Var2.f10350b.getClass();
        String scheme = l0Var2.f10350b.f10259a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(l0Var2.f10350b.f10260b, "application/x-image-uri")) {
            e2.g0 g0Var5 = l0Var2.f10350b;
            int K = h2.m0.K(g0Var5.f10259a, g0Var5.f10260b);
            if (l0Var2.f10350b.h != -9223372036854775807L) {
                f3.m mVar = this.f58345a.f58336a;
                synchronized (mVar) {
                    mVar.f11066e = 1;
                }
                p.a(this.f58345a);
            }
            try {
                f0 b10 = this.f58345a.b(K);
                e2.e0 a10 = l0Var2.f10351c.a();
                e2.f0 f0Var = l0Var2.f10351c;
                if (f0Var.f10241a == -9223372036854775807L) {
                    a10.f10229a = this.d;
                }
                if (f0Var.d == -3.4028235E38f) {
                    a10.d = this.f58350g;
                }
                if (f0Var.f10244e == -3.4028235E38f) {
                    a10.f10232e = this.h;
                }
                if (f0Var.f10242b == -9223372036854775807L) {
                    a10.f10230b = this.f58348e;
                }
                if (f0Var.f10243c == -9223372036854775807L) {
                    a10.f10231c = this.f58349f;
                }
                e2.f0 f0Var2 = new e2.f0(a10);
                if (!f0Var2.equals(l0Var2.f10351c)) {
                    e2.c0 c0Var2 = new e2.c0();
                    List list = Collections.EMPTY_LIST;
                    h9.i0 i0Var = t1.f14397e;
                    e2.h0 h0Var = e2.h0.d;
                    e2.b0 b0Var = l0Var2.f10352e;
                    ?? obj = new Object();
                    obj.f10657a = b0Var.f10170b;
                    obj.f10658b = b0Var.d;
                    obj.f10659c = b0Var.f10172e;
                    obj.d = b0Var.f10173f;
                    obj.f10660e = b0Var.f10174g;
                    obj.f10661f = b0Var.h;
                    String str3 = l0Var2.f10349a;
                    e2.o0 o0Var = l0Var2.d;
                    l0Var2.f10351c.a();
                    e2.h0 h0Var2 = l0Var2.f10353f;
                    e2.g0 g0Var6 = l0Var2.f10350b;
                    if (g0Var6 != null) {
                        String str4 = g0Var6.f10263f;
                        String str5 = g0Var6.f10260b;
                        Uri uri2 = g0Var6.f10259a;
                        list = g0Var6.f10262e;
                        i0Var = g0Var6.f10264g;
                        g0Var3 = null;
                        e2.d0 d0Var3 = g0Var6.f10261c;
                        if (d0Var3 != null) {
                            z10 = false;
                            ?? obj2 = new Object();
                            z9 = true;
                            obj2.f10194a = d0Var3.f10208a;
                            obj2.f10195b = d0Var3.f10209b;
                            obj2.f10196c = d0Var3.f10210c;
                            obj2.d = d0Var3.d;
                            obj2.f10197e = d0Var3.f10211e;
                            obj2.f10198f = d0Var3.f10212f;
                            obj2.f10199g = d0Var3.f10213g;
                            obj2.h = d0Var3.h;
                            c0Var = obj2;
                        } else {
                            z9 = true;
                            z10 = false;
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
                        z9 = true;
                        z10 = false;
                        j3 = -9223372036854775807L;
                        uri = null;
                        str = null;
                        yVar = null;
                        str2 = null;
                    }
                    List list2 = list;
                    h9.i0 i0Var2 = i0Var;
                    e2.e0 a11 = f0Var2.a();
                    if (c0Var2.f10195b != null && c0Var2.f10194a == null) {
                        z12 = z10 ? 1 : 0;
                    } else {
                        z12 = z9;
                    }
                    ia.p(z12);
                    if (uri != null) {
                        if (c0Var2.f10194a != null) {
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
                    z9 = true;
                    z10 = false;
                }
                a b11 = b10.b(l0Var2);
                h9.i0 i0Var3 = l0Var2.f10350b.f10264g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[z10 ? 1 : 0] = b11;
                    for (int i7 = z10 ? 1 : 0; i7 < i0Var3.size(); i7++) {
                        if (this.f58351i) {
                            e2.t tVar = new e2.t();
                            tVar.f10563r = e2.s0.n(((e2.k0) i0Var3.get(i7)).f10310b);
                            tVar.d = ((e2.k0) i0Var3.get(i7)).f10311c;
                            tVar.f10551e = ((e2.k0) i0Var3.get(i7)).d;
                            tVar.f10552f = ((e2.k0) i0Var3.get(i7)).f10312e;
                            tVar.f10549b = ((e2.k0) i0Var3.get(i7)).f10313f;
                            tVar.f10548a = ((e2.k0) i0Var3.get(i7)).f10314g;
                            e2.u uVar = new e2.u(tVar);
                            org.telegram.ui.web.a0 a0Var2 = new org.telegram.ui.web.a0(24, this, uVar);
                            j2.n nVar = this.f58346b;
                            u5.e eVar = new u5.e(a0Var2, 10);
                            hy0 hy0Var = new hy0(6);
                            pb.b bVar = new pb.b(4);
                            if (this.f58347c.w(uVar)) {
                                e2.t a12 = uVar.a();
                                a12.f10563r = e2.s0.n("application/x-media3-cues");
                                a12.f10555j = uVar.f10615s;
                                a12.P = this.f58347c.D(uVar);
                                uVar = new e2.u(a12);
                            }
                            e2.u uVar2 = uVar;
                            int i10 = i7 + 1;
                            String uri3 = ((e2.k0) i0Var3.get(i7)).f10309a.toString();
                            e2.z zVar = new e2.z();
                            e2.c0 c0Var3 = new e2.c0();
                            List list3 = Collections.EMPTY_LIST;
                            t1 t1Var = t1.f14397e;
                            e2.e0 e0Var = new e2.e0();
                            e2.h0 h0Var3 = e2.h0.d;
                            if (uri3 == null) {
                                parse = g0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (c0Var3.f10195b != null && c0Var3.f10194a == null) {
                                z11 = z10 ? 1 : 0;
                            } else {
                                z11 = z9;
                            }
                            ia.p(z11);
                            if (parse != null) {
                                if (c0Var3.f10194a != null) {
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
                            aVarArr[i10] = new y0(l0Var3, nVar, eVar, hy0Var.t(l0Var3), bVar, 1048576, uVar2);
                        } else {
                            j2.n nVar2 = this.f58346b;
                            nVar2.getClass();
                            aVarArr[i7 + 1] = new m1((e2.k0) i0Var3.get(i7), nVar2, new pb.b(4));
                        }
                    }
                    b11 = new o0(aVarArr);
                }
                e2.b0 b0Var2 = l0Var2.f10352e;
                if (b0Var2.f10170b != 0 || b0Var2.d != Long.MIN_VALUE || b0Var2.f10173f) {
                    e eVar2 = new e(b11);
                    long j10 = b0Var2.f10170b;
                    if (j10 >= 0) {
                        z10 = z9;
                    }
                    ia.f(z10);
                    ia.p(!eVar2.h);
                    eVar2.f58224b = j10;
                    long j11 = b0Var2.d;
                    ia.p(!eVar2.h);
                    eVar2.f58225c = j11;
                    ia.p(!eVar2.h);
                    eVar2.d = !b0Var2.f10174g;
                    boolean z13 = b0Var2.f10172e;
                    ia.p(!eVar2.h);
                    eVar2.f58226e = z13;
                    boolean z14 = b0Var2.f10173f;
                    ia.p(!eVar2.h);
                    eVar2.f58227f = z14;
                    boolean z15 = b0Var2.h;
                    ia.p(!eVar2.h);
                    eVar2.f58228g = z15;
                    ia.p(!eVar2.h);
                    eVar2.h = z9;
                    b11 = new h(eVar2);
                }
                l0Var2.f10350b.getClass();
                if (l0Var2.f10350b.d == null) {
                    return b11;
                }
                h2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return b11;
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(e10);
            }
        }
        long j12 = l0Var2.f10350b.h;
        String str7 = h2.m0.f14112a;
        throw null;
    }

    @Override
    public final f0 c(boolean z9) {
        this.f58351i = z9;
        p pVar = this.f58345a;
        pVar.f58339e = z9;
        f3.m mVar = pVar.f58336a;
        synchronized (mVar) {
            mVar.f11064b = z9;
        }
        for (f0 f0Var : pVar.f58338c.values()) {
            f0Var.c(z9);
        }
        return this;
    }

    @Override
    public final f0 d(int i7) {
        p pVar = this.f58345a;
        pVar.f58341g = i7;
        f3.m mVar = pVar.f58336a;
        synchronized (mVar) {
            mVar.d = i7;
        }
        return this;
    }
}
