package s8;

import android.util.SparseIntArray;
public final class a {
    public static final Object f54675c = new Object();
    public static int d;
    public final SparseIntArray f54676a = new SparseIntArray();
    public final SparseIntArray f54677b = new SparseIntArray();

    public final int a(int i3) {
        synchronized (f54675c) {
            try {
                int i10 = this.f54676a.get(i3, -1);
                if (i10 != -1) {
                    return i10;
                }
                int i11 = d;
                d = i11 + 1;
                this.f54676a.append(i3, i11);
                this.f54677b.append(i11, i3);
                return i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
