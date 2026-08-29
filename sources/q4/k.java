package q4;

import android.net.Uri;
import android.text.TextUtils;
import f5.c0;
import f5.d0;
import f5.w;
import h7.m5;
import i7.n6;
import j3.s0;
import j3.t0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.FileLog;
import q8.l0;
import q8.x;
import q8.z;
import y3.b0;
public final class k extends n4.k {
    public static final AtomicInteger X = new AtomicInteger();
    public final int A;
    public final com.google.android.exoplayer2.upstream.m B;
    public final com.google.android.exoplayer2.upstream.q C;
    public final b D;
    public final boolean E;
    public final boolean F;
    public final c0 G;
    public final j H;
    public final List I;
    public final n3.c J;
    public final g4.i K;
    public final w L;
    public final boolean M;
    public final boolean N;
    public b O;
    public r P;
    public int Q;
    public boolean R;
    public volatile boolean S;
    public boolean T;
    public z U;
    public boolean V;
    public boolean W;
    public final int v;
    public final int f46283w;
    public final Uri f46284x;
    public final boolean f46285y;

    public k(j jVar, com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar, t0 t0Var, boolean z10, com.google.android.exoplayer2.upstream.m mVar2, com.google.android.exoplayer2.upstream.q qVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, c0 c0Var, n3.c cVar, b bVar, g4.i iVar, w wVar, boolean z15, k3.k kVar) {
        super(mVar, qVar, t0Var, i10, obj, j10, j11, j12);
        boolean z16;
        this.M = z10;
        this.A = i11;
        this.W = z12;
        this.f46283w = i12;
        this.C = qVar2;
        this.B = mVar2;
        if (qVar2 != null) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.R = z16;
        this.N = z11;
        this.f46284x = uri;
        this.E = z14;
        this.G = c0Var;
        this.F = z13;
        this.H = jVar;
        this.I = list;
        this.J = cVar;
        this.D = bVar;
        this.K = iVar;
        this.L = wVar;
        this.f46285y = z15;
        x xVar = z.f46511b;
        this.U = l0.f46462e;
        this.v = X.getAndIncrement();
    }

    public static byte[] e(String str) {
        int i10;
        if (n6.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i10 = byteArray.length - 16;
        } else {
            i10 = 0;
        }
        System.arraycopy(byteArray, i10, bArr, (16 - byteArray.length) + i10, byteArray.length - i10);
        return bArr;
    }

    @Override
    public final void a() {
        b bVar;
        this.P.getClass();
        if (this.O == null && (bVar = this.D) != null) {
            o3.k kVar = bVar.f46254a;
            if ((kVar instanceof b0) || (kVar instanceof w3.i)) {
                this.O = bVar;
                this.R = false;
            }
        }
        com.google.android.exoplayer2.upstream.q qVar = this.C;
        com.google.android.exoplayer2.upstream.m mVar = this.B;
        if (this.R) {
            mVar.getClass();
            qVar.getClass();
            d(mVar, qVar, this.N);
            this.Q = 0;
            this.R = false;
        }
        if (!this.S) {
            if (!this.F) {
                d(this.f17133r, this.f17128b, this.M);
            }
            this.T = !this.S;
        }
    }

    @Override
    public final boolean c() {
        throw null;
    }

