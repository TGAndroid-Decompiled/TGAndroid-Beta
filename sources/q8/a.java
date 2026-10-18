package q8;

import android.util.SparseIntArray;
public final class a {
    public static final Object f44416c = new Object();
    public static int d;
    public final SparseIntArray f44417a = new SparseIntArray();
    public final SparseIntArray f44418b = new SparseIntArray();

    public final int a(int i10) {
        synchronized (f44416c) {
            try {
                int i11 = this.f44417a.get(i10, -1);
                if (i11 != -1) {
                    return i11;
                }
                int i12 = d;
                d = i12 + 1;
                this.f44417a.append(i10, i12);
                this.f44418b.append(i12, i10);
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
