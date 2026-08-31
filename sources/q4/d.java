package q4;

import android.util.SparseArray;
import j3.n0;
import n7.qa;
import org.telegram.ui.Components.jb;
import r3.s;
import r3.v;
public final class d implements r3.m {
    public static final jb f44465s = new Object();
    public final r3.k f44466a;
    public final int f44467b;
    public final n0 f44468c;
    public final SparseArray d = new SparseArray();
    public boolean f44469e;
    public qa f44470f;
    public long h;
    public s f44471n;
    public n0[] f44472r;

    public d(r3.k kVar, int i10, n0 n0Var) {
        this.f44466a = kVar;
        this.f44467b = i10;
        this.f44468c = n0Var;
    }

    public final void a(qa qaVar, long j10, long j11) {
        this.f44470f = qaVar;
        this.h = j11;
        boolean z4 = this.f44469e;
        r3.k kVar = this.f44466a;
        if (!z4) {
            kVar.e(this);
            if (j10 != -9223372036854775807L) {
                kVar.d(0L, j10);
            }
            this.f44469e = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        kVar.d(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i10 < sparseArray.size()) {
                c cVar = (c) sparseArray.valueAt(i10);
                if (qaVar == null) {
                    cVar.f44463e = cVar.f44462c;
                } else {
                    cVar.f44464f = j11;
                    v j12 = qaVar.j1(cVar.f44460a);
                    cVar.f44463e = j12;
                    n0 n0Var = cVar.d;
                    if (n0Var != null) {
                        j12.b(n0Var);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void i1() {
        SparseArray sparseArray = this.d;
        n0[] n0VarArr = new n0[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            n0 n0Var = ((c) sparseArray.valueAt(i10)).d;
            h5.a.j(n0Var);
            n0VarArr[i10] = n0Var;
        }
        this.f44472r = n0VarArr;
    }

    @Override
    public final v i2(int i10, int i11) {
        boolean z4;
        n0 n0Var;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f44472r == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            h5.a.i(z4);
            if (i11 == this.f44467b) {
                n0Var = this.f44468c;
            } else {
                n0Var = null;
            }
            cVar = new c(i10, i11, n0Var);
            qa qaVar = this.f44470f;
            long j10 = this.h;
            if (qaVar == null) {
                cVar.f44463e = cVar.f44462c;
            } else {
                cVar.f44464f = j10;
                v j12 = qaVar.j1(i11);
                cVar.f44463e = j12;
                n0 n0Var2 = cVar.d;
                if (n0Var2 != null) {
                    j12.b(n0Var2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    @Override
    public final void m2(s sVar) {
        this.f44471n = sVar;
    }
}
