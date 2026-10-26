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
    public final o f49999a;
    public final int f50000b;
    public final x f50001c;
    public final SparseArray d = new SparseArray();
    public final d e = d.f49998a;
    public boolean f50002f;
    public m4.c h;
    public long f50003n;
    public b0 f50004r;
    public x[] f50005s;

    public e(o oVar, int i10, x xVar) {
        this.f49999a = oVar;
        this.f50000b = i10;
        this.f50001c = xVar;
    }

    @Override
    public final void D1(b0 b0Var) {
        this.f50004r = b0Var;
    }

    @Override
    public final j0 F1(int i10, int i11) {
        boolean z10;
        x xVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f50005s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
            if (i11 == this.f50000b) {
                xVar = this.f50001c;
            } else {
                xVar = null;
            }
            cVar = new c(i10, i11, xVar, this.e);
            m4.c cVar2 = this.h;
            long j10 = this.f50003n;
            if (cVar2 == null) {
                cVar.f49996f = cVar.f49995c;
            } else {
                cVar.f49997g = j10;
                j0 B0 = cVar2.B0(i11);
                cVar.f49996f = B0;
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
        this.f50005s = xVarArr;
    }

    public final c3.j a() {
        b0 b0Var = this.f50004r;
        if (b0Var instanceof c3.j) {
            return (c3.j) b0Var;
        }
        if (b0Var instanceof u3.d) {
            return ((u3.d) b0Var).f49505a;
        }
        return null;
    }

    public final void b(m4.c cVar, long j10, long j11) {
        this.h = cVar;
        this.f50003n = j11;
        boolean z10 = this.f50002f;
        o oVar = this.f49999a;
        if (!z10) {
            oVar.c(this);
            if (j10 != -9223372036854775807L) {
                oVar.d(0L, j10);
            }
            this.f50002f = true;
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
                    cVar2.f49996f = cVar2.f49995c;
                } else {
                    cVar2.f49997g = j11;
                    j0 B0 = cVar.B0(cVar2.f49993a);
                    cVar2.f49996f = B0;
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
