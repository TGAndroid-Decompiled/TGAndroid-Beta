package v7;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
public abstract class o8 {
    public static Method f47543a;
    public static boolean f47544b;
    public static Method f47545c;
    public static boolean d;

    public static int a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.i(drawable);
        }
        if (!d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f47545c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e7) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e7);
            }
            d = true;
        }
        Method method = f47545c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, null)).intValue();
            } catch (Exception e10) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e10);
                f47545c = null;
                return 0;
            }
        }
        return 0;
    }

    public static boolean b(int i10, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.D(i10, drawable);
        }
        if (!f47544b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f47543a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e7) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e7);
            }
            f47544b = true;
        }
        Method method = f47543a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i10));
                return true;
            } catch (Exception e10) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e10);
                f47543a = null;
            }
        }
        return false;
    }

    public static void c(int i10, Drawable drawable) {
        drawable.setTint(i10);
    }

    public static Drawable d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 && !(drawable instanceof j0.b)) {
            ?? drawable2 = new Drawable();
            drawable2.d = drawable2.c();
            drawable2.h(drawable);
            j0.d.a();
            return drawable2;
        }
        return drawable;
    }
}
