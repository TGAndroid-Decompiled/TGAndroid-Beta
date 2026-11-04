package x7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public abstract class a0 {
    public static void a(ArrayList arrayList) {
        boolean z10;
        boolean z11;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t9.a aVar = (t9.a) obj;
            t9.h hVar = new t9.h(aVar);
            for (t9.r rVar : aVar.f55042b) {
                if (aVar.f55044e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                t9.i iVar = new t9.i(rVar, !z11);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set = (Set) hashMap.get(iVar);
                if (!set.isEmpty() && z11) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + ".");
                }
                set.add(hVar);
            }
        }
        for (Set<t9.h> set2 : hashMap.values()) {
            for (t9.h hVar2 : set2) {
                for (t9.j jVar : hVar2.f55056a.f55043c) {
                    if (jVar.f55063c == 0) {
                        t9.r rVar2 = jVar.f55061a;
                        if (jVar.f55062b == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Set<t9.h> set3 = (Set) hashMap.get(new t9.i(rVar2, z10));
                        if (set3 != null) {
                            for (t9.h hVar3 : set3) {
                                hVar2.f55057b.add(hVar3);
                                hVar3.f55058c.add(hVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            t9.h hVar4 = (t9.h) it.next();
            if (hVar4.f55058c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            t9.h hVar5 = (t9.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i3++;
            Iterator it2 = hVar5.f55057b.iterator();
            while (it2.hasNext()) {
                t9.h hVar6 = (t9.h) it2.next();
                hVar6.f55058c.remove(hVar5);
                if (hVar6.f55058c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i3 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            t9.h hVar7 = (t9.h) it3.next();
            if (!hVar7.f55058c.isEmpty() && !hVar7.f55057b.isEmpty()) {
                arrayList2.add(hVar7.f55056a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
