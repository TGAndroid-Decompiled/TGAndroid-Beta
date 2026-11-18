package t8;

import android.util.SparseIntArray;
public final class a {
    public static final Object f57624c = new Object();
    public static int d;
    public final SparseIntArray f57625a = new SparseIntArray();
    public final SparseIntArray f57626b = new SparseIntArray();

    public final int a(int i7) {
        synchronized (f57624c) {
            try {
                int i10 = this.f57625a.get(i7, -1);
                if (i10 != -1) {
                    return i10;
                }
                int i11 = d;
                d = i11 + 1;
                this.f57625a.append(i7, i11);
                this.f57626b.append(i11, i7);
                return i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
