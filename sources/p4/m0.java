package p4;

import android.util.SparseArray;
public final class m0 implements Runnable {
    public final int f45280a;
    public final n0 f45281b;

    public m0(n0 n0Var, int i10) {
        this.f45280a = i10;
        this.f45281b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f45280a) {
            case 0:
                SparseArray sparseArray = this.f45281b.h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p0) sparseArray.valueAt(i10)).getClass();
                    p0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                n0 n0Var = this.f45281b;
                s0 s0Var = n0Var.f45290i;
                if (s0Var.f45322y == n0Var) {
                    s0Var.p();
                    return;
                }
                return;
        }
    }
}
