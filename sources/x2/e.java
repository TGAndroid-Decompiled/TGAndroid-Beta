package x2;

import android.util.SparseArray;
import b8.zb;
import d2.v;
import e3.b0;
import e3.i0;
import e3.o;
import e3.q;
import e3.s;
public final class e implements q {
    public static final s f58139w = new Object();
    public final o f58140a;
    public final int f58141b;
    public final v f58142c;
    public final SparseArray d = new SparseArray();
    public final d f58143e = d.f58138a;
    public boolean f58144f;
    public ua.b h;
    public long f58145n;
    public b0 f58146r;
    public v[] f58147s;

    public e(o oVar, int i3, v vVar) {
        this.f58140a = oVar;
        this.f58141b = i3;
        this.f58142c = vVar;
    }

    @Override
    public final void L() {
        SparseArray sparseArray = this.d;
        v[] vVarArr = new v[sparseArray.size()];
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            v vVar = ((c) sparseArray.valueAt(i3)).f58135e;
            vVar.getClass();
            vVarArr[i3] = vVar;
        }
        this.f58147s = vVarArr;
    }

    public final e3.j a() {
        b0 b0Var = this.f58146r;
        if (b0Var instanceof e3.j) {
            return (e3.j) b0Var;
        }
        if (b0Var instanceof w3.d) {
            return ((w3.d) b0Var).f57306a;
        }
        return null;
    }

    public final void b(ua.b bVar, long j10, long j11) {
        this.h = bVar;
        this.f58145n = j11;
        boolean z10 = this.f58144f;
        o oVar = this.f58140a;
        if (!z10) {
            oVar.c(this);
            if (j10 != -9223372036854775807L) {
                oVar.d(0L, j10);
            }
            this.f58144f = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        oVar.d(0L, j10);
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i3 < sparseArray.size()) {
                c cVar = (c) sparseArray.valueAt(i3);
                if (bVar == null) {
                    cVar.f58136f = cVar.f58134c;
                } else {
                    cVar.f58137g = j11;
                    i0 c2 = bVar.c(cVar.f58132a);
                    cVar.f58136f = c2;
                    v vVar = cVar.f58135e;
                    if (vVar != null) {
                        c2.g(vVar);
                    }
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void f(b0 b0Var) {
        this.f58146r = b0Var;
    }

    @Override
    public final i0 i0(int i3, int i10) {
        boolean z10;
        v vVar;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i3);
        if (cVar == null) {
            if (this.f58147s == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.p(z10);
            if (i10 == this.f58141b) {
                vVar = this.f58142c;
            } else {
                vVar = null;
            }
            cVar = new c(i3, i10, vVar, this.f58143e);
            ua.b bVar = this.h;
            long j10 = this.f58145n;
            if (bVar == null) {
                cVar.f58136f = cVar.f58134c;
            } else {
                cVar.f58137g = j10;
                i0 c2 = bVar.c(i10);
                cVar.f58136f = c2;
                v vVar2 = cVar.f58135e;
                if (vVar2 != null) {
                    c2.g(vVar2);
                }
            }
            sparseArray.put(i3, cVar);
        }
        return cVar;
    }
}
