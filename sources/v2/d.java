package v2;

import android.util.SparseArray;
import c3.b0;
import c3.h0;
import c3.o;
import c3.q;
import c3.s;
import n7.a1;
public final class d implements q {
    public static final s f42855s = new Object();
    public final o f42856a;
    public final int f42857b;
    public final b2.s f42858c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public a1 f42859f;
    public long h;
    public b0 f42860n;
    public b2.s[] f42861r;

    public d(o oVar, int i10, b2.s sVar) {
        this.f42856a = oVar;
        this.f42857b = i10;
        this.f42858c = sVar;
    }

    @Override
    public final void B() {
        SparseArray sparseArray = this.d;
        b2.s[] sVarArr = new b2.s[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            b2.s sVar = ((c) sparseArray.valueAt(i10)).d;
            e2.d.h(sVar);
            sVarArr[i10] = sVar;
        }
        this.f42861r = sVarArr;
    }

    @Override
    public final void G(b0 b0Var) {
        this.f42860n = b0Var;
    }

    @Override
    public final h0 I(int i10, int i11) {
        boolean z10;
        b2.s sVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f42861r == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (i11 == this.f42857b) {
                sVar = this.f42858c;
            } else {
                sVar = null;
            }
            cVar = new c(i10, i11, sVar);
            a1 a1Var = this.f42859f;
            long j3 = this.h;
            if (a1Var == null) {
                cVar.e = cVar.f42853c;
            } else {
                cVar.f42854f = j3;
                h0 t02 = a1Var.t0(i11);
                cVar.e = t02;
                b2.s sVar2 = cVar.d;
                if (sVar2 != null) {
                    t02.b(sVar2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    public final void a(a1 a1Var, long j3, long j10) {
        this.f42859f = a1Var;
        this.h = j10;
        boolean z10 = this.e;
        o oVar = this.f42856a;
        if (!z10) {
            oVar.g(this);
            if (j3 != -9223372036854775807L) {
                oVar.h(0L, j3);
            }
            this.e = true;
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
                if (a1Var == null) {
                    cVar.e = cVar.f42853c;
                } else {
                    cVar.f42854f = j10;
                    h0 t02 = a1Var.t0(cVar.f42851a);
                    cVar.e = t02;
                    b2.s sVar = cVar.d;
                    if (sVar != null) {
                        t02.b(sVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
