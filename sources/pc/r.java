package pc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
public abstract class r {
    public static int a(int i9) {
        if (i9 < 0) {
            return i9;
        }
        if (i9 < 3) {
            return i9 + 1;
        }
        if (i9 < 1073741824) {
            return (int) ((i9 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map b(oc.d... dVarArr) {
        if (dVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(a(dVarArr.length));
            c(linkedHashMap, dVarArr);
            return linkedHashMap;
        }
        return p.f45541a;
    }

    public static final void c(LinkedHashMap linkedHashMap, oc.d[] dVarArr) {
        for (oc.d dVar : dVarArr) {
            linkedHashMap.put(dVar.f19189a, dVar.f19190b);
        }
    }

    public static Map d(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(a(arrayList.size()));
                int size2 = arrayList.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    oc.d dVar = (oc.d) obj;
                    linkedHashMap.put(dVar.f19189a, dVar.f19190b);
                }
                return linkedHashMap;
            }
            oc.d pair = (oc.d) arrayList.get(0);
            kotlin.jvm.internal.i.e(pair, "pair");
            Map singletonMap = Collections.singletonMap(pair.f19189a, pair.f19190b);
            kotlin.jvm.internal.i.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        return p.f45541a;
    }
}
