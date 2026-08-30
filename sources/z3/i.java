package z3;

import android.util.SparseArray;
import b4.e0;
import h5.c0;
import h5.d0;
import h5.w;
import j$.util.DesugarCollections;
import j3.m0;
import j3.n0;
import j3.r1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kh.a2;
import r3.v;
public final class i implements r3.k {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final n0 I;
    public int A;
    public int B;
    public boolean C;
    public boolean G;
    public final int f47302a;
    public final List f47303b;
    public final byte[] f47306g;
    public final w h;
    public final c0 f47307i;
    public final v f47312n;
    public int f47313o;
    public int f47314p;
    public long f47315q;
    public int f47316r;
    public w f47317s;
    public long f47318t;
    public int f47319u;
    public h f47322y;
    public int f47323z;
    public final f7.b f47308j = new f7.b(3, (byte) 0);
    public final w f47309k = new w(16);
    public final w d = new w(h5.a.d);
    public final w e = new w(5);
    public final w f47305f = new w();
    public final ArrayDeque f47310l = new ArrayDeque();
    public final ArrayDeque f47311m = new ArrayDeque();
    public final SparseArray f47304c = new SparseArray();
    public long f47320w = -9223372036854775807L;
    public long v = -9223372036854775807L;
    public long f47321x = -9223372036854775807L;
    public r3.m D = r3.m.A;
    public v[] E = new v[0];
    public v[] F = new v[0];

    static {
        m0 m0Var = new m0();
        m0Var.f8684o = "application/x-emsg";
        I = new n0(m0Var);
    }

    public i(int i10, c0 c0Var, List list, r4.n nVar) {
        this.f47302a = i10;
        this.f47307i = c0Var;
        this.f47303b = DesugarCollections.unmodifiableList(list);
        this.f47312n = nVar;
        byte[] bArr = new byte[16];
        this.f47306g = bArr;
        this.h = new w(bArr);
    }

    public static o3.g a(List list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) list.get(i10);
            if (bVar.f14222b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f47279c.f7000a;
                e0 e = j.e(bArr);
                if (e == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) e.f1368c;
                }
                if (uuid == null) {
                    h5.a.K("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new o3.f(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new o3.g(null, false, (o3.f[]) arrayList.toArray(new o3.f[0]));
    }

    public static void b(w wVar, int i10, r rVar) {
        boolean z4;
        wVar.F(i10 + 8);
        int g10 = wVar.g();
        if ((g10 & 1) == 0) {
            if ((g10 & 2) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int x10 = wVar.x();
            if (x10 == 0) {
                Arrays.fill(rVar.f47371l, 0, rVar.e, false);
                return;
            }
            int i11 = rVar.e;
            w wVar2 = rVar.f47373n;
            if (x10 == i11) {
                Arrays.fill(rVar.f47371l, 0, x10, z4);
                wVar2.C(wVar.a());
                rVar.f47370k = true;
                rVar.f47374o = true;
                wVar.e(0, wVar2.f7002c, wVar2.f7000a);
                wVar2.F(0);
                rVar.f47374o = false;
                return;
            }
            StringBuilder m9 = a2.m(x10, "Senc sample count ", " is different from fragment sample count");
            m9.append(rVar.e);
            throw r1.a(m9.toString(), null);
        }
        throw r1.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public final void c(long r51) {
        throw new UnsupportedOperationException("Method not decompiled: z3.i.c(long):void");
    }

    @Override
    public final void d(long j10, long j11) {
        SparseArray sparseArray = this.f47304c;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h) sparseArray.valueAt(i10)).d();
        }
        this.f47311m.clear();
        this.f47319u = 0;
        this.v = j11;
        this.f47310l.clear();
        this.f47313o = 0;
        this.f47316r = 0;
    }

    @Override
    public final void e(r3.m mVar) {
        int i10;
        this.D = mVar;
        int i11 = 0;
        this.f47313o = 0;
        this.f47316r = 0;
        v[] vVarArr = new v[2];
        this.E = vVarArr;
        v vVar = this.f47312n;
        if (vVar != null) {
            vVarArr[0] = vVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f47302a & 4) != 0) {
            vVarArr[i10] = mVar.c2(100, 5);
            i12 = 101;
            i10++;
        }
        v[] vVarArr2 = (v[]) d0.I(i10, this.E);
        this.E = vVarArr2;
        for (v vVar2 : vVarArr2) {
            vVar2.b(I);
        }
        List list = this.f47303b;
        this.F = new v[list.size()];
        while (i11 < this.F.length) {
            v c22 = this.D.c2(i12, 3);
            c22.b((n0) list.get(i11));
            this.F[i11] = c22;
            i11++;
            i12++;
        }
    }

    @Override
    public final int h(r3.l r34, org.telegram.ui.Components.jb r35) {
        throw new UnsupportedOperationException("Method not decompiled: z3.i.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(r3.l lVar) {
        return j.j(lVar, true, false);
    }

    @Override
    public final void release() {
    }
}
