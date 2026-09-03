package q4;

import android.util.SparseArray;
import j3.n0;
import n7.qa;
import org.telegram.ui.Components.jb;
import r3.s;
import r3.v;
public final class d implements r3.m {
    public static final jb f42752s = new Object();
    public final r3.k f42753a;
    public final int f42754b;
    public final n0 f42755c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public qa f42756f;
    public long h;
    public s f42757n;
    public n0[] f42758r;

    public d(r3.k kVar, int i10, n0 n0Var) {
        this.f42753a = kVar;
        this.f42754b = i10;
        this.f42755c = n0Var;
    }

    public final void a(qa qaVar, long j10, long j11) {
        this.f42756f = qaVar;
        this.h = j11;
        boolean z4 = this.e;
        r3.k kVar = this.f42753a;
        if (!z4) {
            kVar.e(this);
            if (j10 != -9223372036854775807L) {
                kVar.d(0L, j10);
            }
            this.e = true;
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
                    cVar.e = cVar.f42750c;
                } else {
                    cVar.f42751f = j11;
                    v M0 = qaVar.M0(cVar.f42748a);
                    cVar.e = M0;
                    n0 n0Var = cVar.d;
                    if (n0Var != null) {
                        M0.b(n0Var);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final v d2(int i10, int i11) {
        boolean z4;
        n0 n0Var;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f42758r == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            h5.a.i(z4);
            if (i11 == this.f42754b) {
                n0Var = this.f42755c;
            } else {
                n0Var = null;
            }
            cVar = new c(i10, i11, n0Var);
            qa qaVar = this.f42756f;
            long j10 = this.h;
            if (qaVar == null) {
                cVar.e = cVar.f42750c;
            } else {
                cVar.f42751f = j10;
                v M0 = qaVar.M0(i11);
                cVar.e = M0;
                n0 n0Var2 = cVar.d;
                if (n0Var2 != null) {
                    M0.b(n0Var2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    @Override
    public final void h2(s sVar) {
        this.f42757n = sVar;
    }

    @Override
    public final void j1() {
        SparseArray sparseArray = this.d;
        n0[] n0VarArr = new n0[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            n0 n0Var = ((c) sparseArray.valueAt(i10)).d;
            h5.a.j(n0Var);
            n0VarArr[i10] = n0Var;
        }
        this.f42758r = n0VarArr;
    }
}
