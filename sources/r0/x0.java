package r0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
public abstract class x0 {
    public static final Field f46512a;
    public static final Field f46513b;
    public static final Field f46514c;
    public static final boolean d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f46512a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f46513b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f46514c = declaredField3;
            declaredField3.setAccessible(true);
            d = true;
        } catch (ReflectiveOperationException e6) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e6.getMessage(), e6);
        }
    }
}
