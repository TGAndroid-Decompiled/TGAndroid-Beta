package v5;

import android.util.SparseArray;
import hg.k0;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f43930a = new SparseArray();
    public static final HashMap f43931b;

    static {
        HashMap hashMap = new HashMap();
        f43931b = hashMap;
        hashMap.put(d.f10996a, 0);
        hashMap.put(d.f10997b, 1);
        hashMap.put(d.f10998c, 2);
        for (d dVar : hashMap.keySet()) {
            f43930a.append(((Integer) f43931b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f43931b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f43930a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(k0.i(i10, "Unknown Priority for value "));
    }
}
