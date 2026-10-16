package x2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b2.r1;
import b2.t1;
import b2.u1;
import java.util.HashMap;
import java.util.Map;
public final class h extends t1 {
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    public h(i iVar) {
        d(iVar);
        this.J = iVar.f47755w0;
        this.K = iVar.f47756x0;
        this.L = iVar.f47757y0;
        this.M = iVar.f47758z0;
        this.N = iVar.A0;
        this.O = iVar.B0;
        this.P = iVar.C0;
        SparseArray sparseArray = iVar.D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.Q = sparseArray2;
        this.R = iVar.E0.clone();
    }

    @Override
    public final void a(r1 r1Var) {
        this.H.put(r1Var.f2322a, r1Var);
    }

    @Override
    public final u1 b() {
        return new i(this);
    }

    @Override
    public final t1 c() {
        super.c();
        return this;
    }

    public h() {
        this.Q = new SparseArray();
        this.R = new SparseBooleanArray();
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
    }
}
