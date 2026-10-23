package v5;

import android.util.SparseArray;
import i2.e;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f47962a = new SparseArray();
    public static final HashMap f47963b;

    static {
        HashMap hashMap = new HashMap();
        f47963b = hashMap;
        hashMap.put(d.f12708a, 0);
        hashMap.put(d.f12709b, 1);
        hashMap.put(d.f12710c, 2);
        for (d dVar : hashMap.keySet()) {
            f47962a.append(((Integer) f47963b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f47963b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f47962a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(e.j(i10, "Unknown Priority for value "));
    }
}
