package w7;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class q7 {
    public static Method f45203a;
    public static boolean f45204b;
    public static Field f45205c;
    public static boolean d;

    public static void a(m.x xVar, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            e0.b.F(xVar, z10);
            return;
        }
        if (!d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f45205c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
            d = true;
        }
        Field field = f45205c;
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
        if (!f45204b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f45203a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f45204b = true;
        }
        Method method = f45203a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }
}
