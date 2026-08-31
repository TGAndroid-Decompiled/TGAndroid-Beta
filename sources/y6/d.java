package y6;

import android.os.Build;
public abstract class d {
    public static final int f50793a;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        f50793a = i10;
    }
}
