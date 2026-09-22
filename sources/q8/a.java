package q8;

import android.util.SparseIntArray;
public final class a {
    public static final Object f41167c = new Object();
    public static int d;
    public final SparseIntArray f41168a = new SparseIntArray();
    public final SparseIntArray f41169b = new SparseIntArray();

    public final int a(int i10) {
        synchronized (f41167c) {
            try {
                int i11 = this.f41168a.get(i10, -1);
                if (i11 != -1) {
                    return i11;
                }
                int i12 = d;
                d = i12 + 1;
                this.f41168a.append(i10, i12);
                this.f41169b.append(i12, i10);
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
