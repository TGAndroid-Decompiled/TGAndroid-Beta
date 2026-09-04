package v2;

import android.util.SparseArray;
import c3.b0;
import c3.h0;
import c3.o;
import c3.q;
import c3.s;
public final class d implements q {
    public static final s f47290s = new Object();
    public final o f47291a;
    public final int f47292b;
    public final b2.s f47293c;
    public final SparseArray d = new SparseArray();
    public boolean f47294e;
    public o0.a f47295f;
    public long h;
    public b0 f47296n;
    public b2.s[] f47297r;

    public d(o oVar, int i10, b2.s sVar) {
        this.f47291a = oVar;
        this.f47292b = i10;
        this.f47293c = sVar;
    }

    @Override
    public final void P1(b0 b0Var) {
        this.f47296n = b0Var;
    }

    @Override
    public final h0 R1(int i10, int i11) {
        boolean z10;
        b2.s sVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f47297r == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (i11 == this.f47292b) {
                sVar = this.f47293c;
            } else {
                sVar = null;
            }
            cVar = new c(i10, i11, sVar);
            o0.a aVar = this.f47295f;
            long j3 = this.h;
            if (aVar == null) {
                cVar.f47288e = cVar.f47287c;
            } else {
                cVar.f47289f = j3;
                h0 U = aVar.U(i11);
                cVar.f47288e = U;
                b2.s sVar2 = cVar.d;
                if (sVar2 != null) {
                    U.b(sVar2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    @Override
    public final void Z0() {
        SparseArray sparseArray = this.d;
        b2.s[] sVarArr = new b2.s[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            b2.s sVar = ((c) sparseArray.valueAt(i10)).d;
            e2.d.h(sVar);
            sVarArr[i10] = sVar;
        }
        this.f47297r = sVarArr;
    }

    public final void a(o0.a aVar, long j3, long j10) {
        this.f47295f = aVar;
        this.h = j10;
        boolean z10 = this.f47294e;
        o oVar = this.f47291a;
        if (!z10) {
            oVar.g(this);
            if (j3 != -9223372036854775807L) {
                oVar.h(0L, j3);
            }
            this.f47294e = true;
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
                    cVar.f47288e = cVar.f47287c;
                } else {
                    cVar.f47289f = j10;
                    h0 U = aVar.U(cVar.f47285a);
                    cVar.f47288e = U;
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
}
