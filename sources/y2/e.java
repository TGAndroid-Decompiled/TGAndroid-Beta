package y2;

import a8.la;
import android.util.SparseArray;
import e2.u;
import f3.b0;
import f3.i0;
import f3.o;
import f3.q;
import f3.s;
import sg.h0;
public final class e implements q {
    public static final s f60671w = new Object();
    public final o f60672a;
    public final int f60673b;
    public final u f60674c;
    public final SparseArray d = new SparseArray();
    public final d f60675e = d.f60670a;
    public boolean f60676f;
    public h0 h;
    public long f60677n;
    public b0 f60678r;
    public u[] f60679s;

    public e(o oVar, int i7, u uVar) {
        this.f60672a = oVar;
        this.f60673b = i7;
        this.f60674c = uVar;
    }

    public final f3.j a() {
        b0 b0Var = this.f60678r;
        if (b0Var instanceof f3.j) {
            return (f3.j) b0Var;
        }
        if (b0Var instanceof x3.d) {
            return ((x3.d) b0Var).f60310a;
        }
        return null;
    }

    public final void b(h0 h0Var, long j3, long j10) {
        this.h = h0Var;
        this.f60677n = j10;
        boolean z10 = this.f60676f;
        o oVar = this.f60672a;
        if (!z10) {
            oVar.c(this);
            if (j3 != -9223372036854775807L) {
                oVar.d(0L, j3);
            }
            this.f60676f = true;
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
                if (h0Var == null) {
                    cVar.f60668f = cVar.f60666c;
                } else {
                    cVar.f60669g = j10;
                    i0 f10 = h0Var.f(cVar.f60664a);
                    cVar.f60668f = f10;
                    u uVar = cVar.f60667e;
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
    public final void d1() {
        SparseArray sparseArray = this.d;
        u[] uVarArr = new u[sparseArray.size()];
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            u uVar = ((c) sparseArray.valueAt(i7)).f60667e;
            uVar.getClass();
            uVarArr[i7] = uVar;
        }
        this.f60679s = uVarArr;
    }

    @Override
    public final i0 d2(int i7, int i10) {
        boolean z10;
        u uVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i7);
        if (cVar == null) {
            if (this.f60679s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
            if (i10 == this.f60673b) {
                uVar = this.f60674c;
            } else {
                uVar = null;
            }
            cVar = new c(i7, i10, uVar, this.f60675e);
            h0 h0Var = this.h;
            long j3 = this.f60677n;
            if (h0Var == null) {
                cVar.f60668f = cVar.f60666c;
            } else {
                cVar.f60669g = j3;
                i0 f10 = h0Var.f(i10);
                cVar.f60668f = f10;
                u uVar2 = cVar.f60667e;
                if (uVar2 != null) {
                    f10.g(uVar2);
                }
            }
            sparseArray.put(i7, cVar);
        }
        return cVar;
    }

    @Override
    public final void j(b0 b0Var) {
        this.f60678r = b0Var;
    }
}
