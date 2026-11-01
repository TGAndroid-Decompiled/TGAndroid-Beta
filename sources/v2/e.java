package v2;

import android.util.SparseArray;
import b2.x;
import c3.b0;
import c3.k0;
import c3.o;
import c3.q;
import c3.s;
import v7.t6;
public final class e implements q {
    public static final s f50311w = new Object();
    public final o f50312a;
    public final int f50313b;
    public final x f50314c;
    public final SparseArray d = new SparseArray();
    public final d e = d.f50310a;
    public boolean f50315f;
    public u9.b h;
    public long f50316n;
    public b0 f50317r;
    public x[] f50318s;

    public e(o oVar, int i10, x xVar) {
        this.f50312a = oVar;
        this.f50313b = i10;
        this.f50314c = xVar;
    }

    @Override
    public final void G1(b0 b0Var) {
        this.f50317r = b0Var;
    }

    @Override
    public final k0 I1(int i10, int i11) {
        boolean z10;
        x xVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f50318s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.p(z10);
            if (i11 == this.f50313b) {
                xVar = this.f50314c;
            } else {
                xVar = null;
            }
            cVar = new c(i10, i11, xVar, this.e);
            u9.b bVar = this.h;
            long j10 = this.f50316n;
            if (bVar == null) {
                cVar.f50308f = cVar.f50307c;
            } else {
                cVar.f50309g = j10;
                k0 c10 = bVar.c(i11);
                cVar.f50308f = c10;
                x xVar2 = cVar.e;
                if (xVar2 != null) {
                    c10.b(xVar2);
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
        this.f50318s = xVarArr;
    }

    public final c3.j a() {
        b0 b0Var = this.f50317r;
        if (b0Var instanceof c3.j) {
            return (c3.j) b0Var;
        }
        if (b0Var instanceof u3.d) {
            return ((u3.d) b0Var).f50098a;
        }
        return null;
    }

    public final void b(u9.b bVar, long j10, long j11) {
        this.h = bVar;
        this.f50316n = j11;
        boolean z10 = this.f50315f;
        o oVar = this.f50312a;
        if (!z10) {
            oVar.c(this);
            if (j10 != -9223372036854775807L) {
                oVar.d(0L, j10);
            }
            this.f50315f = true;
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
                c cVar = (c) sparseArray.valueAt(i10);
                if (bVar == null) {
                    cVar.f50308f = cVar.f50307c;
                } else {
                    cVar.f50309g = j11;
                    k0 c10 = bVar.c(cVar.f50305a);
                    cVar.f50308f = c10;
                    x xVar = cVar.e;
                    if (xVar != null) {
                        c10.b(xVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
