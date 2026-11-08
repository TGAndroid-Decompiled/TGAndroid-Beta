package u9;

import android.util.Log;
import c8.sc;
import c8.tc;
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
import org.telegram.ui.web.w;
public final class g implements b {
    public static final ab.m f56462n = new ab.m(1);
    public final l f56466e;
    public final e h;
    public final HashMap f56463a = new HashMap();
    public final HashMap f56464b = new HashMap();
    public final HashMap f56465c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f56467f = new AtomicReference();

    public g(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        l lVar = new l(executor);
        this.f56466e = lVar;
        this.h = eVar;
        ArrayList arrayList3 = new ArrayList();
        int i7 = 0;
        arrayList3.add(a.c(lVar, l.class, ra.b.class, ra.a.class));
        arrayList3.add(a.c(this, g.class, new Class[0]));
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            a aVar = (a) obj;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((ua.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.i(componentRegistrar));
                        it.remove();
                    }
                } catch (m e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).f56452b.toArray();
                int length = array.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        Object obj3 = array[i12];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.d.add(obj3.toString());
                        }
                        i12++;
                    }
                }
            }
            if (this.f56463a.isEmpty()) {
                sc.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f56463a.keySet());
                arrayList6.addAll(arrayList3);
                sc.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                a aVar2 = (a) obj4;
                this.f56463a.put(aVar2, new n(new o9.c(2, this, aVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        int size4 = arrayList5.size();
        while (i7 < size4) {
            Object obj5 = arrayList5.get(i7);
            i7++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f56467f.get();
        if (bool != null) {
            d(this.f56463a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return e(r.a(cls));
    }

    @Override
    public final p b(r rVar) {
        ua.b f10 = f(rVar);
        if (f10 == null) {
            return new p(p.f56484c, p.d);
        }
        if (f10 instanceof p) {
            return (p) f10;
        }
        return new p(null, f10);
    }

    @Override
    public final ua.b c(Class cls) {
        return f(r.a(cls));
    }

    public final void d(HashMap hashMap, boolean z9) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            ua.b bVar = (ua.b) entry.getValue();
            int i7 = ((a) entry.getKey()).d;
            if (i7 == 1 || (i7 == 2 && z9)) {
                bVar.get();
            }
        }
        l lVar = this.f56466e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f56477b;
                if (arrayDeque != null) {
                    lVar.f56477b = null;
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
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override
    public final Object e(r rVar) {
        ua.b f10 = f(rVar);
        if (f10 == null) {
            return null;
        }
        return f10.get();
    }

    @Override
    public final synchronized ua.b f(r rVar) {
        tc.a(rVar, "Null interface requested.");
        return (ua.b) this.f56464b.get(rVar);
    }

    @Override
    public final Set g(r rVar) {
        ua.b bVar;
        synchronized (this) {
            bVar = (o) this.f56465c.get(rVar);
            if (bVar == null) {
                bVar = f56462n;
            }
        }
        return (Set) bVar.get();
    }

    public final void h(boolean z9) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f56467f;
        Boolean valueOf = Boolean.valueOf(z9);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f56463a);
        }
        d(hashMap, z9);
    }

    public final void i() {
        boolean z9;
        HashMap hashMap = this.f56464b;
        HashMap hashMap2 = this.f56465c;
        for (a aVar : this.f56463a.keySet()) {
            for (j jVar : aVar.f56453c) {
                if (jVar.f56474b == 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar = jVar.f56473a;
                if (z9 && !hashMap2.containsKey(rVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f56483b = null;
                    obj.f56482a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f56482a.addAll(set);
                    hashMap2.put(rVar, obj);
                } else if (hashMap.containsKey(rVar)) {
                    continue;
                } else {
                    int i7 = jVar.f56474b;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            hashMap.put(rVar, new p(p.f56484c, p.d));
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
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            a aVar = (a) obj;
            if (aVar.f56454e == 0) {
                ua.b bVar = (ua.b) this.f56463a.get(aVar);
                for (r rVar : aVar.f56452b) {
                    HashMap hashMap = this.f56464b;
                    if (!hashMap.containsKey(rVar)) {
                        hashMap.put(rVar, bVar);
                    } else {
                        arrayList2.add(new w(29, (p) ((ua.b) hashMap.get(rVar)), bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap hashMap = this.f56465c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f56463a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f56454e != 0) {
                ua.b bVar = (ua.b) entry.getValue();
                for (r rVar : aVar.f56452b) {
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
                obj.f56483b = null;
                obj.f56482a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f56482a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((r) entry2.getKey(), obj);
            } else {
                o oVar = (o) hashMap.get(entry2.getKey());
                for (ua.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new f(0, oVar, bVar2));
                }
            }
        }
        return arrayList;
    }
}
