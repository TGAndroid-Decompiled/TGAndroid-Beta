package p7;

import android.os.Build;
public abstract class b {
    public static final int f45503a;

    static {
        int i9;
        if (Build.VERSION.SDK_INT >= 31) {
            i9 = 33554432;
        } else {
            i9 = 0;
        }
        f45503a = i9;
    }
}
