package y8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import g7.s8;
import g7.t8;
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
import xf.o0;
public final class g implements b {
    public static final f f49631n = new f(0);
    public final l f49635e;
    public final e h;
    public final HashMap f49632a = new HashMap();
    public final HashMap f49633b = new HashMap();
    public final HashMap f49634c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f49636f = new AtomicReference();

    public g(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        l lVar = new l(executor);
        this.f49635e = lVar;
        this.h = eVar;
        ArrayList arrayList3 = new ArrayList();
        int i9 = 0;
        arrayList3.add(a.c(lVar, l.class, u9.b.class, u9.a.class));
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((x9.b) it.next()).get();
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
                Object[] array = ((a) it2.next()).f49622b.toArray();
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
            if (this.f49632a.isEmpty()) {
                s8.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f49632a.keySet());
                arrayList6.addAll(arrayList3);
                s8.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                a aVar2 = (a) obj4;
                this.f49632a.put(aVar2, new n(new s8.d(2, this, aVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            h();
        }
        int size4 = arrayList5.size();
        while (i9 < size4) {
            Object obj5 = arrayList5.get(i9);
            i9++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f49636f.get();
        if (bool != null) {
            b(this.f49632a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return c(r.a(cls));
    }

    public final void b(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            x9.b bVar = (x9.b) entry.getValue();
            int i9 = ((a) entry.getKey()).d;
            if (i9 == 1 || (i9 == 2 && z10)) {
                bVar.get();
            }
        }
        l lVar = this.f49635e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f49646b;
                if (arrayDeque != null) {
                    lVar.f49646b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
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
    public final Object c(r rVar) {
        x9.b g10 = g(rVar);
        if (g10 == null) {
            return null;
        }
        return g10.get();
    }

    public final void d(boolean z10) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f49636f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f49632a);
        }
        b(hashMap, z10);
    }

    @Override
    public final x9.b e(Class cls) {
        return g(r.a(cls));
    }

    @Override
    public final p f(r rVar) {
        x9.b g10 = g(rVar);
        if (g10 == null) {
            return new p(p.f49653c, p.d);
        }
        if (g10 instanceof p) {
            return (p) g10;
        }
        return new p(null, g10);
    }

    @Override
    public final synchronized x9.b g(r rVar) {
        t8.a(rVar, "Null interface requested.");
        return (x9.b) this.f49633b.get(rVar);
    }

    public final void h() {
        boolean z10;
        HashMap hashMap = this.f49633b;
        HashMap hashMap2 = this.f49634c;
        for (a aVar : this.f49632a.keySet()) {
            for (j jVar : aVar.f49623c) {
                if (jVar.f49643b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = jVar.f49642a;
                if (z10 && !hashMap2.containsKey(rVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f49652b = null;
                    obj.f49651a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f49651a.addAll(set);
                    hashMap2.put(rVar, obj);
                } else if (hashMap.containsKey(rVar)) {
                    continue;
                } else {
                    int i9 = jVar.f49643b;
                    if (i9 != 1) {
                        if (i9 != 2) {
                            hashMap.put(rVar, new p(p.f49653c, p.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + aVar + ": " + rVar);
                    }
                }
            }
        }
    }

    @Override
    public final Set i(r rVar) {
        x9.b bVar;
        synchronized (this) {
            bVar = (o) this.f49634c.get(rVar);
            if (bVar == null) {
                bVar = f49631n;
            }
        }
        return (Set) bVar.get();
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            a aVar = (a) obj;
            if (aVar.f49624e == 0) {
                x9.b bVar = (x9.b) this.f49632a.get(aVar);
                for (r rVar : aVar.f49622b) {
                    HashMap hashMap = this.f49633b;
                    if (!hashMap.containsKey(rVar)) {
                        hashMap.put(rVar, bVar);
                    } else {
                        arrayList2.add(new o0(2, (p) ((x9.b) hashMap.get(rVar)), bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap hashMap = this.f49634c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f49632a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f49624e != 0) {
                x9.b bVar = (x9.b) entry.getValue();
                for (r rVar : aVar.f49622b) {
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
                obj.f49652b = null;
                obj.f49651a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f49651a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((r) entry2.getKey(), obj);
            } else {
                o oVar = (o) hashMap.get(entry2.getKey());
                for (x9.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new o0(3, oVar, bVar2));
                }
            }
        }
        return arrayList;
    }
}
