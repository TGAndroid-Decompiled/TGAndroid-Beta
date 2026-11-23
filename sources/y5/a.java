package y5;

import android.util.SparseArray;
import i5.c;
import java.util.HashMap;
import l5.d;
public abstract class a {
    public static final SparseArray f60801a = new SparseArray();
    public static final HashMap f60802b;

    static {
        HashMap hashMap = new HashMap();
        f60802b = hashMap;
        hashMap.put(d.f19703a, 0);
        hashMap.put(d.f19704b, 1);
        hashMap.put(d.f19705c, 2);
        for (d dVar : hashMap.keySet()) {
            f60801a.append(((Integer) f60802b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f60802b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i7) {
        d dVar = (d) f60801a.get(i7);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.i(i7, "Unknown Priority for value "));
    }
}
