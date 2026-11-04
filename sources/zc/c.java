package zc;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;
public abstract class c {
    public static final Map f60380a;

    static {
        Map map;
        try {
            Field declaredField = ff.b.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th2) {
            Map map2 = Collections.EMPTY_MAP;
            th2.printStackTrace();
            map = map2;
        }
        f60380a = map;
    }
}
