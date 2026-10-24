package q8;

import android.util.SparseIntArray;
public final class a {
    public static final Object f44836c = new Object();
    public static int d;
    public final SparseIntArray f44837a = new SparseIntArray();
    public final SparseIntArray f44838b = new SparseIntArray();

    public final int a(int i10) {
        synchronized (f44836c) {
            try {
                int i11 = this.f44837a.get(i10, -1);
                if (i11 != -1) {
                    return i11;
                }
                int i12 = d;
                d = i12 + 1;
                this.f44837a.append(i10, i12);
                this.f44838b.append(i12, i10);
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
