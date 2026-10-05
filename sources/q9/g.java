package q9;

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
import org.telegram.ui.web.x1;
import w7.s6;
import w7.t6;
public final class g implements b {
    public static final f f44860n = new f(0);
    public final l f44864e;
    public final e h;
    public final HashMap f44861a = new HashMap();
    public final HashMap f44862b = new HashMap();
    public final HashMap f44863c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f44865f = new AtomicReference();

    public g(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        l lVar = new l(executor);
        this.f44864e = lVar;
        this.h = eVar;
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        arrayList3.add(a.c(lVar, l.class, ma.b.class, ma.a.class));
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((pa.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.b(componentRegistrar));
                        it.remove();
                    }
                } catch (m e7) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e7);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).f44852b.toArray();
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
            if (this.f44861a.isEmpty()) {
                s6.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f44861a.keySet());
                arrayList6.addAll(arrayList3);
                s6.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                a aVar2 = (a) obj4;
                this.f44861a.put(aVar2, new n(new k9.d(2, this, aVar2)));
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
        Boolean bool = (Boolean) this.f44865f.get();
        if (bool != null) {
            c(this.f44861a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return g(r.a(cls));
    }

    @Override
    public final p b(r rVar) {
        pa.b e7 = e(rVar);
        if (e7 == null) {
            return new p(p.f44882c, p.d);
        }
        if (e7 instanceof p) {
            return (p) e7;
        }
        return new p(null, e7);
    }

    public final void c(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            pa.b bVar = (pa.b) entry.getValue();
            int i10 = ((a) entry.getKey()).d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        l lVar = this.f44864e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f44875b;
                if (arrayDeque != null) {
                    lVar.f44875b = null;
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
                throw a4.a.k(it);
            }
        }
    }

    @Override
    public final pa.b d(Class cls) {
        return e(r.a(cls));
    }

    @Override
    public final synchronized pa.b e(r rVar) {
        t6.a(rVar, "Null interface requested.");
        return (pa.b) this.f44862b.get(rVar);
    }

    @Override
    public final Set f(r rVar) {
        pa.b bVar;
        synchronized (this) {
            bVar = (o) this.f44863c.get(rVar);
            if (bVar == null) {
                bVar = f44860n;
            }
        }
        return (Set) bVar.get();
    }

    @Override
    public final Object g(r rVar) {
        pa.b e7 = e(rVar);
        if (e7 == null) {
            return null;
        }
        return e7.get();
    }

    public final void h(boolean z10) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f44865f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f44861a);
        }
        c(hashMap, z10);
    }

    public final void i() {
        boolean z10;
        HashMap hashMap = this.f44862b;
        HashMap hashMap2 = this.f44863c;
        for (a aVar : this.f44861a.keySet()) {
            for (j jVar : aVar.f44853c) {
                if (jVar.f44872b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = jVar.f44871a;
                if (z10 && !hashMap2.containsKey(rVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f44881b = null;
                    obj.f44880a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f44880a.addAll(set);
                    hashMap2.put(rVar, obj);
                } else if (hashMap.containsKey(rVar)) {
                    continue;
                } else {
                    int i10 = jVar.f44872b;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            hashMap.put(rVar, new p(p.f44882c, p.d));
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
            if (aVar.f44854e == 0) {
                pa.b bVar = (pa.b) this.f44861a.get(aVar);
                for (r rVar : aVar.f44852b) {
                    HashMap hashMap = this.f44862b;
                    if (!hashMap.containsKey(rVar)) {
                        hashMap.put(rVar, bVar);
                    } else {
                        arrayList2.add(new x1(6, (p) ((pa.b) hashMap.get(rVar)), bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap hashMap = this.f44863c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f44861a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f44854e != 0) {
                pa.b bVar = (pa.b) entry.getValue();
                for (r rVar : aVar.f44852b) {
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
                obj.f44881b = null;
                obj.f44880a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f44880a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((r) entry2.getKey(), obj);
            } else {
                o oVar = (o) hashMap.get(entry2.getKey());
                for (pa.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new x1(7, oVar, bVar2));
                }
            }
        }
        return arrayList;
    }
}
