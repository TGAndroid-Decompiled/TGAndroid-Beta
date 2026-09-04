package v7;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class k7 {
    public static Field f47507a;
    public static boolean f47508b;
    public static Class f47509c;
    public static boolean d;
    public static Field f47510e;
    public static boolean f47511f;
    public static Field f47512g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f47509c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e7) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
            }
            d = true;
        }
        Class cls = f47509c;
        if (cls != null) {
            if (!f47511f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f47510e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
                }
                f47511f = true;
            }
            Field field = f47510e;
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
