package p1;

import c8.qb;
import gd.k;
import hd.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import rd.q;
public final class i extends kd.j implements q {
    public o1.f f53098a;
    public q1.b f53099b;

    @Override
    public final Object b(Object obj, Object obj2, Object obj3) {
        ?? jVar = new kd.j(3, (id.c) obj3);
        jVar.f53098a = (o1.f) obj;
        jVar.f53099b = (q1.b) obj2;
        return jVar.invokeSuspend(k.f13831a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f16646a;
        af.b.c(obj);
        o1.f fVar = this.f53098a;
        q1.b bVar = this.f53099b;
        Set<q1.e> keySet = bVar.a().keySet();
        ArrayList arrayList = new ArrayList(hd.h.d(keySet, 10));
        for (q1.e eVar : keySet) {
            arrayList.add(eVar.f53698a);
        }
        Map<String, ?> all = fVar.f20712a.getAll();
        kotlin.jvm.internal.j.d(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            boolean z9 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            Set set = fVar.f20713b;
            if (set != null) {
                z9 = set.contains(key);
            }
            if (z9) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(r.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = hd.f.o((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        q1.b bVar2 = new q1.b(new LinkedHashMap(bVar.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String name = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new q1.e(name), value2);
            } else if (value2 instanceof Float) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new q1.e(name), value2);
            } else if (value2 instanceof Integer) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new q1.e(name), value2);
            } else if (value2 instanceof Long) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new q1.e(name), value2);
            } else if (value2 instanceof String) {
                bVar2.e(qb.a(name), value2);
            } else if (value2 instanceof Set) {
                bVar2.e(qb.b(name), (Set) value2);
            }
        }
        return new q1.b(new LinkedHashMap(bVar2.a()), true);
    }
}
