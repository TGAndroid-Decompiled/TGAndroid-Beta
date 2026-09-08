package v5;

import android.util.SparseArray;
import i2.g;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f47393a = new SparseArray();
    public static final HashMap f47394b;

    static {
        HashMap hashMap = new HashMap();
        f47394b = hashMap;
        hashMap.put(d.f11885a, 0);
        hashMap.put(d.f11886b, 1);
        hashMap.put(d.f11887c, 2);
        for (d dVar : hashMap.keySet()) {
            f47393a.append(((Integer) f47394b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f47394b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f47393a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(g.i(i10, "Unknown Priority for value "));
    }
}
