package p4;

import android.util.SparseArray;
public final class l0 implements Runnable {
    public final int f43865a;
    public final m0 f43866b;

    public l0(m0 m0Var, int i10) {
        this.f43865a = i10;
        this.f43866b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f43865a) {
            case 0:
                SparseArray sparseArray = this.f43866b.h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((o0) sparseArray.valueAt(i10)).getClass();
                    o0.a(null, null);
                }
                sparseArray.clear();
                return;
            default:
                m0 m0Var = this.f43866b;
                r0 r0Var = m0Var.f43874i;
                if (r0Var.f43907y == m0Var) {
                    r0Var.p();
                    return;
                }
                return;
        }
    }
}
