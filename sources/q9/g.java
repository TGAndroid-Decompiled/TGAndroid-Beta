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
import org.telegram.ui.web.f2;
import w7.q6;
import w7.r6;
public final class g implements b {
    public static final f f46091n = new f(0);
    public final l f46095e;
    public final e h;
    public final HashMap f46092a = new HashMap();
    public final HashMap f46093b = new HashMap();
    public final HashMap f46094c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f46096f = new AtomicReference();

    public g(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        l lVar = new l(executor);
        this.f46095e = lVar;
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
                Object[] array = ((a) it2.next()).f46083b.toArray();
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
            if (this.f46092a.isEmpty()) {
                q6.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f46092a.keySet());
                arrayList6.addAll(arrayList3);
                q6.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                a aVar2 = (a) obj4;
                this.f46092a.put(aVar2, new n(new k9.d(2, this, aVar2)));
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
        Boolean bool = (Boolean) this.f46096f.get();
        if (bool != null) {
            e(this.f46092a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return g(s.a(cls));
    }

    @Override
    public final q b(s sVar) {
        pa.b d = d(sVar);
        if (d == null) {
            return new q(q.f46116c, q.d);
        }
        if (d instanceof q) {
            return (q) d;
        }
        return new q(null, d);
    }

    @Override
    public final pa.b c(Class cls) {
        return d(s.a(cls));
    }

    @Override
    public final synchronized pa.b d(s sVar) {
        r6.a(sVar, "Null interface requested.");
        return (pa.b) this.f46093b.get(sVar);
    }

    public final void e(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            pa.b bVar = (pa.b) entry.getValue();
            int i10 = ((a) entry.getKey()).d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        l lVar = this.f46095e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f46106b;
                if (arrayDeque != null) {
                    lVar.f46106b = null;
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
                throw a1.g.k(it);
            }
        }
    }

    @Override
    public final Set f(s sVar) {
        pa.b bVar;
        synchronized (this) {
            bVar = (o) this.f46094c.get(sVar);
            if (bVar == null) {
                bVar = f46091n;
            }
        }
        return (Set) bVar.get();
    }

    @Override
    public final Object g(s sVar) {
        pa.b d = d(sVar);
        if (d == null) {
            return null;
        }
        return d.get();
    }

    public final void h(boolean z10) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f46096f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f46092a);
        }
        e(hashMap, z10);
    }

    public final void i() {
        boolean z10;
        HashMap hashMap = this.f46093b;
        HashMap hashMap2 = this.f46094c;
        for (a aVar : this.f46092a.keySet()) {
            for (j jVar : aVar.f46084c) {
                if (jVar.f46103b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s sVar = jVar.f46102a;
                if (z10 && !hashMap2.containsKey(sVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f46112b = null;
                    obj.f46111a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f46111a.addAll(set);
                    hashMap2.put(sVar, obj);
                } else if (hashMap.containsKey(sVar)) {
                    continue;
                } else {
                    int i10 = jVar.f46103b;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            hashMap.put(sVar, new q(q.f46116c, q.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + aVar + ": " + sVar);
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
            if (aVar.f46085e == 0) {
                pa.b bVar = (pa.b) this.f46092a.get(aVar);
                for (s sVar : aVar.f46083b) {
                    HashMap hashMap = this.f46093b;
                    if (!hashMap.containsKey(sVar)) {
                        hashMap.put(sVar, bVar);
                    } else {
                        arrayList2.add(new f2(8, (q) ((pa.b) hashMap.get(sVar)), bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap hashMap = this.f46094c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f46092a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f46085e != 0) {
                pa.b bVar = (pa.b) entry.getValue();
                for (s sVar : aVar.f46083b) {
                    if (!hashMap2.containsKey(sVar)) {
                        hashMap2.put(sVar, new HashSet());
                    }
                    ((Set) hashMap2.get(sVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                ?? obj = new Object();
                obj.f46112b = null;
                obj.f46111a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f46111a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((s) entry2.getKey(), obj);
            } else {
                o oVar = (o) hashMap.get(entry2.getKey());
                for (pa.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new f2(9, oVar, bVar2));
                }
            }
        }
        return arrayList;
    }
}
