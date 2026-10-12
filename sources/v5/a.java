package v5;

import android.util.SparseArray;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f46565a = new SparseArray();
    public static final HashMap f46566b;

    static {
        HashMap hashMap = new HashMap();
        f46566b = hashMap;
        hashMap.put(d.f11319a, 0);
        hashMap.put(d.f11320b, 1);
        hashMap.put(d.f11321c, 2);
        for (d dVar : hashMap.keySet()) {
            f46565a.append(((Integer) f46566b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f46566b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f46565a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(i2.d.i(i10, "Unknown Priority for value "));
    }
}
