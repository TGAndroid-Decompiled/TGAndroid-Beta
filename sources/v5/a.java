package v5;

import android.util.SparseArray;
import hg.c;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f49238a = new SparseArray();
    public static final HashMap f49239b;

    static {
        HashMap hashMap = new HashMap();
        f49239b = hashMap;
        hashMap.put(d.f12013a, 0);
        hashMap.put(d.f12014b, 1);
        hashMap.put(d.f12015c, 2);
        for (d dVar : hashMap.keySet()) {
            f49238a.append(((Integer) f49239b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f49239b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f49238a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.h(i10, "Unknown Priority for value "));
    }
}
