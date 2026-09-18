package u2;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class p implements e0 {
    public final c5.g f43715a;
    public final of.b f43716b;
    public qb.b f43717c;
    public final long d;
    public final long e;
    public final long f43718f;
    public final float f43719g;
    public final float h;
    public boolean f43720i;

    public p(Context context, c3.m mVar) {
        of.b bVar = new of.b(context, 18);
        this.f43716b = bVar;
        qb.b bVar2 = new qb.b(28);
        this.f43717c = bVar2;
        ?? obj = new Object();
        obj.f3878b = mVar;
        obj.f3880f = bVar2;
        obj.f3879c = new HashMap();
        obj.d = new HashMap();
        obj.f3877a = true;
        this.f43715a = obj;
        if (bVar != ((of.b) obj.e)) {
            obj.e = bVar;
            ((HashMap) obj.f3879c).clear();
            ((HashMap) obj.d).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f43718f = -9223372036854775807L;
        this.f43719g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f43720i = true;
    }

    public static e0 e(Class cls, g2.g gVar) {
        try {
            return (e0) cls.getConstructor(g2.g.class).newInstance(gVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
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
        k0Var2.f3078b.getClass();
        String scheme = k0Var2.f3078b.f2993a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(k0Var2.f3078b.f2994b, "application/x-image-uri")) {
            b2.f0 f0Var5 = k0Var2.f3078b;
            int I = e2.d0.I(f0Var5.f2993a, f0Var5.f2994b);
            if (k0Var2.f3078b.h != -9223372036854775807L) {
                c3.m mVar = (c3.m) this.f43715a.f3878b;
                synchronized (mVar) {
                    mVar.d = 1;
                }
            }
            try {
                c5.g gVar = this.f43715a;
                HashMap hashMap = (HashMap) gVar.d;
                e0 e0Var = (e0) hashMap.get(Integer.valueOf(I));
                if (e0Var == null) {
                    e0Var = (e0) gVar.a(I).get();
                    e0Var.d((qb.b) gVar.f3880f);
                    e0Var.b(gVar.f3877a);
                    e0Var.c();
                    hashMap.put(Integer.valueOf(I), e0Var);
                }
                b2.d0 a2 = k0Var2.f3079c.a();
                b2.e0 e0Var2 = k0Var2.f3079c;
                if (e0Var2.f2978a == -9223372036854775807L) {
                    a2.f2957a = this.d;
                }
                if (e0Var2.d == -3.4028235E38f) {
                    a2.d = this.f43719g;
                }
                if (e0Var2.e == -3.4028235E38f) {
                    a2.e = this.h;
                }
                if (e0Var2.f2979b == -9223372036854775807L) {
                    a2.f2958b = this.e;
                }
                if (e0Var2.f2980c == -9223372036854775807L) {
                    a2.f2959c = this.f43718f;
                }
                b2.e0 e0Var3 = new b2.e0(a2);
                if (!e0Var3.equals(k0Var2.f3079c)) {
                    b2.b0 b0Var2 = new b2.b0();
                    List list = Collections.EMPTY_LIST;
                    e9.i0 i0Var = e9.a1.e;
                    b2.g0 g0Var = b2.g0.d;
                    b2.a0 a0Var = k0Var2.e;
                    ?? obj = new Object();
                    obj.f3355a = a0Var.f3370b;
                    obj.f3356b = a0Var.d;
                    obj.f3357c = a0Var.e;
                    obj.d = a0Var.f3372f;
                    obj.e = a0Var.f3373g;
                    obj.f3358f = a0Var.h;
                    String str3 = k0Var2.f3077a;
                    b2.n0 n0Var = k0Var2.d;
                    k0Var2.f3079c.a();
                    b2.g0 g0Var2 = k0Var2.f3080f;
                    b2.f0 f0Var6 = k0Var2.f3078b;
                    if (f0Var6 != null) {
                        String str4 = f0Var6.f2996f;
                        String str5 = f0Var6.f2994b;
                        Uri uri2 = f0Var6.f2993a;
                        list = f0Var6.e;
                        i0Var = f0Var6.f2997g;
                        f0Var3 = null;
                        b2.c0 c0Var3 = f0Var6.f2995c;
                        if (c0Var3 != null) {
                            c10 = 0;
                            ?? obj2 = new Object();
                            obj2.f2938a = c0Var3.f2951a;
                            obj2.f2939b = c0Var3.f2952b;
                            obj2.f2940c = c0Var3.f2953c;
                            obj2.d = c0Var3.d;
                            obj2.e = c0Var3.e;
                            obj2.f2941f = c0Var3.f2954f;
                            obj2.f2942g = c0Var3.f2955g;
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
                    if (b0Var2.f2939b != null && b0Var2.f2938a == null) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    e2.d.g(z12);
                    if (uri != null) {
                        if (b0Var2.f2938a != null) {
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
                e9.i0 i0Var3 = k0Var2.f3078b.f2997g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[c10] = a11;
                    for (int i10 = 0; i10 < i0Var3.size(); i10++) {
                        if (this.f43720i) {
                            b2.r rVar = new b2.r();
                            rVar.f3253q = b2.r0.n(((b2.j0) i0Var3.get(i10)).f3045b);
                            rVar.d = ((b2.j0) i0Var3.get(i10)).f3046c;
                            rVar.e = ((b2.j0) i0Var3.get(i10)).d;
                            rVar.f3243f = ((b2.j0) i0Var3.get(i10)).e;
                            rVar.f3241b = ((b2.j0) i0Var3.get(i10)).f3047f;
                            rVar.f3240a = ((b2.j0) i0Var3.get(i10)).f3048g;
                            b2.s sVar = new b2.s(rVar);
                            s5.e eVar = new s5.e(6, this, sVar);
                            of.b bVar = this.f43716b;
                            r5.d dVar = new r5.d(eVar, 10);
                            lf.i iVar = new lf.i(5);
                            qb.b bVar2 = new qb.b(26);
                            if (this.f43717c.W(sVar)) {
                                b2.r a12 = sVar.a();
                                a12.f3253q = b2.r0.n("application/x-media3-cues");
                                a12.f3246j = sVar.f3309r;
                                a12.O = this.f43717c.D(sVar);
                                sVar = new b2.s(a12);
                            }
                            b2.s sVar2 = sVar;
                            int i11 = i10 + 1;
                            String uri3 = ((b2.j0) i0Var3.get(i10)).f3044a.toString();
                            b2.y yVar = new b2.y();
                            b2.b0 b0Var3 = new b2.b0();
                            List list3 = Collections.EMPTY_LIST;
                            e9.a1 a1Var = e9.a1.e;
                            b2.d0 d0Var = new b2.d0();
                            b2.g0 g0Var3 = b2.g0.d;
                            if (uri3 == null) {
                                parse = f0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (b0Var3.f2939b != null && b0Var3.f2938a == null) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            e2.d.g(z11);
                            if (parse != null) {
                                if (b0Var3.f2938a != null) {
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
                            aVarArr[i11] = new w0(k0Var3, bVar, dVar, iVar.A(k0Var3), bVar2, 1048576, sVar2);
                        } else {
                            of.b bVar3 = this.f43716b;
                            bVar3.getClass();
                            aVarArr[i10 + 1] = new l1((b2.j0) i0Var3.get(i10), bVar3, new qb.b(26));
                        }
                    }
                    a11 = new o0(aVarArr);
                }
                b2.a0 a0Var2 = k0Var2.e;
                if (a0Var2.f3370b != 0 || a0Var2.d != Long.MIN_VALUE || a0Var2.f3372f) {
                    e eVar2 = new e(a11);
                    long j10 = a0Var2.f3370b;
                    if (j10 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    e2.d.g(!eVar2.h);
                    eVar2.f43602b = j10;
                    long j11 = a0Var2.d;
                    e2.d.g(!eVar2.h);
                    eVar2.f43603c = j11;
                    e2.d.g(!eVar2.h);
                    eVar2.d = !a0Var2.f3373g;
                    boolean z13 = a0Var2.e;
                    e2.d.g(!eVar2.h);
                    eVar2.e = z13;
                    boolean z14 = a0Var2.f3372f;
                    e2.d.g(!eVar2.h);
                    eVar2.f43604f = z14;
                    boolean z15 = a0Var2.h;
                    e2.d.g(!eVar2.h);
                    eVar2.f43605g = z15;
                    eVar2.h = true;
                    a11 = new h(eVar2);
                }
                k0Var2.f3078b.getClass();
                if (k0Var2.f3078b.d == null) {
                    return a11;
                }
                e2.a.n("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return a11;
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }
        long j12 = k0Var2.f3078b.h;
        String str7 = e2.d0.f7887a;
        throw null;
    }

    @Override
    public final e0 b(boolean z10) {
        this.f43720i = z10;
        c5.g gVar = this.f43715a;
        gVar.f3877a = z10;
        c3.m mVar = (c3.m) gVar.f3878b;
        synchronized (mVar) {
            mVar.f3794b = z10;
        }
        for (e0 e0Var : ((HashMap) gVar.d).values()) {
            e0Var.b(z10);
        }
        return this;
    }

    @Override
    public final e0 c() {
        c5.g gVar = this.f43715a;
        gVar.getClass();
        synchronized (((c3.m) gVar.f3878b)) {
        }
        return this;
    }

    @Override
    public final e0 d(qb.b bVar) {
        this.f43717c = bVar;
        c5.g gVar = this.f43715a;
        gVar.f3880f = bVar;
        c3.m mVar = (c3.m) gVar.f3878b;
        synchronized (mVar) {
            mVar.f3795c = bVar;
        }
        for (e0 e0Var : ((HashMap) gVar.d).values()) {
            e0Var.d(bVar);
        }
        return this;
    }
}
