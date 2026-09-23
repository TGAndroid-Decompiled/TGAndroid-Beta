package v2;

import android.util.SparseArray;
import c3.b0;
import c3.h0;
import c3.o;
import c3.q;
import c3.s;
public final class d implements q {
    public static final s f43784s = new Object();
    public final o f43785a;
    public final int f43786b;
    public final b2.s f43787c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public o0.a f43788f;
    public long h;
    public b0 f43789n;
    public b2.s[] f43790r;

    public d(o oVar, int i10, b2.s sVar) {
        this.f43785a = oVar;
        this.f43786b = i10;
        this.f43787c = sVar;
    }

    @Override
    public final void X1(b0 b0Var) {
        this.f43789n = b0Var;
    }

    @Override
    public final h0 Z1(int i10, int i11) {
        boolean z10;
        b2.s sVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f43790r == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (i11 == this.f43786b) {
                sVar = this.f43787c;
            } else {
                sVar = null;
            }
            cVar = new c(i10, i11, sVar);
            o0.a aVar = this.f43788f;
            long j3 = this.h;
            if (aVar == null) {
                cVar.e = cVar.f43782c;
            } else {
                cVar.f43783f = j3;
                h0 U = aVar.U(i11);
                cVar.e = U;
                b2.s sVar2 = cVar.d;
                if (sVar2 != null) {
                    U.b(sVar2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    public final void a(o0.a aVar, long j3, long j10) {
        this.f43788f = aVar;
        this.h = j10;
        boolean z10 = this.e;
        o oVar = this.f43785a;
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
                if (aVar == null) {
                    cVar.e = cVar.f43782c;
                } else {
                    cVar.f43783f = j10;
                    h0 U = aVar.U(cVar.f43780a);
                    cVar.e = U;
                    b2.s sVar = cVar.d;
                    if (sVar != null) {
                        U.b(sVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void e1() {
        SparseArray sparseArray = this.d;
        b2.s[] sVarArr = new b2.s[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            b2.s sVar = ((c) sparseArray.valueAt(i10)).d;
            e2.d.h(sVar);
            sVarArr[i10] = sVar;
        }
        this.f43790r = sVarArr;
    }
}
