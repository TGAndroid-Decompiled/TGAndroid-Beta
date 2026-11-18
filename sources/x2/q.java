package x2;

import a8.la;
import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.md0;
import org.telegram.ui.wc1;
import tg.z1;
public final class q implements f0 {
    public final p f60199a;
    public final wf.b f60200b;
    public nb.a f60201c;
    public final long d;
    public final long f60202e;
    public final long f60203f;
    public final float f60204g;
    public final float h;
    public boolean f60205i;

    public q(Context context, f3.m mVar) {
        wf.b bVar = new wf.b(context);
        nb.a aVar = new nb.a(6);
        this.f60200b = bVar;
        this.f60201c = aVar;
        p pVar = new p(mVar, aVar);
        this.f60199a = pVar;
        if (bVar != pVar.d) {
            pVar.d = bVar;
            pVar.f60189b.clear();
            pVar.f60190c.clear();
        }
        this.d = -9223372036854775807L;
        this.f60202e = -9223372036854775807L;
        this.f60203f = -9223372036854775807L;
        this.f60204g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f60205i = true;
    }

    public static f0 e(Class cls, j2.g gVar) {
        try {
            return (f0) cls.getConstructor(j2.g.class).newInstance(gVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override
    public final f0 a(nb.a aVar) {
        this.f60201c = aVar;
        p pVar = this.f60199a;
        pVar.f60192f = aVar;
        f3.m mVar = pVar.f60188a;
        synchronized (mVar) {
            mVar.f11194c = aVar;
        }
        for (f0 f0Var : pVar.f60190c.values()) {
            f0Var.a(aVar);
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
        l0Var2.f10504b.getClass();
        String scheme = l0Var2.f10504b.f10413a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(l0Var2.f10504b.f10414b, "application/x-image-uri")) {
            e2.g0 g0Var5 = l0Var2.f10504b;
            int K = h2.l0.K(g0Var5.f10413a, g0Var5.f10414b);
            if (l0Var2.f10504b.h != -9223372036854775807L) {
                f3.m mVar = this.f60199a.f60188a;
                synchronized (mVar) {
                    mVar.f11195e = 1;
                }
                p.a(this.f60199a);
            }
            try {
                f0 b10 = this.f60199a.b(K);
                e2.e0 a10 = l0Var2.f10505c.a();
                e2.f0 f0Var = l0Var2.f10505c;
                if (f0Var.f10395a == -9223372036854775807L) {
                    a10.f10383a = this.d;
                }
                if (f0Var.d == -3.4028235E38f) {
                    a10.d = this.f60204g;
                }
                if (f0Var.f10398e == -3.4028235E38f) {
                    a10.f10386e = this.h;
                }
                if (f0Var.f10396b == -9223372036854775807L) {
                    a10.f10384b = this.f60202e;
                }
                if (f0Var.f10397c == -9223372036854775807L) {
                    a10.f10385c = this.f60203f;
                }
                e2.f0 f0Var2 = new e2.f0(a10);
                if (!f0Var2.equals(l0Var2.f10505c)) {
                    e2.c0 c0Var2 = new e2.c0();
                    List list = Collections.EMPTY_LIST;
                    h9.i0 i0Var = h9.t1.f14074e;
                    e2.h0 h0Var = e2.h0.d;
                    e2.b0 b0Var = l0Var2.f10506e;
                    ?? obj = new Object();
                    obj.f10811a = b0Var.f10324b;
                    obj.f10812b = b0Var.d;
                    obj.f10813c = b0Var.f10326e;
                    obj.d = b0Var.f10327f;
                    obj.f10814e = b0Var.f10328g;
                    obj.f10815f = b0Var.h;
                    String str3 = l0Var2.f10503a;
                    e2.o0 o0Var = l0Var2.d;
                    l0Var2.f10505c.a();
                    e2.h0 h0Var2 = l0Var2.f10507f;
                    e2.g0 g0Var6 = l0Var2.f10504b;
                    if (g0Var6 != null) {
                        String str4 = g0Var6.f10417f;
                        String str5 = g0Var6.f10414b;
                        Uri uri2 = g0Var6.f10413a;
                        list = g0Var6.f10416e;
                        i0Var = g0Var6.f10418g;
                        g0Var3 = null;
                        e2.d0 d0Var3 = g0Var6.f10415c;
                        if (d0Var3 != null) {
                            z11 = false;
                            ?? obj2 = new Object();
                            z10 = true;
                            obj2.f10348a = d0Var3.f10362a;
                            obj2.f10349b = d0Var3.f10363b;
                            obj2.f10350c = d0Var3.f10364c;
                            obj2.d = d0Var3.d;
                            obj2.f10351e = d0Var3.f10365e;
                            obj2.f10352f = d0Var3.f10366f;
                            obj2.f10353g = d0Var3.f10367g;
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
                    if (c0Var2.f10349b != null && c0Var2.f10348a == null) {
                        z13 = z11 ? 1 : 0;
                    } else {
                        z13 = z10;
                    }
                    la.p(z13);
                    if (uri != null) {
                        if (c0Var2.f10348a != null) {
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
                a b11 = b10.b(l0Var2);
                h9.i0 i0Var3 = l0Var2.f10504b.f10418g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[z11 ? 1 : 0] = b11;
                    for (int i7 = z11 ? 1 : 0; i7 < i0Var3.size(); i7++) {
                        if (this.f60205i) {
                            e2.t tVar = new e2.t();
                            tVar.f10717r = e2.s0.n(((e2.k0) i0Var3.get(i7)).f10464b);
                            tVar.d = ((e2.k0) i0Var3.get(i7)).f10465c;
                            tVar.f10705e = ((e2.k0) i0Var3.get(i7)).d;
                            tVar.f10706f = ((e2.k0) i0Var3.get(i7)).f10466e;
                            tVar.f10703b = ((e2.k0) i0Var3.get(i7)).f10467f;
                            tVar.f10702a = ((e2.k0) i0Var3.get(i7)).f10468g;
                            e2.u uVar = new e2.u(tVar);
                            wc1 wc1Var = new wc1(26, this, uVar);
                            wf.b bVar = this.f60200b;
                            z1 z1Var = new z1(wc1Var, 15);
                            md0 md0Var = new md0(7);
                            qb.a aVar = new qb.a(4);
                            if (this.f60201c.H(uVar)) {
                                e2.t a12 = uVar.a();
                                a12.f10717r = e2.s0.n("application/x-media3-cues");
                                a12.f10709j = uVar.f10769s;
                                a12.P = this.f60201c.O(uVar);
                                uVar = new e2.u(a12);
                            }
                            e2.u uVar2 = uVar;
                            int i10 = i7 + 1;
                            String uri3 = ((e2.k0) i0Var3.get(i7)).f10463a.toString();
                            e2.z zVar = new e2.z();
                            e2.c0 c0Var3 = new e2.c0();
                            List list3 = Collections.EMPTY_LIST;
                            h9.t1 t1Var = h9.t1.f14074e;
                            e2.e0 e0Var = new e2.e0();
                            e2.h0 h0Var3 = e2.h0.d;
                            if (uri3 == null) {
                                parse = g0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (c0Var3.f10349b != null && c0Var3.f10348a == null) {
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = z10;
                            }
                            la.p(z12);
                            if (parse != null) {
                                if (c0Var3.f10348a != null) {
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
                            aVarArr[i10] = new y0(l0Var3, bVar, z1Var, md0Var.s(l0Var3), aVar, 1048576, uVar2);
                        } else {
                            wf.b bVar2 = this.f60200b;
                            bVar2.getClass();
                            aVarArr[i7 + 1] = new n1((e2.k0) i0Var3.get(i7), bVar2, new qb.a(4));
                        }
                    }
                    b11 = new o0(aVarArr);
                }
                e2.b0 b0Var2 = l0Var2.f10506e;
                if (b0Var2.f10324b != 0 || b0Var2.d != Long.MIN_VALUE || b0Var2.f10327f) {
                    e eVar = new e(b11);
                    long j10 = b0Var2.f10324b;
                    if (j10 >= 0) {
                        z11 = z10;
                    }
                    la.f(z11);
                    la.p(!eVar.h);
                    eVar.f60079b = j10;
                    long j11 = b0Var2.d;
                    la.p(!eVar.h);
                    eVar.f60080c = j11;
                    la.p(!eVar.h);
                    eVar.d = !b0Var2.f10328g;
                    boolean z14 = b0Var2.f10326e;
                    la.p(!eVar.h);
                    eVar.f60081e = z14;
                    boolean z15 = b0Var2.f10327f;
                    la.p(!eVar.h);
                    eVar.f60082f = z15;
                    boolean z16 = b0Var2.h;
                    la.p(!eVar.h);
                    eVar.f60083g = z16;
                    la.p(!eVar.h);
                    eVar.h = z10;
                    b11 = new h(eVar);
                }
                l0Var2.f10504b.getClass();
                if (l0Var2.f10504b.d == null) {
                    return b11;
                }
                h2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return b11;
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(e10);
            }
        }
        long j12 = l0Var2.f10504b.h;
        String str7 = h2.l0.f13786a;
        throw null;
    }

    @Override
    public final f0 c(boolean z10) {
        this.f60205i = z10;
        p pVar = this.f60199a;
        pVar.f60191e = z10;
        f3.m mVar = pVar.f60188a;
        synchronized (mVar) {
            mVar.f11193b = z10;
        }
        for (f0 f0Var : pVar.f60190c.values()) {
            f0Var.c(z10);
        }
        return this;
    }

    @Override
    public final f0 d(int i7) {
        p pVar = this.f60199a;
        pVar.f60193g = i7;
        f3.m mVar = pVar.f60188a;
        synchronized (mVar) {
            mVar.d = i7;
        }
        return this;
    }
}
