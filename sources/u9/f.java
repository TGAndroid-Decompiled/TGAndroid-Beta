package u9;

import android.util.Log;
import c8.vc;
import c8.wc;
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
import p4.o0;
public final class f implements b {
    public static final ab.m f58536n = new ab.m(1);
    public final k f58540e;
    public final e h;
    public final HashMap f58537a = new HashMap();
    public final HashMap f58538b = new HashMap();
    public final HashMap f58539c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f58541f = new AtomicReference();

    public f(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        k kVar = new k(executor);
        this.f58540e = kVar;
        this.h = eVar;
        ArrayList arrayList3 = new ArrayList();
        int i7 = 0;
        arrayList3.add(a.c(kVar, k.class, ra.b.class, ra.a.class));
        arrayList3.add(a.c(this, f.class, new Class[0]));
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
                        arrayList3.addAll(this.h.k(componentRegistrar));
                        it.remove();
                    }
                } catch (l e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).f58529b.toArray();
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
            if (this.f58537a.isEmpty()) {
                vc.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f58537a.keySet());
                arrayList6.addAll(arrayList3);
                vc.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                a aVar2 = (a) obj4;
                this.f58537a.put(aVar2, new m(new o9.c(2, this, aVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            h();
        }
        int size4 = arrayList5.size();
        while (i7 < size4) {
            Object obj5 = arrayList5.get(i7);
            i7++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f58541f.get();
        if (bool != null) {
            d(this.f58537a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return e(q.a(cls));
    }

    @Override
    public final o b(q qVar) {
        ua.b f10 = f(qVar);
        if (f10 == null) {
            return new o(o.f58558c, o.d);
        }
        if (f10 instanceof o) {
            return (o) f10;
        }
        return new o(null, f10);
    }

    @Override
    public final ua.b c(Class cls) {
        return f(q.a(cls));
    }

    public final void d(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            ua.b bVar = (ua.b) entry.getValue();
            int i7 = ((a) entry.getKey()).d;
            if (i7 == 1 || (i7 == 2 && z10)) {
                bVar.get();
            }
        }
        k kVar = this.f58540e;
        synchronized (kVar) {
            try {
                arrayDeque = kVar.f58551b;
                if (arrayDeque != null) {
                    kVar.f58551b = null;
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
    public final Object e(q qVar) {
        ua.b f10 = f(qVar);
        if (f10 == null) {
            return null;
        }
        return f10.get();
    }

    @Override
    public final synchronized ua.b f(q qVar) {
        wc.a(qVar, "Null interface requested.");
        return (ua.b) this.f58538b.get(qVar);
    }

    public final void g(boolean z10) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f58541f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f58537a);
        }
        d(hashMap, z10);
    }

    public final void h() {
        boolean z10;
        HashMap hashMap = this.f58538b;
        HashMap hashMap2 = this.f58539c;
        for (a aVar : this.f58537a.keySet()) {
            for (i iVar : aVar.f58530c) {
                if (iVar.f58548b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q qVar = iVar.f58547a;
                if (z10 && !hashMap2.containsKey(qVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f58557b = null;
                    obj.f58556a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f58556a.addAll(set);
                    hashMap2.put(qVar, obj);
                } else if (hashMap.containsKey(qVar)) {
                    continue;
                } else {
                    int i7 = iVar.f58548b;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            hashMap.put(qVar, new o(o.f58558c, o.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + aVar + ": " + qVar);
                    }
                }
            }
        }
    }

    @Override
    public final Set i(q qVar) {
        ua.b bVar;
        synchronized (this) {
            bVar = (n) this.f58539c.get(qVar);
            if (bVar == null) {
                bVar = f58536n;
            }
        }
        return (Set) bVar.get();
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            a aVar = (a) obj;
            if (aVar.f58531e == 0) {
                ua.b bVar = (ua.b) this.f58537a.get(aVar);
                for (q qVar : aVar.f58529b) {
                    HashMap hashMap = this.f58538b;
                    if (!hashMap.containsKey(qVar)) {
                        hashMap.put(qVar, bVar);
                    } else {
                        arrayList2.add(new o0(16, (o) ((ua.b) hashMap.get(qVar)), bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap hashMap = this.f58539c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f58537a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f58531e != 0) {
                ua.b bVar = (ua.b) entry.getValue();
                for (q qVar : aVar.f58529b) {
                    if (!hashMap2.containsKey(qVar)) {
                        hashMap2.put(qVar, new HashSet());
                    }
                    ((Set) hashMap2.get(qVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                ?? obj = new Object();
                obj.f58557b = null;
                obj.f58556a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f58556a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((q) entry2.getKey(), obj);
            } else {
                n nVar = (n) hashMap.get(entry2.getKey());
                for (ua.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new o0(17, nVar, bVar2));
                }
            }
        }
        return arrayList;
    }
}
