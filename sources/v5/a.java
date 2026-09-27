package v5;

import android.util.SparseArray;
import hg.k0;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f44230a = new SparseArray();
    public static final HashMap f44231b;

    static {
        HashMap hashMap = new HashMap();
        f44231b = hashMap;
        hashMap.put(d.f10986a, 0);
        hashMap.put(d.f10987b, 1);
        hashMap.put(d.f10988c, 2);
        for (d dVar : hashMap.keySet()) {
            f44230a.append(((Integer) f44231b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f44231b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f44230a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(k0.h(i10, "Unknown Priority for value "));
    }
}
