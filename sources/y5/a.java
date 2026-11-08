package y5;

import android.util.SparseArray;
import java.util.HashMap;
import jg.g;
import l5.d;
public abstract class a {
    public static final SparseArray f58969a = new SparseArray();
    public static final HashMap f58970b;

    static {
        HashMap hashMap = new HashMap();
        f58970b = hashMap;
        hashMap.put(d.f18175a, 0);
        hashMap.put(d.f18176b, 1);
        hashMap.put(d.f18177c, 2);
        for (d dVar : hashMap.keySet()) {
            f58969a.append(((Integer) f58970b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f58970b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i7) {
        d dVar = (d) f58969a.get(i7);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(g.j(i7, "Unknown Priority for value "));
    }
}
