package qc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class r {
    public static int a(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map b(pc.d... dVarArr) {
        if (dVarArr.length <= 0) {
            return p.f46211a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(dVarArr.length));
        c(linkedHashMap, dVarArr);
        return linkedHashMap;
    }

    public static final void c(LinkedHashMap linkedHashMap, pc.d[] dVarArr) {
        for (pc.d dVar : dVarArr) {
            linkedHashMap.put(dVar.f45688a, dVar.f45689b);
        }
    }

    public static Map d(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return p.f46211a;
        }
        if (size == 1) {
            pc.d pair = (pc.d) arrayList.get(0);
            kotlin.jvm.internal.j.e(pair, "pair");
            Map mapSingletonMap = Collections.singletonMap(pair.f45688a, pair.f45689b);
            kotlin.jvm.internal.j.d(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a(arrayList.size()));
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            pc.d dVar = (pc.d) obj;
            linkedHashMap.put(dVar.f45688a, dVar.f45689b);
        }
        return linkedHashMap;
    }
}
