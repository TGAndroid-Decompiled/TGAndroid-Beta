package v5;

import android.util.SparseArray;
import hg.k0;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f43902a = new SparseArray();
    public static final HashMap f43903b;

    static {
        HashMap hashMap = new HashMap();
        f43903b = hashMap;
        hashMap.put(d.f10993a, 0);
        hashMap.put(d.f10994b, 1);
        hashMap.put(d.f10995c, 2);
        for (d dVar : hashMap.keySet()) {
            f43902a.append(((Integer) f43903b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f43903b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f43902a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(k0.i(i10, "Unknown Priority for value "));
    }
}
