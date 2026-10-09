package w3;

import android.util.Pair;
import android.util.SparseArray;
import b2.r0;
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
import n4.x;
public final class j implements c3.o {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final b2.s P;
    public long A;
    public long B;
    public i C;
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
    public final z3.k f49787a;
    public final int f49788b;
    public final List f49789c;
    public final byte[] h;
    public final v f49793i;
    public final b0 f49794j;
    public final e2.c f49799o;
    public final h0 f49800p;
    public final xa.d f49801q;
    public a1 f49802r;
    public int f49803s;
    public int f49804t;
    public long f49805u;
    public int v;
    public v f49806w;
    public long f49807x;
    public int f49808y;
    public long f49809z;
    public final x f49795k = new x(28);
    public final v f49796l = new v(16);
    public final v f49790e = new v(f2.p.f9617a);
    public final v f49791f = new v(6);
    public final v f49792g = new v();
    public final ArrayDeque f49797m = new ArrayDeque();
    public final ArrayDeque f49798n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        b2.r rVar = new b2.r();
        rVar.f3585q = r0.n("application/x-emsg");
        P = new b2.s(rVar);
    }

    public j(z3.k kVar, int i10, b0 b0Var, List list, l2.o oVar) {
        this.f49787a = kVar;
        this.f49788b = i10;
        this.f49794j = b0Var;
        this.f49789c = DesugarCollections.unmodifiableList(list);
        this.f49800p = oVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.f49793i = new v(bArr);
        g0 g0Var = i0.f8752b;
        this.f49802r = a1.f8715e;
        this.A = -9223372036854775807L;
        this.f49809z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = c3.q.f4149m;
        this.J = new h0[0];
        this.K = new h0[0];
        this.f49799o = new e2.c(new g(this));
        this.f49801q = new xa.d(7);
        this.N = -1L;
    }

    public static b2.o d(List list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            f2.e eVar = (f2.e) list.get(i10);
            if (eVar.f8881b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = eVar.f9565c.f8584a;
                j6.l j3 = p.j(bArr);
                if (j3 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) j3.f14062b;
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

    public static void e(v vVar, int i10, s sVar) {
        boolean z10;
        vVar.J(i10 + 8);
        int j3 = vVar.j();
        byte[] bArr = e.f49768a;
        if ((j3 & 1) == 0) {
            if ((j3 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int B = vVar.B();
            if (B == 0) {
                Arrays.fill(sVar.f49870l, 0, sVar.f49864e, false);
                return;
            }
            int i11 = sVar.f49864e;
            v vVar2 = sVar.f49872n;
            if (B == i11) {
                Arrays.fill(sVar.f49870l, 0, B, z10);
                vVar2.G(vVar.a());
                sVar.f49869k = true;
                sVar.f49873o = true;
                vVar.h(0, vVar2.f8586c, vVar2.f8584a);
                vVar2.J(0);
                sVar.f49873o = false;
                return;
            }
            StringBuilder j10 = hg.c.j(B, "Senc sample count ", " is different from fragment sample count");
            j10.append(sVar.f49864e);
            throw s0.a(null, j10.toString());
        }
        throw s0.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair f(long j3, v vVar) {
        long C;
        long C2;
        v vVar2 = vVar;
        vVar2.J(8);
        int e7 = e.e(vVar2.j());
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
        String str = d0.f8532a;
        long X = d0.X(C, 1000000L, z10, RoundingMode.DOWN);
        vVar2.K(2);
        int D = vVar2.D();
        int[] iArr = new int[D];
        long[] jArr = new long[D];
        long[] jArr2 = new long[D];
        long[] jArr3 = new long[D];
        long j11 = j10;
        long j12 = X;
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
                long X2 = d0.X(C, 1000000L, z10, RoundingMode.DOWN);
                jArr4[i10] = X2 - jArr5[i10];
                vVar2.K(4);
                j11 += iArr[i10];
                i10++;
                D = D;
                vVar2 = vVar;
                j12 = X2;
                jArr2 = jArr4;
                jArr3 = jArr5;
            } else {
                throw s0.a(null, "Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(X), new c3.j(iArr, jArr, jArr2, jArr3));
    }

    @Override
    public final boolean a(c3.p pVar) {
        a1 a1Var;
        f0 n10 = p.n(pVar, true, false);
        if (n10 != null) {
            a1Var = i0.z(n10);
        } else {
            g0 g0Var = i0.f8752b;
            a1Var = a1.f8715e;
        }
        this.f49802r = a1Var;
        if (n10 == null) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.f49803s = 0;
        this.v = 0;
    }

    @Override
    public final void g(c3.q qVar) {
        int i10;
        int i11 = this.f49788b;
        if ((i11 & 32) == 0) {
            qVar = new com.google.firebase.messaging.m(qVar, this.f49787a);
        }
        this.I = qVar;
        b();
        h0[] h0VarArr = new h0[2];
        this.J = h0VarArr;
        int i12 = 0;
        h0 h0Var = this.f49800p;
        if (h0Var != null) {
            h0VarArr[0] = h0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = 100;
        if ((i11 & 4) != 0) {
            h0VarArr[i10] = this.I.f2(100, 5);
            i13 = 101;
            i10++;
        }
        h0[] h0VarArr2 = (h0[]) d0.R(i10, this.J);
        this.J = h0VarArr2;
        for (h0 h0Var2 : h0VarArr2) {
            h0Var2.b(P);
        }
        List list = this.f49789c;
        this.K = new h0[list.size()];
        while (i12 < this.K.length) {
            h0 f22 = this.I.f2(i13, 3);
            f22.b((b2.s) list.get(i12));
            this.K[i12] = f22;
            i12++;
            i13++;
        }
    }

    @Override
    public final void h(long j3, long j10) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i) sparseArray.valueAt(i10)).e();
        }
        this.f49798n.clear();
        this.f49808y = 0;
        ((PriorityQueue) this.f49799o.f8529e).clear();
        this.f49809z = j10;
        this.f49797m.clear();
        b();
    }

    @Override
    public final List i() {
        return this.f49802r;
    }

    public final void j(long r54) {
        throw new UnsupportedOperationException("Method not decompiled: w3.j.j(long):void");
    }

    @Override
    public final int m(c3.p r33, c3.s r34) {
        throw new UnsupportedOperationException("Method not decompiled: w3.j.m(c3.p, c3.s):int");
    }

    @Override
    public final c3.o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
