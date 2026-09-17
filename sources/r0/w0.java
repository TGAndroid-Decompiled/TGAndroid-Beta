package r0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
public abstract class w0 {
    public static final Field f44741a;
    public static final Field f44742b;
    public static final Field f44743c;
    public static final boolean d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f44741a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f44742b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f44743c = declaredField3;
            declaredField3.setAccessible(true);
            d = true;
        } catch (ReflectiveOperationException e7) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e7.getMessage(), e7);
        }
    }
}
