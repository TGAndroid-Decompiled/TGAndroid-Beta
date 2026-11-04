package w2;

import android.content.Context;
import android.net.Uri;
import b8.zb;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.na1;
public final class q implements f0 {
    public final p f57193a;
    public final tf.b f57194b;
    public mb.b f57195c;
    public final long d;
    public final long f57196e;
    public final long f57197f;
    public final float f57198g;
    public final float h;
    public boolean f57199i;

    public q(Context context, e3.m mVar) {
        tf.b bVar = new tf.b(context);
        mb.b bVar2 = new mb.b(4);
        this.f57194b = bVar;
        this.f57195c = bVar2;
        p pVar = new p(mVar, bVar2);
        this.f57193a = pVar;
        if (bVar != pVar.d) {
            pVar.d = bVar;
            pVar.f57183b.clear();
            pVar.f57184c.clear();
        }
        this.d = -9223372036854775807L;
        this.f57196e = -9223372036854775807L;
        this.f57197f = -9223372036854775807L;
        this.f57198g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f57199i = true;
    }

    public static f0 e(Class cls, i2.g gVar) {
        try {
            return (f0) cls.getConstructor(i2.g.class).newInstance(gVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override
    public final f0 a(mb.b bVar) {
        this.f57195c = bVar;
        p pVar = this.f57193a;
        pVar.f57186f = bVar;
        e3.m mVar = pVar.f57182a;
        synchronized (mVar) {
            mVar.f9501c = bVar;
        }
        for (f0 f0Var : pVar.f57184c.values()) {
            f0Var.a(bVar);
        }
        return this;
    }

    @Override
    public final f0 b(boolean z10) {
        this.f57199i = z10;
        p pVar = this.f57193a;
        pVar.f57185e = z10;
        e3.m mVar = pVar.f57182a;
        synchronized (mVar) {
            mVar.f9500b = z10;
        }
        for (f0 f0Var : pVar.f57184c.values()) {
            f0Var.b(z10);
        }
        return this;
    }

    @Override
    public final a c(d2.n0 n0Var) {
        d2.i0 i0Var;
        int i3;
        boolean z10;
        Uri parse;
        boolean z11;
        d2.i0 i0Var2;
        d2.f0 f0Var;
        d2.i0 i0Var3;
        long j10;
        Uri uri;
        String str;
        d2.a0 a0Var;
        String str2;
        boolean z12;
        d2.i0 i0Var4;
        d2.f0 f0Var2;
        d2.e0 e0Var;
        d2.n0 n0Var2 = n0Var;
        n0Var2.f8241b.getClass();
        String scheme = n0Var2.f8241b.f8139a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(n0Var2.f8241b.f8140b, "application/x-image-uri")) {
            d2.i0 i0Var5 = n0Var2.f8241b;
            int K = g2.n0.K(i0Var5.f8139a, i0Var5.f8140b);
            if (n0Var2.f8241b.h != -9223372036854775807L) {
                e3.m mVar = this.f57193a.f57182a;
                synchronized (mVar) {
                    mVar.f9502e = 1;
                }
                p.a(this.f57193a);
            }
            try {
                f0 b10 = this.f57193a.b(K);
                d2.g0 a10 = n0Var2.f8242c.a();
                d2.h0 h0Var = n0Var2.f8242c;
                if (h0Var.f8121a == -9223372036854775807L) {
                    a10.f8108a = this.d;
                }
                if (h0Var.d == -3.4028235E38f) {
                    a10.d = this.f57198g;
                }
                if (h0Var.f8124e == -3.4028235E38f) {
                    a10.f8111e = this.h;
                }
                if (h0Var.f8122b == -9223372036854775807L) {
                    a10.f8109b = this.f57196e;
                }
                if (h0Var.f8123c == -9223372036854775807L) {
                    a10.f8110c = this.f57197f;
                }
                d2.h0 h0Var2 = new d2.h0(a10);
                if (!h0Var2.equals(n0Var2.f8242c)) {
                    d2.e0 e0Var2 = new d2.e0();
                    List list = Collections.EMPTY_LIST;
                    g9.i0 i0Var6 = g9.s1.f12146e;
                    d2.j0 j0Var = d2.j0.d;
                    d2.d0 d0Var = n0Var2.f8243e;
                    ?? obj = new Object();
                    obj.f8033a = d0Var.f8053b;
                    obj.f8034b = d0Var.d;
                    obj.f8035c = d0Var.f8055e;
                    obj.d = d0Var.f8056f;
                    obj.f8036e = d0Var.f8057g;
                    obj.f8037f = d0Var.h;
                    String str3 = n0Var2.f8240a;
                    d2.q0 q0Var = n0Var2.d;
                    n0Var2.f8242c.a();
                    d2.j0 j0Var2 = n0Var2.f8244f;
                    d2.i0 i0Var7 = n0Var2.f8241b;
                    if (i0Var7 != null) {
                        String str4 = i0Var7.f8143f;
                        String str5 = i0Var7.f8140b;
                        Uri uri2 = i0Var7.f8139a;
                        list = i0Var7.f8142e;
                        i0Var6 = i0Var7.f8144g;
                        i0Var3 = null;
                        d2.f0 f0Var3 = i0Var7.f8141c;
                        if (f0Var3 != null) {
                            z10 = false;
                            ?? obj2 = new Object();
                            i3 = 1;
                            obj2.f8073a = f0Var3.f8101a;
                            obj2.f8074b = f0Var3.f8102b;
                            obj2.f8075c = f0Var3.f8103c;
                            obj2.d = f0Var3.d;
                            obj2.f8076e = f0Var3.f8104e;
                            obj2.f8077f = f0Var3.f8105f;
                            obj2.f8078g = f0Var3.f8106g;
                            obj2.h = f0Var3.h;
                            e0Var = obj2;
                        } else {
                            i3 = 1;
                            z10 = false;
                            e0Var = new d2.e0();
                        }
                        d2.a0 a0Var2 = i0Var7.d;
                        j10 = i0Var7.h;
                        a0Var = a0Var2;
                        str = str5;
                        uri = uri2;
                        str2 = str4;
                        e0Var2 = e0Var;
                    } else {
                        i0Var3 = null;
                        i3 = 1;
                        z10 = false;
                        j10 = -9223372036854775807L;
                        uri = null;
                        str = null;
                        a0Var = null;
                        str2 = null;
                    }
                    List list2 = list;
                    g9.i0 i0Var8 = i0Var6;
                    d2.g0 a11 = h0Var2.a();
                    if (e0Var2.f8074b != null && e0Var2.f8073a == null) {
                        z12 = z10 ? 1 : 0;
                    } else {
                        z12 = i3;
                    }
                    zb.p(z12);
                    if (uri != null) {
                        if (e0Var2.f8073a != null) {
                            f0Var2 = new d2.f0(e0Var2);
                        } else {
                            f0Var2 = i0Var3;
                        }
                        i0Var4 = new d2.i0(uri, str, f0Var2, a0Var, list2, str2, i0Var8, j10);
                    } else {
                        i0Var4 = i0Var3;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str6 = str3;
                    ?? c0Var = new d2.c0(obj);
                    d2.h0 h0Var3 = new d2.h0(a11);
                    if (q0Var == null) {
                        q0Var = d2.q0.L;
                    }
                    n0Var2 = new d2.n0(str6, c0Var, i0Var4, h0Var3, q0Var, j0Var2);
                    i0Var = i0Var3;
                } else {
                    i0Var = null;
                    i3 = 1;
                    z10 = false;
                }
                a c2 = b10.c(n0Var2);
                g9.i0 i0Var9 = n0Var2.f8241b.f8144g;
                if (!i0Var9.isEmpty()) {
                    a[] aVarArr = new a[i0Var9.size() + 1];
                    aVarArr[z10 ? 1 : 0] = c2;
                    int i10 = z10 ? 1 : 0;
                    while (i10 < i0Var9.size()) {
                        if (this.f57199i) {
                            d2.u uVar = new d2.u();
                            uVar.f8431r = d2.u0.n(((d2.m0) i0Var9.get(i10)).f8194b);
                            uVar.d = ((d2.m0) i0Var9.get(i10)).f8195c;
                            uVar.f8419e = ((d2.m0) i0Var9.get(i10)).d;
                            uVar.f8420f = ((d2.m0) i0Var9.get(i10)).f8196e;
                            uVar.f8417b = ((d2.m0) i0Var9.get(i10)).f8197f;
                            uVar.f8416a = ((d2.m0) i0Var9.get(i10)).f8198g;
                            d2.v vVar = new d2.v(uVar);
                            na1 na1Var = new na1(19, this, vVar);
                            tf.b bVar = this.f57194b;
                            e3 e3Var = new e3(na1Var, 27);
                            k4.j jVar = new k4.j(28);
                            kb.a aVar = new kb.a(i3);
                            if (this.f57195c.l(vVar)) {
                                d2.u a12 = vVar.a();
                                a12.f8431r = d2.u0.n("application/x-media3-cues");
                                a12.f8423j = vVar.f8489s;
                                a12.P = this.f57195c.q0(vVar);
                                vVar = new d2.v(a12);
                            }
                            d2.v vVar2 = vVar;
                            int i11 = i10 + 1;
                            String uri3 = ((d2.m0) i0Var9.get(i10)).f8193a.toString();
                            d2.b0 b0Var = new d2.b0();
                            d2.e0 e0Var3 = new d2.e0();
                            List list3 = Collections.EMPTY_LIST;
                            g9.s1 s1Var = g9.s1.f12146e;
                            d2.g0 g0Var = new d2.g0();
                            d2.j0 j0Var3 = d2.j0.d;
                            if (uri3 == null) {
                                parse = i0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (e0Var3.f8074b != null && e0Var3.f8073a == null) {
                                z11 = z10 ? 1 : 0;
                            } else {
                                z11 = true;
                            }
                            zb.p(z11);
                            if (parse != null) {
                                if (e0Var3.f8073a != null) {
                                    f0Var = new d2.f0(e0Var3);
                                } else {
                                    f0Var = i0Var;
                                }
                                i0Var2 = new d2.i0(parse, null, f0Var, null, list3, null, s1Var, -9223372036854775807L);
                            } else {
                                i0Var2 = i0Var;
                            }
                            d2.n0 n0Var3 = new d2.n0("", new d2.c0(b0Var), i0Var2, new d2.h0(g0Var), d2.q0.L, j0Var3);
                            i0Var2.getClass();
                            aVarArr[i11] = new y0(n0Var3, bVar, e3Var, jVar.x(n0Var3), aVar, 1048576, vVar2);
                        } else {
                            tf.b bVar2 = this.f57194b;
                            bVar2.getClass();
                            aVarArr[i10 + 1] = new n1((d2.m0) i0Var9.get(i10), bVar2, new kb.a(1));
                        }
                        i10++;
                        i3 = 1;
                    }
                    c2 = new o0(aVarArr);
                }
                d2.d0 d0Var2 = n0Var2.f8243e;
                if (d0Var2.f8053b != 0 || d0Var2.d != Long.MIN_VALUE || d0Var2.f8056f) {
                    e eVar = new e(c2);
                    long j11 = d0Var2.f8053b;
                    if (j11 >= 0) {
                        z10 = true;
                    }
                    zb.f(z10);
                    zb.p(!eVar.h);
                    eVar.f57073b = j11;
                    long j12 = d0Var2.d;
                    zb.p(!eVar.h);
                    eVar.f57074c = j12;
                    zb.p(!eVar.h);
                    eVar.d = !d0Var2.f8057g;
                    boolean z13 = d0Var2.f8055e;
                    zb.p(!eVar.h);
                    eVar.f57075e = z13;
                    boolean z14 = d0Var2.f8056f;
                    zb.p(!eVar.h);
                    eVar.f57076f = z14;
                    boolean z15 = d0Var2.h;
                    zb.p(!eVar.h);
                    eVar.f57077g = z15;
                    zb.p(!eVar.h);
                    eVar.h = true;
                    c2 = new h(eVar);
                }
                n0Var2.f8241b.getClass();
                if (n0Var2.f8241b.d == null) {
                    return c2;
                }
                g2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return c2;
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(e10);
            }
        }
        long j13 = n0Var2.f8241b.h;
        String str7 = g2.n0.f11873a;
        throw null;
    }

    @Override
    public final f0 d(int i3) {
        p pVar = this.f57193a;
        pVar.f57187g = i3;
        e3.m mVar = pVar.f57182a;
        synchronized (mVar) {
            mVar.d = i3;
        }
        return this;
    }
}
