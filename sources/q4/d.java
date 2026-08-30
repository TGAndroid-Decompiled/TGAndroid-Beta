package q4;

import android.util.SparseArray;
import j3.n0;
import n7.qa;
import org.telegram.ui.Components.jb;
import r3.s;
import r3.v;
public final class d implements r3.m {
    public static final jb f42722s = new Object();
    public final r3.k f42723a;
    public final int f42724b;
    public final n0 f42725c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public qa f42726f;
    public long h;
    public s f42727n;
    public n0[] f42728r;

    public d(r3.k kVar, int i10, n0 n0Var) {
        this.f42723a = kVar;
        this.f42724b = i10;
        this.f42725c = n0Var;
    }

    public final void a(qa qaVar, long j10, long j11) {
        this.f42726f = qaVar;
        this.h = j11;
        boolean z4 = this.e;
        r3.k kVar = this.f42723a;
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
                    cVar.e = cVar.f42720c;
                } else {
                    cVar.f42721f = j11;
                    v k12 = qaVar.k1(cVar.f42718a);
                    cVar.e = k12;
                    n0 n0Var = cVar.d;
                    if (n0Var != null) {
                        k12.b(n0Var);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final v c2(int i10, int i11) {
        boolean z4;
        n0 n0Var;
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f42728r == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            h5.a.i(z4);
            if (i11 == this.f42724b) {
                n0Var = this.f42725c;
            } else {
                n0Var = null;
            }
            cVar = new c(i10, i11, n0Var);
            qa qaVar = this.f42726f;
            long j10 = this.h;
            if (qaVar == null) {
                cVar.e = cVar.f42720c;
            } else {
                cVar.f42721f = j10;
                v k12 = qaVar.k1(i11);
                cVar.e = k12;
                n0 n0Var2 = cVar.d;
                if (n0Var2 != null) {
                    k12.b(n0Var2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    @Override
    public final void f1() {
        SparseArray sparseArray = this.d;
        n0[] n0VarArr = new n0[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            n0 n0Var = ((c) sparseArray.valueAt(i10)).d;
            h5.a.j(n0Var);
            n0VarArr[i10] = n0Var;
        }
        this.f42728r = n0VarArr;
    }

    @Override
    public final void g2(s sVar) {
        this.f42727n = sVar;
    }
}
