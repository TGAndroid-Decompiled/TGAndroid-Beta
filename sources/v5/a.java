package v5;

import android.util.SparseArray;
import hc.b;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f42922a = new SparseArray();
    public static final HashMap f42923b;

    static {
        HashMap hashMap = new HashMap();
        f42923b = hashMap;
        hashMap.put(d.f10477a, 0);
        hashMap.put(d.f10478b, 1);
        hashMap.put(d.f10479c, 2);
        for (d dVar : hashMap.keySet()) {
            f42922a.append(((Integer) f42923b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f42923b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f42922a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(b.j(i10, "Unknown Priority for value "));
    }
}
