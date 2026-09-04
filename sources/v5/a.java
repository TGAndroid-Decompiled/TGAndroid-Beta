package v5;

import android.util.SparseArray;
import i2.g;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f47365a = new SparseArray();
    public static final HashMap f47366b;

    static {
        HashMap hashMap = new HashMap();
        f47366b = hashMap;
        hashMap.put(d.f11859a, 0);
        hashMap.put(d.f11860b, 1);
        hashMap.put(d.f11861c, 2);
        for (d dVar : hashMap.keySet()) {
            f47365a.append(((Integer) f47366b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f47366b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f47365a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(g.i(i10, "Unknown Priority for value "));
    }
}
