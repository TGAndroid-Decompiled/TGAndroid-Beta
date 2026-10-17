package v5;

import android.util.SparseArray;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f47973a = new SparseArray();
    public static final HashMap f47974b;

    static {
        HashMap hashMap = new HashMap();
        f47974b = hashMap;
        hashMap.put(d.f12712a, 0);
        hashMap.put(d.f12713b, 1);
        hashMap.put(d.f12714c, 2);
        for (d dVar : hashMap.keySet()) {
            f47973a.append(((Integer) f47974b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f47974b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f47973a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(i0.a.j(i10, "Unknown Priority for value "));
    }
}
