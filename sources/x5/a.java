package x5;

import android.util.SparseArray;
import java.util.HashMap;
import k2.p1;
import k5.d;
public abstract class a {
    public static final SparseArray f58223a = new SparseArray();
    public static final HashMap f58224b;

    static {
        HashMap hashMap = new HashMap();
        f58224b = hashMap;
        hashMap.put(d.f16877a, 0);
        hashMap.put(d.f16878b, 1);
        hashMap.put(d.f16879c, 2);
        for (d dVar : hashMap.keySet()) {
            f58223a.append(((Integer) f58224b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f58224b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i3) {
        d dVar = (d) f58223a.get(i3);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(p1.i(i3, "Unknown Priority for value "));
    }
}
