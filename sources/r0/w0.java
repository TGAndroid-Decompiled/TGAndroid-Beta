package r0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
public abstract class w0 {
    public static final Field f42269a;
    public static final Field f42270b;
    public static final Field f42271c;
    public static final boolean d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f42269a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f42270b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f42271c = declaredField3;
            declaredField3.setAccessible(true);
            d = true;
        } catch (ReflectiveOperationException e) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
        }
    }
}
