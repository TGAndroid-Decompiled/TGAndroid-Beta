package r9;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import w7.c7;
import w7.f7;
public final class g implements b {
    public static final f f45152n = new f(0);
    public final l e;
    public final e h;
    public final HashMap f45153a = new HashMap();
    public final HashMap f45154b = new HashMap();
    public final HashMap f45155c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f45156f = new AtomicReference();

    public g(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        l lVar = new l(executor);
        this.e = lVar;
        this.h = eVar;
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        arrayList3.add(a.c(lVar, l.class, na.b.class, na.a.class));
        arrayList3.add(a.c(this, g.class, new Class[0]));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            a aVar = (a) obj;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((qa.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.v(componentRegistrar));
                        it.remove();
                    }
                } catch (m e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).f45145b.toArray();
                int length = array.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        Object obj3 = array[i13];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.d.add(obj3.toString());
                        }
                        i13++;
                    }
                }
            }
            if (this.f45153a.isEmpty()) {
                c7.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f45153a.keySet());
                arrayList6.addAll(arrayList3);
                c7.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                a aVar2 = (a) obj4;
                this.f45153a.put(aVar2, new n(new l9.d(2, this, aVar2)));
            }
            arrayList5.addAll(h(arrayList3));
            arrayList5.addAll(j());
            e();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f45156f.get();
        if (bool != null) {
            c(this.f45153a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return f(r.a(cls));
    }

    @Override
    public final qa.b b(Class cls) {
        return g(r.a(cls));
    }

    public final void c(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            qa.b bVar = (qa.b) entry.getValue();
            int i10 = ((a) entry.getKey()).d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        l lVar = this.e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f45166b;
                if (arrayDeque != null) {
                    lVar.f45166b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw a1.g.j(it);
            }
        }
    }

    public final void d(boolean z10) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f45156f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f45153a);
        }
        c(hashMap, z10);
    }

    public final void e() {
        boolean z10;
        HashMap hashMap = this.f45154b;
        HashMap hashMap2 = this.f45155c;
        for (a aVar : this.f45153a.keySet()) {
            for (j jVar : aVar.f45146c) {
                if (jVar.f45163b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = jVar.f45162a;
                if (z10 && !hashMap2.containsKey(rVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f45172b = null;
                    obj.f45171a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f45171a.addAll(set);
                    hashMap2.put(rVar, obj);
                } else if (hashMap.containsKey(rVar)) {
                    continue;
                } else {
                    int i10 = jVar.f45163b;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            hashMap.put(rVar, new p(p.f45173c, p.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + aVar + ": " + rVar);
                    }
                }
            }
        }
    }

    @Override
    public final Object f(r rVar) {
        qa.b g10 = g(rVar);
        if (g10 == null) {
            return null;
        }
        return g10.get();
    }

    @Override
    public final synchronized qa.b g(r rVar) {
        f7.a(rVar, "Null interface requested.");
        return (qa.b) this.f45154b.get(rVar);
    }

    public final ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (aVar.e == 0) {
                qa.b bVar = (qa.b) this.f45153a.get(aVar);
                for (r rVar : aVar.f45145b) {
                    HashMap hashMap = this.f45154b;
                    if (!hashMap.containsKey(rVar)) {
                        hashMap.put(rVar, bVar);
                    } else {
                        arrayList2.add(new p2.b(10, (p) ((qa.b) hashMap.get(rVar)), bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override
    public final Set i(r rVar) {
        qa.b bVar;
        synchronized (this) {
            bVar = (o) this.f45155c.get(rVar);
            if (bVar == null) {
                bVar = f45152n;
            }
        }
        return (Set) bVar.get();
    }

    public final ArrayList j() {
        HashMap hashMap = this.f45155c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f45153a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.e != 0) {
                qa.b bVar = (qa.b) entry.getValue();
                for (r rVar : aVar.f45145b) {
                    if (!hashMap2.containsKey(rVar)) {
                        hashMap2.put(rVar, new HashSet());
                    }
                    ((Set) hashMap2.get(rVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                ?? obj = new Object();
                obj.f45172b = null;
                obj.f45171a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f45171a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((r) entry2.getKey(), obj);
            } else {
                o oVar = (o) hashMap.get(entry2.getKey());
                for (qa.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new p2.b(11, oVar, bVar2));
                }
            }
        }
        return arrayList;
    }

    @Override
    public final p n(r rVar) {
        qa.b g10 = g(rVar);
        if (g10 == null) {
            return new p(p.f45173c, p.d);
        }
        if (g10 instanceof p) {
            return (p) g10;
        }
        return new p(null, g10);
    }
}
