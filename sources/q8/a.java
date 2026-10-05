package q8;

import android.util.SparseIntArray;
public final class a {
    public static final Object f44848c = new Object();
    public static int d;
    public final SparseIntArray f44849a = new SparseIntArray();
    public final SparseIntArray f44850b = new SparseIntArray();

    public final int a(int i10) {
        synchronized (f44848c) {
            try {
                int i11 = this.f44849a.get(i10, -1);
                if (i11 != -1) {
                    return i11;
                }
                int i12 = d;
                d = i12 + 1;
                this.f44849a.append(i10, i12);
                this.f44850b.append(i12, i10);
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
