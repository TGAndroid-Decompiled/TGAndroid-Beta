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
import w7.a7;
import w7.z6;
public final class g implements b {
    public static final f f45124n = new f(0);
    public final l e;
    public final e h;
    public final HashMap f45125a = new HashMap();
    public final HashMap f45126b = new HashMap();
    public final HashMap f45127c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f45128f = new AtomicReference();

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
                Object[] array = ((a) it2.next()).f45117b.toArray();
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
            if (this.f45125a.isEmpty()) {
                z6.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f45125a.keySet());
                arrayList6.addAll(arrayList3);
                z6.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                a aVar2 = (a) obj4;
                this.f45125a.put(aVar2, new n(new l9.d(2, this, aVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f45128f.get();
        if (bool != null) {
            d(this.f45125a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return c(r.a(cls));
    }

    @Override
    public final qa.b b(Class cls) {
        return e(r.a(cls));
    }

    @Override
    public final Object c(r rVar) {
        qa.b e = e(rVar);
        if (e == null) {
            return null;
        }
        return e.get();
    }

    public final void d(HashMap hashMap, boolean z10) {
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
                arrayDeque = lVar.f45138b;
                if (arrayDeque != null) {
                    lVar.f45138b = null;
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

    @Override
    public final synchronized qa.b e(r rVar) {
        a7.a(rVar, "Null interface requested.");
        return (qa.b) this.f45126b.get(rVar);
    }

    @Override
    public final Set f(r rVar) {
        qa.b bVar;
        synchronized (this) {
            bVar = (o) this.f45127c.get(rVar);
            if (bVar == null) {
                bVar = f45124n;
            }
        }
        return (Set) bVar.get();
    }

    @Override
    public final p g(r rVar) {
        qa.b e = e(rVar);
        if (e == null) {
            return new p(p.f45145c, p.d);
        }
        if (e instanceof p) {
            return (p) e;
        }
        return new p(null, e);
    }

    public final void h(boolean z10) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f45128f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f45125a);
        }
        d(hashMap, z10);
    }

    public final void i() {
        boolean z10;
        HashMap hashMap = this.f45126b;
        HashMap hashMap2 = this.f45127c;
        for (a aVar : this.f45125a.keySet()) {
            for (j jVar : aVar.f45118c) {
                if (jVar.f45135b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = jVar.f45134a;
                if (z10 && !hashMap2.containsKey(rVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f45144b = null;
                    obj.f45143a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f45143a.addAll(set);
                    hashMap2.put(rVar, obj);
                } else if (hashMap.containsKey(rVar)) {
                    continue;
                } else {
                    int i10 = jVar.f45135b;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            hashMap.put(rVar, new p(p.f45145c, p.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + aVar + ": " + rVar);
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (aVar.e == 0) {
                qa.b bVar = (qa.b) this.f45125a.get(aVar);
                for (r rVar : aVar.f45117b) {
                    HashMap hashMap = this.f45126b;
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

    public final ArrayList k() {
        HashMap hashMap = this.f45127c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f45125a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.e != 0) {
                qa.b bVar = (qa.b) entry.getValue();
                for (r rVar : aVar.f45117b) {
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
                obj.f45144b = null;
                obj.f45143a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f45143a.addAll((Set) ((Collection) entry2.getValue()));
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
}
