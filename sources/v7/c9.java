package v7;

import android.os.Build;
public abstract class c9 {
    public static t7.r f47996a;

    public static boolean a(int i10) {
        if (i10 == 8 || i10 == 7) {
            return true;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 && (i10 == 26 || i10 == 27)) {
            return true;
        }
        if (i11 >= 33 && i10 == 30) {
            return true;
        }
        return false;
    }

    public static synchronized y8 b(v8 v8Var) {
        y8 y8Var;
        synchronized (c9.class) {
            try {
                if (f47996a == null) {
                    f47996a = new t7.r(1);
                }
                y8Var = (y8) f47996a.R0(v8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y8Var;
    }
}
