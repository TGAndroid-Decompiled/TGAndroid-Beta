package v5;

import android.util.SparseArray;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f50387a = new SparseArray();
    public static final HashMap f50388b;

    static {
        HashMap hashMap = new HashMap();
        f50388b = hashMap;
        hashMap.put(d.f8207a, 0);
        hashMap.put(d.f8208b, 1);
        hashMap.put(d.f8209c, 2);
        for (d dVar : hashMap.keySet()) {
            f50387a.append(((Integer) f50388b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f50388b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f50387a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(i0.a.i(i10, "Unknown Priority for value "));
    }
}
