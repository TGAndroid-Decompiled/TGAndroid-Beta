package w3;

import android.util.Pair;
import android.util.SparseArray;
import b2.v;
import b2.v0;
import b2.w;
import b2.w0;
import c3.i0;
import c3.l0;
import e2.k0;
import e2.m0;
import e2.x;
import e9.n0;
import e9.x1;
import i2.o1;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
public final class h implements c3.q {
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
    public c3.s I;
    public l0[] J;
    public l0[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final z3.k f48935a;
    public final int f48936b;
    public final List f48937c;
    public final byte[] h;
    public final x f48940i;
    public final k0 f48941j;
    public final e2.c f48946o;
    public final l0 f48947p;
    public final qb.c f48948q;
    public x1 f48949r;
    public int f48950s;
    public int f48951t;
    public long f48952u;
    public int v;
    public x f48953w;
    public long f48954x;
    public int f48955y;
    public long f48956z;
    public final n2.e f48942k = new n2.e(1);
    public final x f48943l = new x(16);
    public final x e = new x(f2.q.f10352a);
    public final x f48938f = new x(6);
    public final x f48939g = new x();
    public final ArrayDeque f48944m = new ArrayDeque();
    public final ArrayDeque f48945n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        v vVar = new v();
        vVar.f4082r = v0.n("application/x-emsg");
        P = new w(vVar);
    }

    public h(z3.k kVar, int i10, k0 k0Var, List list, l2.o oVar) {
        this.f48935a = kVar;
        this.f48936b = i10;
        this.f48941j = k0Var;
        this.f48937c = DesugarCollections.unmodifiableList(list);
        this.f48947p = oVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.f48940i = new x(bArr);
        e9.l0 l0Var = n0.f8481b;
        this.f48949r = x1.e;
        this.A = -9223372036854775807L;
        this.f48956z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = c3.s.f4663i;
        this.J = new l0[0];
        this.K = new l0[0];
        this.f48946o = new e2.c(new e(this));
        this.f48948q = new qb.c(10);
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
            if (eVar.f10304b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = eVar.f10302c.f8298a;
                j6.l i11 = p.i(bArr);
                if (i11 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) i11.f14334b;
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
        byte[] bArr = c.f48917a;
        if ((m10 & 1) == 0) {
            if ((m10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int E = xVar.E();
            if (E == 0) {
                Arrays.fill(sVar.f49016l, 0, sVar.e, false);
                return;
            }
            int i11 = sVar.e;
            x xVar2 = sVar.f49018n;
            if (E == i11) {
                Arrays.fill(sVar.f49016l, 0, E, z10);
                xVar2.K(xVar.a());
                sVar.f49015k = true;
                sVar.f49019o = true;
                xVar.k(0, xVar2.f8300c, xVar2.f8298a);
                xVar2.N(0);
                sVar.f49019o = false;
                return;
            }
            StringBuilder n10 = o1.n(E, "Senc sample count ", " is different from fragment sample count");
            n10.append(sVar.e);
            throw w0.a(null, n10.toString());
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
        String str = m0.f8259a;
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
    public final boolean a(c3.r rVar) {
        x1 x1Var;
        i0 m10 = p.m(rVar, true, false);
        if (m10 != null) {
            x1Var = n0.y(m10);
        } else {
            e9.l0 l0Var = n0.f8481b;
            x1Var = x1.e;
        }
        this.f48949r = x1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.s sVar) {
        int i10;
        int i11 = this.f48936b;
        if ((i11 & 32) == 0) {
            sVar = new c2.b(sVar, this.f48935a);
        }
        this.I = sVar;
        h();
        l0[] l0VarArr = new l0[2];
        this.J = l0VarArr;
        int i12 = 0;
        l0 l0Var = this.f48947p;
        if (l0Var != null) {
            l0VarArr[0] = l0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = 100;
        if ((i11 & 4) != 0) {
            l0VarArr[i10] = this.I.j0(100, 5);
            i13 = 101;
            i10++;
        }
        l0[] l0VarArr2 = (l0[]) m0.U(i10, this.J);
        this.J = l0VarArr2;
        for (l0 l0Var2 : l0VarArr2) {
            l0Var2.b(P);
        }
        List list = this.f48937c;
        this.K = new l0[list.size()];
        while (i12 < this.K.length) {
            l0 j02 = this.I.j0(i13, 3);
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
        this.f48945n.clear();
        this.f48955y = 0;
        ((PriorityQueue) this.f48946o.e).clear();
        this.f48956z = j11;
        this.f48944m.clear();
        h();
    }

    @Override
    public final List e() {
        return this.f48949r;
    }

    @Override
    public final int f(c3.r r33, c3.u r34) {
        throw new UnsupportedOperationException("Method not decompiled: w3.h.f(c3.r, c3.u):int");
    }

    public final void h() {
        this.f48950s = 0;
        this.v = 0;
    }

    public final void l(long r55) {
        throw new UnsupportedOperationException("Method not decompiled: w3.h.l(long):void");
    }

    @Override
    public final c3.q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
