package w7;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class q7 {
    public static Method f45097a;
    public static boolean f45098b;
    public static Field f45099c;
    public static boolean d;

    public static void a(m.x xVar, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.F(xVar, z10);
            return;
        }
        if (!d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f45099c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
            d = true;
        }
        Field field = f45099c;
        if (field != null) {
            try {
                field.set(xVar, Boolean.valueOf(z10));
            } catch (IllegalAccessException e7) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e7);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.H(popupWindow, i10);
            return;
        }
        if (!f45098b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f45097a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f45098b = true;
        }
        Method method = f45097a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }
}
