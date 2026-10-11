package v2;

import android.util.SparseArray;
import c3.b0;
import c3.h0;
import c3.o;
import c3.q;
import c3.s;
import n7.z0;
public final class d implements q {
    public static final s f49129s = new Object();
    public final o f49130a;
    public final int f49131b;
    public final b2.s f49132c;
    public final SparseArray d = new SparseArray();
    public boolean f49133e;
    public z0 f49134f;
    public long h;
    public b0 f49135n;
    public b2.s[] f49136r;

    public d(o oVar, int i10, b2.s sVar) {
        this.f49130a = oVar;
        this.f49131b = i10;
        this.f49132c = sVar;
    }

    public final void a(z0 z0Var, long j3, long j10) {
        this.f49134f = z0Var;
        this.h = j10;
        boolean z10 = this.f49133e;
        o oVar = this.f49130a;
        if (!z10) {
            oVar.g(this);
            if (j3 != -9223372036854775807L) {
                oVar.h(0L, j3);
            }
            this.f49133e = true;
            return;
        }
        if (j3 == -9223372036854775807L) {
            j3 = 0;
        }
        oVar.h(0L, j3);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i10 < sparseArray.size()) {
                c cVar = (c) sparseArray.valueAt(i10);
                if (z0Var == null) {
                    cVar.f49127e = cVar.f49126c;
                } else {
                    cVar.f49128f = j10;
                    h0 D = z0Var.D(cVar.f49124a);
                    cVar.f49127e = D;
                    b2.s sVar = cVar.d;
                    if (sVar != null) {
                        D.b(sVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d2(b0 b0Var) {
        this.f49135n = b0Var;
    }

    @Override
    public final h0 f2(int i10, int i11) {
        boolean z10;
        b2.s sVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f49136r == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (i11 == this.f49131b) {
                sVar = this.f49132c;
            } else {
                sVar = null;
            }
            cVar = new c(i10, i11, sVar);
            z0 z0Var = this.f49134f;
            long j3 = this.h;
            if (z0Var == null) {
                cVar.f49127e = cVar.f49126c;
            } else {
                cVar.f49128f = j3;
                h0 D = z0Var.D(i11);
                cVar.f49127e = D;
                b2.s sVar2 = cVar.d;
                if (sVar2 != null) {
                    D.b(sVar2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    @Override
    public final void k1() {
        SparseArray sparseArray = this.d;
        b2.s[] sVarArr = new b2.s[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            b2.s sVar = ((c) sparseArray.valueAt(i10)).d;
            e2.d.h(sVar);
            sVarArr[i10] = sVar;
        }
        this.f49136r = sVarArr;
    }
}
