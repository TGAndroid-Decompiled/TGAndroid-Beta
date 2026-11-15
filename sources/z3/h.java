package z3;

import android.util.Pair;
import android.util.SparseArray;
import e2.s0;
import e2.t0;
import e2.u;
import f3.f0;
import f3.i0;
import h2.k0;
import h2.l0;
import h2.x;
import h9.g0;
import h9.s1;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
public final class h implements f3.o {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final u P;
    public long A;
    public long B;
    public g C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public f3.q I;
    public i0[] J;
    public i0[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final c4.k f60812a;
    public final int f60813b;
    public final List f60814c;
    public final byte[] h;
    public final x f60818i;
    public final k0 f60819j;
    public final h2.c f60824o;
    public final i0 f60825p;
    public final cb.c f60826q;
    public s1 f60827r;
    public int f60828s;
    public int f60829t;
    public long f60830u;
    public int v;
    public x f60831w;
    public long f60832x;
    public int f60833y;
    public long f60834z;
    public final k8.a f60820k = new k8.a(24);
    public final x f60821l = new x(16);
    public final x f60815e = new x(i2.o.f15659a);
    public final x f60816f = new x(6);
    public final x f60817g = new x();
    public final ArrayDeque f60822m = new ArrayDeque();
    public final ArrayDeque f60823n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        e2.t tVar = new e2.t();
        tVar.f10399r = s0.n("application/x-emsg");
        P = new u(tVar);
    }

    public h(c4.k kVar, int i7, k0 k0Var, List list, o2.o oVar) {
        this.f60812a = kVar;
        this.f60813b = i7;
        this.f60819j = k0Var;
        this.f60814c = DesugarCollections.unmodifiableList(list);
        this.f60825p = oVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.f60818i = new x(bArr);
        g0 g0Var = h9.i0.f13686b;
        this.f60827r = s1.f13749e;
        this.A = -9223372036854775807L;
        this.f60834z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = f3.q.f10876q;
        this.J = new i0[0];
        this.K = new i0[0];
        this.f60824o = new h2.c(new e(this));
        this.f60826q = new cb.c(21);
        this.N = -1L;
    }

    public static int g(int i7) {
        int i10;
        if ((i7 & 1) != 0) {
            i10 = 64;
        } else {
            i10 = 0;
        }
        if ((i7 & 2) != 0) {
            return i10 | 128;
        }
        return i10;
    }

    public static e2.r i(List list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            i2.d dVar = (i2.d) list.get(i7);
            if (dVar.f8040b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.f15607c.f13521a;
                m6.n i10 = p.i(bArr);
                if (i10 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) i10.f20518b;
                }
                if (uuid == null) {
                    h2.a.l("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new e2.q(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new e2.r(null, false, (e2.q[]) arrayList.toArray(new e2.q[0]));
    }

    public static void j(x xVar, int i7, s sVar) {
        boolean z10;
        xVar.N(i7 + 8);
        int m10 = xVar.m();
        byte[] bArr = c.f60793a;
        if ((m10 & 1) == 0) {
            if ((m10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int E = xVar.E();
            if (E == 0) {
                Arrays.fill(sVar.f60900l, 0, sVar.f60894e, false);
                return;
            }
            int i10 = sVar.f60894e;
            x xVar2 = sVar.f60902n;
            if (E == i10) {
                Arrays.fill(sVar.f60900l, 0, E, z10);
                xVar2.K(xVar.a());
                sVar.f60899k = true;
                sVar.f60903o = true;
                xVar.k(0, xVar2.f13523c, xVar2.f13521a);
                xVar2.N(0);
                sVar.f60903o = false;
                return;
            }
            StringBuilder m11 = i5.c.m(E, "Senc sample count ", " is different from fragment sample count");
            m11.append(sVar.f60894e);
            throw t0.a(null, m11.toString());
        }
        throw t0.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair k(long j3, x xVar) {
        long G;
        long G2;
        x xVar2 = xVar;
        xVar2.N(8);
        int e10 = c.e(xVar2.m());
        xVar2.O(4);
        long C = xVar2.C();
        if (e10 == 0) {
            G = xVar2.C();
            G2 = xVar2.C();
        } else {
            G = xVar2.G();
            G2 = xVar2.G();
        }
        long j10 = G2 + j3;
        String str = l0.f13471a;
        long a02 = l0.a0(G, 1000000L, C, RoundingMode.DOWN);
        xVar2.O(2);
        int H = xVar2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j11 = j10;
        long j12 = a02;
        int i7 = 0;
        while (i7 < H) {
            int m10 = xVar2.m();
            if ((Integer.MIN_VALUE & m10) == 0) {
                long C2 = xVar2.C();
                iArr[i7] = m10 & Integer.MAX_VALUE;
                jArr[i7] = j11;
                jArr3[i7] = j12;
                G += C2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                long a03 = l0.a0(G, 1000000L, C, RoundingMode.DOWN);
                jArr4[i7] = a03 - jArr5[i7];
                xVar2.O(4);
                j11 += iArr[i7];
                i7++;
                H = H;
                xVar2 = xVar;
                j12 = a03;
                jArr2 = jArr4;
                jArr3 = jArr5;
            } else {
                throw t0.a(null, "Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(a02), new f3.j(iArr, jArr, jArr2, jArr3));
    }

    @Override
    public final boolean b(f3.p pVar) {
        s1 s1Var;
        f0 m10 = p.m(pVar, true, false);
        if (m10 != null) {
            s1Var = h9.i0.u(m10);
        } else {
            g0 g0Var = h9.i0.f13686b;
            s1Var = s1.f13749e;
        }
        this.f60827r = s1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        int i7;
        int i10 = this.f60813b;
        if ((i10 & 32) == 0) {
            qVar = new ab.q(qVar, this.f60812a);
        }
        this.I = qVar;
        h();
        i0[] i0VarArr = new i0[2];
        this.J = i0VarArr;
        int i11 = 0;
        i0 i0Var = this.f60825p;
        if (i0Var != null) {
            i0VarArr[0] = i0Var;
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i12 = 100;
        if ((i10 & 4) != 0) {
            i0VarArr[i7] = this.I.d2(100, 5);
            i12 = 101;
            i7++;
        }
        i0[] i0VarArr2 = (i0[]) l0.U(i7, this.J);
        this.J = i0VarArr2;
        for (i0 i0Var2 : i0VarArr2) {
            i0Var2.g(P);
        }
        List list = this.f60814c;
        this.K = new i0[list.size()];
        while (i11 < this.K.length) {
            i0 d2 = this.I.d2(i12, 3);
            d2.g((u) list.get(i11));
            this.K[i11] = d2;
            i11++;
            i12++;
        }
    }

    @Override
    public final void d(long j3, long j10) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((g) sparseArray.valueAt(i7)).e();
        }
        this.f60823n.clear();
        this.f60833y = 0;
        ((PriorityQueue) this.f60824o.f13420e).clear();
        this.f60834z = j10;
        this.f60822m.clear();
        h();
    }

    @Override
    public final List e() {
        return this.f60827r;
    }

    @Override
    public final int f(f3.p r33, f3.s r34) {
        throw new UnsupportedOperationException("Method not decompiled: z3.h.f(f3.p, f3.s):int");
    }

    public final void h() {
        this.f60828s = 0;
        this.v = 0;
    }

    public final void l(long r55) {
        throw new UnsupportedOperationException("Method not decompiled: z3.h.l(long):void");
    }

    @Override
    public final f3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
