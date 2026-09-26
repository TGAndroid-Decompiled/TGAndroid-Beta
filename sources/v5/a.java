package v5;

import android.util.SparseArray;
import hg.c;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f44184a = new SparseArray();
    public static final HashMap f44185b;

    static {
        HashMap hashMap = new HashMap();
        f44185b = hashMap;
        hashMap.put(d.f10983a, 0);
        hashMap.put(d.f10984b, 1);
        hashMap.put(d.f10985c, 2);
        for (d dVar : hashMap.keySet()) {
            f44184a.append(((Integer) f44185b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f44185b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f44184a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.h(i10, "Unknown Priority for value "));
    }
}
