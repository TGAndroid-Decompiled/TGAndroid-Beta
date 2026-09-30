package v7;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class l7 {
    public static Field f44431a;
    public static boolean f44432b;
    public static Class f44433c;
    public static boolean d;
    public static Field e;
    public static boolean f44434f;
    public static Field f44435g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f44433c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e7) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
            }
            d = true;
        }
        Class cls = f44433c;
        if (cls != null) {
            if (!f44434f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
                }
                f44434f = true;
            }
            Field field = e;
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
