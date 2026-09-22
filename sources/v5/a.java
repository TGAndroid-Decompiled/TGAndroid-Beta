package v5;

import android.util.SparseArray;
import hg.c;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f43898a = new SparseArray();
    public static final HashMap f43899b;

    static {
        HashMap hashMap = new HashMap();
        f43899b = hashMap;
        hashMap.put(d.f10995a, 0);
        hashMap.put(d.f10996b, 1);
        hashMap.put(d.f10997c, 2);
        for (d dVar : hashMap.keySet()) {
            f43898a.append(((Integer) f43899b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f43899b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f43898a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.i(i10, "Unknown Priority for value "));
    }
}
