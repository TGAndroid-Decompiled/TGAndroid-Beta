package w3;

import android.util.Pair;
import android.util.SparseArray;
import b2.r0;
import b2.s;
import b2.s0;
import c3.f0;
import c3.h0;
import e2.b0;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
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
    public static final s P;
    public long A;
    public long B;
    public g C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public c3.q I;
    public h0[] J;
    public h0[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final z3.k f43463a;
    public final int f43464b;
    public final List f43465c;
    public final byte[] h;
    public final v f43468i;
    public final b0 f43469j;
    public final e2.c f43474o;
    public final h0 f43475p;
    public final b0.b f43476q;
    public a1 f43477r;
    public int f43478s;
    public int f43479t;
    public long f43480u;
    public int v;
    public v f43481w;
    public long f43482x;
    public int f43483y;
    public long f43484z;
    public final of.b f43470k = new of.b(26);
    public final v f43471l = new v(16);
    public final v e = new v(f2.o.f7732a);
    public final v f43466f = new v(6);
    public final v f43467g = new v();
    public final ArrayDeque f43472m = new ArrayDeque();
    public final ArrayDeque f43473n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        b2.r rVar = new b2.r();
        rVar.f1946q = r0.n("application/x-emsg");
        P = new s(rVar);
    }

    public h(z3.k kVar, int i10, b0 b0Var, List list, l2.p pVar) {
        this.f43463a = kVar;
        this.f43464b = i10;
        this.f43469j = b0Var;
        this.f43465c = DesugarCollections.unmodifiableList(list);
        this.f43475p = pVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.f43468i = new v(bArr);
        g0 g0Var = i0.f7384b;
        this.f43477r = a1.e;
        this.A = -9223372036854775807L;
        this.f43484z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = c3.q.f4211p;
        this.J = new h0[0];
        this.K = new h0[0];
        this.f43474o = new e2.c(new e(this));
        this.f43476q = new b0.b(1);
        this.N = -1L;
    }

    public static b2.o d(List list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            f2.d dVar = (f2.d) list.get(i10);
            if (dVar.f6465b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.f7684c.f7234a;
                j6.l j3 = n.j(bArr);
                if (j3 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) j3.f11802b;
                }
                if (uuid == null) {
                    e2.a.n("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new b2.n(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new b2.o(null, false, (b2.n[]) arrayList.toArray(new b2.n[0]));
    }

    public static void e(v vVar, int i10, q qVar) {
        boolean z10;
        vVar.J(i10 + 8);
        int j3 = vVar.j();
        byte[] bArr = c.f43445a;
        if ((j3 & 1) == 0) {
            if ((j3 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int B = vVar.B();
            if (B == 0) {
                Arrays.fill(qVar.f43539l, 0, qVar.e, false);
                return;
            }
            int i11 = qVar.e;
            v vVar2 = qVar.f43541n;
            if (B == i11) {
                Arrays.fill(qVar.f43539l, 0, B, z10);
                vVar2.G(vVar.a());
                qVar.f43538k = true;
                qVar.f43542o = true;
                vVar.h(0, vVar2.f7236c, vVar2.f7234a);
                vVar2.J(0);
                qVar.f43542o = false;
                return;
            }
            StringBuilder m10 = hc.b.m(B, "Senc sample count ", " is different from fragment sample count");
            m10.append(qVar.e);
            throw s0.a(null, m10.toString());
        }
        throw s0.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair f(long j3, v vVar) {
        long C;
        long C2;
        v vVar2 = vVar;
        vVar2.J(8);
        int e = c.e(vVar2.j());
        vVar2.K(4);
        long z10 = vVar2.z();
        if (e == 0) {
            C = vVar2.z();
            C2 = vVar2.z();
        } else {
            C = vVar2.C();
            C2 = vVar2.C();
        }
        long j10 = C2 + j3;
        String str = d0.f7188a;
        long Y = d0.Y(C, 1000000L, z10, RoundingMode.DOWN);
        vVar2.K(2);
        int D = vVar2.D();
        int[] iArr = new int[D];
        long[] jArr = new long[D];
        long[] jArr2 = new long[D];
        long[] jArr3 = new long[D];
        long j11 = j10;
        long j12 = Y;
        int i10 = 0;
        while (i10 < D) {
            int j13 = vVar2.j();
            if ((Integer.MIN_VALUE & j13) == 0) {
                long z11 = vVar2.z();
                iArr[i10] = j13 & Integer.MAX_VALUE;
                jArr[i10] = j11;
                jArr3[i10] = j12;
                C += z11;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                long Y2 = d0.Y(C, 1000000L, z10, RoundingMode.DOWN);
                jArr4[i10] = Y2 - jArr5[i10];
                vVar2.K(4);
                j11 += iArr[i10];
                i10++;
                D = D;
                vVar2 = vVar;
                j12 = Y2;
                jArr2 = jArr4;
                jArr3 = jArr5;
            } else {
                throw s0.a(null, "Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(Y), new c3.j(iArr, jArr, jArr2, jArr3));
    }

    public final void a() {
        this.f43478s = 0;
        this.v = 0;
    }

    @Override
    public final boolean b(c3.p pVar) {
        a1 a1Var;
        f0 n10 = n.n(pVar, true, false);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f7384b;
            a1Var = a1.e;
        }
        this.f43477r = a1Var;
        if (n10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void g(c3.q qVar) {
        int i10;
        int i11 = this.f43464b;
        if ((i11 & 32) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f43463a);
        }
        this.I = qVar;
        a();
        h0[] h0VarArr = new h0[2];
        this.J = h0VarArr;
        int i12 = 0;
        h0 h0Var = this.f43475p;
        if (h0Var != null) {
            h0VarArr[0] = h0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = 100;
        if ((i11 & 4) != 0) {
            h0VarArr[i10] = this.I.I(100, 5);
            i13 = 101;
            i10++;
        }
        h0[] h0VarArr2 = (h0[]) d0.S(i10, this.J);
        this.J = h0VarArr2;
        for (h0 h0Var2 : h0VarArr2) {
            h0Var2.b(P);
        }
        List list = this.f43465c;
        this.K = new h0[list.size()];
        while (i12 < this.K.length) {
            h0 I = this.I.I(i13, 3);
            I.b((s) list.get(i12));
            this.K[i12] = I;
            i12++;
            i13++;
        }
    }

    @Override
    public final void h(long j3, long j10) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) sparseArray.valueAt(i10)).e();
        }
        this.f43473n.clear();
        this.f43483y = 0;
        ((PriorityQueue) this.f43474o.e).clear();
        this.f43484z = j10;
        this.f43472m.clear();
        a();
    }

    @Override
    public final List i() {
        return this.f43477r;
    }

    public final void j(long r54) {
        throw new UnsupportedOperationException("Method not decompiled: w3.h.j(long):void");
    }

    @Override
    public final int m(c3.p r33, c3.s r34) {
        throw new UnsupportedOperationException("Method not decompiled: w3.h.m(c3.p, c3.s):int");
    }

    @Override
    public final c3.o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