    public final void d(com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar, boolean z10) {
        com.google.android.exoplayer2.upstream.q a2;
        long j10;
        boolean z11 = false;
        if (z10) {
            if (this.Q != 0) {
                z11 = true;
            }
            a2 = qVar;
        } else {
            a2 = qVar.a(this.Q);
        }
        try {
            try {
                o3.h g10 = g(mVar, a2);
                if (z11) {
                    g10.t(this.Q);
                }
                do {
                    try {
                        try {
                            if (this.S) {
                                break;
                            }
                        } catch (EOFException e10) {
                            if ((this.d.f10800e & 16384) != 0) {
                                this.O.f46254a.f(0L, 0L);
                                j10 = g10.d;
                            } else {
                                throw e10;
                            }
                        }
                    } catch (Throwable th2) {
                        this.Q = (int) (g10.d - qVar.f3602e);
                        throw th2;
                    }
                } while (this.O.f46254a.d(g10, b.d) == 0);
                j10 = g10.d;
                this.Q = (int) (j10 - qVar.f3602e);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        } finally {
            m5.a(mVar);
        }
    }

    public final int f(int i10) {
        f5.a.i(!this.f46285y);
        if (i10 >= this.U.size()) {
            return 0;
        }
        return ((Integer) this.U.get(i10)).intValue();
    }

    public final o3.h g(com.google.android.exoplayer2.upstream.m mVar, com.google.android.exoplayer2.upstream.q qVar) {
        int i10;
        int i11;
        boolean z10;
        long j10;
        long j11;
        String str;
        b bVar;
        b bVar2;
        int i12;
        ArrayList arrayList;
        List list;
        o3.k aVar;
        boolean z11;
        boolean z12;
        int i13;
        List list2;
        List singletonList;
        int i14;
        boolean z13;
        q[] qVarArr;
        long j12;
        q[] qVarArr2;
        boolean z14;
        o3.k dVar;
        b4.b[] bVarArr;
        long open = mVar.open(qVar);
        try {
            c0 c0Var = this.G;
            boolean z15 = this.E;
            long j13 = this.h;
            synchronized (c0Var) {
                i10 = 1;
                i11 = 0;
                if (c0Var.f6576a == 9223372036854775806L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f5.a.i(z10);
                if (c0Var.f6577b == -9223372036854775807L) {
                    if (z15) {
                        c0Var.d.set(Long.valueOf(j13));
                    } else {
                        while (c0Var.f6577b == -9223372036854775807L) {
                            c0Var.wait();
                        }
                    }
                }
            }
            o3.h hVar = new o3.h(mVar, qVar.f3602e, open);
            if (this.O == null) {
                w wVar = this.L;
                hVar.f19097f = 0;
                try {
                    wVar.z(10);
                    hVar.f(wVar.f6640a, 0, 10, false);
                    if (wVar.t() == 4801587) {
                        wVar.D(3);
                        int q6 = wVar.q();
                        int i15 = q6 + 10;
                        byte[] bArr = wVar.f6640a;
                        if (i15 > bArr.length) {
                            wVar.z(i15);
                            System.arraycopy(bArr, 0, wVar.f6640a, 0, 10);
                        }
                        hVar.f(wVar.f6640a, 10, q6, false);
                        b4.c c3 = this.K.c(q6, wVar.f6640a);
                        if (c3 != null) {
                            for (b4.b bVar3 : c3.f1919a) {
                                if (bVar3 instanceof g4.m) {
                                    g4.m mVar2 = (g4.m) bVar3;
                                    if ("com.apple.streaming.transportStreamTimestamp".equals(mVar2.f7013b)) {
                                        System.arraycopy(mVar2.f7014c, 0, wVar.f6640a, 0, 8);
                                        wVar.C(0);
                                        wVar.B(8);
                                        j10 = wVar.l() & 8589934591L;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } catch (EOFException unused) {
                }
                j10 = -9223372036854775807L;
                hVar.f19097f = 0;
                b bVar4 = this.D;
                if (bVar4 != null) {
                    c0 c0Var2 = bVar4.f46256c;
                    t0 t0Var = bVar4.f46255b;
                    o3.k kVar = bVar4.f46254a;
                    if (!(kVar instanceof b0) && !(kVar instanceof w3.i)) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    f5.a.i(!z14);
                    o3.k kVar2 = bVar4.f46254a;
                    if (kVar2 instanceof v) {
                        dVar = new v(t0Var.f10799c, c0Var2);
                    } else if (kVar2 instanceof y3.d) {
                        dVar = new y3.d(0);
                    } else if (kVar2 instanceof y3.a) {
                        dVar = new y3.a();
                    } else if (kVar2 instanceof y3.c) {
                        dVar = new y3.c();
                    } else if (kVar2 instanceof v3.d) {
                        dVar = new v3.d(0);
                    } else {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(kVar2.getClass().getSimpleName()));
                    }
                    bVar2 = new b(dVar, t0Var, c0Var2);
                    j11 = -9223372036854775807L;
                } else {
                    j jVar = this.H;
                    Uri uri = qVar.f3599a;
                    t0 t0Var2 = this.d;
                    List list3 = this.I;
                    c0 c0Var3 = this.G;
                    j11 = -9223372036854775807L;
                    Map responseHeaders = mVar.getResponseHeaders();
                    ((c) jVar).getClass();
                    int w10 = f5.a.w(t0Var2.B);
                    List list4 = (List) responseHeaders.get("Content-Type");
                    if (list4 != null && !list4.isEmpty()) {
                        str = (String) list4.get(0);
                    } else {
                        str = null;
                    }
                    int w11 = f5.a.w(str);
                    int x4 = f5.a.x(uri);
                    int[] iArr = c.f46257b;
                    ArrayList arrayList2 = new ArrayList(7);
                    c.a(w10, arrayList2);
                    c.a(w11, arrayList2);
                    c.a(x4, arrayList2);
                    int i16 = 0;
                    for (int i17 = 7; i16 < i17; i17 = 7) {
                        c.a(iArr[i16], arrayList2);
                        i16++;
                    }
                    hVar.f19097f = 0;
                    int i18 = 0;
                    o3.k kVar3 = null;
                    while (true) {
                        if (i18 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList2.get(i18)).intValue();
                            if (intValue != 0) {
                                if (intValue != i10) {
                                    if (intValue != 2) {
                                        if (intValue != 7) {
                                            if (intValue != 8) {
                                                if (intValue != 11) {
                                                    if (intValue != 13) {
                                                        i12 = i18;
                                                        arrayList = arrayList2;
                                                        list = list3;
                                                        aVar = null;
                                                    } else {
                                                        aVar = new v(t0Var2.f10799c, c0Var3);
                                                        i12 = i18;
                                                        arrayList = arrayList2;
                                                    }
                                                } else {
                                                    if (list3 != null) {
                                                        i14 = 48;
                                                        singletonList = list3;
                                                    } else {
                                                        s0 s0Var = new s0();
                                                        s0Var.f10742o = "application/cea-608";
                                                        singletonList = Collections.singletonList(new t0(s0Var));
                                                        i14 = 16;
                                                    }
                                                    i12 = i18;
                                                    String str2 = t0Var2.f10803r;
                                                    if (!TextUtils.isEmpty(str2)) {
                                                        arrayList = arrayList2;
                                                        if (f5.o.a(str2, "audio/mp4a-latm") == null) {
                                                            i14 |= 2;
                                                        }
                                                        if (f5.o.a(str2, "video/avc") == null) {
                                                            i14 |= 4;
                                                        }
                                                    } else {
                                                        arrayList = arrayList2;
                                                    }
                                                    aVar = new b0(2, c0Var3, new o0.i(i14, singletonList));
                                                }
                                            } else {
                                                i12 = i18;
                                                arrayList = arrayList2;
                                                b4.c cVar = t0Var2.f10804s;
                                                if (cVar != null) {
                                                    int i19 = 0;
                                                    while (true) {
                                                        b4.b[] bVarArr2 = cVar.f1919a;
                                                        b4.c cVar2 = cVar;
                                                        if (i19 >= bVarArr2.length) {
                                                            break;
                                                        }
                                                        b4.b bVar5 = bVarArr2[i19];
                                                        if (bVar5 instanceof u) {
                                                            z12 = !((u) bVar5).f46350c.isEmpty();
                                                            break;
                                                        }
                                                        i19++;
                                                        cVar = cVar2;
                                                    }
                                                }
                                                z12 = false;
                                                if (z12) {
                                                    i13 = 4;
                                                } else {
                                                    i13 = 0;
                                                }
                                                if (list3 != null) {
                                                    list2 = list3;
                                                } else {
                                                    list2 = Collections.EMPTY_LIST;
                                                }
                                                aVar = new w3.i(i13, c0Var3, list2, null);
                                            }
                                            list = list3;
                                        } else {
                                            i12 = i18;
                                            arrayList = arrayList2;
                                            list = list3;
                                            aVar = new v3.d(0, 0L);
                                        }
                                    } else {
                                        i12 = i18;
                                        arrayList = arrayList2;
                                        list = list3;
                                        aVar = new y3.d(0);
                                    }
                                } else {
                                    i12 = i18;
                                    arrayList = arrayList2;
                                    list = list3;
                                    aVar = new y3.c();
                                }
                            } else {
                                i12 = i18;
                                arrayList = arrayList2;
                                list = list3;
                                aVar = new y3.a();
                            }
                            aVar.getClass();
                            try {
                                z11 = aVar.e(hVar);
                                i11 = 0;
                                hVar.f19097f = 0;
                            } catch (EOFException unused2) {
                                i11 = 0;
                                hVar.f19097f = 0;
                                z11 = false;
                            } catch (Throwable th2) {
                                hVar.f19097f = 0;
                                throw th2;
                            }
                            if (z11) {
                                bVar = new b(aVar, t0Var2, c0Var3);
                                break;
                            }
                            if (kVar3 == null && (intValue == w10 || intValue == w11 || intValue == x4 || intValue == 11)) {
                                kVar3 = aVar;
                            }
                            list3 = list;
                            i18 = i12 + 1;
                            arrayList2 = arrayList;
                            i10 = 1;
                        } else {
                            kVar3.getClass();
                            bVar = new b(kVar3, t0Var2, c0Var3);
                            break;
                        }
                    }
                    bVar2 = bVar;
                }
                this.O = bVar2;
                o3.k kVar4 = bVar2.f46254a;
                if (!(kVar4 instanceof y3.d) && !(kVar4 instanceof y3.a) && !(kVar4 instanceof y3.c) && !(kVar4 instanceof v3.d)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    r rVar = this.P;
                    if (j10 != j11) {
                        j12 = this.G.b(j10);
                    } else {
                        j12 = this.h;
                    }
                    if (rVar.f46333h0 != j12) {
                        rVar.f46333h0 = j12;
                        for (q qVar2 : rVar.H) {
                            if (qVar2.F != j12) {
                                qVar2.F = j12;
                                qVar2.f14288z = true;
                            }
                        }
                    }
                } else {
                    r rVar2 = this.P;
                    if (rVar2.f46333h0 != 0) {
                        rVar2.f46333h0 = 0L;
                        for (q qVar3 : rVar2.H) {
                            if (qVar3.F != 0) {
                                qVar3.F = 0L;
                                qVar3.f14288z = true;
                            }
                        }
                    }
                }
                this.P.J.clear();
                this.O.f46254a.i(this.P);
            }
            r rVar3 = this.P;
            n3.c cVar3 = this.J;
            if (!d0.a(rVar3.f46334i0, cVar3)) {
                rVar3.f46334i0 = cVar3;
                while (true) {
                    q[] qVarArr3 = rVar3.H;
                    if (i11 >= qVarArr3.length) {
                        break;
                    }
                    if (rVar3.f46322a0[i11]) {
                        q qVar4 = qVarArr3[i11];
                        qVar4.I = cVar3;
                        qVar4.f14288z = true;
                    }
                    i11++;
                }
            }
            return hVar;
        } catch (InterruptedException unused3) {
            throw new InterruptedIOException();
        }
    }

    @Override
    public final void q() {
        this.S = true;
    }
}
