package t9;

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
import org.telegram.ui.hc1;
import x7.a0;
import x7.b0;
public final class g implements b {
    public static final f f55050n = new f(0);
    public final l f55054e;
    public final e h;
    public final HashMap f55051a = new HashMap();
    public final HashMap f55052b = new HashMap();
    public final HashMap f55053c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f55055f = new AtomicReference();

    public g(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        l lVar = new l(executor);
        this.f55054e = lVar;
        this.h = eVar;
        ArrayList arrayList3 = new ArrayList();
        int i3 = 0;
        arrayList3.add(a.c(lVar, l.class, qa.b.class, qa.a.class));
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((ta.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.b(componentRegistrar));
                        it.remove();
                    }
                } catch (m e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).f55042b.toArray();
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
            if (this.f55051a.isEmpty()) {
                a0.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f55051a.keySet());
                arrayList6.addAll(arrayList3);
                a0.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                a aVar2 = (a) obj4;
                this.f55051a.put(aVar2, new n(new n9.d(2, this, aVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        int size4 = arrayList5.size();
        while (i3 < size4) {
            Object obj5 = arrayList5.get(i3);
            i3++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f55055f.get();
        if (bool != null) {
            d(this.f55051a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return g(r.a(cls));
    }

    @Override
    public final Set b(r rVar) {
        ta.b bVar;
        synchronized (this) {
            bVar = (o) this.f55053c.get(rVar);
            if (bVar == null) {
                bVar = f55050n;
            }
        }
        return (Set) bVar.get();
    }

    @Override
    public final synchronized ta.b c(r rVar) {
        b0.a(rVar, "Null interface requested.");
        return (ta.b) this.f55052b.get(rVar);
    }

    public final void d(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            ta.b bVar = (ta.b) entry.getValue();
            int i3 = ((a) entry.getKey()).d;
            if (i3 == 1 || (i3 == 2 && z10)) {
                bVar.get();
            }
        }
        l lVar = this.f55054e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f55065b;
                if (arrayDeque != null) {
                    lVar.f55065b = null;
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
                throw a1.g.m(it);
            }
        }
    }

    @Override
    public final p e(r rVar) {
        ta.b c2 = c(rVar);
        if (c2 == null) {
            return new p(p.f55072c, p.d);
        }
        if (c2 instanceof p) {
            return (p) c2;
        }
        return new p(null, c2);
    }

    @Override
    public final ta.b f(Class cls) {
        return c(r.a(cls));
    }

    @Override
    public final Object g(r rVar) {
        ta.b c2 = c(rVar);
        if (c2 == null) {
            return null;
        }
        return c2.get();
    }

    public final void h(boolean z10) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f55055f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f55051a);
        }
        d(hashMap, z10);
    }

    public final void i() {
        boolean z10;
        HashMap hashMap = this.f55052b;
        HashMap hashMap2 = this.f55053c;
        for (a aVar : this.f55051a.keySet()) {
            for (j jVar : aVar.f55043c) {
                if (jVar.f55062b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = jVar.f55061a;
                if (z10 && !hashMap2.containsKey(rVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f55071b = null;
                    obj.f55070a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f55070a.addAll(set);
                    hashMap2.put(rVar, obj);
                } else if (hashMap.containsKey(rVar)) {
                    continue;
                } else {
                    int i3 = jVar.f55062b;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            hashMap.put(rVar, new p(p.f55072c, p.d));
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            a aVar = (a) obj;
            if (aVar.f55044e == 0) {
                ta.b bVar = (ta.b) this.f55051a.get(aVar);
                for (r rVar : aVar.f55042b) {
                    HashMap hashMap = this.f55052b;
                    if (!hashMap.containsKey(rVar)) {
                        hashMap.put(rVar, bVar);
                    } else {
                        arrayList2.add(new hc1(26, (p) ((ta.b) hashMap.get(rVar)), bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap hashMap = this.f55053c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f55051a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f55044e != 0) {
                ta.b bVar = (ta.b) entry.getValue();
                for (r rVar : aVar.f55042b) {
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
                obj.f55071b = null;
                obj.f55070a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f55070a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((r) entry2.getKey(), obj);
            } else {
                o oVar = (o) hashMap.get(entry2.getKey());
                for (ta.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new hc1(27, oVar, bVar2));
                }
            }
        }
        return arrayList;
    }
}
