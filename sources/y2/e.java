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
    public static final s f60713w = new Object();
    public final o f60714a;
    public final int f60715b;
    public final u f60716c;
    public final SparseArray d = new SparseArray();
    public final d f60717e = d.f60712a;
    public boolean f60718f;
    public h0 h;
    public long f60719n;
    public b0 f60720r;
    public u[] f60721s;

    public e(o oVar, int i7, u uVar) {
        this.f60714a = oVar;
        this.f60715b = i7;
        this.f60716c = uVar;
    }

    public final f3.j a() {
        b0 b0Var = this.f60720r;
        if (b0Var instanceof f3.j) {
            return (f3.j) b0Var;
        }
        if (b0Var instanceof x3.d) {
            return ((x3.d) b0Var).f60352a;
        }
        return null;
    }

    public final void b(h0 h0Var, long j3, long j10) {
        this.h = h0Var;
        this.f60719n = j10;
        boolean z10 = this.f60718f;
        o oVar = this.f60714a;
        if (!z10) {
            oVar.c(this);
            if (j3 != -9223372036854775807L) {
                oVar.d(0L, j3);
            }
            this.f60718f = true;
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
                    cVar.f60710f = cVar.f60708c;
                } else {
                    cVar.f60711g = j10;
                    i0 f10 = h0Var.f(cVar.f60706a);
                    cVar.f60710f = f10;
                    u uVar = cVar.f60709e;
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
            u uVar = ((c) sparseArray.valueAt(i7)).f60709e;
            uVar.getClass();
            uVarArr[i7] = uVar;
        }
        this.f60721s = uVarArr;
    }

    @Override
    public final i0 d2(int i7, int i10) {
        boolean z10;
        u uVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i7);
        if (cVar == null) {
            if (this.f60721s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
            if (i10 == this.f60715b) {
                uVar = this.f60716c;
            } else {
                uVar = null;
            }
            cVar = new c(i7, i10, uVar, this.f60717e);
            h0 h0Var = this.h;
            long j3 = this.f60719n;
            if (h0Var == null) {
                cVar.f60710f = cVar.f60708c;
            } else {
                cVar.f60711g = j3;
                i0 f10 = h0Var.f(i10);
                cVar.f60710f = f10;
                u uVar2 = cVar.f60709e;
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
        this.f60720r = b0Var;
    }
}
