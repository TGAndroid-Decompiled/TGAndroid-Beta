package y5;

import android.util.SparseArray;
import java.util.HashMap;
import jg.g;
import l5.d;
public abstract class a {
    public static final SparseArray f58977a = new SparseArray();
    public static final HashMap f58978b;

    static {
        HashMap hashMap = new HashMap();
        f58978b = hashMap;
        hashMap.put(d.f18178a, 0);
        hashMap.put(d.f18179b, 1);
        hashMap.put(d.f18180c, 2);
        for (d dVar : hashMap.keySet()) {
            f58977a.append(((Integer) f58978b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f58978b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i7) {
        d dVar = (d) f58977a.get(i7);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(g.j(i7, "Unknown Priority for value "));
    }
}
