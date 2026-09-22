package q8;

import android.util.SparseIntArray;
public final class a {
    public static final Object f41494c = new Object();
    public static int d;
    public final SparseIntArray f41495a = new SparseIntArray();
    public final SparseIntArray f41496b = new SparseIntArray();

    public final int a(int i10) {
        synchronized (f41494c) {
            try {
                int i11 = this.f41495a.get(i10, -1);
                if (i11 != -1) {
                    return i11;
                }
                int i12 = d;
                d = i12 + 1;
                this.f41495a.append(i10, i12);
                this.f41496b.append(i12, i10);
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
