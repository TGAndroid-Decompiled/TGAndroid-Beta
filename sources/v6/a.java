package v6;

import android.os.Build;
public abstract class a {
    public static final int f48359a;

    static {
        int i9;
        if (Build.VERSION.SDK_INT >= 31) {
            i9 = 33554432;
        } else {
            i9 = 0;
        }
        f48359a = i9;
    }
}
