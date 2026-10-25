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
    public final o f49996a;
    public final int f49997b;
    public final x f49998c;
    public final SparseArray d = new SparseArray();
    public final d e = d.f49995a;
    public boolean f49999f;
    public m4.c h;
    public long f50000n;
    public b0 f50001r;
    public x[] f50002s;

    public e(o oVar, int i10, x xVar) {
        this.f49996a = oVar;
        this.f49997b = i10;
        this.f49998c = xVar;
    }

    @Override
    public final void D1(b0 b0Var) {
        this.f50001r = b0Var;
    }

    @Override
    public final j0 F1(int i10, int i11) {
        boolean z10;
        x xVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f50002s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
            if (i11 == this.f49997b) {
                xVar = this.f49998c;
            } else {
                xVar = null;
            }
            cVar = new c(i10, i11, xVar, this.e);
            m4.c cVar2 = this.h;
            long j10 = this.f50000n;
            if (cVar2 == null) {
                cVar.f49993f = cVar.f49992c;
            } else {
                cVar.f49994g = j10;
                j0 B0 = cVar2.B0(i11);
                cVar.f49993f = B0;
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
        this.f50002s = xVarArr;
    }

    public final c3.j a() {
        b0 b0Var = this.f50001r;
        if (b0Var instanceof c3.j) {
            return (c3.j) b0Var;
        }
        if (b0Var instanceof u3.d) {
            return ((u3.d) b0Var).f49502a;
        }
        return null;
    }

    public final void b(m4.c cVar, long j10, long j11) {
        this.h = cVar;
        this.f50000n = j11;
        boolean z10 = this.f49999f;
        o oVar = this.f49996a;
        if (!z10) {
            oVar.c(this);
            if (j10 != -9223372036854775807L) {
                oVar.d(0L, j10);
            }
            this.f49999f = true;
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
                    cVar2.f49993f = cVar2.f49992c;
                } else {
                    cVar2.f49994g = j11;
                    j0 B0 = cVar.B0(cVar2.f49990a);
                    cVar2.f49993f = B0;
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
