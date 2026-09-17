package v7;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class k7 {
    public static Field f47508a;
    public static boolean f47509b;
    public static Class f47510c;
    public static boolean d;
    public static Field f47511e;
    public static boolean f47512f;
    public static Field f47513g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f47510c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e7) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
            }
            d = true;
        }
        Class cls = f47510c;
        if (cls != null) {
            if (!f47512f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f47511e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
                }
                f47512f = true;
            }
            Field field = f47511e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e11);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    g.x.a(longSparseArray);
                }
            }
        }
    }
}
