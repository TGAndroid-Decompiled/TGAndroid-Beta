package q8;

import android.util.SparseIntArray;
public final class a {
    public static final Object f44235c = new Object();
    public static int d;
    public final SparseIntArray f44236a = new SparseIntArray();
    public final SparseIntArray f44237b = new SparseIntArray();

    public final int a(int i10) {
        synchronized (f44235c) {
            try {
                int i11 = this.f44236a.get(i10, -1);
                if (i11 != -1) {
                    return i11;
                }
                int i12 = d;
                d = i12 + 1;
                this.f44236a.append(i10, i12);
                this.f44237b.append(i12, i10);
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
