package v7;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
public abstract class i7 {
    public static Field f49220a;
    public static boolean f49221b;
    public static Class f49222c;
    public static boolean d;
    public static Field f49223e;
    public static boolean f49224f;
    public static Field f49225g;
    public static boolean h;

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                f49222c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e7) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
            }
            d = true;
        }
        Class cls = f49222c;
        if (cls != null) {
            if (!f49224f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f49223e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
                }
                f49224f = true;
            }
            Field field = f49223e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e11);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    g.w.a(longSparseArray);
                }
            }
        }
    }
}
