package y3;

import android.util.Pair;
import android.util.SparseArray;
import d2.u0;
import d2.v;
import d2.v0;
import e3.f0;
import e3.i0;
import g2.l0;
import g2.n0;
import g2.y;
import g9.g0;
import g9.s1;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import k2.p1;
import mi.h0;
public final class i implements e3.o {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final v P;
    public long A;
    public long B;
    public h C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public e3.q I;
    public i0[] J;
    public i0[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final b4.k f58929a;
    public final int f58930b;
    public final List f58931c;
    public final byte[] h;
    public final y f58935i;
    public final l0 f58936j;
    public final g2.d f58941o;
    public final i0 f58942p;
    public final android.support.v4.media.c f58943q;
    public s1 f58944r;
    public int f58945s;
    public int f58946t;
    public long f58947u;
    public int v;
    public y f58948w;
    public long f58949x;
    public int f58950y;
    public long f58951z;
    public final h0 f58937k = new h0(17);
    public final y f58938l = new y(16);
    public final y f58932e = new y(h2.o.f14158a);
    public final y f58933f = new y(6);
    public final y f58934g = new y();
    public final ArrayDeque f58939m = new ArrayDeque();
    public final ArrayDeque f58940n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        d2.u uVar = new d2.u();
        uVar.f8431r = u0.n("application/x-emsg");
        P = new v(uVar);
    }

    public i(b4.k kVar, int i3, l0 l0Var, List list, n2.o oVar) {
        this.f58929a = kVar;
        this.f58930b = i3;
        this.f58936j = l0Var;
        this.f58931c = DesugarCollections.unmodifiableList(list);
        this.f58942p = oVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.f58935i = new y(bArr);
        g0 g0Var = g9.i0.f12083b;
        this.f58944r = s1.f12146e;
        this.A = -9223372036854775807L;
        this.f58951z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = e3.q.f9505k;
        this.J = new i0[0];
        this.K = new i0[0];
        this.f58941o = new g2.d(new f(this));
        this.f58943q = new android.support.v4.media.c(17);
        this.N = -1L;
    }

    public static int g(int i3) {
        int i10;
        if ((i3 & 1) != 0) {
            i10 = 64;
        } else {
            i10 = 0;
        }
        if ((i3 & 2) != 0) {
            return i10 | 128;
        }
        return i10;
    }

    public static d2.s i(List list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            h2.d dVar = (h2.d) list.get(i3);
            if (dVar.f365b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.f14106c.f11923a;
                l6.n i10 = q.i(bArr);
                if (i10 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) i10.f18089b;
                }
                if (uuid == null) {
                    g2.a.l("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new d2.r(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new d2.s(null, false, (d2.r[]) arrayList.toArray(new d2.r[0]));
    }

    public static void j(y yVar, int i3, t tVar) {
        boolean z10;
        yVar.N(i3 + 8);
        int m10 = yVar.m();
        byte[] bArr = d.f58910a;
        if ((m10 & 1) == 0) {
            if ((m10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int E = yVar.E();
            if (E == 0) {
                Arrays.fill(tVar.f59017l, 0, tVar.f59011e, false);
                return;
            }
            int i10 = tVar.f59011e;
            y yVar2 = tVar.f59019n;
            if (E == i10) {
                Arrays.fill(tVar.f59017l, 0, E, z10);
                yVar2.K(yVar.a());
                tVar.f59016k = true;
                tVar.f59020o = true;
                yVar.k(0, yVar2.f11925c, yVar2.f11923a);
                yVar2.N(0);
                tVar.f59020o = false;
                return;
            }
            StringBuilder m11 = p1.m(E, "Senc sample count ", " is different from fragment sample count");
            m11.append(tVar.f59011e);
            throw v0.a(null, m11.toString());
        }
        throw v0.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair k(long j10, y yVar) {
        long G;
        long G2;
        y yVar2 = yVar;
        yVar2.N(8);
        int e10 = d.e(yVar2.m());
        yVar2.O(4);
        long C = yVar2.C();
        if (e10 == 0) {
            G = yVar2.C();
            G2 = yVar2.C();
        } else {
            G = yVar2.G();
            G2 = yVar2.G();
        }
        long j11 = G2 + j10;
        String str = n0.f11873a;
        long a02 = n0.a0(G, 1000000L, C, RoundingMode.DOWN);
        yVar2.O(2);
        int H = yVar2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j12 = j11;
        long j13 = a02;
        int i3 = 0;
        while (i3 < H) {
            int m10 = yVar2.m();
            if ((Integer.MIN_VALUE & m10) == 0) {
                long C2 = yVar2.C();
                iArr[i3] = m10 & Integer.MAX_VALUE;
                jArr[i3] = j12;
                jArr3[i3] = j13;
                G += C2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                long a03 = n0.a0(G, 1000000L, C, RoundingMode.DOWN);
                jArr4[i3] = a03 - jArr5[i3];
                yVar2.O(4);
                j12 += iArr[i3];
                i3++;
                H = H;
                yVar2 = yVar;
                j13 = a03;
                jArr2 = jArr4;
                jArr3 = jArr5;
            } else {
                throw v0.a(null, "Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(a02), new e3.j(iArr, jArr, jArr2, jArr3));
    }

    @Override
    public final boolean b(e3.p pVar) {
        s1 s1Var;
        f0 m10 = q.m(pVar, true, false);
        if (m10 != null) {
            s1Var = g9.i0.u(m10);
        } else {
            g0 g0Var = g9.i0.f12083b;
            s1Var = s1.f12146e;
        }
        this.f58944r = s1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(e3.q qVar) {
        int i3;
        int i10 = this.f58930b;
        if ((i10 & 32) == 0) {
            qVar = new b4.n(qVar, this.f58929a);
        }
        this.I = qVar;
        h();
        i0[] i0VarArr = new i0[2];
        this.J = i0VarArr;
        int i11 = 0;
        i0 i0Var = this.f58942p;
        if (i0Var != null) {
            i0VarArr[0] = i0Var;
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i12 = 100;
        if ((i10 & 4) != 0) {
            i0VarArr[i3] = this.I.i0(100, 5);
            i12 = 101;
            i3++;
        }
        i0[] i0VarArr2 = (i0[]) n0.U(i3, this.J);
        this.J = i0VarArr2;
        for (i0 i0Var2 : i0VarArr2) {
            i0Var2.g(P);
        }
        List list = this.f58931c;
        this.K = new i0[list.size()];
        while (i11 < this.K.length) {
            i0 i02 = this.I.i0(i12, 3);
            i02.g((v) list.get(i11));
            this.K[i11] = i02;
            i11++;
            i12++;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((h) sparseArray.valueAt(i3)).e();
        }
        this.f58940n.clear();
        this.f58950y = 0;
        ((PriorityQueue) this.f58941o.f11821e).clear();
        this.f58951z = j11;
        this.f58939m.clear();
        h();
    }

    @Override
    public final List e() {
        return this.f58944r;
    }

    @Override
    public final int f(e3.p r33, e3.s r34) {
        throw new UnsupportedOperationException("Method not decompiled: y3.i.f(e3.p, e3.s):int");
    }

    public final void h() {
        this.f58945s = 0;
        this.v = 0;
    }

    public final void l(long r55) {
        throw new UnsupportedOperationException("Method not decompiled: y3.i.l(long):void");
    }

    @Override
    public final e3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
