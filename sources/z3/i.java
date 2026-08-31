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
import r3.v;
public final class i implements r3.k {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final n0 I;
    public int A;
    public int B;
    public boolean C;
    public boolean G;
    public final int f50993a;
    public final List f50994b;
    public final byte[] f50998g;
    public final w h;
    public final c0 f50999i;
    public final v f51004n;
    public int f51005o;
    public int f51006p;
    public long f51007q;
    public int f51008r;
    public w f51009s;
    public long f51010t;
    public int f51011u;
    public h f51014y;
    public int f51015z;
    public final f7.b f51000j = new f7.b(3, (byte) 0);
    public final w f51001k = new w(16);
    public final w d = new w(h5.a.d);
    public final w f50996e = new w(5);
    public final w f50997f = new w();
    public final ArrayDeque f51002l = new ArrayDeque();
    public final ArrayDeque f51003m = new ArrayDeque();
    public final SparseArray f50995c = new SparseArray();
    public long f51012w = -9223372036854775807L;
    public long v = -9223372036854775807L;
    public long f51013x = -9223372036854775807L;
    public r3.m D = r3.m.A;
    public v[] E = new v[0];
    public v[] F = new v[0];

    static {
        m0 m0Var = new m0();
        m0Var.f9265o = "application/x-emsg";
        I = new n0(m0Var);
    }

    public i(int i10, c0 c0Var, List list, r4.n nVar) {
        this.f50993a = i10;
        this.f50999i = c0Var;
        this.f50994b = DesugarCollections.unmodifiableList(list);
        this.f51004n = nVar;
        byte[] bArr = new byte[16];
        this.f50998g = bArr;
        this.h = new w(bArr);
    }

    public static o3.g a(List list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) list.get(i10);
            if (bVar.f15193b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f50968c.f7308a;
                e0 e6 = j.e(bArr);
                if (e6 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) e6.f1475c;
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
                Arrays.fill(rVar.f51070l, 0, rVar.f51064e, false);
                return;
            }
            int i11 = rVar.f51064e;
            w wVar2 = rVar.f51072n;
            if (x10 == i11) {
                Arrays.fill(rVar.f51070l, 0, x10, z4);
                wVar2.C(wVar.a());
                rVar.f51069k = true;
                rVar.f51073o = true;
                wVar.e(0, wVar2.f7310c, wVar2.f7308a);
                wVar2.F(0);
                rVar.f51073o = false;
                return;
            }
            StringBuilder m9 = l.d.m(x10, "Senc sample count ", " is different from fragment sample count");
            m9.append(rVar.f51064e);
            throw r1.a(m9.toString(), null);
        }
        throw r1.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public final void c(long r51) {
        throw new UnsupportedOperationException("Method not decompiled: z3.i.c(long):void");
    }

    @Override
    public final void d(long j10, long j11) {
        SparseArray sparseArray = this.f50995c;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h) sparseArray.valueAt(i10)).d();
        }
        this.f51003m.clear();
        this.f51011u = 0;
        this.v = j11;
        this.f51002l.clear();
        this.f51005o = 0;
        this.f51008r = 0;
    }

    @Override
    public final void e(r3.m mVar) {
        int i10;
        this.D = mVar;
        int i11 = 0;
        this.f51005o = 0;
        this.f51008r = 0;
        v[] vVarArr = new v[2];
        this.E = vVarArr;
        v vVar = this.f51004n;
        if (vVar != null) {
            vVarArr[0] = vVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f50993a & 4) != 0) {
            vVarArr[i10] = mVar.i2(100, 5);
            i12 = 101;
            i10++;
        }
        v[] vVarArr2 = (v[]) d0.I(i10, this.E);
        this.E = vVarArr2;
        for (v vVar2 : vVarArr2) {
            vVar2.b(I);
        }
        List list = this.f50994b;
        this.F = new v[list.size()];
        while (i11 < this.F.length) {
            v i22 = this.D.i2(i12, 3);
            i22.b((n0) list.get(i11));
            this.F[i11] = i22;
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
