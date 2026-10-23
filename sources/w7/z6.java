package w7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public abstract class z6 {
    public static void a(ArrayList arrayList) {
        boolean z10;
        boolean z11;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            r9.a aVar = (r9.a) obj;
            r9.h hVar = new r9.h(aVar);
            for (r9.r rVar : aVar.f45543b) {
                if (aVar.e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r9.i iVar = new r9.i(rVar, !z11);
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
        for (Set<r9.h> set2 : hashMap.values()) {
            for (r9.h hVar2 : set2) {
                for (r9.j jVar : hVar2.f45555a.f45544c) {
                    if (jVar.f45562c == 0) {
                        r9.r rVar2 = jVar.f45560a;
                        if (jVar.f45561b == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Set<r9.h> set3 = (Set) hashMap.get(new r9.i(rVar2, z10));
                        if (set3 != null) {
                            for (r9.h hVar3 : set3) {
                                hVar2.f45556b.add(hVar3);
                                hVar3.f45557c.add(hVar2);
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
            r9.h hVar4 = (r9.h) it.next();
            if (hVar4.f45557c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            r9.h hVar5 = (r9.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i10++;
            Iterator it2 = hVar5.f45556b.iterator();
            while (it2.hasNext()) {
                r9.h hVar6 = (r9.h) it2.next();
                hVar6.f45557c.remove(hVar5);
                if (hVar6.f45557c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            r9.h hVar7 = (r9.h) it3.next();
            if (!hVar7.f45557c.isEmpty() && !hVar7.f45556b.isEmpty()) {
                arrayList2.add(hVar7.f45555a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
