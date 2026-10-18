package v5;

import android.util.SparseArray;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f47998a = new SparseArray();
    public static final HashMap f47999b;

    static {
        HashMap hashMap = new HashMap();
        f47999b = hashMap;
        hashMap.put(d.f12710a, 0);
        hashMap.put(d.f12711b, 1);
        hashMap.put(d.f12712c, 2);
        for (d dVar : hashMap.keySet()) {
            f47998a.append(((Integer) f47999b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f47999b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f47998a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(i2.d.j(i10, "Unknown Priority for value "));
    }
}
