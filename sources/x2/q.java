package x2;

import a8.ma;
import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Components.i61;
import org.telegram.ui.uc1;
public final class q implements f0 {
    public final p f60328a;
    public final wf.b f60329b;
    public nb.a f60330c;
    public final long d;
    public final long f60331e;
    public final long f60332f;
    public final float f60333g;
    public final float h;
    public boolean f60334i;

    public q(Context context, f3.m mVar) {
        wf.b bVar = new wf.b(context);
        nb.a aVar = new nb.a(6);
        this.f60329b = bVar;
        this.f60330c = aVar;
        p pVar = new p(mVar, aVar);
        this.f60328a = pVar;
        if (bVar != pVar.d) {
            pVar.d = bVar;
            pVar.f60318b.clear();
            pVar.f60319c.clear();
        }
        this.d = -9223372036854775807L;
        this.f60331e = -9223372036854775807L;
        this.f60332f = -9223372036854775807L;
        this.f60333g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f60334i = true;
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
        this.f60330c = aVar;
        p pVar = this.f60328a;
        pVar.f60321f = aVar;
        f3.m mVar = pVar.f60317a;
        synchronized (mVar) {
            mVar.f11190c = aVar;
        }
        for (f0 f0Var : pVar.f60319c.values()) {
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
        l0Var2.f10494b.getClass();
        String scheme = l0Var2.f10494b.f10403a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(l0Var2.f10494b.f10404b, "application/x-image-uri")) {
            e2.g0 g0Var5 = l0Var2.f10494b;
            int K = h2.l0.K(g0Var5.f10403a, g0Var5.f10404b);
            if (l0Var2.f10494b.h != -9223372036854775807L) {
                f3.m mVar = this.f60328a.f60317a;
                synchronized (mVar) {
                    mVar.f11191e = 1;
                }
                p.a(this.f60328a);
            }
            try {
                f0 b10 = this.f60328a.b(K);
                e2.e0 a10 = l0Var2.f10495c.a();
                e2.f0 f0Var = l0Var2.f10495c;
                if (f0Var.f10385a == -9223372036854775807L) {
                    a10.f10373a = this.d;
                }
                if (f0Var.d == -3.4028235E38f) {
                    a10.d = this.f60333g;
                }
                if (f0Var.f10388e == -3.4028235E38f) {
                    a10.f10376e = this.h;
                }
                if (f0Var.f10386b == -9223372036854775807L) {
                    a10.f10374b = this.f60331e;
                }
                if (f0Var.f10387c == -9223372036854775807L) {
                    a10.f10375c = this.f60332f;
                }
                e2.f0 f0Var2 = new e2.f0(a10);
                if (!f0Var2.equals(l0Var2.f10495c)) {
                    e2.c0 c0Var2 = new e2.c0();
                    List list = Collections.EMPTY_LIST;
                    h9.i0 i0Var = h9.s1.f14058e;
                    e2.h0 h0Var = e2.h0.d;
                    e2.b0 b0Var = l0Var2.f10496e;
                    ?? obj = new Object();
                    obj.f10801a = b0Var.f10314b;
                    obj.f10802b = b0Var.d;
                    obj.f10803c = b0Var.f10316e;
                    obj.d = b0Var.f10317f;
                    obj.f10804e = b0Var.f10318g;
                    obj.f10805f = b0Var.h;
                    String str3 = l0Var2.f10493a;
                    e2.o0 o0Var = l0Var2.d;
                    l0Var2.f10495c.a();
                    e2.h0 h0Var2 = l0Var2.f10497f;
                    e2.g0 g0Var6 = l0Var2.f10494b;
                    if (g0Var6 != null) {
                        String str4 = g0Var6.f10407f;
                        String str5 = g0Var6.f10404b;
                        Uri uri2 = g0Var6.f10403a;
                        list = g0Var6.f10406e;
                        i0Var = g0Var6.f10408g;
                        g0Var3 = null;
                        e2.d0 d0Var3 = g0Var6.f10405c;
                        if (d0Var3 != null) {
                            z11 = false;
                            ?? obj2 = new Object();
                            z10 = true;
                            obj2.f10338a = d0Var3.f10352a;
                            obj2.f10339b = d0Var3.f10353b;
                            obj2.f10340c = d0Var3.f10354c;
                            obj2.d = d0Var3.d;
                            obj2.f10341e = d0Var3.f10355e;
                            obj2.f10342f = d0Var3.f10356f;
                            obj2.f10343g = d0Var3.f10357g;
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
                    if (c0Var2.f10339b != null && c0Var2.f10338a == null) {
                        z13 = z11 ? 1 : 0;
                    } else {
                        z13 = z10;
                    }
                    ma.p(z13);
                    if (uri != null) {
                        if (c0Var2.f10338a != null) {
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
                h9.i0 i0Var3 = l0Var2.f10494b.f10408g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[z11 ? 1 : 0] = b11;
                    for (int i7 = z11 ? 1 : 0; i7 < i0Var3.size(); i7++) {
                        if (this.f60334i) {
                            e2.t tVar = new e2.t();
                            tVar.f10707r = e2.s0.n(((e2.k0) i0Var3.get(i7)).f10454b);
                            tVar.d = ((e2.k0) i0Var3.get(i7)).f10455c;
                            tVar.f10695e = ((e2.k0) i0Var3.get(i7)).d;
                            tVar.f10696f = ((e2.k0) i0Var3.get(i7)).f10456e;
                            tVar.f10693b = ((e2.k0) i0Var3.get(i7)).f10457f;
                            tVar.f10692a = ((e2.k0) i0Var3.get(i7)).f10458g;
                            e2.u uVar = new e2.u(tVar);
                            uc1 uc1Var = new uc1(26, this, uVar);
                            wf.b bVar = this.f60329b;
                            tg.s sVar = new tg.s(uc1Var, 18);
                            i61 i61Var = new i61(9);
                            qb.a aVar = new qb.a(4);
                            if (this.f60330c.G(uVar)) {
                                e2.t a12 = uVar.a();
                                a12.f10707r = e2.s0.n("application/x-media3-cues");
                                a12.f10699j = uVar.f10759s;
                                a12.P = this.f60330c.I(uVar);
                                uVar = new e2.u(a12);
                            }
                            e2.u uVar2 = uVar;
                            int i10 = i7 + 1;
                            String uri3 = ((e2.k0) i0Var3.get(i7)).f10453a.toString();
                            e2.z zVar = new e2.z();
                            e2.c0 c0Var3 = new e2.c0();
                            List list3 = Collections.EMPTY_LIST;
                            h9.s1 s1Var = h9.s1.f14058e;
                            e2.e0 e0Var = new e2.e0();
                            e2.h0 h0Var3 = e2.h0.d;
                            if (uri3 == null) {
                                parse = g0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (c0Var3.f10339b != null && c0Var3.f10338a == null) {
                                z12 = z11 ? 1 : 0;
                            } else {
                                z12 = z10;
                            }
                            ma.p(z12);
                            if (parse != null) {
                                if (c0Var3.f10338a != null) {
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
                            aVarArr[i10] = new y0(l0Var3, bVar, sVar, i61Var.x(l0Var3), aVar, 1048576, uVar2);
                        } else {
                            wf.b bVar2 = this.f60329b;
                            bVar2.getClass();
                            aVarArr[i7 + 1] = new n1((e2.k0) i0Var3.get(i7), bVar2, new qb.a(4));
                        }
                    }
                    b11 = new o0(aVarArr);
                }
                e2.b0 b0Var2 = l0Var2.f10496e;
                if (b0Var2.f10314b != 0 || b0Var2.d != Long.MIN_VALUE || b0Var2.f10317f) {
                    e eVar = new e(b11);
                    long j10 = b0Var2.f10314b;
                    if (j10 >= 0) {
                        z11 = z10;
                    }
                    ma.f(z11);
                    ma.p(!eVar.h);
                    eVar.f60208b = j10;
                    long j11 = b0Var2.d;
                    ma.p(!eVar.h);
                    eVar.f60209c = j11;
                    ma.p(!eVar.h);
                    eVar.d = !b0Var2.f10318g;
                    boolean z14 = b0Var2.f10316e;
                    ma.p(!eVar.h);
                    eVar.f60210e = z14;
                    boolean z15 = b0Var2.f10317f;
                    ma.p(!eVar.h);
                    eVar.f60211f = z15;
                    boolean z16 = b0Var2.h;
                    ma.p(!eVar.h);
                    eVar.f60212g = z16;
                    ma.p(!eVar.h);
                    eVar.h = z10;
                    b11 = new h(eVar);
                }
                l0Var2.f10494b.getClass();
                if (l0Var2.f10494b.d == null) {
                    return b11;
                }
                h2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return b11;
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(e10);
            }
        }
        long j12 = l0Var2.f10494b.h;
        String str7 = h2.l0.f13778a;
        throw null;
    }

    @Override
    public final f0 c(boolean z10) {
        this.f60334i = z10;
        p pVar = this.f60328a;
        pVar.f60320e = z10;
        f3.m mVar = pVar.f60317a;
        synchronized (mVar) {
            mVar.f11189b = z10;
        }
        for (f0 f0Var : pVar.f60319c.values()) {
            f0Var.c(z10);
        }
        return this;
    }

    @Override
    public final f0 d(int i7) {
        p pVar = this.f60328a;
        pVar.f60322g = i7;
        f3.m mVar = pVar.f60317a;
        synchronized (mVar) {
            mVar.d = i7;
        }
        return this;
    }
}
