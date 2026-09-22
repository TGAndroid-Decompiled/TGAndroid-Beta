package v2;

import android.util.SparseArray;
import c3.b0;
import c3.h0;
import c3.o;
import c3.q;
import c3.s;
public final class d implements q {
    public static final s f44155s = new Object();
    public final o f44156a;
    public final int f44157b;
    public final b2.s f44158c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public m5.e f44159f;
    public long h;
    public b0 f44160n;
    public b2.s[] f44161r;

    public d(o oVar, int i10, b2.s sVar) {
        this.f44156a = oVar;
        this.f44157b = i10;
        this.f44158c = sVar;
    }

    @Override
    public final void X1(b0 b0Var) {
        this.f44160n = b0Var;
    }

    @Override
    public final h0 Z1(int i10, int i11) {
        boolean z10;
        b2.s sVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f44161r == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            if (i11 == this.f44157b) {
                sVar = this.f44158c;
            } else {
                sVar = null;
            }
            cVar = new c(i10, i11, sVar);
            m5.e eVar = this.f44159f;
            long j3 = this.h;
            if (eVar == null) {
                cVar.e = cVar.f44153c;
            } else {
                cVar.f44154f = j3;
                h0 W = eVar.W(i11);
                cVar.e = W;
                b2.s sVar2 = cVar.d;
                if (sVar2 != null) {
                    W.b(sVar2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    public final void a(m5.e eVar, long j3, long j10) {
        this.f44159f = eVar;
        this.h = j10;
        boolean z10 = this.e;
        o oVar = this.f44156a;
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
                if (eVar == null) {
                    cVar.e = cVar.f44153c;
                } else {
                    cVar.f44154f = j10;
                    h0 W = eVar.W(cVar.f44151a);
                    cVar.e = W;
                    b2.s sVar = cVar.d;
                    if (sVar != null) {
                        W.b(sVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void f1() {
        SparseArray sparseArray = this.d;
        b2.s[] sVarArr = new b2.s[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            b2.s sVar = ((c) sparseArray.valueAt(i10)).d;
            e2.d.h(sVar);
            sVarArr[i10] = sVar;
        }
        this.f44161r = sVarArr;
    }
}
