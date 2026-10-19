package v5;

import android.util.SparseArray;
import i2.e;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f47953a = new SparseArray();
    public static final HashMap f47954b;

    static {
        HashMap hashMap = new HashMap();
        f47954b = hashMap;
        hashMap.put(d.f12708a, 0);
        hashMap.put(d.f12709b, 1);
        hashMap.put(d.f12710c, 2);
        for (d dVar : hashMap.keySet()) {
            f47953a.append(((Integer) f47954b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f47954b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f47953a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(e.j(i10, "Unknown Priority for value "));
    }
}
