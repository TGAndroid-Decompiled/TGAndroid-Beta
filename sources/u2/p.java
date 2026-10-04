package u2;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class p implements e0 {
    public final c5.g f47354a;
    public final of.b f47355b;
    public qb.b f47356c;
    public final long d;
    public final long f47357e;
    public final long f47358f;
    public final float f47359g;
    public final float h;
    public boolean f47360i;

    public p(Context context, c3.m mVar) {
        of.b bVar = new of.b(context, 18);
        this.f47355b = bVar;
        qb.b bVar2 = new qb.b(28);
        this.f47356c = bVar2;
        ?? obj = new Object();
        obj.f4185b = mVar;
        obj.f4188f = bVar2;
        obj.f4186c = new HashMap();
        obj.d = new HashMap();
        obj.f4184a = true;
        this.f47354a = obj;
        if (bVar != ((of.b) obj.f4187e)) {
            obj.f4187e = bVar;
            ((HashMap) obj.f4186c).clear();
            ((HashMap) obj.d).clear();
        }
        this.d = -9223372036854775807L;
        this.f47357e = -9223372036854775807L;
        this.f47358f = -9223372036854775807L;
        this.f47359g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f47360i = true;
    }

    public static e0 e(Class cls, g2.g gVar) {
        try {
            return (e0) cls.getConstructor(g2.g.class).newInstance(gVar);
        } catch (Exception e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override
    public final a a(b2.k0 k0Var) {
        b2.f0 f0Var;
        char c10;
        boolean z10;
        Uri parse;
        boolean z11;
        b2.f0 f0Var2;
        b2.c0 c0Var;
        b2.f0 f0Var3;
        long j3;
        Uri uri;
        String str;
        b2.x xVar;
        String str2;
        boolean z12;
        b2.f0 f0Var4;
        b2.c0 c0Var2;
        b2.b0 b0Var;
        b2.k0 k0Var2 = k0Var;
        k0Var2.f3321b.getClass();
        String scheme = k0Var2.f3321b.f3226a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(k0Var2.f3321b.f3227b, "application/x-image-uri")) {
            b2.f0 f0Var5 = k0Var2.f3321b;
            int I = e2.d0.I(f0Var5.f3226a, f0Var5.f3227b);
            if (k0Var2.f3321b.h != -9223372036854775807L) {
                c3.m mVar = (c3.m) this.f47354a.f4185b;
                synchronized (mVar) {
                    mVar.d = 1;
                }
            }
            try {
                c5.g gVar = this.f47354a;
                HashMap hashMap = (HashMap) gVar.d;
                e0 e0Var = (e0) hashMap.get(Integer.valueOf(I));
                if (e0Var == null) {
                    e0Var = (e0) gVar.a(I).get();
                    e0Var.d((qb.b) gVar.f4188f);
                    e0Var.b(gVar.f4184a);
                    e0Var.c();
                    hashMap.put(Integer.valueOf(I), e0Var);
                }
                b2.d0 a2 = k0Var2.f3322c.a();
                b2.e0 e0Var2 = k0Var2.f3322c;
                if (e0Var2.f3209a == -9223372036854775807L) {
                    a2.f3185a = this.d;
                }
                if (e0Var2.d == -3.4028235E38f) {
                    a2.d = this.f47359g;
                }
                if (e0Var2.f3212e == -3.4028235E38f) {
                    a2.f3188e = this.h;
                }
                if (e0Var2.f3210b == -9223372036854775807L) {
                    a2.f3186b = this.f47357e;
                }
                if (e0Var2.f3211c == -9223372036854775807L) {
                    a2.f3187c = this.f47358f;
                }
                b2.e0 e0Var3 = new b2.e0(a2);
                if (!e0Var3.equals(k0Var2.f3322c)) {
                    b2.b0 b0Var2 = new b2.b0();
                    List list = Collections.EMPTY_LIST;
                    e9.i0 i0Var = e9.a1.f8720e;
                    b2.g0 g0Var = b2.g0.d;
                    b2.a0 a0Var = k0Var2.f3323e;
                    ?? obj = new Object();
                    obj.f3614a = a0Var.f3630b;
                    obj.f3615b = a0Var.d;
                    obj.f3616c = a0Var.f3632e;
                    obj.d = a0Var.f3633f;
                    obj.f3617e = a0Var.f3634g;
                    obj.f3618f = a0Var.h;
                    String str3 = k0Var2.f3320a;
                    b2.n0 n0Var = k0Var2.d;
                    k0Var2.f3322c.a();
                    b2.g0 g0Var2 = k0Var2.f3324f;
                    b2.f0 f0Var6 = k0Var2.f3321b;
                    if (f0Var6 != null) {
                        String str4 = f0Var6.f3230f;
                        String str5 = f0Var6.f3227b;
                        Uri uri2 = f0Var6.f3226a;
                        list = f0Var6.f3229e;
                        i0Var = f0Var6.f3231g;
                        f0Var3 = null;
                        b2.c0 c0Var3 = f0Var6.f3228c;
                        if (c0Var3 != null) {
                            c10 = 0;
                            ?? obj2 = new Object();
                            obj2.f3164a = c0Var3.f3178a;
                            obj2.f3165b = c0Var3.f3179b;
                            obj2.f3166c = c0Var3.f3180c;
                            obj2.d = c0Var3.d;
                            obj2.f3167e = c0Var3.f3181e;
                            obj2.f3168f = c0Var3.f3182f;
                            obj2.f3169g = c0Var3.f3183g;
                            obj2.h = c0Var3.h;
                            b0Var = obj2;
                        } else {
                            c10 = 0;
                            b0Var = new b2.b0();
                        }
                        b2.x xVar2 = f0Var6.d;
                        j3 = f0Var6.h;
                        xVar = xVar2;
                        str = str5;
                        uri = uri2;
                        str2 = str4;
                        b0Var2 = b0Var;
                    } else {
                        f0Var3 = null;
                        c10 = 0;
                        j3 = -9223372036854775807L;
                        uri = null;
                        str = null;
                        xVar = null;
                        str2 = null;
                    }
                    List list2 = list;
                    e9.i0 i0Var2 = i0Var;
                    b2.d0 a10 = e0Var3.a();
                    if (b0Var2.f3165b != null && b0Var2.f3164a == null) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    e2.d.g(z12);
                    if (uri != null) {
                        if (b0Var2.f3164a != null) {
                            c0Var2 = new b2.c0(b0Var2);
                        } else {
                            c0Var2 = f0Var3;
                        }
                        f0Var4 = new b2.f0(uri, str, c0Var2, xVar, list2, str2, i0Var2, j3);
                    } else {
                        f0Var4 = f0Var3;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str6 = str3;
                    ?? zVar = new b2.z(obj);
                    b2.e0 e0Var4 = new b2.e0(a10);
                    if (n0Var == null) {
                        n0Var = b2.n0.K;
                    }
                    k0Var2 = new b2.k0(str6, zVar, f0Var4, e0Var4, n0Var, g0Var2);
                    f0Var = f0Var3;
                } else {
                    f0Var = null;
                    c10 = 0;
                }
                a a11 = e0Var.a(k0Var2);
                e9.i0 i0Var3 = k0Var2.f3321b.f3231g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[c10] = a11;
                    for (int i10 = 0; i10 < i0Var3.size(); i10++) {
                        if (this.f47360i) {
                            b2.r rVar = new b2.r();
                            rVar.f3506q = b2.r0.n(((b2.j0) i0Var3.get(i10)).f3286b);
                            rVar.d = ((b2.j0) i0Var3.get(i10)).f3287c;
                            rVar.f3495e = ((b2.j0) i0Var3.get(i10)).d;
                            rVar.f3496f = ((b2.j0) i0Var3.get(i10)).f3288e;
                            rVar.f3493b = ((b2.j0) i0Var3.get(i10)).f3289f;
                            rVar.f3492a = ((b2.j0) i0Var3.get(i10)).f3290g;
                            b2.s sVar = new b2.s(rVar);
                            rg.x xVar3 = new rg.x(7, this, sVar);
                            of.b bVar = this.f47355b;
                            r2.s sVar2 = new r2.s(xVar3, 12);
                            la.h hVar = new la.h(6);
                            qb.b bVar2 = new qb.b(26);
                            if (this.f47356c.V(sVar)) {
                                b2.r a12 = sVar.a();
                                a12.f3506q = b2.r0.n("application/x-media3-cues");
                                a12.f3499j = sVar.f3564r;
                                a12.O = this.f47356c.H(sVar);
                                sVar = new b2.s(a12);
                            }
                            b2.s sVar3 = sVar;
                            int i11 = i10 + 1;
                            String uri3 = ((b2.j0) i0Var3.get(i10)).f3285a.toString();
                            b2.y yVar = new b2.y();
                            b2.b0 b0Var3 = new b2.b0();
                            List list3 = Collections.EMPTY_LIST;
                            e9.a1 a1Var = e9.a1.f8720e;
                            b2.d0 d0Var = new b2.d0();
                            b2.g0 g0Var3 = b2.g0.d;
                            if (uri3 == null) {
                                parse = f0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (b0Var3.f3165b != null && b0Var3.f3164a == null) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            e2.d.g(z11);
                            if (parse != null) {
                                if (b0Var3.f3164a != null) {
                                    c0Var = new b2.c0(b0Var3);
                                } else {
                                    c0Var = f0Var;
                                }
                                f0Var2 = new b2.f0(parse, null, c0Var, null, list3, null, a1Var, -9223372036854775807L);
                            } else {
                                f0Var2 = f0Var;
                            }
                            b2.k0 k0Var3 = new b2.k0("", new b2.z(yVar), f0Var2, new b2.e0(d0Var), b2.n0.K, g0Var3);
                            f0Var2.getClass();
                            aVarArr[i11] = new x0(k0Var3, bVar, sVar2, hVar.A(k0Var3), bVar2, 1048576, sVar3);
                        } else {
                            of.b bVar3 = this.f47355b;
                            bVar3.getClass();
                            aVarArr[i10 + 1] = new m1((b2.j0) i0Var3.get(i10), bVar3, new qb.b(26));
                        }
                    }
                    a11 = new p0(aVarArr);
                }
                b2.a0 a0Var2 = k0Var2.f3323e;
                if (a0Var2.f3630b != 0 || a0Var2.d != Long.MIN_VALUE || a0Var2.f3633f) {
                    e eVar = new e(a11);
                    long j10 = a0Var2.f3630b;
                    if (j10 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    e2.d.g(!eVar.h);
                    eVar.f47247b = j10;
                    long j11 = a0Var2.d;
                    e2.d.g(!eVar.h);
                    eVar.f47248c = j11;
                    e2.d.g(!eVar.h);
                    eVar.d = !a0Var2.f3634g;
                    boolean z13 = a0Var2.f3632e;
                    e2.d.g(!eVar.h);
                    eVar.f47249e = z13;
                    boolean z14 = a0Var2.f3633f;
                    e2.d.g(!eVar.h);
                    eVar.f47250f = z14;
                    boolean z15 = a0Var2.h;
                    e2.d.g(!eVar.h);
                    eVar.f47251g = z15;
                    eVar.h = true;
                    a11 = new h(eVar);
                }
                k0Var2.f3321b.getClass();
                if (k0Var2.f3321b.d == null) {
                    return a11;
                }
                e2.a.n("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return a11;
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException(e7);
            }
        }
        long j12 = k0Var2.f3321b.h;
        String str7 = e2.d0.f8537a;
        throw null;
    }

    @Override
    public final e0 b(boolean z10) {
        this.f47360i = z10;
        c5.g gVar = this.f47354a;
        gVar.f4184a = z10;
        c3.m mVar = (c3.m) gVar.f4185b;
        synchronized (mVar) {
            mVar.f4096b = z10;
        }
        for (e0 e0Var : ((HashMap) gVar.d).values()) {
            e0Var.b(z10);
        }
        return this;
    }

    @Override
    public final e0 c() {
        c5.g gVar = this.f47354a;
        gVar.getClass();
        synchronized (((c3.m) gVar.f4185b)) {
        }
        return this;
    }

    @Override
    public final e0 d(qb.b bVar) {
        this.f47356c = bVar;
        c5.g gVar = this.f47354a;
        gVar.f4188f = bVar;
        c3.m mVar = (c3.m) gVar.f4185b;
        synchronized (mVar) {
            mVar.f4097c = bVar;
        }
        for (e0 e0Var : ((HashMap) gVar.d).values()) {
            e0Var.d(bVar);
        }
        return this;
    }
}
