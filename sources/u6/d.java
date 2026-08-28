package u6;

import android.os.Build;
public abstract class d {
    public static final int f48134a;

    static {
        int i9;
        if (Build.VERSION.SDK_INT >= 31) {
            i9 = 33554432;
        } else {
            i9 = 0;
        }
        f48134a = i9;
    }
}
