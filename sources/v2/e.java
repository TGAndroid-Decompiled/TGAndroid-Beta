package v2;

import a8.yb;
import android.util.SparseArray;
import b2.x;
import c3.b0;
import c3.j0;
import c3.o;
import c3.q;
import c3.s;
public final class e implements q {
    public static final s v = new Object();
    public final o f50034a;
    public final int f50035b;
    public final x f50036c;
    public final SparseArray d = new SparseArray();
    public final d e = d.f50033a;
    public boolean f50037f;
    public m4.c h;
    public long f50038n;
    public b0 f50039r;
    public x[] f50040s;

    public e(o oVar, int i10, x xVar) {
        this.f50034a = oVar;
        this.f50035b = i10;
        this.f50036c = xVar;
    }

    @Override
    public final void D1(b0 b0Var) {
        this.f50039r = b0Var;
    }

    @Override
    public final j0 F1(int i10, int i11) {
        boolean z10;
        x xVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f50040s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
            if (i11 == this.f50035b) {
                xVar = this.f50036c;
            } else {
                xVar = null;
            }
            cVar = new c(i10, i11, xVar, this.e);
            m4.c cVar2 = this.h;
            long j10 = this.f50038n;
            if (cVar2 == null) {
                cVar.f50031f = cVar.f50030c;
            } else {
                cVar.f50032g = j10;
                j0 B0 = cVar2.B0(i11);
                cVar.f50031f = B0;
                x xVar2 = cVar.e;
                if (xVar2 != null) {
                    B0.b(xVar2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    @Override
    public final void Q0() {
        SparseArray sparseArray = this.d;
        x[] xVarArr = new x[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            x xVar = ((c) sparseArray.valueAt(i10)).e;
            xVar.getClass();
            xVarArr[i10] = xVar;
        }
        this.f50040s = xVarArr;
    }

    public final c3.j a() {
        b0 b0Var = this.f50039r;
        if (b0Var instanceof c3.j) {
            return (c3.j) b0Var;
        }
        if (b0Var instanceof u3.d) {
            return ((u3.d) b0Var).f49540a;
        }
        return null;
    }

    public final void b(m4.c cVar, long j10, long j11) {
        this.h = cVar;
        this.f50038n = j11;
        boolean z10 = this.f50037f;
        o oVar = this.f50034a;
        if (!z10) {
            oVar.c(this);
            if (j10 != -9223372036854775807L) {
                oVar.d(0L, j10);
            }
            this.f50037f = true;
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
                c cVar2 = (c) sparseArray.valueAt(i10);
                if (cVar == null) {
                    cVar2.f50031f = cVar2.f50030c;
                } else {
                    cVar2.f50032g = j11;
                    j0 B0 = cVar.B0(cVar2.f50028a);
                    cVar2.f50031f = B0;
                    x xVar = cVar2.e;
                    if (xVar != null) {
                        B0.b(xVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
