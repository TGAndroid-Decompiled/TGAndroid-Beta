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
import h9.t1;
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
    public final c4.k f61377a;
    public final int f61378b;
    public final List f61379c;
    public final byte[] h;
    public final x f61383i;
    public final k0 f61384j;
    public final h2.c f61389o;
    public final i0 f61390p;
    public final d6.i f61391q;
    public t1 f61392r;
    public int f61393s;
    public int f61394t;
    public long f61395u;
    public int v;
    public x f61396w;
    public long f61397x;
    public int f61398y;
    public long f61399z;
    public final k8.a f61385k = new k8.a(24);
    public final x f61386l = new x(16);
    public final x f61380e = new x(i2.o.f15974a);
    public final x f61381f = new x(6);
    public final x f61382g = new x();
    public final ArrayDeque f61387m = new ArrayDeque();
    public final ArrayDeque f61388n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        e2.t tVar = new e2.t();
        tVar.f10714r = s0.n("application/x-emsg");
        P = new u(tVar);
    }

    public h(c4.k kVar, int i7, k0 k0Var, List list, o2.o oVar) {
        this.f61377a = kVar;
        this.f61378b = i7;
        this.f61384j = k0Var;
        this.f61379c = DesugarCollections.unmodifiableList(list);
        this.f61390p = oVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.f61383i = new x(bArr);
        g0 g0Var = h9.i0.f14003b;
        this.f61392r = t1.f14071e;
        this.A = -9223372036854775807L;
        this.f61399z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = f3.q.f11195q;
        this.J = new i0[0];
        this.K = new i0[0];
        this.f61389o = new h2.c(new e(this));
        this.f61391q = new d6.i(17);
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
            if (dVar.f8319b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.f15922c.f13833a;
                m6.n i10 = p.i(bArr);
                if (i10 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) i10.f20879b;
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
        byte[] bArr = c.f61358a;
        if ((m10 & 1) == 0) {
            if ((m10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int E = xVar.E();
            if (E == 0) {
                Arrays.fill(sVar.f61465l, 0, sVar.f61459e, false);
                return;
            }
            int i10 = sVar.f61459e;
            x xVar2 = sVar.f61467n;
            if (E == i10) {
                Arrays.fill(sVar.f61465l, 0, E, z10);
                xVar2.K(xVar.a());
                sVar.f61464k = true;
                sVar.f61468o = true;
                xVar.k(0, xVar2.f13835c, xVar2.f13833a);
                xVar2.N(0);
                sVar.f61468o = false;
                return;
            }
            StringBuilder m11 = i5.c.m(E, "Senc sample count ", " is different from fragment sample count");
            m11.append(sVar.f61459e);
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
        String str = l0.f13783a;
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
        t1 t1Var;
        f0 m10 = p.m(pVar, true, false);
        if (m10 != null) {
            t1Var = h9.i0.u(m10);
        } else {
            g0 g0Var = h9.i0.f14003b;
            t1Var = t1.f14071e;
        }
        this.f61392r = t1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(f3.q qVar) {
        int i7;
        int i10 = this.f61378b;
        if ((i10 & 32) == 0) {
            qVar = new ab.q(qVar, this.f61377a);
        }
        this.I = qVar;
        h();
        i0[] i0VarArr = new i0[2];
        this.J = i0VarArr;
        int i11 = 0;
        i0 i0Var = this.f61390p;
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
        List list = this.f61379c;
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
        this.f61388n.clear();
        this.f61398y = 0;
        ((PriorityQueue) this.f61389o.f13732e).clear();
        this.f61399z = j10;
        this.f61387m.clear();
        h();
    }

    @Override
    public final List e() {
        return this.f61392r;
    }

    @Override
    public final int f(f3.p r33, f3.s r34) {
        throw new UnsupportedOperationException("Method not decompiled: z3.h.f(f3.p, f3.s):int");
    }

    public final void h() {
        this.f61393s = 0;
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
