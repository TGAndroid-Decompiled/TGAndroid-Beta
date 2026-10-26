package r8;

import android.util.SparseIntArray;
public final class a {
    public static final Object f47308c = new Object();
    public static int d;
    public final SparseIntArray f47309a = new SparseIntArray();
    public final SparseIntArray f47310b = new SparseIntArray();

    public final int a(int i10) {
        synchronized (f47308c) {
            try {
                int i11 = this.f47309a.get(i10, -1);
                if (i11 != -1) {
                    return i11;
                }
                int i12 = d;
                d = i12 + 1;
                this.f47309a.append(i10, i12);
                this.f47310b.append(i12, i10);
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
