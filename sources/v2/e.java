package v2;

import android.util.SparseArray;
import b2.x;
import c3.b0;
import c3.i0;
import c3.o;
import c3.q;
import c3.s;
import v7.u6;
public final class e implements q {
    public static final s v = new Object();
    public final o f46491a;
    public final int f46492b;
    public final x f46493c;
    public final SparseArray d = new SparseArray();
    public final d e = d.f46490a;
    public boolean f46494f;
    public n3.b h;
    public long f46495n;
    public b0 f46496r;
    public x[] f46497s;

    public e(o oVar, int i10, x xVar) {
        this.f46491a = oVar;
        this.f46492b = i10;
        this.f46493c = xVar;
    }

    @Override
    public final void D() {
        SparseArray sparseArray = this.d;
        x[] xVarArr = new x[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            x xVar = ((c) sparseArray.valueAt(i10)).e;
            xVar.getClass();
            xVarArr[i10] = xVar;
        }
        this.f46497s = xVarArr;
    }

    @Override
    public final void K(b0 b0Var) {
        this.f46496r = b0Var;
    }

    @Override
    public final i0 W(int i10, int i11) {
        boolean z10;
        x xVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f46497s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            if (i11 == this.f46492b) {
                xVar = this.f46493c;
            } else {
                xVar = null;
            }
            cVar = new c(i10, i11, xVar, this.e);
            n3.b bVar = this.h;
            long j10 = this.f46495n;
            if (bVar == null) {
                cVar.f46488f = cVar.f46487c;
            } else {
                cVar.f46489g = j10;
                i0 j02 = bVar.j0(i11);
                cVar.f46488f = j02;
                x xVar2 = cVar.e;
                if (xVar2 != null) {
                    j02.b(xVar2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    public final c3.j a() {
        b0 b0Var = this.f46496r;
        if (b0Var instanceof c3.j) {
            return (c3.j) b0Var;
        }
        if (b0Var instanceof u3.d) {
            return ((u3.d) b0Var).f46123a;
        }
        return null;
    }

    public final void b(n3.b bVar, long j10, long j11) {
        this.h = bVar;
        this.f46495n = j11;
        boolean z10 = this.f46494f;
        o oVar = this.f46491a;
        if (!z10) {
            oVar.c(this);
            if (j10 != -9223372036854775807L) {
                oVar.d(0L, j10);
            }
            this.f46494f = true;
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
                    cVar.f46488f = cVar.f46487c;
                } else {
                    cVar.f46489g = j11;
                    i0 j02 = bVar.j0(cVar.f46485a);
                    cVar.f46488f = j02;
                    x xVar = cVar.e;
                    if (xVar != null) {
                        j02.b(xVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
