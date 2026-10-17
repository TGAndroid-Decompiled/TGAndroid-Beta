package w3;

import android.util.Pair;
import android.util.SparseArray;
import b2.v;
import b2.v0;
import b2.w;
import b2.w0;
import c3.g0;
import c3.j0;
import e2.k0;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
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
    public static final w P;
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
    public final z3.k f48508a;
    public final int f48509b;
    public final List f48510c;
    public final byte[] h;
    public final x f48513i;
    public final k0 f48514j;
    public final e2.c f48519o;
    public final j0 f48520p;
    public final a6.m f48521q;
    public x1 f48522r;
    public int f48523s;
    public int f48524t;
    public long f48525u;
    public int v;
    public x f48526w;
    public long f48527x;
    public int f48528y;
    public long f48529z;
    public final n2.e f48515k = new n2.e(1);
    public final x f48516l = new x(16);
    public final x e = new x(f2.q.f10336a);
    public final x f48511f = new x(6);
    public final x f48512g = new x();
    public final ArrayDeque f48517m = new ArrayDeque();
    public final ArrayDeque f48518n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        v vVar = new v();
        vVar.f4078r = v0.n("application/x-emsg");
        P = new w(vVar);
    }

    public h(z3.k kVar, int i10, k0 k0Var, List list, l2.o oVar) {
        this.f48508a = kVar;
        this.f48509b = i10;
        this.f48514j = k0Var;
        this.f48510c = DesugarCollections.unmodifiableList(list);
        this.f48520p = oVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.f48513i = new x(bArr);
        l0 l0Var = n0.f8476b;
        this.f48522r = x1.e;
        this.A = -9223372036854775807L;
        this.f48529z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = c3.q.f4657i;
        this.J = new j0[0];
        this.K = new j0[0];
        this.f48519o = new e2.c(new e(this));
        this.f48521q = new a6.m(9);
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

    public static b2.s i(List list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            f2.e eVar = (f2.e) list.get(i10);
            if (eVar.f10288b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = eVar.f10286c.f8293a;
                j6.l i11 = p.i(bArr);
                if (i11 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) i11.f14284b;
                }
                if (uuid == null) {
                    e2.a.l("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new b2.r(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new b2.s(null, false, (b2.r[]) arrayList.toArray(new b2.r[0]));
    }

    public static void j(x xVar, int i10, s sVar) {
        boolean z10;
        xVar.N(i10 + 8);
        int m10 = xVar.m();
        byte[] bArr = c.f48490a;
        if ((m10 & 1) == 0) {
            if ((m10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int E = xVar.E();
            if (E == 0) {
                Arrays.fill(sVar.f48589l, 0, sVar.e, false);
                return;
            }
            int i11 = sVar.e;
            x xVar2 = sVar.f48591n;
            if (E == i11) {
                Arrays.fill(sVar.f48589l, 0, E, z10);
                xVar2.K(xVar.a());
                sVar.f48588k = true;
                sVar.f48592o = true;
                xVar.k(0, xVar2.f8295c, xVar2.f8293a);
                xVar2.N(0);
                sVar.f48592o = false;
                return;
            }
            StringBuilder l4 = i0.a.l(E, "Senc sample count ", " is different from fragment sample count");
            l4.append(sVar.e);
            throw w0.a(null, l4.toString());
        }
        throw w0.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair k(long j10, x xVar) {
        long G;
        long G2;
        x xVar2 = xVar;
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
        String str = m0.f8254a;
        long a02 = m0.a0(G, 1000000L, C, RoundingMode.DOWN);
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
                long a03 = m0.a0(G, 1000000L, C, RoundingMode.DOWN);
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
                throw w0.a(null, "Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(a02), new c3.j(iArr, jArr, jArr2, jArr3));
    }

    @Override
    public final boolean a(c3.p pVar) {
        x1 x1Var;
        g0 m10 = p.m(pVar, true, false);
        if (m10 != null) {
            x1Var = n0.y(m10);
        } else {
            l0 l0Var = n0.f8476b;
            x1Var = x1.e;
        }
        this.f48522r = x1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        int i10;
        int i11 = this.f48509b;
        if ((i11 & 32) == 0) {
            qVar = new c2.b(qVar, this.f48508a);
        }
        this.I = qVar;
        h();
        j0[] j0VarArr = new j0[2];
        this.J = j0VarArr;
        int i12 = 0;
        j0 j0Var = this.f48520p;
        if (j0Var != null) {
            j0VarArr[0] = j0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = 100;
        if ((i11 & 4) != 0) {
            j0VarArr[i10] = this.I.j0(100, 5);
            i13 = 101;
            i10++;
        }
        j0[] j0VarArr2 = (j0[]) m0.U(i10, this.J);
        this.J = j0VarArr2;
        for (j0 j0Var2 : j0VarArr2) {
            j0Var2.b(P);
        }
        List list = this.f48510c;
        this.K = new j0[list.size()];
        while (i12 < this.K.length) {
            j0 j02 = this.I.j0(i13, 3);
            j02.b((w) list.get(i12));
            this.K[i12] = j02;
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
        this.f48518n.clear();
        this.f48528y = 0;
        ((PriorityQueue) this.f48519o.e).clear();
        this.f48529z = j11;
        this.f48517m.clear();
        h();
    }

    @Override
    public final List e() {
        return this.f48522r;
    }

    @Override
    public final int f(c3.p r33, c3.s r34) {
        throw new UnsupportedOperationException("Method not decompiled: w3.h.f(c3.p, c3.s):int");
    }

    public final void h() {
        this.f48523s = 0;
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
