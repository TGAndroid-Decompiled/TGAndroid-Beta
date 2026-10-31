package v5;

import android.util.SparseArray;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f50373a = new SparseArray();
    public static final HashMap f50374b;

    static {
        HashMap hashMap = new HashMap();
        f50374b = hashMap;
        hashMap.put(d.f8206a, 0);
        hashMap.put(d.f8207b, 1);
        hashMap.put(d.f8208c, 2);
        for (d dVar : hashMap.keySet()) {
            f50373a.append(((Integer) f50374b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f50374b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f50373a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(i0.a.i(i10, "Unknown Priority for value "));
    }
}
