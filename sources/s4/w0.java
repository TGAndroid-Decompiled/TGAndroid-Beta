package s4;

import android.util.SparseArray;
public final class w0 {
    public final SparseArray f47891a = new SparseArray();
    public int f47892b = 0;

    public final void a() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f47891a;
            if (i10 < sparseArray.size()) {
                ((v0) sparseArray.valueAt(i10)).f47885a.clear();
                i10++;
            } else {
                return;
            }
        }
    }

    public final v0 b(int i10) {
        SparseArray sparseArray = this.f47891a;
        v0 v0Var = (v0) sparseArray.get(i10);
        if (v0Var == null) {
            v0 v0Var2 = new v0();
            sparseArray.put(i10, v0Var2);
            return v0Var2;
        }
        return v0Var;
    }
}
