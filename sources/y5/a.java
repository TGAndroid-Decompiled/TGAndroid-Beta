package y5;

import android.util.SparseArray;
import i5.c;
import java.util.HashMap;
import l5.d;
public abstract class a {
    public static final SparseArray f60884a = new SparseArray();
    public static final HashMap f60885b;

    static {
        HashMap hashMap = new HashMap();
        f60885b = hashMap;
        hashMap.put(d.f19769a, 0);
        hashMap.put(d.f19770b, 1);
        hashMap.put(d.f19771c, 2);
        for (d dVar : hashMap.keySet()) {
            f60884a.append(((Integer) f60885b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f60885b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i7) {
        d dVar = (d) f60884a.get(i7);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.i(i7, "Unknown Priority for value "));
    }
}
