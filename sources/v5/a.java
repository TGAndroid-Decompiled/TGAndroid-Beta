package v5;

import android.util.SparseArray;
import hg.k0;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f44156a = new SparseArray();
    public static final HashMap f44157b;

    static {
        HashMap hashMap = new HashMap();
        f44157b = hashMap;
        hashMap.put(d.f10996a, 0);
        hashMap.put(d.f10997b, 1);
        hashMap.put(d.f10998c, 2);
        for (d dVar : hashMap.keySet()) {
            f44156a.append(((Integer) f44157b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f44157b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f44156a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(k0.h(i10, "Unknown Priority for value "));
    }
}
