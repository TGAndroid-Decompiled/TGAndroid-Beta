package v5;

import android.util.SparseArray;
import hg.c;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f47853a = new SparseArray();
    public static final HashMap f47854b;

    static {
        HashMap hashMap = new HashMap();
        f47854b = hashMap;
        hashMap.put(d.f11964a, 0);
        hashMap.put(d.f11965b, 1);
        hashMap.put(d.f11966c, 2);
        for (d dVar : hashMap.keySet()) {
            f47853a.append(((Integer) f47854b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f47854b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f47853a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.h(i10, "Unknown Priority for value "));
    }
}
