package y5;

import android.util.SparseArray;
import i5.c;
import java.util.HashMap;
import l5.d;
public abstract class a {
    public static final SparseArray f60766a = new SparseArray();
    public static final HashMap f60767b;

    static {
        HashMap hashMap = new HashMap();
        f60767b = hashMap;
        hashMap.put(d.f19669a, 0);
        hashMap.put(d.f19670b, 1);
        hashMap.put(d.f19671c, 2);
        for (d dVar : hashMap.keySet()) {
            f60766a.append(((Integer) f60767b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f60767b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i7) {
        d dVar = (d) f60766a.get(i7);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.i(i7, "Unknown Priority for value "));
    }
}
