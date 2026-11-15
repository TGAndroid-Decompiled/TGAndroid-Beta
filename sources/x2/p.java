package x2;

import a8.ja;
import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Wallet.k8;
import org.telegram.ui.ld0;
import tg.z1;
public final class p implements e0 {
    public final h5 f59627a;
    public final wf.b f59628b;
    public nb.a f59629c;
    public final long d;
    public final long f59630e;
    public final long f59631f;
    public final float f59632g;
    public final float h;
    public boolean f59633i;

    public p(Context context, f3.m mVar) {
        wf.b bVar = new wf.b(context);
        nb.a aVar = new nb.a(6);
        this.f59628b = bVar;
        this.f59629c = aVar;
        h5 h5Var = new h5(mVar, aVar);
        this.f59627a = h5Var;
        if (bVar != ((wf.b) h5Var.f28639f)) {
            h5Var.f28639f = bVar;
            ((HashMap) h5Var.d).clear();
            ((HashMap) h5Var.f28638e).clear();
        }
        this.d = -9223372036854775807L;
        this.f59630e = -9223372036854775807L;
        this.f59631f = -9223372036854775807L;
        this.f59632g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f59633i = true;
    }

    public static e0 e(Class cls, j2.g gVar) {
        try {
            return (e0) cls.getConstructor(j2.g.class).newInstance(gVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override
    public final e0 a(nb.a aVar) {
        this.f59629c = aVar;
        h5 h5Var = this.f59627a;
        h5Var.h = aVar;
        f3.m mVar = (f3.m) h5Var.f28637c;
        synchronized (mVar) {
            mVar.f10872c = aVar;
        }
        for (e0 e0Var : ((HashMap) h5Var.f28638e).values()) {
            e0Var.a(aVar);
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
        l0Var2.f10186b.getClass();
        String scheme = l0Var2.f10186b.f10095a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(l0Var2.f10186b.f10096b, "application/x-image-uri")) {
            e2.g0 g0Var5 = l0Var2.f10186b;
            int K = h2.l0.K(g0Var5.f10095a, g0Var5.f10096b);
            if (l0Var2.f10186b.h != -9223372036854775807L) {
                f3.m mVar = (f3.m) this.f59627a.f28637c;
                synchronized (mVar) {
                    mVar.f10873e = 1;
                }
                h5.c(this.f59627a);
            }
            try {
                e0 i7 = this.f59627a.i(K);
                e2.e0 a10 = l0Var2.f10187c.a();
                e2.f0 f0Var = l0Var2.f10187c;
                if (f0Var.f10077a == -9223372036854775807L) {
                    a10.f10065a = this.d;
                }
                if (f0Var.d == -3.4028235E38f) {
                    a10.d = this.f59632g;
                }
                if (f0Var.f10080e == -3.4028235E38f) {
                    a10.f10068e = this.h;
                }
                if (f0Var.f10078b == -9223372036854775807L) {
                    a10.f10066b = this.f59630e;
                }
                if (f0Var.f10079c == -9223372036854775807L) {
                    a10.f10067c = this.f59631f;
                }
                e2.f0 f0Var2 = new e2.f0(a10);
                if (!f0Var2.equals(l0Var2.f10187c)) {
                    e2.c0 c0Var2 = new e2.c0();
                    List list = Collections.EMPTY_LIST;
                    h9.i0 i0Var = h9.s1.f13749e;
                    e2.h0 h0Var = e2.h0.d;
                    e2.b0 b0Var = l0Var2.f10188e;
                    ?? obj = new Object();
                    obj.f10493a = b0Var.f10006b;
                    obj.f10494b = b0Var.d;
                    obj.f10495c = b0Var.f10008e;
                    obj.d = b0Var.f10009f;
                    obj.f10496e = b0Var.f10010g;
                    obj.f10497f = b0Var.h;
                    String str3 = l0Var2.f10185a;
                    e2.o0 o0Var = l0Var2.d;
                    l0Var2.f10187c.a();
                    e2.h0 h0Var2 = l0Var2.f10189f;
                    e2.g0 g0Var6 = l0Var2.f10186b;
                    if (g0Var6 != null) {
                        String str4 = g0Var6.f10099f;
                        String str5 = g0Var6.f10096b;
                        Uri uri2 = g0Var6.f10095a;
                        list = g0Var6.f10098e;
                        i0Var = g0Var6.f10100g;
                        g0Var3 = null;
                        e2.d0 d0Var3 = g0Var6.f10097c;
                        if (d0Var3 != null) {
                            z11 = false;
                            ?? obj2 = new Object();
                            z10 = true;
                            obj2.f10030a = d0Var3.f10044a;
                            obj2.f10031b = d0Var3.f10045b;
                            obj2.f10032c = d0Var3.f10046c;
                            obj2.d = d0Var3.d;
                            obj2.f10033e = d0Var3.f10047e;
                            obj2.f10034f = d0Var3.f10048f;
                            obj2.f10035g = d0Var3.f10049g;
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
                    if (c0Var2.f10031b != null && c0Var2.f10030a == null) {
                        z13 = z11 ? 1 : 0;
                    } else {
                        z13 = z10;
                    }
                    ja.p(z13);
                    if (uri != null) {
                        if (c0Var2.f10030a != null) {
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
                a b10 = i7.b(l0Var2);
                h9.i0 i0Var3 = l0Var2.f10186b.f10100g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[z11 ? 1 : 0] = b10;
                    for (int i10 = z11 ? 1 : 0; i10 < i0Var3.size(); i10++) {
                        if (this.f59633i) {
                            e2.t tVar = new e2.t();
                            tVar.f10399r = e2.s0.n(((e2.k0) i0Var3.get(i10)).f10146b);
                            tVar.d = ((e2.k0) i0Var3.get(i10)).f10147c;
                            tVar.f10387e = ((e2.k0) i0Var3.get(i10)).d;
                            tVar.f10388f = ((e2.k0) i0Var3.get(i10)).f10148e;
                            tVar.f10385b = ((e2.k0) i0Var3.get(i10)).f10149f;
                            tVar.f10384a = ((e2.k0) i0Var3.get(i10)).f10150g;
                            e2.u uVar = new e2.u(tVar);
                            k8 k8Var = new k8(28, this, uVar);
                            wf.b bVar = this.f59628b;
                            z1 z1Var = new z1(k8Var, 14);
                            ld0 ld0Var = new ld0(7);
                            qb.a aVar = new qb.a(4);
                            if (this.f59629c.L(uVar)) {
                                e2.t a12 = uVar.a();
                                a12.f10399r = e2.s0.n("application/x-media3-cues");
                                a12.f10391j = uVar.f10451s;
                                a12.P = this.f59629c.O(uVar);
                                uVar = new e2.u(a12);
                            }
                            e2.u uVar2 = uVar;
                            int i11 = i10 + 1;
                            String uri3 = ((e2.k0) i0Var3.get(i10)).f10145a.toString();
                            e2.z zVar = new e2.z();
                            e2.c0 c0Var3 = new e2.c0();
                            List list3 = Collections.EMPTY_LIST;
                            h9.s1 s1Var = h9.s1.f13749e;
                            e2.e0 e0Var = new e2.e0();
                            e2.h0 h0Var3 = e2.h0.d;
                            if (uri3 == null) {
                                parse = g0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (c0Var3.f10031b != null && c0Var3.f10030a == null) {
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = z10;
                            }
                            ja.p(z12);
                            if (parse != null) {
                                if (c0Var3.f10030a != null) {
                                    d0Var = new e2.d0(c0Var3);
                                } else {
                                    d0Var = g0Var;
                                }
                                g0Var2 = new e2.g0(parse, null, d0Var, null, list3, null, s1Var, -9223372036854775807L);
                            } else {
                                g0Var2 = g0Var;
                            }
                            e2.l0 l0Var3 = new e2.l0("", new e2.a0(zVar), g0Var2, new e2.f0(e0Var), e2.o0.L, h0Var3);
                            g0Var2.getClass();
                            aVarArr[i11] = new x0(l0Var3, bVar, z1Var, ld0Var.s(l0Var3), aVar, 1048576, uVar2);
                        } else {
                            wf.b bVar2 = this.f59628b;
                            bVar2.getClass();
                            aVarArr[i10 + 1] = new l1((e2.k0) i0Var3.get(i10), bVar2, new qb.a(4));
                        }
                    }
                    b10 = new n0(aVarArr);
                }
                e2.b0 b0Var2 = l0Var2.f10188e;
                if (b0Var2.f10006b != 0 || b0Var2.d != Long.MIN_VALUE || b0Var2.f10009f) {
                    e eVar = new e(b10);
                    long j10 = b0Var2.f10006b;
                    if (j10 >= 0) {
                        z11 = z10;
                    }
                    ja.f(z11);
                    ja.p(!eVar.h);
                    eVar.f59512b = j10;
                    long j11 = b0Var2.d;
                    ja.p(!eVar.h);
                    eVar.f59513c = j11;
                    ja.p(!eVar.h);
                    eVar.d = !b0Var2.f10010g;
                    boolean z14 = b0Var2.f10008e;
                    ja.p(!eVar.h);
                    eVar.f59514e = z14;
                    boolean z15 = b0Var2.f10009f;
                    ja.p(!eVar.h);
                    eVar.f59515f = z15;
                    boolean z16 = b0Var2.h;
                    ja.p(!eVar.h);
                    eVar.f59516g = z16;
                    ja.p(!eVar.h);
                    eVar.h = z10;
                    b10 = new h(eVar);
                }
                l0Var2.f10186b.getClass();
                if (l0Var2.f10186b.d == null) {
                    return b10;
                }
                h2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return b10;
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(e10);
            }
        }
        long j12 = l0Var2.f10186b.h;
        String str7 = h2.l0.f13471a;
        throw null;
    }

    @Override
    public final e0 c(boolean z10) {
        this.f59633i = z10;
        h5 h5Var = this.f59627a;
        h5Var.f28635a = z10;
        f3.m mVar = (f3.m) h5Var.f28637c;
        synchronized (mVar) {
            mVar.f10871b = z10;
        }
        for (e0 e0Var : ((HashMap) h5Var.f28638e).values()) {
            e0Var.c(z10);
        }
        return this;
    }

    @Override
    public final e0 d(int i7) {
        h5 h5Var = this.f59627a;
        h5Var.f28636b = i7;
        f3.m mVar = (f3.m) h5Var.f28637c;
        synchronized (mVar) {
            mVar.d = i7;
        }
        return this;
    }
}
