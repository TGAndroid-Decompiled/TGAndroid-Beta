package v4;

import android.util.SparseArray;
public final class v0 {
    public final SparseArray f59239a = new SparseArray();
    public int f59240b = 0;

    public final void a() {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f59239a;
            if (i7 < sparseArray.size()) {
                ((u0) sparseArray.valueAt(i7)).f59233a.clear();
                i7++;
            } else {
                return;
            }
        }
    }

    public final u0 b(int i7) {
        SparseArray sparseArray = this.f59239a;
        u0 u0Var = (u0) sparseArray.get(i7);
        if (u0Var == null) {
            u0 u0Var2 = new u0();
            sparseArray.put(i7, u0Var2);
            return u0Var2;
        }
        return u0Var;
    }
}
