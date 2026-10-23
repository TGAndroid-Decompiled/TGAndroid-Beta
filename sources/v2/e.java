package v2;

import android.util.SparseArray;
import b2.w;
import c3.c0;
import c3.j0;
import c3.o;
import c3.q;
import c3.s;
import v7.u6;
public final class e implements q {
    public static final s v = new Object();
    public final o f47888a;
    public final int f47889b;
    public final w f47890c;
    public final SparseArray d = new SparseArray();
    public final d e = d.f47887a;
    public boolean f47891f;
    public n2.e h;
    public long f47892n;
    public c0 f47893r;
    public w[] f47894s;

    public e(o oVar, int i10, w wVar) {
        this.f47888a = oVar;
        this.f47889b = i10;
        this.f47890c = wVar;
    }

    @Override
    public final void H() {
        SparseArray sparseArray = this.d;
        w[] wVarArr = new w[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            w wVar = ((c) sparseArray.valueAt(i10)).e;
            wVar.getClass();
            wVarArr[i10] = wVar;
        }
        this.f47894s = wVarArr;
    }

    public final c3.j a() {
        c0 c0Var = this.f47893r;
        if (c0Var instanceof c3.j) {
            return (c3.j) c0Var;
        }
        if (c0Var instanceof u3.d) {
            return ((u3.d) c0Var).f47521a;
        }
        return null;
    }

    public final void b(n2.e eVar, long j10, long j11) {
        this.h = eVar;
        this.f47892n = j11;
        boolean z10 = this.f47891f;
        o oVar = this.f47888a;
        if (!z10) {
            oVar.c(this);
            if (j10 != -9223372036854775807L) {
                oVar.d(0L, j10);
            }
            this.f47891f = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        oVar.d(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i10 < sparseArray.size()) {
                c cVar = (c) sparseArray.valueAt(i10);
                if (eVar == null) {
                    cVar.f47885f = cVar.f47884c;
                } else {
                    cVar.f47886g = j11;
                    j0 r02 = eVar.r0(cVar.f47882a);
                    cVar.f47885f = r02;
                    w wVar = cVar.e;
                    if (wVar != null) {
                        r02.b(wVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void g0(c0 c0Var) {
        this.f47893r = c0Var;
    }

    @Override
    public final j0 j0(int i10, int i11) {
        boolean z10;
        w wVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f47894s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            if (i11 == this.f47889b) {
                wVar = this.f47890c;
            } else {
                wVar = null;
            }
            cVar = new c(i10, i11, wVar, this.e);
            n2.e eVar = this.h;
            long j10 = this.f47892n;
            if (eVar == null) {
                cVar.f47885f = cVar.f47884c;
            } else {
                cVar.f47886g = j10;
                j0 r02 = eVar.r0(i11);
                cVar.f47885f = r02;
                w wVar2 = cVar.e;
                if (wVar2 != null) {
                    r02.b(wVar2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }
}
