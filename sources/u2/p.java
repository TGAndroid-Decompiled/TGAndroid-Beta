package u2;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import rg.p2;
public final class p implements e0 {
    public final c5.g f46776a;
    public final pf.b f46777b;
    public rb.a f46778c;
    public final long d;
    public final long f46779e;
    public final long f46780f;
    public final float f46781g;
    public final float h;
    public boolean f46782i;

    public p(Context context, c3.m mVar) {
        pf.b bVar = new pf.b(context, 18);
        this.f46777b = bVar;
        rb.a aVar = new rb.a(28);
        this.f46778c = aVar;
        ?? obj = new Object();
        obj.f4379b = mVar;
        obj.f4382f = aVar;
        obj.f4380c = new HashMap();
        obj.d = new HashMap();
        obj.f4378a = true;
        this.f46776a = obj;
        if (bVar != ((pf.b) obj.f4381e)) {
            obj.f4381e = bVar;
            ((HashMap) obj.f4380c).clear();
            ((HashMap) obj.d).clear();
        }
        this.d = -9223372036854775807L;
        this.f46779e = -9223372036854775807L;
        this.f46780f = -9223372036854775807L;
        this.f46781g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f46782i = true;
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
        k0Var2.f2127b.getClass();
        String scheme = k0Var2.f2127b.f2032a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(k0Var2.f2127b.f2033b, "application/x-image-uri")) {
            b2.f0 f0Var5 = k0Var2.f2127b;
            int I = e2.d0.I(f0Var5.f2032a, f0Var5.f2033b);
            if (k0Var2.f2127b.h != -9223372036854775807L) {
                c3.m mVar = (c3.m) this.f46776a.f4379b;
                synchronized (mVar) {
                    mVar.d = 1;
                }
            }
            try {
                c5.g gVar = this.f46776a;
                HashMap hashMap = (HashMap) gVar.d;
                e0 e0Var = (e0) hashMap.get(Integer.valueOf(I));
                if (e0Var == null) {
                    e0Var = (e0) gVar.a(I).get();
                    e0Var.d((rb.a) gVar.f4382f);
                    e0Var.b(gVar.f4378a);
                    e0Var.c();
                    hashMap.put(Integer.valueOf(I), e0Var);
                }
                b2.d0 a2 = k0Var2.f2128c.a();
                b2.e0 e0Var2 = k0Var2.f2128c;
                if (e0Var2.f2015a == -9223372036854775807L) {
                    a2.f1991a = this.d;
                }
                if (e0Var2.d == -3.4028235E38f) {
                    a2.d = this.f46781g;
                }
                if (e0Var2.f2018e == -3.4028235E38f) {
                    a2.f1994e = this.h;
                }
                if (e0Var2.f2016b == -9223372036854775807L) {
                    a2.f1992b = this.f46779e;
                }
                if (e0Var2.f2017c == -9223372036854775807L) {
                    a2.f1993c = this.f46780f;
                }
                b2.e0 e0Var3 = new b2.e0(a2);
                if (!e0Var3.equals(k0Var2.f2128c)) {
                    b2.b0 b0Var2 = new b2.b0();
                    List list = Collections.EMPTY_LIST;
                    e9.i0 i0Var = e9.a1.f8920e;
                    b2.g0 g0Var = b2.g0.d;
                    b2.a0 a0Var = k0Var2.f2129e;
                    ?? obj = new Object();
                    obj.f2420a = a0Var.f2436b;
                    obj.f2421b = a0Var.d;
                    obj.f2422c = a0Var.f2438e;
                    obj.d = a0Var.f2439f;
                    obj.f2423e = a0Var.f2440g;
                    obj.f2424f = a0Var.h;
                    String str3 = k0Var2.f2126a;
                    b2.n0 n0Var = k0Var2.d;
                    k0Var2.f2128c.a();
                    b2.g0 g0Var2 = k0Var2.f2130f;
                    b2.f0 f0Var6 = k0Var2.f2127b;
                    if (f0Var6 != null) {
                        String str4 = f0Var6.f2036f;
                        String str5 = f0Var6.f2033b;
                        Uri uri2 = f0Var6.f2032a;
                        list = f0Var6.f2035e;
                        i0Var = f0Var6.f2037g;
                        f0Var3 = null;
                        b2.c0 c0Var3 = f0Var6.f2034c;
                        if (c0Var3 != null) {
                            c10 = 0;
                            ?? obj2 = new Object();
                            obj2.f1970a = c0Var3.f1984a;
                            obj2.f1971b = c0Var3.f1985b;
                            obj2.f1972c = c0Var3.f1986c;
                            obj2.d = c0Var3.d;
                            obj2.f1973e = c0Var3.f1987e;
                            obj2.f1974f = c0Var3.f1988f;
                            obj2.f1975g = c0Var3.f1989g;
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
                    if (b0Var2.f1971b != null && b0Var2.f1970a == null) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    e2.d.g(z12);
                    if (uri != null) {
                        if (b0Var2.f1970a != null) {
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
                e9.i0 i0Var3 = k0Var2.f2127b.f2037g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[c10] = a11;
                    for (int i10 = 0; i10 < i0Var3.size(); i10++) {
                        if (this.f46782i) {
                            b2.r rVar = new b2.r();
                            rVar.f2312q = b2.r0.n(((b2.j0) i0Var3.get(i10)).f2092b);
                            rVar.d = ((b2.j0) i0Var3.get(i10)).f2093c;
                            rVar.f2301e = ((b2.j0) i0Var3.get(i10)).d;
                            rVar.f2302f = ((b2.j0) i0Var3.get(i10)).f2094e;
                            rVar.f2299b = ((b2.j0) i0Var3.get(i10)).f2095f;
                            rVar.f2298a = ((b2.j0) i0Var3.get(i10)).f2096g;
                            b2.s sVar = new b2.s(rVar);
                            sg.x xVar3 = new sg.x(1, this, sVar);
                            pf.b bVar = this.f46777b;
                            p2 p2Var = new p2(xVar3, 4);
                            m2.t tVar = new m2.t(4);
                            rb.a aVar = new rb.a(26);
                            if (this.f46778c.i0(sVar)) {
                                b2.r a12 = sVar.a();
                                a12.f2312q = b2.r0.n("application/x-media3-cues");
                                a12.f2305j = sVar.f2370r;
                                a12.O = this.f46778c.J(sVar);
                                sVar = new b2.s(a12);
                            }
                            b2.s sVar2 = sVar;
                            int i11 = i10 + 1;
                            String uri3 = ((b2.j0) i0Var3.get(i10)).f2091a.toString();
                            b2.y yVar = new b2.y();
                            b2.b0 b0Var3 = new b2.b0();
                            List list3 = Collections.EMPTY_LIST;
                            e9.a1 a1Var = e9.a1.f8920e;
                            b2.d0 d0Var = new b2.d0();
                            b2.g0 g0Var3 = b2.g0.d;
                            if (uri3 == null) {
                                parse = f0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (b0Var3.f1971b != null && b0Var3.f1970a == null) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            e2.d.g(z11);
                            if (parse != null) {
                                if (b0Var3.f1970a != null) {
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
                            aVarArr[i11] = new w0(k0Var3, bVar, p2Var, tVar.w(k0Var3), aVar, 1048576, sVar2);
                        } else {
                            pf.b bVar2 = this.f46777b;
                            bVar2.getClass();
                            aVarArr[i10 + 1] = new l1((b2.j0) i0Var3.get(i10), bVar2, new rb.a(26));
                        }
                    }
                    a11 = new o0(aVarArr);
                }
                b2.a0 a0Var2 = k0Var2.f2129e;
                if (a0Var2.f2436b != 0 || a0Var2.d != Long.MIN_VALUE || a0Var2.f2439f) {
                    e eVar = new e(a11);
                    long j10 = a0Var2.f2436b;
                    if (j10 >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.b(z10);
                    e2.d.g(!eVar.h);
                    eVar.f46656b = j10;
                    long j11 = a0Var2.d;
                    e2.d.g(!eVar.h);
                    eVar.f46657c = j11;
                    e2.d.g(!eVar.h);
                    eVar.d = !a0Var2.f2440g;
                    boolean z13 = a0Var2.f2438e;
                    e2.d.g(!eVar.h);
                    eVar.f46658e = z13;
                    boolean z14 = a0Var2.f2439f;
                    e2.d.g(!eVar.h);
                    eVar.f46659f = z14;
                    boolean z15 = a0Var2.h;
                    e2.d.g(!eVar.h);
                    eVar.f46660g = z15;
                    eVar.h = true;
                    a11 = new h(eVar);
                }
                k0Var2.f2127b.getClass();
                if (k0Var2.f2127b.d == null) {
                    return a11;
                }
                e2.a.n("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return a11;
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException(e7);
            }
        }
        long j12 = k0Var2.f2127b.h;
        String str7 = e2.d0.f8737a;
        throw null;
    }

    @Override
    public final e0 b(boolean z10) {
        this.f46782i = z10;
        c5.g gVar = this.f46776a;
        gVar.f4378a = z10;
        c3.m mVar = (c3.m) gVar.f4379b;
        synchronized (mVar) {
            mVar.f4290b = z10;
        }
        for (e0 e0Var : ((HashMap) gVar.d).values()) {
            e0Var.b(z10);
        }
        return this;
    }

    @Override
    public final e0 c() {
        c5.g gVar = this.f46776a;
        gVar.getClass();
        synchronized (((c3.m) gVar.f4379b)) {
        }
        return this;
    }

    @Override
    public final e0 d(rb.a aVar) {
        this.f46778c = aVar;
        c5.g gVar = this.f46776a;
        gVar.f4382f = aVar;
        c3.m mVar = (c3.m) gVar.f4379b;
        synchronized (mVar) {
            mVar.f4291c = aVar;
        }
        for (e0 e0Var : ((HashMap) gVar.d).values()) {
            e0Var.d(aVar);
        }
        return this;
    }
}
