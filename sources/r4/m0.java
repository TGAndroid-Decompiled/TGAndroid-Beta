package r4;

import android.util.SparseArray;
public final class m0 implements Runnable {
    public final int f54318a;
    public final n0 f54319b;

    public m0(n0 n0Var, int i3) {
        this.f54318a = i3;
        this.f54319b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f54318a) {
            case 0:
                SparseArray sparseArray = this.f54319b.h;
                int size = sparseArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((p0) sparseArray.valueAt(i3)).getClass();
                    p0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                n0 n0Var = this.f54319b;
                s0 s0Var = n0Var.f54328i;
                if (s0Var.E == n0Var) {
                    s0Var.p();
                    return;
                }
                return;
        }
    }
}
