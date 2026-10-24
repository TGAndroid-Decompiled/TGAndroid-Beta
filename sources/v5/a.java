package v5;

import android.util.SparseArray;
import i2.o1;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f48399a = new SparseArray();
    public static final HashMap f48400b;

    static {
        HashMap hashMap = new HashMap();
        f48400b = hashMap;
        hashMap.put(d.f12740a, 0);
        hashMap.put(d.f12741b, 1);
        hashMap.put(d.f12742c, 2);
        for (d dVar : hashMap.keySet()) {
            f48399a.append(((Integer) f48400b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f48400b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f48399a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(o1.k(i10, "Unknown Priority for value "));
    }
}
