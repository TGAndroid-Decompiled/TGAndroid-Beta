package w3;

import android.util.Pair;
import android.util.SparseArray;
import b2.w;
import b2.w0;
import b2.x;
import b2.x0;
import c3.f0;
import c3.j0;
import e2.k0;
import e2.n0;
import f9.g0;
import f9.i0;
import f9.s1;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
public final class h implements c3.o {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final x P;
    public long A;
    public long B;
    public g C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public c3.q I;
    public j0[] J;
    public j0[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final z3.k f50681a;
    public final int f50682b;
    public final List f50683c;
    public final byte[] h;
    public final e2.x f50686i;
    public final k0 f50687j;
    public final e2.c f50692o;
    public final j0 f50693p;
    public final za.c f50694q;
    public s1 f50695r;
    public int f50696s;
    public int f50697t;
    public long f50698u;
    public int v;
    public e2.x f50699w;
    public long f50700x;
    public int f50701y;
    public long f50702z;
    public final m4.c f50688k = new m4.c(2);
    public final e2.x f50689l = new e2.x(16);
    public final e2.x e = new e2.x(f2.q.f10111a);
    public final e2.x f50684f = new e2.x(6);
    public final e2.x f50685g = new e2.x();
    public final ArrayDeque f50690m = new ArrayDeque();
    public final ArrayDeque f50691n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        w wVar = new w();
        wVar.f3533r = w0.n("application/x-emsg");
        P = new x(wVar);
    }

    public h(z3.k kVar, int i10, k0 k0Var, List list, l2.n nVar) {
        this.f50681a = kVar;
        this.f50682b = i10;
        this.f50687j = k0Var;
        this.f50683c = DesugarCollections.unmodifiableList(list);
        this.f50693p = nVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.f50686i = new e2.x(bArr);
        g0 g0Var = i0.f10287b;
        this.f50695r = s1.e;
        this.A = -9223372036854775807L;
        this.f50702z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = c3.q.f6091i;
        this.J = new j0[0];
        this.K = new j0[0];
        this.f50692o = new e2.c(new e(this));
        this.f50694q = new za.c(8);
        this.N = -1L;
    }

    public static int g(int i10) {
        int i11;
        if ((i10 & 1) != 0) {
            i11 = 64;
        } else {
            i11 = 0;
        }
        if ((i10 & 2) != 0) {
            return i11 | 128;
        }
        return i11;
    }

    public static b2.t i(List list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            f2.e eVar = (f2.e) list.get(i10);
            if (eVar.f10063b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = eVar.f10061c.f9732a;
                k6.m i11 = p.i(bArr);
                if (i11 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) i11.f16424b;
                }
                if (uuid == null) {
                    e2.a.l("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new b2.s(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new b2.t(null, false, (b2.s[]) arrayList.toArray(new b2.s[0]));
    }

    public static void j(e2.x xVar, int i10, s sVar) {
        boolean z10;
        xVar.N(i10 + 8);
        int m10 = xVar.m();
        byte[] bArr = c.f50663a;
        if ((m10 & 1) == 0) {
            if ((m10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int E = xVar.E();
            if (E == 0) {
                Arrays.fill(sVar.f50762l, 0, sVar.e, false);
                return;
            }
            int i11 = sVar.e;
            e2.x xVar2 = sVar.f50764n;
            if (E == i11) {
                Arrays.fill(sVar.f50762l, 0, E, z10);
                xVar2.K(xVar.a());
                sVar.f50761k = true;
                sVar.f50765o = true;
                xVar.k(0, xVar2.f9734c, xVar2.f9732a);
                xVar2.N(0);
                sVar.f50765o = false;
                return;
            }
            StringBuilder k10 = ic.a.k(E, "Senc sample count ", " is different from fragment sample count");
            k10.append(sVar.e);
            throw x0.a(null, k10.toString());
        }
        throw x0.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair k(long j10, e2.x xVar) {
        long G;
        long G2;
        e2.x xVar2 = xVar;
        xVar2.N(8);
        int e = c.e(xVar2.m());
        xVar2.O(4);
        long C = xVar2.C();
        if (e == 0) {
            G = xVar2.C();
            G2 = xVar2.C();
        } else {
            G = xVar2.G();
            G2 = xVar2.G();
        }
        long j11 = G2 + j10;
        String str = n0.f9692a;
        long a02 = n0.a0(G, 1000000L, C, RoundingMode.DOWN);
        xVar2.O(2);
        int H = xVar2.H();
        int[] iArr = new int[H];
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        long[] jArr3 = new long[H];
        long j12 = j11;
        long j13 = a02;
        int i10 = 0;
        while (i10 < H) {
            int m10 = xVar2.m();
            if ((Integer.MIN_VALUE & m10) == 0) {
                long C2 = xVar2.C();
                iArr[i10] = m10 & Integer.MAX_VALUE;
                jArr[i10] = j12;
                jArr3[i10] = j13;
                G += C2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                long a03 = n0.a0(G, 1000000L, C, RoundingMode.DOWN);
                jArr4[i10] = a03 - jArr5[i10];
                xVar2.O(4);
                j12 += iArr[i10];
                i10++;
                H = H;
                xVar2 = xVar;
                j13 = a03;
                jArr2 = jArr4;
                jArr3 = jArr5;
            } else {
                throw x0.a(null, "Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(a02), new c3.j(iArr, jArr, jArr2, jArr3));
    }

    @Override
    public final boolean a(c3.p pVar) {
        s1 s1Var;
        f0 m10 = p.m(pVar, true, false);
        if (m10 != null) {
            s1Var = i0.y(m10);
        } else {
            g0 g0Var = i0.f10287b;
            s1Var = s1.e;
        }
        this.f50695r = s1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        int i10;
        int i11 = this.f50682b;
        if ((i11 & 32) == 0) {
            qVar = new c2.b(qVar, this.f50681a);
        }
        this.I = qVar;
        h();
        j0[] j0VarArr = new j0[2];
        this.J = j0VarArr;
        int i12 = 0;
        j0 j0Var = this.f50693p;
        if (j0Var != null) {
            j0VarArr[0] = j0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = 100;
        if ((i11 & 4) != 0) {
            j0VarArr[i10] = this.I.F1(100, 5);
            i13 = 101;
            i10++;
        }
        j0[] j0VarArr2 = (j0[]) n0.U(i10, this.J);
        this.J = j0VarArr2;
        for (j0 j0Var2 : j0VarArr2) {
            j0Var2.b(P);
        }
        List list = this.f50683c;
        this.K = new j0[list.size()];
        while (i12 < this.K.length) {
            j0 F1 = this.I.F1(i13, 3);
            F1.b((x) list.get(i12));
            this.K[i12] = F1;
            i12++;
            i13++;
        }
    }

    @Override
    public final void d(long j10, long j11) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) sparseArray.valueAt(i10)).e();
        }
        this.f50691n.clear();
        this.f50701y = 0;
        ((PriorityQueue) this.f50692o.e).clear();
        this.f50702z = j11;
        this.f50690m.clear();
        h();
    }

    @Override
    public final List e() {
        return this.f50695r;
    }

    @Override
    public final int f(c3.p r33, c3.s r34) {
        throw new UnsupportedOperationException("Method not decompiled: w3.h.f(c3.p, c3.s):int");
    }

    public final void h() {
        this.f50696s = 0;
        this.v = 0;
    }

    public final void l(long r55) {
        throw new UnsupportedOperationException("Method not decompiled: w3.h.l(long):void");
    }

    @Override
    public final c3.o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
