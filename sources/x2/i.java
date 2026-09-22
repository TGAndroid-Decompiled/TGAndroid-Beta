package x2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b2.m1;
import b2.p1;
import b2.q1;
import java.util.HashMap;
import java.util.Map;
public final class i extends p1 {
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final SparseArray M;
    public final SparseBooleanArray N;

    public i(j jVar) {
        d(jVar);
        this.F = jVar.f45491o0;
        this.G = jVar.f45492p0;
        this.H = jVar.f45493q0;
        this.I = jVar.f45494r0;
        this.J = jVar.f45495s0;
        this.K = jVar.f45496t0;
        this.L = jVar.f45497u0;
        SparseArray sparseArray = jVar.f45498v0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.M = sparseArray2;
        this.N = jVar.f45499w0.clone();
    }

    @Override
    public final void a(m1 m1Var) {
        this.D.put(m1Var.f3117a, m1Var);
    }

    @Override
    public final q1 b() {
        return new j(this);
    }

    @Override
    public final p1 c() {
        super.c();
        return this;
    }

    public i() {
        this.M = new SparseArray();
        this.N = new SparseBooleanArray();
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = true;
        this.K = true;
        this.L = true;
    }
}
