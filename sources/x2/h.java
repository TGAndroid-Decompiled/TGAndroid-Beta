package x2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b2.q1;
import b2.s1;
import b2.t1;
import java.util.HashMap;
import java.util.Map;
public final class h extends s1 {
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
        this.J = iVar.f49594w0;
        this.K = iVar.f49595x0;
        this.L = iVar.f49596y0;
        this.M = iVar.f49597z0;
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
    public final void a(q1 q1Var) {
        this.H.put(q1Var.f3934a, q1Var);
    }

    @Override
    public final t1 b() {
        return new i(this);
    }

    @Override
    public final s1 c() {
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
