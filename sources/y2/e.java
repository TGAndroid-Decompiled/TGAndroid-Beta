package y2;

import a8.ia;
import android.util.SparseArray;
import e2.u;
import f3.c0;
import f3.j0;
import f3.o;
import f3.q;
import f3.s;
import sg.i0;
public final class e implements q {
    public static final s f58893w = new Object();
    public final o f58894a;
    public final int f58895b;
    public final u f58896c;
    public final SparseArray d = new SparseArray();
    public final d f58897e = d.f58892a;
    public boolean f58898f;
    public i0 h;
    public long f58899n;
    public c0 f58900r;
    public u[] f58901s;

    public e(o oVar, int i7, u uVar) {
        this.f58894a = oVar;
        this.f58895b = i7;
        this.f58896c = uVar;
    }

    @Override
    public final j0 O1(int i7, int i10) {
        boolean z9;
        u uVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i7);
        if (cVar == null) {
            if (this.f58901s == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
            if (i10 == this.f58895b) {
                uVar = this.f58896c;
            } else {
                uVar = null;
            }
            cVar = new c(i7, i10, uVar, this.f58897e);
            i0 i0Var = this.h;
            long j3 = this.f58899n;
            if (i0Var == null) {
                cVar.f58890f = cVar.f58888c;
            } else {
                cVar.f58891g = j3;
                j0 f10 = i0Var.f(i10);
                cVar.f58890f = f10;
                u uVar2 = cVar.f58889e;
                if (uVar2 != null) {
                    f10.g(uVar2);
                }
            }
            sparseArray.put(i7, cVar);
        }
        return cVar;
    }

    @Override
    public final void U0() {
        SparseArray sparseArray = this.d;
        u[] uVarArr = new u[sparseArray.size()];
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            u uVar = ((c) sparseArray.valueAt(i7)).f58889e;
            uVar.getClass();
            uVarArr[i7] = uVar;
        }
        this.f58901s = uVarArr;
    }

    public final f3.j a() {
        c0 c0Var = this.f58900r;
        if (c0Var instanceof f3.j) {
            return (f3.j) c0Var;
        }
        if (c0Var instanceof x3.d) {
            return ((x3.d) c0Var).f58557a;
        }
        return null;
    }

    public final void b(i0 i0Var, long j3, long j10) {
        this.h = i0Var;
        this.f58899n = j10;
        boolean z9 = this.f58898f;
        o oVar = this.f58894a;
        if (!z9) {
            oVar.c(this);
            if (j3 != -9223372036854775807L) {
                oVar.d(0L, j3);
            }
            this.f58898f = true;
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
                if (i0Var == null) {
                    cVar.f58890f = cVar.f58888c;
                } else {
                    cVar.f58891g = j10;
                    j0 f10 = i0Var.f(cVar.f58886a);
                    cVar.f58890f = f10;
                    u uVar = cVar.f58889e;
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
    public final void f(c0 c0Var) {
        this.f58900r = c0Var;
    }
}
