package q8;

import android.util.SparseIntArray;
public final class a {
    public static final Object f41490c = new Object();
    public static int d;
    public final SparseIntArray f41491a = new SparseIntArray();
    public final SparseIntArray f41492b = new SparseIntArray();

    public final int a(int i10) {
        synchronized (f41490c) {
            try {
                int i11 = this.f41491a.get(i10, -1);
                if (i11 != -1) {
                    return i11;
                }
                int i12 = d;
                d = i12 + 1;
                this.f41491a.append(i10, i12);
                this.f41492b.append(i12, i10);
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
