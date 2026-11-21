package y5;

import android.util.SparseArray;
import i5.c;
import java.util.HashMap;
import l5.d;
public abstract class a {
    public static final SparseArray f60797a = new SparseArray();
    public static final HashMap f60798b;

    static {
        HashMap hashMap = new HashMap();
        f60798b = hashMap;
        hashMap.put(d.f19700a, 0);
        hashMap.put(d.f19701b, 1);
        hashMap.put(d.f19702c, 2);
        for (d dVar : hashMap.keySet()) {
            f60797a.append(((Integer) f60798b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f60798b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i7) {
        d dVar = (d) f60797a.get(i7);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.i(i7, "Unknown Priority for value "));
    }
}
