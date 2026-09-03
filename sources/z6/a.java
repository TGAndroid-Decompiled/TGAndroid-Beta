package z6;

import android.os.Build;
public abstract class a {
    public static final int f47449a;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        f47449a = i10;
    }
}
