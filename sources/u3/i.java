package u3;

import android.util.SparseArray;
import d5.e0;
import d5.f0;
import d5.y;
import h3.s0;
import h3.t0;
import h3.t1;
import j$.util.DesugarCollections;
import j3.r0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import m3.w;
public final class i implements m3.k {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final t0 I;
    public int A;
    public int B;
    public boolean C;
    public boolean G;
    public final int f48000a;
    public final List f48001b;
    public final byte[] f48005g;
    public final y h;
    public final e0 f48006i;
    public final w f48011n;
    public int f48012o;
    public int f48013p;
    public long f48014q;
    public int f48015r;
    public y f48016s;
    public long f48017t;
    public int f48018u;
    public h f48021y;
    public int f48022z;
    public final we.b f48007j = new we.b(6, (byte) 0);
    public final y f48008k = new y(16);
    public final y d = new y(d5.a.d);
    public final y f48003e = new y(5);
    public final y f48004f = new y();
    public final ArrayDeque f48009l = new ArrayDeque();
    public final ArrayDeque f48010m = new ArrayDeque();
    public final SparseArray f48002c = new SparseArray();
    public long f48019w = -9223372036854775807L;
    public long v = -9223372036854775807L;
    public long f48020x = -9223372036854775807L;
    public m3.m D = m3.m.f17243t;
    public w[] E = new w[0];
    public w[] F = new w[0];

    static {
        s0 s0Var = new s0();
        s0Var.f9705o = "application/x-emsg";
        I = new t0(s0Var);
    }

    public i(int i9, e0 e0Var, List list, m4.n nVar) {
        this.f48000a = i9;
        this.f48006i = e0Var;
        this.f48001b = DesugarCollections.unmodifiableList(list);
        this.f48011n = nVar;
        byte[] bArr = new byte[16];
        this.f48005g = bArr;
        this.h = new y(bArr);
    }

    public static l3.c a(List list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            b bVar = (b) list.get(i9);
            if (bVar.f16818b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f47975c.f4410a;
                n5.e0 e10 = j.e(bArr);
                if (e10 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) e10.f18488b;
                }
                if (uuid == null) {
                    d5.a.K("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new l3.b(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new l3.c(null, false, (l3.b[]) arrayList.toArray(new l3.b[0]));
    }

    public static void d(y yVar, int i9, q qVar) {
        boolean z10;
        yVar.C(i9 + 8);
        int e10 = yVar.e();
        if ((e10 & 1) == 0) {
            if ((e10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int u10 = yVar.u();
            if (u10 == 0) {
                Arrays.fill(qVar.f48076l, 0, qVar.f48070e, false);
                return;
            }
            int i10 = qVar.f48070e;
            y yVar2 = qVar.f48078n;
            if (u10 == i10) {
                Arrays.fill(qVar.f48076l, 0, u10, z10);
                yVar2.z(yVar.a());
                qVar.f48075k = true;
                qVar.f48079o = true;
                yVar.c(0, yVar2.f4412c, yVar2.f4410a);
                yVar2.C(0);
                qVar.f48079o = false;
                return;
            }
            StringBuilder p6 = r0.p(u10, "Senc sample count ", " is different from fragment sample count");
            p6.append(qVar.f48070e);
            throw t1.a(p6.toString(), null);
        }
        throw t1.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override
    public final int b(m3.l r34, m3.n r35) {
        throw new UnsupportedOperationException("Method not decompiled: u3.i.b(m3.l, m3.n):int");
    }

    @Override
    public final void c(m3.m mVar) {
        int i9;
        this.D = mVar;
        int i10 = 0;
        this.f48012o = 0;
        this.f48015r = 0;
        w[] wVarArr = new w[2];
        this.E = wVarArr;
        w wVar = this.f48011n;
        if (wVar != null) {
            wVarArr[0] = wVar;
            i9 = 1;
        } else {
            i9 = 0;
        }
        int i11 = 100;
        if ((this.f48000a & 4) != 0) {
            wVarArr[i9] = mVar.I(100, 5);
            i11 = 101;
            i9++;
        }
        w[] wVarArr2 = (w[]) f0.J(i9, this.E);
        this.E = wVarArr2;
        for (w wVar2 : wVarArr2) {
            wVar2.c(I);
        }
        List list = this.f48001b;
        this.F = new w[list.size()];
        while (i10 < this.F.length) {
            w I2 = this.D.I(i11, 3);
            I2.c((t0) list.get(i10));
            this.F[i10] = I2;
            i10++;
            i11++;
        }
    }

    public final void e(long r51) {
        throw new UnsupportedOperationException("Method not decompiled: u3.i.e(long):void");
    }

    @Override
    public final boolean f(m3.l lVar) {
        return j.i(lVar, true, false);
    }

    @Override
    public final void g(long j10, long j11) {
        SparseArray sparseArray = this.f48002c;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((h) sparseArray.valueAt(i9)).d();
        }
        this.f48010m.clear();
        this.f48018u = 0;
        this.v = j11;
        this.f48009l.clear();
        this.f48012o = 0;
        this.f48015r = 0;
    }

    @Override
    public final void release() {
    }
}
