package p4;

import android.util.SparseArray;
public final class m0 implements Runnable {
    public final int f44781a;
    public final n0 f44782b;

    public m0(n0 n0Var, int i10) {
        this.f44781a = i10;
        this.f44782b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f44781a) {
            case 0:
                SparseArray sparseArray = this.f44782b.h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p0) sparseArray.valueAt(i10)).getClass();
                    p0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                n0 n0Var = this.f44782b;
                s0 s0Var = n0Var.f44790i;
                if (s0Var.D == n0Var) {
                    s0Var.p();
                    return;
                }
                return;
        }
    }
}
