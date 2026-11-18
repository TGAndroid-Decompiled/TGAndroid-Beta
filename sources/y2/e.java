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
    public static final s f60672w = new Object();
    public final o f60673a;
    public final int f60674b;
    public final u f60675c;
    public final SparseArray d = new SparseArray();
    public final d f60676e = d.f60671a;
    public boolean f60677f;
    public h0 h;
    public long f60678n;
    public b0 f60679r;
    public u[] f60680s;

    public e(o oVar, int i7, u uVar) {
        this.f60673a = oVar;
        this.f60674b = i7;
        this.f60675c = uVar;
    }

    public final f3.j a() {
        b0 b0Var = this.f60679r;
        if (b0Var instanceof f3.j) {
            return (f3.j) b0Var;
        }
        if (b0Var instanceof x3.d) {
            return ((x3.d) b0Var).f60311a;
        }
        return null;
    }

    public final void b(h0 h0Var, long j3, long j10) {
        this.h = h0Var;
        this.f60678n = j10;
        boolean z10 = this.f60677f;
        o oVar = this.f60673a;
        if (!z10) {
            oVar.c(this);
            if (j3 != -9223372036854775807L) {
                oVar.d(0L, j3);
            }
            this.f60677f = true;
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
                    cVar.f60669f = cVar.f60667c;
                } else {
                    cVar.f60670g = j10;
                    i0 f10 = h0Var.f(cVar.f60665a);
                    cVar.f60669f = f10;
                    u uVar = cVar.f60668e;
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
            u uVar = ((c) sparseArray.valueAt(i7)).f60668e;
            uVar.getClass();
            uVarArr[i7] = uVar;
        }
        this.f60680s = uVarArr;
    }

    @Override
    public final i0 d2(int i7, int i10) {
        boolean z10;
        u uVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i7);
        if (cVar == null) {
            if (this.f60680s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
            if (i10 == this.f60674b) {
                uVar = this.f60675c;
            } else {
                uVar = null;
            }
            cVar = new c(i7, i10, uVar, this.f60676e);
            h0 h0Var = this.h;
            long j3 = this.f60678n;
            if (h0Var == null) {
                cVar.f60669f = cVar.f60667c;
            } else {
                cVar.f60670g = j3;
                i0 f10 = h0Var.f(i10);
                cVar.f60669f = f10;
                u uVar2 = cVar.f60668e;
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
        this.f60679r = b0Var;
    }
}
