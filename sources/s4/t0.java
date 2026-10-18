package s4;

import android.util.SparseArray;
public final class t0 {
    public final SparseArray f46076a = new SparseArray();
    public int f46077b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f46076a;
            if (i10 < sparseArray.size()) {
                ((s0) sparseArray.valueAt(i10)).f46073a.clear();
                i10++;
            } else {
                return;
            }
        }
    }

    public final s0 b(int i10) {
        SparseArray sparseArray = this.f46076a;
        s0 s0Var = (s0) sparseArray.get(i10);
        if (s0Var == null) {
            s0 s0Var2 = new s0();
            sparseArray.put(i10, s0Var2);
            return s0Var2;
        }
        return s0Var;
    }
}
