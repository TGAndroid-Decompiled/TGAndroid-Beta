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
import n4.y;
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
    public final z3.k f47942a;
    public final int f47943b;
    public final List f47944c;
    public final byte[] h;
    public final v f47948i;
    public final b0 f47949j;
    public final e2.c f47954o;
    public final h0 f47955p;
    public final a4.m f47956q;
    public a1 f47957r;
    public int f47958s;
    public int f47959t;
    public long f47960u;
    public int v;
    public v f47961w;
    public long f47962x;
    public int f47963y;
    public long f47964z;
    public final y f47950k = new y(27);
    public final v f47951l = new v(16);
    public final v f47945e = new v(f2.p.f9229a);
    public final v f47946f = new v(6);
    public final v f47947g = new v();
    public final ArrayDeque f47952m = new ArrayDeque();
    public final ArrayDeque f47953n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        b2.r rVar = new b2.r();
        rVar.f2312q = r0.n("application/x-emsg");
        P = new s(rVar);
    }

    public h(z3.k kVar, int i10, b0 b0Var, List list, l2.n nVar) {
        this.f47942a = kVar;
        this.f47943b = i10;
        this.f47949j = b0Var;
        this.f47944c = DesugarCollections.unmodifiableList(list);
        this.f47955p = nVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.f47948i = new v(bArr);
        g0 g0Var = i0.f8957b;
        this.f47957r = a1.f8920e;
        this.A = -9223372036854775807L;
        this.f47964z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = c3.q.f4293m;
        this.J = new h0[0];
        this.K = new h0[0];
        this.f47954o = new e2.c(new e(this));
        this.f47956q = new a4.m(8);
        this.N = -1L;
    }

    public static b2.o d(List list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            f2.e eVar = (f2.e) list.get(i10);
            if (eVar.f6773b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = eVar.f9177c.f8789a;
                j6.l j3 = n.j(bArr);
                if (j3 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) j3.f13551b;
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
        byte[] bArr = c.f47923a;
        if ((j3 & 1) == 0) {
            if ((j3 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int B = vVar.B();
            if (B == 0) {
                Arrays.fill(qVar.f48025l, 0, qVar.f48019e, false);
                return;
            }
            int i11 = qVar.f48019e;
            v vVar2 = qVar.f48027n;
            if (B == i11) {
                Arrays.fill(qVar.f48025l, 0, B, z10);
                vVar2.G(vVar.a());
                qVar.f48024k = true;
                qVar.f48028o = true;
                vVar.h(0, vVar2.f8791c, vVar2.f8789a);
                vVar2.J(0);
                qVar.f48028o = false;
                return;
            }
            StringBuilder l4 = i2.g.l(B, "Senc sample count ", " is different from fragment sample count");
            l4.append(qVar.f48019e);
            throw s0.a(null, l4.toString());
        }
        throw s0.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair f(long j3, v vVar) {
        long C;
        long C2;
        v vVar2 = vVar;
        vVar2.J(8);
        int e7 = c.e(vVar2.j());
        vVar2.K(4);
        long z10 = vVar2.z();
        if (e7 == 0) {
            C = vVar2.z();
            C2 = vVar2.z();
        } else {
            C = vVar2.C();
            C2 = vVar2.C();
        }
        long j10 = C2 + j3;
        String str = d0.f8737a;
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
        this.f47958s = 0;
        this.v = 0;
    }

    @Override
    public final boolean b(c3.p pVar) {
        a1 a1Var;
        f0 n10 = n.n(pVar, true, false);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8957b;
            a1Var = a1.f8920e;
        }
        this.f47957r = a1Var;
        if (n10 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void g(c3.q qVar) {
        int i10;
        int i11 = this.f47943b;
        if ((i11 & 32) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f47942a);
        }
        this.I = qVar;
        a();
        h0[] h0VarArr = new h0[2];
        this.J = h0VarArr;
        int i12 = 0;
        h0 h0Var = this.f47955p;
        if (h0Var != null) {
            h0VarArr[0] = h0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = 100;
        if ((i11 & 4) != 0) {
            h0VarArr[i10] = this.I.R1(100, 5);
            i13 = 101;
            i10++;
        }
        h0[] h0VarArr2 = (h0[]) d0.S(i10, this.J);
        this.J = h0VarArr2;
        for (h0 h0Var2 : h0VarArr2) {
            h0Var2.b(P);
        }
        List list = this.f47944c;
        this.K = new h0[list.size()];
        while (i12 < this.K.length) {
            h0 R1 = this.I.R1(i13, 3);
            R1.b((s) list.get(i12));
            this.K[i12] = R1;
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
        this.f47953n.clear();
        this.f47963y = 0;
        ((PriorityQueue) this.f47954o.f8734e).clear();
        this.f47964z = j10;
        this.f47952m.clear();
        a();
    }

    @Override
    public final List i() {
        return this.f47957r;
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
