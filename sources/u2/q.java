package u2;

import android.content.Context;
import android.net.Uri;
import e9.x1;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import m.g3;
import v7.u6;
public final class q implements f0 {
    public final jg.f f47414a;
    public final qf.b f47415b;
    public t7.u f47416c;
    public final long d;
    public final long e;
    public final long f47417f;
    public final float f47418g;
    public final float h;
    public boolean f47419i;

    public q(Context context, c3.m mVar) {
        qf.b bVar = new qf.b(context, 18);
        t7.u uVar = new t7.u(28);
        this.f47415b = bVar;
        this.f47416c = uVar;
        jg.f fVar = new jg.f(mVar, uVar);
        this.f47414a = fVar;
        if (bVar != ((qf.b) fVar.f14428f)) {
            fVar.f14428f = bVar;
            ((HashMap) fVar.d).clear();
            ((HashMap) fVar.e).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f47417f = -9223372036854775807L;
        this.f47418g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f47419i = true;
    }

    public static f0 e(Class cls, g2.g gVar) {
        try {
            return (f0) cls.getConstructor(g2.g.class).newInstance(gVar);
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
        o0Var2.f3887b.getClass();
        String scheme = o0Var2.f3887b.f3797a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(o0Var2.f3887b.f3798b, "application/x-image-uri")) {
            b2.j0 j0Var5 = o0Var2.f3887b;
            int K = e2.m0.K(j0Var5.f3797a, j0Var5.f3798b);
            if (o0Var2.f3887b.h != -9223372036854775807L) {
                c3.m mVar = (c3.m) this.f47414a.f14427c;
                synchronized (mVar) {
                    mVar.e = 1;
                }
                jg.f.a(this.f47414a);
            }
            try {
                f0 b10 = this.f47414a.b(K);
                b2.h0 a2 = o0Var2.f3888c.a();
                b2.i0 i0Var = o0Var2.f3888c;
                if (i0Var.f3781a == -9223372036854775807L) {
                    a2.f3770a = this.d;
                }
                if (i0Var.d == -3.4028235E38f) {
                    a2.d = this.f47418g;
                }
                if (i0Var.e == -3.4028235E38f) {
                    a2.e = this.h;
                }
                if (i0Var.f3782b == -9223372036854775807L) {
                    a2.f3771b = this.e;
                }
                if (i0Var.f3783c == -9223372036854775807L) {
                    a2.f3772c = this.f47417f;
                }
                b2.i0 i0Var2 = new b2.i0(a2);
                if (!i0Var2.equals(o0Var2.f3888c)) {
                    b2.f0 f0Var2 = new b2.f0();
                    List list = Collections.EMPTY_LIST;
                    e9.n0 n0Var = x1.e;
                    b2.k0 k0Var = b2.k0.d;
                    b2.e0 e0Var = o0Var2.e;
                    ?? obj = new Object();
                    obj.f3704a = e0Var.f3719b;
                    obj.f3705b = e0Var.d;
                    obj.f3706c = e0Var.e;
                    obj.d = e0Var.f3721f;
                    obj.e = e0Var.f3722g;
                    obj.f3707f = e0Var.h;
                    String str3 = o0Var2.f3886a;
                    b2.r0 r0Var = o0Var2.d;
                    o0Var2.f3888c.a();
                    b2.k0 k0Var2 = o0Var2.f3889f;
                    b2.j0 j0Var6 = o0Var2.f3887b;
                    if (j0Var6 != null) {
                        String str4 = j0Var6.f3800f;
                        String str5 = j0Var6.f3798b;
                        Uri uri2 = j0Var6.f3797a;
                        list = j0Var6.e;
                        n0Var = j0Var6.f3801g;
                        j0Var3 = null;
                        b2.g0 g0Var3 = j0Var6.f3799c;
                        if (g0Var3 != null) {
                            z11 = false;
                            ?? obj2 = new Object();
                            z10 = true;
                            obj2.f3750a = g0Var3.f3763a;
                            obj2.f3751b = g0Var3.f3764b;
                            obj2.f3752c = g0Var3.f3765c;
                            obj2.d = g0Var3.d;
                            obj2.e = g0Var3.e;
                            obj2.f3753f = g0Var3.f3766f;
                            obj2.f3754g = g0Var3.f3767g;
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
                    if (f0Var2.f3751b != null && f0Var2.f3750a == null) {
                        z13 = z11 ? 1 : 0;
                    } else {
                        z13 = z10;
                    }
                    u6.p(z13);
                    if (uri != null) {
                        if (f0Var2.f3750a != null) {
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
                e9.n0 n0Var3 = o0Var2.f3887b.f3801g;
                if (!n0Var3.isEmpty()) {
                    a[] aVarArr = new a[n0Var3.size() + 1];
                    aVarArr[z11 ? 1 : 0] = a11;
                    for (int i10 = z11 ? 1 : 0; i10 < n0Var3.size(); i10++) {
                        if (this.f47419i) {
                            b2.v vVar = new b2.v();
                            vVar.f4075r = b2.v0.n(((b2.n0) n0Var3.get(i10)).f3854b);
                            vVar.d = ((b2.n0) n0Var3.get(i10)).f3855c;
                            vVar.e = ((b2.n0) n0Var3.get(i10)).d;
                            vVar.f4064f = ((b2.n0) n0Var3.get(i10)).e;
                            vVar.f4062b = ((b2.n0) n0Var3.get(i10)).f3856f;
                            vVar.f4061a = ((b2.n0) n0Var3.get(i10)).f3857g;
                            b2.w wVar = new b2.w(vVar);
                            org.telegram.ui.web.m mVar2 = new org.telegram.ui.web.m(11, this, wVar);
                            qf.b bVar = this.f47415b;
                            qg.h0 h0Var = new qg.h0(mVar2, 17);
                            g3 g3Var = new g3(5);
                            oa.d dVar = new oa.d(27);
                            if (this.f47416c.a0(wVar)) {
                                b2.v a12 = wVar.a();
                                a12.f4075r = b2.v0.n("application/x-media3-cues");
                                a12.f4067j = wVar.f4128s;
                                a12.P = this.f47416c.L(wVar);
                                wVar = new b2.w(a12);
                            }
                            b2.w wVar2 = wVar;
                            int i11 = i10 + 1;
                            String uri3 = ((b2.n0) n0Var3.get(i10)).f3853a.toString();
                            b2.c0 c0Var = new b2.c0();
                            b2.f0 f0Var3 = new b2.f0();
                            List list3 = Collections.EMPTY_LIST;
                            x1 x1Var = x1.e;
                            b2.h0 h0Var2 = new b2.h0();
                            b2.k0 k0Var3 = b2.k0.d;
                            if (uri3 == null) {
                                parse = j0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (f0Var3.f3751b != null && f0Var3.f3750a == null) {
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = z10;
                            }
                            u6.p(z12);
                            if (parse != null) {
                                if (f0Var3.f3750a != null) {
                                    g0Var = new b2.g0(f0Var3);
                                } else {
                                    g0Var = j0Var;
                                }
                                j0Var2 = new b2.j0(parse, null, g0Var, null, list3, null, x1Var, -9223372036854775807L);
                            } else {
                                j0Var2 = j0Var;
                            }
                            b2.o0 o0Var3 = new b2.o0("", new b2.d0(c0Var), j0Var2, new b2.i0(h0Var2), b2.r0.L, k0Var3);
                            j0Var2.getClass();
                            aVarArr[i11] = new z0(o0Var3, bVar, h0Var, g3Var.B(o0Var3), dVar, 1048576, wVar2);
                        } else {
                            qf.b bVar2 = this.f47415b;
                            bVar2.getClass();
                            aVarArr[i10 + 1] = new o1((b2.n0) n0Var3.get(i10), bVar2, new oa.d(27));
                        }
                    }
                    a11 = new p0(aVarArr);
                }
                b2.e0 e0Var2 = o0Var2.e;
                if (e0Var2.f3719b != 0 || e0Var2.d != Long.MIN_VALUE || e0Var2.f3721f) {
                    f fVar = new f(a11);
                    long j11 = e0Var2.f3719b;
                    if (j11 >= 0) {
                        z11 = z10;
                    }
                    u6.g(z11);
                    u6.p(!fVar.h);
                    fVar.f47307b = j11;
                    long j12 = e0Var2.d;
                    u6.p(!fVar.h);
                    fVar.f47308c = j12;
                    u6.p(!fVar.h);
                    fVar.d = !e0Var2.f3722g;
                    boolean z14 = e0Var2.e;
                    u6.p(!fVar.h);
                    fVar.e = z14;
                    boolean z15 = e0Var2.f3721f;
                    u6.p(!fVar.h);
                    fVar.f47309f = z15;
                    boolean z16 = e0Var2.h;
                    u6.p(!fVar.h);
                    fVar.f47310g = z16;
                    u6.p(!fVar.h);
                    fVar.h = z10;
                    a11 = new i(fVar);
                }
                o0Var2.f3887b.getClass();
                if (o0Var2.f3887b.d == null) {
                    return a11;
                }
                e2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return a11;
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }
        long j13 = o0Var2.f3887b.h;
        String str7 = e2.m0.f8252a;
        throw null;
    }

    @Override
    public final f0 b(boolean z10) {
        this.f47419i = z10;
        jg.f fVar = this.f47414a;
        fVar.f14425a = z10;
        c3.m mVar = (c3.m) fVar.f14427c;
        synchronized (mVar) {
            mVar.f4650b = z10;
        }
        for (f0 f0Var : ((HashMap) fVar.e).values()) {
            f0Var.b(z10);
        }
        return this;
    }

    @Override
    public final f0 c(int i10) {
        jg.f fVar = this.f47414a;
        fVar.f14426b = i10;
        c3.m mVar = (c3.m) fVar.f14427c;
        synchronized (mVar) {
            mVar.d = i10;
        }
        return this;
    }

    @Override
    public final f0 d(t7.u uVar) {
        this.f47416c = uVar;
        jg.f fVar = this.f47414a;
        fVar.f14429g = uVar;
        c3.m mVar = (c3.m) fVar.f14427c;
        synchronized (mVar) {
            mVar.f4651c = uVar;
        }
        for (f0 f0Var : ((HashMap) fVar.e).values()) {
            f0Var.d(uVar);
        }
        return this;
    }
}
