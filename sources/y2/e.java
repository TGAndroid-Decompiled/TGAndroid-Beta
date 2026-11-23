package y2;

import a8.ma;
import android.util.SparseArray;
import e2.u;
import f3.c0;
import f3.j0;
import f3.o;
import f3.q;
import f3.s;
public final class e implements q {
    public static final s f60800w = new Object();
    public final o f60801a;
    public final int f60802b;
    public final u f60803c;
    public final SparseArray d = new SparseArray();
    public final d f60804e = d.f60799a;
    public boolean f60805f;
    public s2.e h;
    public long f60806n;
    public c0 f60807r;
    public u[] f60808s;

    public e(o oVar, int i7, u uVar) {
        this.f60801a = oVar;
        this.f60802b = i7;
        this.f60803c = uVar;
    }

    @Override
    public final void Z0() {
        SparseArray sparseArray = this.d;
        u[] uVarArr = new u[sparseArray.size()];
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            u uVar = ((c) sparseArray.valueAt(i7)).f60796e;
            uVar.getClass();
            uVarArr[i7] = uVar;
        }
        this.f60808s = uVarArr;
    }

    public final f3.j a() {
        c0 c0Var = this.f60807r;
        if (c0Var instanceof f3.j) {
            return (f3.j) c0Var;
        }
        if (c0Var instanceof x3.d) {
            return ((x3.d) c0Var).f60439a;
        }
        return null;
    }

    public final void b(s2.e eVar, long j3, long j10) {
        this.h = eVar;
        this.f60806n = j10;
        boolean z10 = this.f60805f;
        o oVar = this.f60801a;
        if (!z10) {
            oVar.c(this);
            if (j3 != -9223372036854775807L) {
                oVar.d(0L, j3);
            }
            this.f60805f = true;
            return;
        }
        if (j3 == -9223372036854775807L) {
            j3 = 0;
        }
        oVar.d(0L, j3);
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i7 < sparseArray.size()) {
                c cVar = (c) sparseArray.valueAt(i7);
                if (eVar == null) {
                    cVar.f60797f = cVar.f60795c;
                } else {
                    cVar.f60798g = j10;
                    j0 f10 = eVar.f(cVar.f60793a);
                    cVar.f60797f = f10;
                    u uVar = cVar.f60796e;
                    if (uVar != null) {
                        f10.g(uVar);
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final j0 d2(int i7, int i10) {
        boolean z10;
        u uVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i7);
        if (cVar == null) {
            if (this.f60808s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.p(z10);
            if (i10 == this.f60802b) {
                uVar = this.f60803c;
            } else {
                uVar = null;
            }
            cVar = new c(i7, i10, uVar, this.f60804e);
            s2.e eVar = this.h;
            long j3 = this.f60806n;
            if (eVar == null) {
                cVar.f60797f = cVar.f60795c;
            } else {
                cVar.f60798g = j3;
                j0 f10 = eVar.f(i10);
                cVar.f60797f = f10;
                u uVar2 = cVar.f60796e;
                if (uVar2 != null) {
                    f10.g(uVar2);
                }
            }
            sparseArray.put(i7, cVar);
        }
        return cVar;
    }

    @Override
    public final void h(c0 c0Var) {
        this.f60807r = c0Var;
    }
}
