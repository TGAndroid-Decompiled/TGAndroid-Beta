package x2;

import a8.ia;
import android.content.Context;
import android.net.Uri;
import h9.t1;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ly0;
public final class p implements e0 {
    public final k5 f58446a;
    public final j2.n f58447b;
    public w7.s f58448c;
    public final long d;
    public final long f58449e;
    public final long f58450f;
    public final float f58451g;
    public final float h;
    public boolean f58452i;

    public p(Context context, f3.m mVar) {
        j2.n nVar = new j2.n(context);
        w7.s sVar = new w7.s(5, false);
        this.f58447b = nVar;
        this.f58448c = sVar;
        k5 k5Var = new k5(mVar, sVar);
        this.f58446a = k5Var;
        if (nVar != ((j2.n) k5Var.f27658f)) {
            k5Var.f27658f = nVar;
            ((HashMap) k5Var.d).clear();
            ((HashMap) k5Var.f27657e).clear();
        }
        this.d = -9223372036854775807L;
        this.f58449e = -9223372036854775807L;
        this.f58450f = -9223372036854775807L;
        this.f58451g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f58452i = true;
    }

    public static e0 e(Class cls, j2.g gVar) {
        try {
            return (e0) cls.getConstructor(j2.g.class).newInstance(gVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override
    public final e0 a(w7.s sVar) {
        this.f58448c = sVar;
        k5 k5Var = this.f58446a;
        k5Var.h = sVar;
        f3.m mVar = (f3.m) k5Var.f27656c;
        synchronized (mVar) {
            mVar.f11070c = sVar;
        }
        for (e0 e0Var : ((HashMap) k5Var.f27657e).values()) {
            e0Var.a(sVar);
        }
        return this;
    }

    @Override
    public final a b(e2.l0 l0Var) {
        e2.g0 g0Var;
        boolean z9;
        boolean z10;
        Uri parse;
        boolean z11;
        e2.g0 g0Var2;
        e2.d0 d0Var;
        e2.g0 g0Var3;
        long j3;
        Uri uri;
        String str;
        e2.y yVar;
        String str2;
        boolean z12;
        e2.g0 g0Var4;
        e2.d0 d0Var2;
        e2.c0 c0Var;
        e2.l0 l0Var2 = l0Var;
        l0Var2.f10355b.getClass();
        String scheme = l0Var2.f10355b.f10264a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(l0Var2.f10355b.f10265b, "application/x-image-uri")) {
            e2.g0 g0Var5 = l0Var2.f10355b;
            int K = h2.m0.K(g0Var5.f10264a, g0Var5.f10265b);
            if (l0Var2.f10355b.h != -9223372036854775807L) {
                f3.m mVar = (f3.m) this.f58446a.f27656c;
                synchronized (mVar) {
                    mVar.f11071e = 1;
                }
                k5.c(this.f58446a);
            }
            try {
                e0 h = this.f58446a.h(K);
                e2.e0 a10 = l0Var2.f10356c.a();
                e2.f0 f0Var = l0Var2.f10356c;
                if (f0Var.f10246a == -9223372036854775807L) {
                    a10.f10234a = this.d;
                }
                if (f0Var.d == -3.4028235E38f) {
                    a10.d = this.f58451g;
                }
                if (f0Var.f10249e == -3.4028235E38f) {
                    a10.f10237e = this.h;
                }
                if (f0Var.f10247b == -9223372036854775807L) {
                    a10.f10235b = this.f58449e;
                }
                if (f0Var.f10248c == -9223372036854775807L) {
                    a10.f10236c = this.f58450f;
                }
                e2.f0 f0Var2 = new e2.f0(a10);
                if (!f0Var2.equals(l0Var2.f10356c)) {
                    e2.c0 c0Var2 = new e2.c0();
                    List list = Collections.EMPTY_LIST;
                    h9.i0 i0Var = t1.f14399e;
                    e2.h0 h0Var = e2.h0.d;
                    e2.b0 b0Var = l0Var2.f10357e;
                    ?? obj = new Object();
                    obj.f10662a = b0Var.f10175b;
                    obj.f10663b = b0Var.d;
                    obj.f10664c = b0Var.f10177e;
                    obj.d = b0Var.f10178f;
                    obj.f10665e = b0Var.f10179g;
                    obj.f10666f = b0Var.h;
                    String str3 = l0Var2.f10354a;
                    e2.o0 o0Var = l0Var2.d;
                    l0Var2.f10356c.a();
                    e2.h0 h0Var2 = l0Var2.f10358f;
                    e2.g0 g0Var6 = l0Var2.f10355b;
                    if (g0Var6 != null) {
                        String str4 = g0Var6.f10268f;
                        String str5 = g0Var6.f10265b;
                        Uri uri2 = g0Var6.f10264a;
                        list = g0Var6.f10267e;
                        i0Var = g0Var6.f10269g;
                        g0Var3 = null;
                        e2.d0 d0Var3 = g0Var6.f10266c;
                        if (d0Var3 != null) {
                            z10 = false;
                            ?? obj2 = new Object();
                            z9 = true;
                            obj2.f10199a = d0Var3.f10213a;
                            obj2.f10200b = d0Var3.f10214b;
                            obj2.f10201c = d0Var3.f10215c;
                            obj2.d = d0Var3.d;
                            obj2.f10202e = d0Var3.f10216e;
                            obj2.f10203f = d0Var3.f10217f;
                            obj2.f10204g = d0Var3.f10218g;
                            obj2.h = d0Var3.h;
                            c0Var = obj2;
                        } else {
                            z9 = true;
                            z10 = false;
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
                        z9 = true;
                        z10 = false;
                        j3 = -9223372036854775807L;
                        uri = null;
                        str = null;
                        yVar = null;
                        str2 = null;
                    }
                    List list2 = list;
                    h9.i0 i0Var2 = i0Var;
                    e2.e0 a11 = f0Var2.a();
                    if (c0Var2.f10200b != null && c0Var2.f10199a == null) {
                        z12 = z10 ? 1 : 0;
                    } else {
                        z12 = z9;
                    }
                    ia.p(z12);
                    if (uri != null) {
                        if (c0Var2.f10199a != null) {
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
                    z9 = true;
                    z10 = false;
                }
                a b10 = h.b(l0Var2);
                h9.i0 i0Var3 = l0Var2.f10355b.f10269g;
                if (!i0Var3.isEmpty()) {
                    a[] aVarArr = new a[i0Var3.size() + 1];
                    aVarArr[z10 ? 1 : 0] = b10;
                    for (int i7 = z10 ? 1 : 0; i7 < i0Var3.size(); i7++) {
                        if (this.f58452i) {
                            e2.t tVar = new e2.t();
                            tVar.f10568r = e2.s0.n(((e2.k0) i0Var3.get(i7)).f10315b);
                            tVar.d = ((e2.k0) i0Var3.get(i7)).f10316c;
                            tVar.f10556e = ((e2.k0) i0Var3.get(i7)).d;
                            tVar.f10557f = ((e2.k0) i0Var3.get(i7)).f10317e;
                            tVar.f10554b = ((e2.k0) i0Var3.get(i7)).f10318f;
                            tVar.f10553a = ((e2.k0) i0Var3.get(i7)).f10319g;
                            e2.u uVar = new e2.u(tVar);
                            org.telegram.ui.web.a0 a0Var2 = new org.telegram.ui.web.a0(23, this, uVar);
                            j2.n nVar = this.f58447b;
                            u5.e eVar = new u5.e(a0Var2, 10);
                            ly0 ly0Var = new ly0(6);
                            pb.b bVar = new pb.b(4);
                            if (this.f58448c.w(uVar)) {
                                e2.t a12 = uVar.a();
                                a12.f10568r = e2.s0.n("application/x-media3-cues");
                                a12.f10560j = uVar.f10620s;
                                a12.P = this.f58448c.D(uVar);
                                uVar = new e2.u(a12);
                            }
                            e2.u uVar2 = uVar;
                            int i10 = i7 + 1;
                            String uri3 = ((e2.k0) i0Var3.get(i7)).f10314a.toString();
                            e2.z zVar = new e2.z();
                            e2.c0 c0Var3 = new e2.c0();
                            List list3 = Collections.EMPTY_LIST;
                            t1 t1Var = t1.f14399e;
                            e2.e0 e0Var = new e2.e0();
                            e2.h0 h0Var3 = e2.h0.d;
                            if (uri3 == null) {
                                parse = g0Var;
                            } else {
                                parse = Uri.parse(uri3);
                            }
                            if (c0Var3.f10200b != null && c0Var3.f10199a == null) {
                                z11 = z10 ? 1 : 0;
                            } else {
                                z11 = z9;
                            }
                            ia.p(z11);
                            if (parse != null) {
                                if (c0Var3.f10199a != null) {
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
                            aVarArr[i10] = new x0(l0Var3, nVar, eVar, ly0Var.t(l0Var3), bVar, 1048576, uVar2);
                        } else {
                            j2.n nVar2 = this.f58447b;
                            nVar2.getClass();
                            aVarArr[i7 + 1] = new l1((e2.k0) i0Var3.get(i7), nVar2, new pb.b(4));
                        }
                    }
                    b10 = new n0(aVarArr);
                }
                e2.b0 b0Var2 = l0Var2.f10357e;
                if (b0Var2.f10175b != 0 || b0Var2.d != Long.MIN_VALUE || b0Var2.f10178f) {
                    e eVar2 = new e(b10);
                    long j10 = b0Var2.f10175b;
                    if (j10 >= 0) {
                        z10 = z9;
                    }
                    ia.f(z10);
                    ia.p(!eVar2.h);
                    eVar2.f58331b = j10;
                    long j11 = b0Var2.d;
                    ia.p(!eVar2.h);
                    eVar2.f58332c = j11;
                    ia.p(!eVar2.h);
                    eVar2.d = !b0Var2.f10179g;
                    boolean z13 = b0Var2.f10177e;
                    ia.p(!eVar2.h);
                    eVar2.f58333e = z13;
                    boolean z14 = b0Var2.f10178f;
                    ia.p(!eVar2.h);
                    eVar2.f58334f = z14;
                    boolean z15 = b0Var2.h;
                    ia.p(!eVar2.h);
                    eVar2.f58335g = z15;
                    ia.p(!eVar2.h);
                    eVar2.h = z9;
                    b10 = new h(eVar2);
                }
                l0Var2.f10355b.getClass();
                if (l0Var2.f10355b.d == null) {
                    return b10;
                }
                h2.a.l("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
                return b10;
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(e10);
            }
        }
        long j12 = l0Var2.f10355b.h;
        String str7 = h2.m0.f14114a;
        throw null;
    }

    @Override
    public final e0 c(boolean z9) {
        this.f58452i = z9;
        k5 k5Var = this.f58446a;
        k5Var.f27654a = z9;
        f3.m mVar = (f3.m) k5Var.f27656c;
        synchronized (mVar) {
            mVar.f11069b = z9;
        }
        for (e0 e0Var : ((HashMap) k5Var.f27657e).values()) {
            e0Var.c(z9);
        }
        return this;
    }

    @Override
    public final e0 d(int i7) {
        k5 k5Var = this.f58446a;
        k5Var.f27655b = i7;
        f3.m mVar = (f3.m) k5Var.f27656c;
        synchronized (mVar) {
            mVar.d = i7;
        }
        return this;
    }
}
