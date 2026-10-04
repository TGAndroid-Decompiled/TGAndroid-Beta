package v5;

import android.util.SparseArray;
import hg.k0;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f47844a = new SparseArray();
    public static final HashMap f47845b;

    static {
        HashMap hashMap = new HashMap();
        f47845b = hashMap;
        hashMap.put(d.f11963a, 0);
        hashMap.put(d.f11964b, 1);
        hashMap.put(d.f11965c, 2);
        for (d dVar : hashMap.keySet()) {
            f47844a.append(((Integer) f47845b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f47845b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f47844a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(k0.h(i10, "Unknown Priority for value "));
    }
}
