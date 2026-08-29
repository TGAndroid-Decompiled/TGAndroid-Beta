package w3;

import android.util.SparseArray;
import f5.c0;
import f5.d0;
import f5.w;
import j$.util.DesugarCollections;
import j3.s0;
import j3.t0;
import j3.t1;
import j7.l1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
public final class i implements o3.k {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final t0 I;
    public int A;
    public int B;
    public boolean C;
    public boolean G;
    public final int f49659a;
    public final List f49660b;
    public final byte[] f49664g;
    public final w h;
    public final c0 f49665i;
    public final o3.w f49670n;
    public int f49671o;
    public int f49672p;
    public long f49673q;
    public int f49674r;
    public w f49675s;
    public long f49676t;
    public int f49677u;
    public h f49680y;
    public int f49681z;
    public final ze.b f49666j = new ze.b(19, false);
    public final w f49667k = new w(16);
    public final w d = new w(f5.a.d);
    public final w f49662e = new w(5);
    public final w f49663f = new w();
    public final ArrayDeque f49668l = new ArrayDeque();
    public final ArrayDeque f49669m = new ArrayDeque();
    public final SparseArray f49661c = new SparseArray();
    public long f49678w = -9223372036854775807L;
    public long v = -9223372036854775807L;
    public long f49679x = -9223372036854775807L;
    public o3.m D = o3.m.f19102u;
    public o3.w[] E = new o3.w[0];
    public o3.w[] F = new o3.w[0];

    static {
        s0 s0Var = new s0();
        s0Var.f10742o = "application/x-emsg";
        I = new t0(s0Var);
    }

    public i(int i10, c0 c0Var, List list, o4.o oVar) {
        this.f49659a = i10;
        this.f49665i = c0Var;
        this.f49660b = DesugarCollections.unmodifiableList(list);
        this.f49670n = oVar;
        byte[] bArr = new byte[16];
        this.f49664g = bArr;
        this.h = new w(bArr);
    }

    public static n3.c a(List list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) list.get(i10);
            if (bVar.f17285b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f49634c.f6640a;
                o1.a e10 = j.e(bArr);
                if (e10 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) e10.f19014b;
                }
                if (uuid == null) {
                    f5.a.K("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new n3.b(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new n3.c(null, false, (n3.b[]) arrayList.toArray(new n3.b[0]));
    }

    public static void b(w wVar, int i10, q qVar) {
        boolean z10;
        wVar.C(i10 + 8);
        int e10 = wVar.e();
        if ((e10 & 1) == 0) {
            if ((e10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int u10 = wVar.u();
            if (u10 == 0) {
                Arrays.fill(qVar.f49735l, 0, qVar.f49729e, false);
                return;
            }
            int i11 = qVar.f49729e;
            w wVar2 = qVar.f49737n;
            if (u10 == i11) {
                Arrays.fill(qVar.f49735l, 0, u10, z10);
                wVar2.z(wVar.a());
                qVar.f49734k = true;
                qVar.f49738o = true;
                wVar.c(0, wVar2.f6642c, wVar2.f6640a);
                wVar2.C(0);
                qVar.f49738o = false;
                return;
            }
            StringBuilder o10 = l1.o(u10, "Senc sample count ", " is different from fragment sample count");
            o10.append(qVar.f49729e);
            throw t1.a(o10.toString(), null);
        }
        throw t1.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public final void c(long r52) {
        throw new UnsupportedOperationException("Method not decompiled: w3.i.c(long):void");
    }

    @Override
    public final int d(o3.l r34, o3.n r35) {
        throw new UnsupportedOperationException("Method not decompiled: w3.i.d(o3.l, o3.n):int");
    }

    @Override
    public final boolean e(o3.l lVar) {
        return j.i(lVar, true, false);
    }

    @Override
    public final void f(long j10, long j11) {
        SparseArray sparseArray = this.f49661c;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h) sparseArray.valueAt(i10)).d();
        }
        this.f49669m.clear();
        this.f49677u = 0;
        this.v = j11;
        this.f49668l.clear();
        this.f49671o = 0;
        this.f49674r = 0;
    }

    @Override
    public final void i(o3.m mVar) {
        int i10;
        this.D = mVar;
        int i11 = 0;
        this.f49671o = 0;
        this.f49674r = 0;
        o3.w[] wVarArr = new o3.w[2];
        this.E = wVarArr;
        o3.w wVar = this.f49670n;
        if (wVar != null) {
            wVarArr[0] = wVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f49659a & 4) != 0) {
            wVarArr[i10] = mVar.Z1(100, 5);
            i12 = 101;
            i10++;
        }
        o3.w[] wVarArr2 = (o3.w[]) d0.J(i10, this.E);
        this.E = wVarArr2;
        for (o3.w wVar2 : wVarArr2) {
            wVar2.b(I);
        }
        List list = this.f49660b;
        this.F = new o3.w[list.size()];
        while (i11 < this.F.length) {
            o3.w Z1 = this.D.Z1(i12, 3);
            Z1.b((t0) list.get(i11));
            this.F[i11] = Z1;
            i11++;
            i12++;
        }
    }

    @Override
    public final void release() {
    }
}
