package v7;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class k7 {
    public static Field f47996a;
    public static boolean f47997b;
    public static Class f47998c;
    public static boolean d;
    public static Field f47999e;
    public static boolean f48000f;
    public static Field f48001g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f47998c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e7) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
            }
            d = true;
        }
        Class cls = f47998c;
        if (cls != null) {
            if (!f48000f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f47999e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
                }
                f48000f = true;
            }
            Field field = f47999e;
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
