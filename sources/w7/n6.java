package w7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public abstract class n6 {
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
            q9.a aVar = (q9.a) obj;
            q9.h hVar = new q9.h(aVar);
            for (q9.r rVar : aVar.f44238b) {
                if (aVar.f44240e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                q9.i iVar = new q9.i(rVar, !z11);
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
        for (Set<q9.h> set2 : hashMap.values()) {
            for (q9.h hVar2 : set2) {
                for (q9.j jVar : hVar2.f44252a.f44239c) {
                    if (jVar.f44259c == 0) {
                        q9.r rVar2 = jVar.f44257a;
                        if (jVar.f44258b == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Set<q9.h> set3 = (Set) hashMap.get(new q9.i(rVar2, z10));
                        if (set3 != null) {
                            for (q9.h hVar3 : set3) {
                                hVar2.f44253b.add(hVar3);
                                hVar3.f44254c.add(hVar2);
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
            q9.h hVar4 = (q9.h) it.next();
            if (hVar4.f44254c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            q9.h hVar5 = (q9.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i10++;
            Iterator it2 = hVar5.f44253b.iterator();
            while (it2.hasNext()) {
                q9.h hVar6 = (q9.h) it2.next();
                hVar6.f44254c.remove(hVar5);
                if (hVar6.f44254c.isEmpty()) {
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
            q9.h hVar7 = (q9.h) it3.next();
            if (!hVar7.f44254c.isEmpty() && !hVar7.f44253b.isEmpty()) {
                arrayList2.add(hVar7.f44252a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
