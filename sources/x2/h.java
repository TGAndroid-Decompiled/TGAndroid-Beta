package x2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b2.m1;
import b2.p1;
import b2.q1;
import java.util.HashMap;
import java.util.Map;
public final class h extends p1 {
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final SparseArray M;
    public final SparseBooleanArray N;

    public h(i iVar) {
        d(iVar);
        this.F = iVar.f44514o0;
        this.G = iVar.f44515p0;
        this.H = iVar.f44516q0;
        this.I = iVar.f44517r0;
        this.J = iVar.f44518s0;
        this.K = iVar.f44519t0;
        this.L = iVar.f44520u0;
        SparseArray sparseArray = iVar.f44521v0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.M = sparseArray2;
        this.N = iVar.f44522w0.clone();
    }

    @Override
    public final void a(m1 m1Var) {
        this.D.put(m1Var.f1811a, m1Var);
    }

    @Override
    public final q1 b() {
        return new i(this);
    }

    @Override
    public final p1 c() {
        super.c();
        return this;
    }

    public h() {
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
