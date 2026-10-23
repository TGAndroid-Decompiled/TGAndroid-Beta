package u2;

import android.content.Context;
import android.net.Uri;
import e9.x1;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import m.g3;
import org.telegram.ui.Wallet.e8;
import v7.u6;
public final class r implements g0 {
    public final q f47872a;
    public final qf.b f47873b;
    public t7.u f47874c;
    public final long d;
    public final long e;
    public final long f47875f;
    public final float f47876g;
    public final float h;
    public boolean f47877i;

    public r(Context context, c3.o oVar) {
        qf.b bVar = new qf.b(context, 18);
        t7.u uVar = new t7.u(28);
        this.f47873b = bVar;
        this.f47874c = uVar;
        q qVar = new q(oVar, uVar);
        this.f47872a = qVar;
        if (bVar != qVar.d) {
            qVar.d = bVar;
            qVar.f47857b.clear();
            qVar.f47858c.clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f47875f = -9223372036854775807L;
        this.f47876g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f47877i = true;
    }

    public static g0 e(Class cls, g2.g gVar) {
        try {
            return (g0) cls.getConstructor(g2.g.class).newInstance(gVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public final a a(b2.o0 o0Var) {
        b2.j0 j0Var;
        boolean z10;
        boolean z11;
        Uri parse;
        boolean z12;
        b2.j0 j0Var2;
        b2.g0 g0Var;
        b2.j0 j0Var3;
        long j10;
        Uri uri;
        String str;
        b2.b0 b0Var;
        String str2;
        boolean z13;
        b2.j0 j0Var4;
        b2.g0 g0Var2;
        b2.f0 f0Var;
        b2.o0 o0Var2 = o0Var;
        o0Var2.f3894b.getClass();
        String scheme = o0Var2.f3894b.f3804a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(o0Var2.f3894b.f3805b, "application/x-image-uri")) {
            b2.j0 j0Var5 = o0Var2.f3894b;
            int K = e2.m0.K(j0Var5.f3804a, j0Var5.f3805b);
            if (o0Var2.f3894b.h != -9223372036854775807L) {
                c3.o oVar = this.f47872a.f47856a;
                synchronized (oVar) {
                    oVar.e = 1;
                }
                q.a(this.f47872a);
            }
            try {
                g0 b10 = this.f47872a.b(K);
                b2.h0 a2 = o0Var2.f3895c.a();
                b2.i0 i0Var = o0Var2.f3895c;
                if (i0Var.f3788a == -9223372036854775807L) {
                    a2.f3777a = this.d;
                }
                if (i0Var.d == -3.4028235E38f) {
                    a2.d = this.f47876g;
                }
                if (i0Var.e == -3.4028235E38f) {
                    a2.e = this.h;
                }
                if (i0Var.f3789b == -9223372036854775807L) {
                    a2.f3778b = this.e;
                }
                if (i0Var.f3790c == -9223372036854775807L) {
                    a2.f3779c = this.f47875f;
                }
                b2.i0 i0Var2 = new b2.i0(a2);
                if (!i0Var2.equals(o0Var2.f3895c)) {
                    b2.f0 f0Var2 = new b2.f0();
                    List list = Collections.EMPTY_LIST;
                    e9.n0 n0Var = x1.e;
                    b2.k0 k0Var = b2.k0.d;
                    b2.e0 e0Var = o0Var2.e;
                    ?? obj = new Object();
                    obj.f3711a = e0Var.f3726b;
                    obj.f3712b = e0Var.d;
                    obj.f3713c = e0Var.e;
                    obj.d = e0Var.f3728f;
                    obj.e = e0Var.f3729g;
                    obj.f3714f = e0Var.h;
                    String str3 = o0Var2.f3893a;
                    b2.r0 r0Var = o0Var2.d;
                    o0Var2.f3895c.a();
                    b2.k0 k0Var2 = o0Var2.f3896f;
                    b2.j0 j0Var6 = o0Var2.f3894b;
                    if (j0Var6 != null) {
                        String str4 = j0Var6.f3807f;
                        String str5 = j0Var6.f3805b;
                        Uri uri2 = j0Var6.f3804a;
                        list = j0Var6.e;
                        n0Var = j0Var6.f3808g;
                        j0Var3 = null;
                        b2.g0 g0Var3 = j0Var6.f3806c;
                        if (g0Var3 != null) {
                            z11 = false;
                            ?? obj2 = new Object();
                            z10 = true;
                            obj2.f3757a = g0Var3.f3770a;
                            obj2.f3758b = g0Var3.f3771b;
                            obj2.f3759c = g0Var3.f3772c;
                            obj2.d = g0Var3.d;
                            obj2.e = g0Var3.e;
                            obj2.f3760f = g0Var3.f3773f;
                            obj2.f3761g = g0Var3.f3774g;
                            obj2.h = g0Var3.h;
                            f0Var = obj2;
                        } else {
                            z10 = true;
                            z11 = false;
                            f0Var = new b2.f0();
                        }
                        b2.b0 b0Var2 = j0Var6.d;
                        j10 = j0Var6.h;
                        b0Var = b0Var2;
                        str = str5;
                        uri = uri2;
                        str2 = str4;
                        f0Var2 = f0Var;
                    } else {
                        j0Var3 = null;
                        z10 = true;
                        z11 = false;
                        j10 = -9223372036854775807L;
                        uri = null;
                        str = null;
                        b0Var = null;
                        str2 = null;
                    }
                    List list2 = list;
                    e9.n0 n0Var2 = n0Var;
                    b2.h0 a10 = i0Var2.a();
                    if (f0Var2.f3758b != null && f0Var2.f3757a == null) {
                        z13 = z11 ? 1 : 0;
                    } else {
                        z13 = z10;
                    }
                    u6.p(z13);
                    if (uri != null) {
                        if (f0Var2.f3757a != null) {
                            g0Var2 = new b2.g0(f0Var2);
                        } else {
                            g0Var2 = j0Var3;
                        }
                        j0Var4 = new b2.j0(uri, str, g0Var2, b0Var, list2, str2, n0Var2, j10);
                    } else {
                        j0Var4 = j0Var3;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str6 = str3;
                    ?? d0Var = new b2.d0(obj);
                    b2.i0 i0Var3 = new b2.i0(a10);
                    if (r0Var == null) {
                        r0Var = b2.r0.L;
                    }
                    o0Var2 = new b2.o0(str6, d0Var, j0Var4, i0Var3, r0Var, k0Var2);
                    j0Var = j0Var3;
                } else {
                    j0Var = null;
                    z10 = true;
                    z11 = false;
                }
                a a11 = b10.a(o0Var2);
                e9.n0 n0Var3 = o0Var2.f3894b.f3808g;
                if (!n0Var3.isEmpty()) {
                    a[] aVarArr = new a[n0Var3.size() + 1];
                    aVarArr[z11 ? 1 : 0] = a11;
                    for (int i10 = z11 ? 1 : 0; i10 < n0Var3.size(); i10++) {
                        if (this.f47877i) {
                            b2.v vVar = new b2.v();
                            vVar.f4082r = b2.v0.n(((b2.n0) n0Var3.get(i10)).f3861b);
                            vVar.d = ((b2.n0) n0Var3.get(i10)).f3862c;
                            vVar.e = ((b2.n0) n0Var3.get(i10)).d;
                            vVar.f4071f = ((b2.n0) n0Var3.get(i10)).e;
                            vVar.f4069b = ((b2.n0) n0Var3.get(i10)).f3863f;
                            vVar.f4068a = ((b2.n0) n0Var3.get(i10)).f3864g;
                            b2.w wVar = new b2.w(vVar);
                            e8 e8Var = new e8(13, this, wVar);
                            qf.b bVar = this.f47873b;
                            qg.g0 g0Var4 = new qg.g0(e8Var, 17);
                            g3 g3Var = new g3(5);
                            oa.d dVar = new oa.d(27);
                            if (this.f47874c.a0(wVar)) {
                                b2.v a12 = wVar.a();
                                a12.f4082r = b2.v0.n("application/x-media3-cues");
                                a12.f4074j = wVar.f4135s;
                                a12.P = this.f47874c.L(wVar);
                                wVar = new b2.w(a12);
                            }
                            b2.w wVar2 = wVar;
                            int i11 = i10 + 1;
                            String uri3 = ((b2.n0) n0Var3.get(i10)).f3860a.toString();
                            b2.c0 c0Var = new b2.c0();
                            b2.f0 f0Var3 = new b2.f0();
                            List list3 = Collections.EMPTY_LIST;
                            x1 x1Var = x1.e;
                            b2.h0 h0Var = new b2.h0();
                            b2.k0 k0Var3 = b2.k0.d;
                            if (uri3 == null) {
                                parse = j0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (f0Var3.f3758b != null && f0Var3.f3757a == null) {
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = z10;
                            }
                            u6.p(z12);
                            if (parse != null) {
                                if (f0Var3.f3757a != null) {
                                    g0Var = new b2.g0(f0Var3);
                                } else {
                                    g0Var = j0Var;
                                }
                                j0Var2 = new b2.j0(parse, null, g0Var, null, list3, null, x1Var, -9223372036854775807L);
                            } else {
                                j0Var2 = j0Var;
                            }
                            b2.o0 o0Var3 = new b2.o0("", new b2.d0(c0Var), j0Var2, new b2.i0(h0Var), b2.r0.L, k0Var3);
                            j0Var2.getClass();
                            aVarArr[i11] = new a1(o0Var3, bVar, g0Var4, g3Var.B(o0Var3), dVar, 1048576, wVar2);
                        } else {
                            qf.b bVar2 = this.f47873b;
                            bVar2.getClass();
                            aVarArr[i10 + 1] = new p1((b2.n0) n0Var3.get(i10), bVar2, new oa.d(27));
                        }
                    }
                    a11 = new q0(aVarArr);
                }
                b2.e0 e0Var2 = o0Var2.e;
                if (e0Var2.f3726b != 0 || e0Var2.d != Long.MIN_VALUE || e0Var2.f3728f) {
                    f fVar = new f(a11);
                    long j11 = e0Var2.f3726b;
                    if (j11 >= 0) {
                        z11 = z10;
                    }
                    u6.g(z11);
                    u6.p(!fVar.h);
                    fVar.f47760b = j11;
                    long j12 = e0Var2.d;
                    u6.p(!fVar.h);
                    fVar.f47761c = j12;
                    u6.p(!fVar.h);
                    fVar.d = !e0Var2.f3729g;
                    boolean z14 = e0Var2.e;
                    u6.p(!fVar.h);
                    fVar.e = z14;
                    boolean z15 = e0Var2.f3728f;
                    u6.p(!fVar.h);
                    fVar.f47762f = z15;
                    boolean z16 = e0Var2.h;
                    u6.p(!fVar.h);
                    fVar.f47763g = z16;
                    u6.p(!fVar.h);
                    fVar.h = z10;
                    a11 = new i(fVar);
                }
                o0Var2.f3894b.getClass();
                if (o0Var2.f3894b.d == null) {
                    return a11;
                }
                e2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return a11;
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }
        long j13 = o0Var2.f3894b.h;
        String str7 = e2.m0.f8259a;
        throw null;
    }

    @Override
    public final g0 b(boolean z10) {
        this.f47877i = z10;
        q qVar = this.f47872a;
        qVar.e = z10;
        c3.o oVar = qVar.f47856a;
        synchronized (oVar) {
            oVar.f4659b = z10;
        }
        for (g0 g0Var : qVar.f47858c.values()) {
            g0Var.b(z10);
        }
        return this;
    }

    @Override
    public final g0 c(int i10) {
        q qVar = this.f47872a;
        qVar.f47860g = i10;
        c3.o oVar = qVar.f47856a;
        synchronized (oVar) {
            oVar.d = i10;
        }
        return this;
    }

    @Override
    public final g0 d(t7.u uVar) {
        this.f47874c = uVar;
        q qVar = this.f47872a;
        qVar.f47859f = uVar;
        c3.o oVar = qVar.f47856a;
        synchronized (oVar) {
            oVar.f4660c = uVar;
        }
        for (g0 g0Var : qVar.f47858c.values()) {
            g0Var.d(uVar);
        }
        return this;
    }
}
