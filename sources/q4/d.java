package q4;

import android.util.SparseArray;
import j3.n0;
import n7.qa;
import org.telegram.ui.Components.jb;
import r3.s;
import r3.v;
public final class d implements r3.m {
    public static final jb f44496s = new Object();
    public final r3.k f44497a;
    public final int f44498b;
    public final n0 f44499c;
    public final SparseArray d = new SparseArray();
    public boolean f44500e;
    public qa f44501f;
    public long h;
    public s f44502n;
    public n0[] f44503r;

    public d(r3.k kVar, int i10, n0 n0Var) {
        this.f44497a = kVar;
        this.f44498b = i10;
        this.f44499c = n0Var;
    }

    public final void a(qa qaVar, long j10, long j11) {
        this.f44501f = qaVar;
        this.h = j11;
        boolean z4 = this.f44500e;
        r3.k kVar = this.f44497a;
        if (!z4) {
            kVar.e(this);
            if (j10 != -9223372036854775807L) {
                kVar.d(0L, j10);
            }
            this.f44500e = true;
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
                    cVar.f44494e = cVar.f44493c;
                } else {
                    cVar.f44495f = j11;
                    v j12 = qaVar.j1(cVar.f44491a);
                    cVar.f44494e = j12;
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
        this.f44503r = n0VarArr;
    }

    @Override
    public final v i2(int i10, int i11) {
        boolean z4;
        n0 n0Var;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f44503r == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            h5.a.i(z4);
            if (i11 == this.f44498b) {
                n0Var = this.f44499c;
            } else {
                n0Var = null;
            }
            cVar = new c(i10, i11, n0Var);
            qa qaVar = this.f44501f;
            long j10 = this.h;
            if (qaVar == null) {
                cVar.f44494e = cVar.f44493c;
            } else {
                cVar.f44495f = j10;
                v j12 = qaVar.j1(i11);
                cVar.f44494e = j12;
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
        this.f44502n = sVar;
    }
}
