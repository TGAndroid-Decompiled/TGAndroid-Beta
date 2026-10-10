package v5;

import android.util.SparseArray;
import hg.c;
import i5.d;
import java.util.HashMap;
public abstract class a {
    public static final SparseArray f49161a = new SparseArray();
    public static final HashMap f49162b;

    static {
        HashMap hashMap = new HashMap();
        f49162b = hashMap;
        hashMap.put(d.f12014a, 0);
        hashMap.put(d.f12015b, 1);
        hashMap.put(d.f12016c, 2);
        for (d dVar : hashMap.keySet()) {
            f49161a.append(((Integer) f49162b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f49162b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f49161a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.h(i10, "Unknown Priority for value "));
    }
}
