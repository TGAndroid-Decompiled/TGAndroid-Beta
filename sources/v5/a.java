package v5;

import android.util.SparseArray;
import hg.c;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f43852a = new SparseArray();
    public static final HashMap f43853b;

    static {
        HashMap hashMap = new HashMap();
        f43853b = hashMap;
        hashMap.put(d.f10983a, 0);
        hashMap.put(d.f10984b, 1);
        hashMap.put(d.f10985c, 2);
        for (d dVar : hashMap.keySet()) {
            f43852a.append(((Integer) f43853b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f43853b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f43852a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.i(i10, "Unknown Priority for value "));
    }
}
