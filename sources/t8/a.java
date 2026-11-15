package t8;

import android.util.SparseIntArray;
public final class a {
    public static final Object f57048c = new Object();
    public static int d;
    public final SparseIntArray f57049a = new SparseIntArray();
    public final SparseIntArray f57050b = new SparseIntArray();

    public final int a(int i7) {
        synchronized (f57048c) {
            try {
                int i10 = this.f57049a.get(i7, -1);
                if (i10 != -1) {
                    return i10;
                }
                int i11 = d;
                d = i11 + 1;
                this.f57049a.append(i7, i11);
                this.f57050b.append(i11, i7);
                return i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
