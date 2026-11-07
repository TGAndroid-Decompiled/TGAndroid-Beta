package z3;

import android.util.Pair;
import android.util.SparseArray;
import e2.s0;
import e2.t0;
import e2.u;
import f3.j0;
import h2.k0;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import m4.d0;
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
    public j0[] J;
    public j0[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final c4.k f59511a;
    public final int f59512b;
    public final List f59513c;
    public final byte[] h;
    public final x f59517i;
    public final k0 f59518j;
    public final h2.c f59523o;
    public final j0 f59524p;
    public final aa.n f59525q;
    public t1 f59526r;
    public int f59527s;
    public int f59528t;
    public long f59529u;
    public int v;
    public x f59530w;
    public long f59531x;
    public int f59532y;
    public long f59533z;
    public final d0 f59519k = new d0(20);
    public final x f59520l = new x(16);
    public final x f59514e = new x(i2.o.f15202a);
    public final x f59515f = new x(6);
    public final x f59516g = new x();
    public final ArrayDeque f59521m = new ArrayDeque();
    public final ArrayDeque f59522n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        e2.t tVar = new e2.t();
        tVar.f10563r = s0.n("application/x-emsg");
        P = new u(tVar);
    }

    public h(c4.k kVar, int i7, k0 k0Var, List list, o2.o oVar) {
        this.f59511a = kVar;
        this.f59512b = i7;
        this.f59518j = k0Var;
        this.f59513c = DesugarCollections.unmodifiableList(list);
        this.f59524p = oVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.f59517i = new x(bArr);
        g0 g0Var = i0.f14329b;
        this.f59526r = t1.f14397e;
        this.A = -9223372036854775807L;
        this.f59533z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = f3.q.f11069q;
        this.J = new j0[0];
        this.K = new j0[0];
        this.f59523o = new h2.c(new e(this));
        this.f59525q = new aa.n(17);
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
            if (dVar.f8650b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.f15150c.f14162a;
                m6.n i10 = p.i(bArr);
                if (i10 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) i10.f19918b;
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
        boolean z9;
        xVar.N(i7 + 8);
        int m10 = xVar.m();
        byte[] bArr = c.f59492a;
        if ((m10 & 1) == 0) {
            if ((m10 & 2) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int E = xVar.E();
            if (E == 0) {
                Arrays.fill(sVar.f59599l, 0, sVar.f59593e, false);
                return;
            }
            int i10 = sVar.f59593e;
            x xVar2 = sVar.f59601n;
            if (E == i10) {
                Arrays.fill(sVar.f59599l, 0, E, z9);
                xVar2.K(xVar.a());
                sVar.f59598k = true;
                sVar.f59602o = true;
                xVar.k(0, xVar2.f14164c, xVar2.f14162a);
                xVar2.N(0);
                sVar.f59602o = false;
                return;
            }
            StringBuilder n10 = jg.g.n(E, "Senc sample count ", " is different from fragment sample count");
            n10.append(sVar.f59593e);
            throw t0.a(null, n10.toString());
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
        String str = m0.f14112a;
        long a02 = m0.a0(G, 1000000L, C, RoundingMode.DOWN);
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
                long a03 = m0.a0(G, 1000000L, C, RoundingMode.DOWN);
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
        t1 t1Var;
        f3.g0 m10 = p.m(pVar, true, false);
        if (m10 != null) {
            t1Var = i0.u(m10);
        } else {
            g0 g0Var = i0.f14329b;
            t1Var = t1.f14397e;
        }
        this.f59526r = t1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        int i7;
        int i10 = this.f59512b;
        if ((i10 & 32) == 0) {
            qVar = new ab.q(qVar, this.f59511a);
        }
        this.I = qVar;
        h();
        j0[] j0VarArr = new j0[2];
        this.J = j0VarArr;
        int i11 = 0;
        j0 j0Var = this.f59524p;
        if (j0Var != null) {
            j0VarArr[0] = j0Var;
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i12 = 100;
        if ((i10 & 4) != 0) {
            j0VarArr[i7] = this.I.O1(100, 5);
            i12 = 101;
            i7++;
        }
        j0[] j0VarArr2 = (j0[]) m0.U(i7, this.J);
        this.J = j0VarArr2;
        for (j0 j0Var2 : j0VarArr2) {
            j0Var2.g(P);
        }
        List list = this.f59513c;
        this.K = new j0[list.size()];
        while (i11 < this.K.length) {
            j0 O1 = this.I.O1(i12, 3);
            O1.g((u) list.get(i11));
            this.K[i11] = O1;
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
        this.f59522n.clear();
        this.f59532y = 0;
        ((PriorityQueue) this.f59523o.f14060e).clear();
        this.f59533z = j10;
        this.f59521m.clear();
        h();
    }

    @Override
    public final List e() {
        return this.f59526r;
    }

    @Override
    public final int f(f3.p r33, f3.s r34) {
        throw new UnsupportedOperationException("Method not decompiled: z3.h.f(f3.p, f3.s):int");
    }

    public final void h() {
        this.f59527s = 0;
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
