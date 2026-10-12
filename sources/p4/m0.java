package p4;

import android.util.SparseArray;
public final class m0 implements Runnable {
    public final int f43068a;
    public final n0 f43069b;

    public m0(n0 n0Var, int i10) {
        this.f43068a = i10;
        this.f43069b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f43068a) {
            case 0:
                SparseArray sparseArray = this.f43069b.h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p0) sparseArray.valueAt(i10)).getClass();
                    p0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                n0 n0Var = this.f43069b;
                s0 s0Var = n0Var.f43077i;
                if (s0Var.f43106y == n0Var) {
                    s0Var.p();
                    return;
                }
                return;
        }
    }
}
