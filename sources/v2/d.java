package v2;

import android.util.SparseArray;
import c3.b0;
import c3.h0;
import c3.o;
import c3.q;
import c3.s;
import n7.z0;
public final class d implements q {
    public static final s f49278s = new Object();
    public final o f49279a;
    public final int f49280b;
    public final b2.s f49281c;
    public final SparseArray d = new SparseArray();
    public boolean f49282e;
    public z0 f49283f;
    public long h;
    public b0 f49284n;
    public b2.s[] f49285r;

    public d(o oVar, int i10, b2.s sVar) {
        this.f49279a = oVar;
        this.f49280b = i10;
        this.f49281c = sVar;
    }

    public final void a(z0 z0Var, long j3, long j10) {
        this.f49283f = z0Var;
        this.h = j10;
        boolean z10 = this.f49282e;
        o oVar = this.f49279a;
        if (!z10) {
            oVar.g(this);
            if (j3 != -9223372036854775807L) {
                oVar.h(0L, j3);
            }
            this.f49282e = true;
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
                    cVar.f49276e = cVar.f49275c;
                } else {
                    cVar.f49277f = j10;
                    h0 w10 = z0Var.w(cVar.f49273a);
                    cVar.f49276e = w10;
                    b2.s sVar = cVar.d;
                    if (sVar != null) {
                        w10.b(sVar);
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
        this.f49284n = b0Var;
    }

    @Override
    public final h0 f2(int i10, int i11) {
        boolean z10;
        b2.s sVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f49285r == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (i11 == this.f49280b) {
                sVar = this.f49281c;
            } else {
                sVar = null;
            }
            cVar = new c(i10, i11, sVar);
            z0 z0Var = this.f49283f;
            long j3 = this.h;
            if (z0Var == null) {
                cVar.f49276e = cVar.f49275c;
            } else {
                cVar.f49277f = j3;
                h0 w10 = z0Var.w(i11);
                cVar.f49276e = w10;
                b2.s sVar2 = cVar.d;
                if (sVar2 != null) {
                    w10.b(sVar2);
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
        this.f49285r = sVarArr;
    }
}
