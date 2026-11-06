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
    public static final s f58791w = new Object();
    public final o f58792a;
    public final int f58793b;
    public final u f58794c;
    public final SparseArray d = new SparseArray();
    public final d f58795e = d.f58790a;
    public boolean f58796f;
    public i0 h;
    public long f58797n;
    public c0 f58798r;
    public u[] f58799s;

    public e(o oVar, int i7, u uVar) {
        this.f58792a = oVar;
        this.f58793b = i7;
        this.f58794c = uVar;
    }

    @Override
    public final j0 O1(int i7, int i10) {
        boolean z9;
        u uVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i7);
        if (cVar == null) {
            if (this.f58799s == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
            if (i10 == this.f58793b) {
                uVar = this.f58794c;
            } else {
                uVar = null;
            }
            cVar = new c(i7, i10, uVar, this.f58795e);
            i0 i0Var = this.h;
            long j3 = this.f58797n;
            if (i0Var == null) {
                cVar.f58788f = cVar.f58786c;
            } else {
                cVar.f58789g = j3;
                j0 f10 = i0Var.f(i10);
                cVar.f58788f = f10;
                u uVar2 = cVar.f58787e;
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
            u uVar = ((c) sparseArray.valueAt(i7)).f58787e;
            uVar.getClass();
            uVarArr[i7] = uVar;
        }
        this.f58799s = uVarArr;
    }

    public final f3.j a() {
        c0 c0Var = this.f58798r;
        if (c0Var instanceof f3.j) {
            return (f3.j) c0Var;
        }
        if (c0Var instanceof x3.d) {
            return ((x3.d) c0Var).f58455a;
        }
        return null;
    }

    public final void b(i0 i0Var, long j3, long j10) {
        this.h = i0Var;
        this.f58797n = j10;
        boolean z9 = this.f58796f;
        o oVar = this.f58792a;
        if (!z9) {
            oVar.c(this);
            if (j3 != -9223372036854775807L) {
                oVar.d(0L, j3);
            }
            this.f58796f = true;
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
                    cVar.f58788f = cVar.f58786c;
                } else {
                    cVar.f58789g = j10;
                    j0 f10 = i0Var.f(cVar.f58784a);
                    cVar.f58788f = f10;
                    u uVar = cVar.f58787e;
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
        this.f58798r = c0Var;
    }
}
