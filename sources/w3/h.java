package w3;

import android.util.Pair;
import android.util.SparseArray;
import b2.w;
import b2.w0;
import b2.x;
import b2.x0;
import c3.f0;
import c3.i0;
import e2.k0;
import e2.m0;
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
    public i0[] J;
    public i0[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final z3.l f47101a;
    public final int f47102b;
    public final List f47103c;
    public final byte[] h;
    public final e2.x f47106i;
    public final k0 f47107j;
    public final e2.c f47112o;
    public final i0 f47113p;
    public final a6.i f47114q;
    public x1 f47115r;
    public int f47116s;
    public int f47117t;
    public long f47118u;
    public int v;
    public e2.x f47119w;
    public long f47120x;
    public int f47121y;
    public long f47122z;
    public final n3.b f47108k = new n3.b(0);
    public final e2.x f47109l = new e2.x(16);
    public final e2.x e = new e2.x(f2.p.f8892a);
    public final e2.x f47104f = new e2.x(6);
    public final e2.x f47105g = new e2.x();
    public final ArrayDeque f47110m = new ArrayDeque();
    public final ArrayDeque f47111n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        w wVar = new w();
        wVar.f2470r = w0.n("application/x-emsg");
        P = new x(wVar);
    }

    public h(z3.l lVar, int i10, k0 k0Var, List list, l2.n nVar) {
        this.f47101a = lVar;
        this.f47102b = i10;
        this.f47107j = k0Var;
        this.f47103c = DesugarCollections.unmodifiableList(list);
        this.f47113p = nVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.f47106i = new e2.x(bArr);
        l0 l0Var = n0.f8595b;
        this.f47115r = x1.e;
        this.A = -9223372036854775807L;
        this.f47122z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = c3.q.f4282i;
        this.J = new i0[0];
        this.K = new i0[0];
        this.f47112o = new e2.c(new e(this));
        this.f47114q = new a6.i(8);
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
            f2.d dVar = (f2.d) list.get(i10);
            if (dVar.f8844b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.f8842c.f8414a;
                j6.l i11 = p.i(bArr);
                if (i11 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) i11.f12877b;
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
        byte[] bArr = c.f47083a;
        if ((m10 & 1) == 0) {
            if ((m10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int E = xVar.E();
            if (E == 0) {
                Arrays.fill(sVar.f47182l, 0, sVar.e, false);
                return;
            }
            int i11 = sVar.e;
            e2.x xVar2 = sVar.f47184n;
            if (E == i11) {
                Arrays.fill(sVar.f47182l, 0, E, z10);
                xVar2.K(xVar.a());
                sVar.f47181k = true;
                sVar.f47185o = true;
                xVar.k(0, xVar2.f8416c, xVar2.f8414a);
                xVar2.N(0);
                sVar.f47185o = false;
                return;
            }
            StringBuilder l4 = i2.d.l(E, "Senc sample count ", " is different from fragment sample count");
            l4.append(sVar.e);
            throw x0.a(null, l4.toString());
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
        String str = m0.f8375a;
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
                throw x0.a(null, "Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(a02), new c3.j(iArr, jArr, jArr2, jArr3));
    }

    @Override
    public final boolean a(c3.p pVar) {
        x1 x1Var;
        f0 m10 = p.m(pVar, true, false);
        if (m10 != null) {
            x1Var = n0.y(m10);
        } else {
            l0 l0Var = n0.f8595b;
            x1Var = x1.e;
        }
        this.f47115r = x1Var;
        if (m10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(c3.q qVar) {
        int i10;
        int i11 = this.f47102b;
        if ((i11 & 32) == 0) {
            qVar = new c2.b(qVar, this.f47101a);
        }
        this.I = qVar;
        h();
        i0[] i0VarArr = new i0[2];
        this.J = i0VarArr;
        int i12 = 0;
        i0 i0Var = this.f47113p;
        if (i0Var != null) {
            i0VarArr[0] = i0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = 100;
        if ((i11 & 4) != 0) {
            i0VarArr[i10] = this.I.W(100, 5);
            i13 = 101;
            i10++;
        }
        i0[] i0VarArr2 = (i0[]) m0.U(i10, this.J);
        this.J = i0VarArr2;
        for (i0 i0Var2 : i0VarArr2) {
            i0Var2.b(P);
        }
        List list = this.f47103c;
        this.K = new i0[list.size()];
        while (i12 < this.K.length) {
            i0 W = this.I.W(i13, 3);
            W.b((x) list.get(i12));
            this.K[i12] = W;
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
        this.f47111n.clear();
        this.f47121y = 0;
        ((PriorityQueue) this.f47112o.e).clear();
        this.f47122z = j11;
        this.f47110m.clear();
        h();
    }

    @Override
    public final List e() {
        return this.f47115r;
    }

    @Override
    public final int f(c3.p r33, c3.s r34) {
        throw new UnsupportedOperationException("Method not decompiled: w3.h.f(c3.p, c3.s):int");
    }

    public final void h() {
        this.f47116s = 0;
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
