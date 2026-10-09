package u2;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import qg.x1;
public final class p implements e0 {
    public final c5.g f48679a;
    public final pf.b f48680b;
    public ob.a f48681c;
    public final long d;
    public final long f48682e;
    public final long f48683f;
    public final float f48684g;
    public final float h;
    public boolean f48685i;

    public p(Context context, c3.m mVar) {
        pf.b bVar = new pf.b(context, 16);
        this.f48680b = bVar;
        ob.a aVar = new ob.a(28);
        this.f48681c = aVar;
        ?? obj = new Object();
        obj.f4236b = mVar;
        obj.f4239f = aVar;
        obj.f4237c = new HashMap();
        obj.d = new HashMap();
        obj.f4235a = true;
        this.f48679a = obj;
        if (bVar != ((pf.b) obj.f4238e)) {
            obj.f4238e = bVar;
            ((HashMap) obj.f4237c).clear();
            ((HashMap) obj.d).clear();
        }
        this.d = -9223372036854775807L;
        this.f48682e = -9223372036854775807L;
        this.f48683f = -9223372036854775807L;
        this.f48684g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f48685i = true;
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
        boolean z10;
        boolean z11;
        Uri parse;
        boolean z12;
        b2.f0 f0Var2;
        b2.c0 c0Var;
        b2.f0 f0Var3;
        long j3;
        Uri uri;
        String str;
        b2.x xVar;
        String str2;
        boolean z13;
        b2.f0 f0Var4;
        b2.c0 c0Var2;
        b2.b0 b0Var;
        b2.k0 k0Var2 = k0Var;
        k0Var2.f3400b.getClass();
        String scheme = k0Var2.f3400b.f3305a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(k0Var2.f3400b.f3306b, "application/x-image-uri")) {
            b2.f0 f0Var5 = k0Var2.f3400b;
            int H = e2.d0.H(f0Var5.f3305a, f0Var5.f3306b);
            if (k0Var2.f3400b.h != -9223372036854775807L) {
                c3.m mVar = (c3.m) this.f48679a.f4236b;
                synchronized (mVar) {
                    mVar.d = 1;
                }
            }
            try {
                c5.g gVar = this.f48679a;
                HashMap hashMap = (HashMap) gVar.d;
                e0 e0Var = (e0) hashMap.get(Integer.valueOf(H));
                if (e0Var == null) {
                    e0Var = (e0) gVar.a(H).get();
                    e0Var.c((ob.a) gVar.f4239f);
                    e0Var.b(gVar.f4235a);
                    e0Var.d();
                    hashMap.put(Integer.valueOf(H), e0Var);
                }
                b2.d0 a2 = k0Var2.f3401c.a();
                b2.e0 e0Var2 = k0Var2.f3401c;
                if (e0Var2.f3288a == -9223372036854775807L) {
                    a2.f3264a = this.d;
                }
                if (e0Var2.d == -3.4028235E38f) {
                    a2.d = this.f48684g;
                }
                if (e0Var2.f3291e == -3.4028235E38f) {
                    a2.f3267e = this.h;
                }
                if (e0Var2.f3289b == -9223372036854775807L) {
                    a2.f3265b = this.f48682e;
                }
                if (e0Var2.f3290c == -9223372036854775807L) {
                    a2.f3266c = this.f48683f;
                }
                b2.e0 e0Var3 = new b2.e0(a2);
                if (!e0Var3.equals(k0Var2.f3401c)) {
                    b2.b0 b0Var2 = new b2.b0();
                    List list = Collections.EMPTY_LIST;
                    e9.i0 i0Var = e9.a1.f8715e;
                    b2.g0 g0Var = b2.g0.d;
                    b2.a0 a0Var = k0Var2.f3402e;
                    ?? obj = new Object();
                    obj.f3693a = a0Var.f3709b;
                    obj.f3694b = a0Var.d;
                    obj.f3695c = a0Var.f3711e;
                    obj.d = a0Var.f3712f;
                    obj.f3696e = a0Var.f3713g;
                    obj.f3697f = a0Var.h;
                    String str3 = k0Var2.f3399a;
                    b2.n0 n0Var = k0Var2.d;
                    k0Var2.f3401c.a();
                    b2.g0 g0Var2 = k0Var2.f3403f;
                    b2.f0 f0Var6 = k0Var2.f3400b;
                    if (f0Var6 != null) {
                        String str4 = f0Var6.f3309f;
                        String str5 = f0Var6.f3306b;
                        Uri uri2 = f0Var6.f3305a;
                        list = f0Var6.f3308e;
                        i0Var = f0Var6.f3310g;
                        f0Var3 = null;
                        b2.c0 c0Var3 = f0Var6.f3307c;
                        if (c0Var3 != null) {
                            z11 = false;
                            ?? obj2 = new Object();
                            z10 = true;
                            obj2.f3243a = c0Var3.f3257a;
                            obj2.f3244b = c0Var3.f3258b;
                            obj2.f3245c = c0Var3.f3259c;
                            obj2.d = c0Var3.d;
                            obj2.f3246e = c0Var3.f3260e;
                            obj2.f3247f = c0Var3.f3261f;
                            obj2.f3248g = c0Var3.f3262g;
                            obj2.h = c0Var3.h;
                            b0Var = obj2;
                        } else {
                            z10 = true;
                            z11 = false;
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
                        z10 = true;
                        z11 = false;
                        j3 = -9223372036854775807L;
                        uri = null;
                        str = null;
                        xVar = null;
                        str2 = null;
                    }
                    List list2 = list;
                    e9.i0 i0Var2 = i0Var;
                    b2.d0 a10 = e0Var3.a();
                    if (b0Var2.f3244b != null && b0Var2.f3243a == null) {
                        z13 = z11 ? 1 : 0;
                    } else {
                        z13 = z10;
                    }
                    e2.d.g(z13);
                    if (uri != null) {
                        if (b0Var2.f3243a != null) {
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
                    z10 = true;
                    z11 = false;
                }
                a a11 = e0Var.a(k0Var2);
                e9.i0 i0Var3 = k0Var2.f3400b.f3310g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[z11 ? 1 : 0] = a11;
                    for (int i10 = z11 ? 1 : 0; i10 < i0Var3.size(); i10++) {
                        if (this.f48685i) {
                            b2.r rVar = new b2.r();
                            rVar.f3585q = b2.r0.n(((b2.j0) i0Var3.get(i10)).f3365b);
                            rVar.d = ((b2.j0) i0Var3.get(i10)).f3366c;
                            rVar.f3574e = ((b2.j0) i0Var3.get(i10)).d;
                            rVar.f3575f = ((b2.j0) i0Var3.get(i10)).f3367e;
                            rVar.f3572b = ((b2.j0) i0Var3.get(i10)).f3368f;
                            rVar.f3571a = ((b2.j0) i0Var3.get(i10)).f3369g;
                            b2.s sVar = new b2.s(rVar);
                            x1 x1Var = new x1(10, this, sVar);
                            pf.b bVar = this.f48680b;
                            r5.d dVar = new r5.d(x1Var, 10);
                            la.h hVar = new la.h(6);
                            rb.a aVar = new rb.a(26);
                            if (this.f48681c.D1(sVar)) {
                                b2.r a12 = sVar.a();
                                a12.f3585q = b2.r0.n("application/x-media3-cues");
                                a12.f3578j = sVar.f3643r;
                                a12.O = this.f48681c.U0(sVar);
                                sVar = new b2.s(a12);
                            }
                            b2.s sVar2 = sVar;
                            int i11 = i10 + 1;
                            String uri3 = ((b2.j0) i0Var3.get(i10)).f3364a.toString();
                            b2.y yVar = new b2.y();
                            b2.b0 b0Var3 = new b2.b0();
                            List list3 = Collections.EMPTY_LIST;
                            e9.a1 a1Var = e9.a1.f8715e;
                            b2.d0 d0Var = new b2.d0();
                            b2.g0 g0Var3 = b2.g0.d;
                            if (uri3 == null) {
                                parse = f0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (b0Var3.f3244b != null && b0Var3.f3243a == null) {
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = z10;
                            }
                            e2.d.g(z12);
                            if (parse != null) {
                                if (b0Var3.f3243a != null) {
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
                            aVarArr[i11] = new w0(k0Var3, bVar, dVar, hVar.B(k0Var3), aVar, 1048576, sVar2);
                        } else {
                            pf.b bVar2 = this.f48680b;
                            bVar2.getClass();
                            aVarArr[i10 + 1] = new l1((b2.j0) i0Var3.get(i10), bVar2, new rb.a(26));
                        }
                    }
                    a11 = new n0(aVarArr);
                }
                b2.a0 a0Var2 = k0Var2.f3402e;
                if (a0Var2.f3709b != 0 || a0Var2.d != Long.MIN_VALUE || a0Var2.f3712f) {
                    e eVar = new e(a11);
                    long j10 = a0Var2.f3709b;
                    if (j10 >= 0) {
                        z11 = z10;
                    }
                    e2.d.b(z11);
                    e2.d.g(!eVar.h);
                    eVar.f48561b = j10;
                    long j11 = a0Var2.d;
                    e2.d.g(!eVar.h);
                    eVar.f48562c = j11;
                    e2.d.g(!eVar.h);
                    eVar.d = !a0Var2.f3713g;
                    boolean z14 = a0Var2.f3711e;
                    e2.d.g(!eVar.h);
                    eVar.f48563e = z14;
                    boolean z15 = a0Var2.f3712f;
                    e2.d.g(!eVar.h);
                    eVar.f48564f = z15;
                    boolean z16 = a0Var2.h;
                    e2.d.g(!eVar.h);
                    eVar.f48565g = z16;
                    eVar.h = z10;
                    a11 = new h(eVar);
                }
                k0Var2.f3400b.getClass();
                if (k0Var2.f3400b.d == null) {
                    return a11;
                }
                e2.a.n("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return a11;
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException(e7);
            }
        }
        long j12 = k0Var2.f3400b.h;
        String str7 = e2.d0.f8532a;
        throw null;
    }

    @Override
    public final e0 b(boolean z10) {
        this.f48685i = z10;
        c5.g gVar = this.f48679a;
        gVar.f4235a = z10;
        c3.m mVar = (c3.m) gVar.f4236b;
        synchronized (mVar) {
            mVar.f4146b = z10;
        }
        for (e0 e0Var : ((HashMap) gVar.d).values()) {
            e0Var.b(z10);
        }
        return this;
    }

    @Override
    public final e0 c(ob.a aVar) {
        this.f48681c = aVar;
        c5.g gVar = this.f48679a;
        gVar.f4239f = aVar;
        c3.m mVar = (c3.m) gVar.f4236b;
        synchronized (mVar) {
            mVar.f4147c = aVar;
        }
        for (e0 e0Var : ((HashMap) gVar.d).values()) {
            e0Var.c(aVar);
        }
        return this;
    }

    @Override
    public final e0 d() {
        c5.g gVar = this.f48679a;
        gVar.getClass();
        synchronized (((c3.m) gVar.f4236b)) {
        }
        return this;
    }
}
