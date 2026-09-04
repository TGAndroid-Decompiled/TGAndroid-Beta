package w7;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class p7 {
    public static Method f48258a;
    public static boolean f48259b;
    public static Field f48260c;
    public static boolean d;

    public static void a(m.x xVar, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.F(xVar, z10);
            return;
        }
        if (!d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f48260c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e7);
            }
            d = true;
        }
        Field field = f48260c;
        if (field != null) {
            try {
                field.set(xVar, Boolean.valueOf(z10));
            } catch (IllegalAccessException e10) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e10);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.H(popupWindow, i10);
            return;
        }
        if (!f48259b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f48258a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f48259b = true;
        }
        Method method = f48258a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }
}
