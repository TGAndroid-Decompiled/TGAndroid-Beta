package v2;

import android.util.SparseArray;
import b2.w;
import c3.e0;
import c3.l0;
import c3.q;
import c3.s;
import c3.u;
import v7.u6;
public final class e implements s {
    public static final u v = new Object();
    public final q f48325a;
    public final int f48326b;
    public final w f48327c;
    public final SparseArray d = new SparseArray();
    public final d e = d.f48324a;
    public boolean f48328f;
    public n2.e h;
    public long f48329n;
    public e0 f48330r;
    public w[] f48331s;

    public e(q qVar, int i10, w wVar) {
        this.f48325a = qVar;
        this.f48326b = i10;
        this.f48327c = wVar;
    }

    @Override
    public final void C() {
        SparseArray sparseArray = this.d;
        w[] wVarArr = new w[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            w wVar = ((c) sparseArray.valueAt(i10)).e;
            wVar.getClass();
            wVarArr[i10] = wVar;
        }
        this.f48331s = wVarArr;
    }

    public final c3.j a() {
        e0 e0Var = this.f48330r;
        if (e0Var instanceof c3.j) {
            return (c3.j) e0Var;
        }
        if (e0Var instanceof u3.d) {
            return ((u3.d) e0Var).f47960a;
        }
        return null;
    }

    public final void b(n2.e eVar, long j10, long j11) {
        this.h = eVar;
        this.f48329n = j11;
        boolean z10 = this.f48328f;
        q qVar = this.f48325a;
        if (!z10) {
            qVar.c(this);
            if (j10 != -9223372036854775807L) {
                qVar.d(0L, j10);
            }
            this.f48328f = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        qVar.d(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i10 < sparseArray.size()) {
                c cVar = (c) sparseArray.valueAt(i10);
                if (eVar == null) {
                    cVar.f48322f = cVar.f48321c;
                } else {
                    cVar.f48323g = j11;
                    l0 V = eVar.V(cVar.f48319a);
                    cVar.f48322f = V;
                    w wVar = cVar.e;
                    if (wVar != null) {
                        V.b(wVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void g0(e0 e0Var) {
        this.f48330r = e0Var;
    }

    @Override
    public final l0 j0(int i10, int i11) {
        boolean z10;
        w wVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f48331s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            if (i11 == this.f48326b) {
                wVar = this.f48327c;
            } else {
                wVar = null;
            }
            cVar = new c(i10, i11, wVar, this.e);
            n2.e eVar = this.h;
            long j10 = this.f48329n;
            if (eVar == null) {
                cVar.f48322f = cVar.f48321c;
            } else {
                cVar.f48323g = j10;
                l0 V = eVar.V(i11);
                cVar.f48322f = V;
                w wVar2 = cVar.e;
                if (wVar2 != null) {
                    V.b(wVar2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }
}
