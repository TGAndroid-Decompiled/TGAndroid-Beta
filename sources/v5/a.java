package v5;

import android.util.SparseArray;
import hg.c;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f49345a = new SparseArray();
    public static final HashMap f49346b;

    static {
        HashMap hashMap = new HashMap();
        f49346b = hashMap;
        hashMap.put(d.f12012a, 0);
        hashMap.put(d.f12013b, 1);
        hashMap.put(d.f12014c, 2);
        for (d dVar : hashMap.keySet()) {
            f49345a.append(((Integer) f49346b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f49346b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f49345a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.i(i10, "Unknown Priority for value "));
    }
}
