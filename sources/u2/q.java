package u2;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import m.e3;
public final class q implements f0 {
    public final c5.g f42421a;
    public final n4.y f42422b;
    public rb.a f42423c;
    public final long d;
    public final long e;
    public final long f42424f;
    public final float f42425g;
    public final float h;
    public boolean f42426i;

    public q(Context context, c3.m mVar) {
        n4.y yVar = new n4.y(context, 18);
        this.f42422b = yVar;
        rb.a aVar = new rb.a(28);
        this.f42423c = aVar;
        ?? obj = new Object();
        obj.f4292b = mVar;
        obj.f4294f = aVar;
        obj.f4293c = new HashMap();
        obj.d = new HashMap();
        obj.f4291a = true;
        this.f42421a = obj;
        if (yVar != ((n4.y) obj.e)) {
            obj.e = yVar;
            ((HashMap) obj.f4293c).clear();
            ((HashMap) obj.d).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f42424f = -9223372036854775807L;
        this.f42425g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f42426i = true;
    }

    public static f0 e(Class cls, g2.g gVar) {
        try {
            return (f0) cls.getConstructor(g2.g.class).newInstance(gVar);
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
        k0Var2.f1771b.getClass();
        String scheme = k0Var2.f1771b.f1686a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(k0Var2.f1771b.f1687b, "application/x-image-uri")) {
            b2.f0 f0Var5 = k0Var2.f1771b;
            int I = e2.d0.I(f0Var5.f1686a, f0Var5.f1687b);
            if (k0Var2.f1771b.h != -9223372036854775807L) {
                c3.m mVar = (c3.m) this.f42421a.f4292b;
                synchronized (mVar) {
                    mVar.d = 1;
                }
            }
            try {
                c5.g gVar = this.f42421a;
                HashMap hashMap = (HashMap) gVar.d;
                f0 f0Var6 = (f0) hashMap.get(Integer.valueOf(I));
                if (f0Var6 == null) {
                    f0Var6 = (f0) gVar.a(I).get();
                    f0Var6.d((rb.a) gVar.f4294f);
                    f0Var6.b(gVar.f4291a);
                    f0Var6.c();
                    hashMap.put(Integer.valueOf(I), f0Var6);
                }
                b2.d0 a2 = k0Var2.f1772c.a();
                b2.e0 e0Var = k0Var2.f1772c;
                if (e0Var.f1671a == -9223372036854775807L) {
                    a2.f1650a = this.d;
                }
                if (e0Var.d == -3.4028235E38f) {
                    a2.d = this.f42425g;
                }
                if (e0Var.e == -3.4028235E38f) {
                    a2.e = this.h;
                }
                if (e0Var.f1672b == -9223372036854775807L) {
                    a2.f1651b = this.e;
                }
                if (e0Var.f1673c == -9223372036854775807L) {
                    a2.f1652c = this.f42424f;
                }
                b2.e0 e0Var2 = new b2.e0(a2);
                if (!e0Var2.equals(k0Var2.f1772c)) {
                    b2.b0 b0Var2 = new b2.b0();
                    List list = Collections.EMPTY_LIST;
                    e9.i0 i0Var = e9.a1.e;
                    b2.g0 g0Var = b2.g0.d;
                    b2.a0 a0Var = k0Var2.e;
                    ?? obj = new Object();
                    obj.f2048a = a0Var.f2063b;
                    obj.f2049b = a0Var.d;
                    obj.f2050c = a0Var.e;
                    obj.d = a0Var.f2065f;
                    obj.e = a0Var.f2066g;
                    obj.f2051f = a0Var.h;
                    String str3 = k0Var2.f1770a;
                    b2.n0 n0Var = k0Var2.d;
                    k0Var2.f1772c.a();
                    b2.g0 g0Var2 = k0Var2.f1773f;
                    b2.f0 f0Var7 = k0Var2.f1771b;
                    if (f0Var7 != null) {
                        String str4 = f0Var7.f1689f;
                        String str5 = f0Var7.f1687b;
                        Uri uri2 = f0Var7.f1686a;
                        list = f0Var7.e;
                        i0Var = f0Var7.f1690g;
                        f0Var3 = null;
                        b2.c0 c0Var3 = f0Var7.f1688c;
                        if (c0Var3 != null) {
                            c10 = 0;
                            ?? obj2 = new Object();
                            obj2.f1631a = c0Var3.f1644a;
                            obj2.f1632b = c0Var3.f1645b;
                            obj2.f1633c = c0Var3.f1646c;
                            obj2.d = c0Var3.d;
                            obj2.e = c0Var3.e;
                            obj2.f1634f = c0Var3.f1647f;
                            obj2.f1635g = c0Var3.f1648g;
                            obj2.h = c0Var3.h;
                            b0Var = obj2;
                        } else {
                            c10 = 0;
                            b0Var = new b2.b0();
                        }
                        b2.x xVar2 = f0Var7.d;
                        j3 = f0Var7.h;
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
                    b2.d0 a10 = e0Var2.a();
                    if (b0Var2.f1632b != null && b0Var2.f1631a == null) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    e2.d.g(z12);
                    if (uri != null) {
                        if (b0Var2.f1631a != null) {
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
                    b2.e0 e0Var3 = new b2.e0(a10);
                    if (n0Var == null) {
                        n0Var = b2.n0.K;
                    }
                    k0Var2 = new b2.k0(str6, zVar, f0Var4, e0Var3, n0Var, g0Var2);
                    f0Var = f0Var3;
                } else {
                    f0Var = null;
                    c10 = 0;
                }
                a a11 = f0Var6.a(k0Var2);
                e9.i0 i0Var3 = k0Var2.f1771b.f1690g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[c10] = a11;
                    for (int i10 = 0; i10 < i0Var3.size(); i10++) {
                        if (this.f42426i) {
                            b2.r rVar = new b2.r();
                            rVar.f1946q = b2.r0.n(((b2.j0) i0Var3.get(i10)).f1738b);
                            rVar.d = ((b2.j0) i0Var3.get(i10)).f1739c;
                            rVar.e = ((b2.j0) i0Var3.get(i10)).d;
                            rVar.f1936f = ((b2.j0) i0Var3.get(i10)).e;
                            rVar.f1934b = ((b2.j0) i0Var3.get(i10)).f1740f;
                            rVar.f1933a = ((b2.j0) i0Var3.get(i10)).f1741g;
                            b2.s sVar = new b2.s(rVar);
                            sg.f0 f0Var8 = new sg.f0(2, this, sVar);
                            n4.y yVar = this.f42422b;
                            th.e eVar = new th.e(f0Var8, 1);
                            e3 e3Var = new e3(4);
                            rb.a aVar = new rb.a(26);
                            if (this.f42423c.C(sVar)) {
                                b2.r a12 = sVar.a();
                                a12.f1946q = b2.r0.n("application/x-media3-cues");
                                a12.f1939j = sVar.f2002r;
                                a12.O = this.f42423c.k(sVar);
                                sVar = new b2.s(a12);
                            }
                            b2.s sVar2 = sVar;
                            int i11 = i10 + 1;
                            String uri3 = ((b2.j0) i0Var3.get(i10)).f1737a.toString();
                            b2.y yVar2 = new b2.y();
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
                            if (b0Var3.f1632b != null && b0Var3.f1631a == null) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            e2.d.g(z11);
                            if (parse != null) {
                                if (b0Var3.f1631a != null) {
                                    c0Var = new b2.c0(b0Var3);
                                } else {
                                    c0Var = f0Var;
                                }
                                f0Var2 = new b2.f0(parse, null, c0Var, null, list3, null, a1Var, -9223372036854775807L);
                            } else {
                                f0Var2 = f0Var;
                            }
                            b2.k0 k0Var3 = new b2.k0("", new b2.z(yVar2), f0Var2, new b2.e0(d0Var), b2.n0.K, g0Var3);
                            f0Var2.getClass();
                            aVarArr[i11] = new y0(k0Var3, yVar, eVar, e3Var.z(k0Var3), aVar, 1048576, sVar2);
                        } else {
                            n4.y yVar3 = this.f42422b;
                            yVar3.getClass();
                            aVarArr[i10 + 1] = new n1((b2.j0) i0Var3.get(i10), yVar3, new rb.a(26));
                        }
                    }
                    a11 = new q0(aVarArr);
                }
                b2.a0 a0Var2 = k0Var2.e;
                if (a0Var2.f2063b != 0 || a0Var2.d != Long.MIN_VALUE || a0Var2.f2065f) {
                    f fVar = new f(a11);
                    long j10 = a0Var2.f2063b;
                    if (j10 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    e2.d.g(!fVar.h);
                    fVar.f42317b = j10;
                    long j11 = a0Var2.d;
                    e2.d.g(!fVar.h);
                    fVar.f42318c = j11;
                    e2.d.g(!fVar.h);
                    fVar.d = !a0Var2.f2066g;
                    boolean z13 = a0Var2.e;
                    e2.d.g(!fVar.h);
                    fVar.e = z13;
                    boolean z14 = a0Var2.f2065f;
                    e2.d.g(!fVar.h);
                    fVar.f42319f = z14;
                    boolean z15 = a0Var2.h;
                    e2.d.g(!fVar.h);
                    fVar.f42320g = z15;
                    fVar.h = true;
                    a11 = new i(fVar);
                }
                k0Var2.f1771b.getClass();
                if (k0Var2.f1771b.d == null) {
                    return a11;
                }
                e2.a.n("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return a11;
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }
        long j12 = k0Var2.f1771b.h;
        String str7 = e2.d0.f7188a;
        throw null;
    }

    @Override
    public final f0 b(boolean z10) {
        this.f42426i = z10;
        c5.g gVar = this.f42421a;
        gVar.f4291a = z10;
        c3.m mVar = (c3.m) gVar.f4292b;
        synchronized (mVar) {
            mVar.f4208b = z10;
        }
        for (f0 f0Var : ((HashMap) gVar.d).values()) {
            f0Var.b(z10);
        }
        return this;
    }

    @Override
    public final f0 c() {
        c5.g gVar = this.f42421a;
        gVar.getClass();
        synchronized (((c3.m) gVar.f4292b)) {
        }
        return this;
    }

    @Override
    public final f0 d(rb.a aVar) {
        this.f42423c = aVar;
        c5.g gVar = this.f42421a;
        gVar.f4294f = aVar;
        c3.m mVar = (c3.m) gVar.f4292b;
        synchronized (mVar) {
            mVar.f4209c = aVar;
        }
        for (f0 f0Var : ((HashMap) gVar.d).values()) {
            f0Var.d(aVar);
        }
        return this;
    }
}
