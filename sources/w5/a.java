package w5;

import android.util.SparseArray;
import j5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f50859a = new SparseArray();
    public static final HashMap f50860b;

    static {
        HashMap hashMap = new HashMap();
        f50860b = hashMap;
        hashMap.put(d.f15512a, 0);
        hashMap.put(d.f15513b, 1);
        hashMap.put(d.f15514c, 2);
        for (d dVar : hashMap.keySet()) {
            f50859a.append(((Integer) f50860b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f50860b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f50859a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(ic.a.i(i10, "Unknown Priority for value "));
    }
}
