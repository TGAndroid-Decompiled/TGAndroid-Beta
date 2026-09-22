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
import org.telegram.ui.web.g1;
import w7.r6;
import w7.s6;
public final class g implements b {
    public static final f f41505n = new f(0);
    public final l e;
    public final e h;
    public final HashMap f41506a = new HashMap();
    public final HashMap f41507b = new HashMap();
    public final HashMap f41508c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f41509f = new AtomicReference();

    public g(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        l lVar = new l(executor);
        this.e = lVar;
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
                } catch (m e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).f41498b.toArray();
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
            if (this.f41506a.isEmpty()) {
                r6.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f41506a.keySet());
                arrayList6.addAll(arrayList3);
                r6.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                a aVar2 = (a) obj4;
                this.f41506a.put(aVar2, new n(new k9.d(2, this, aVar2)));
            }
            arrayList5.addAll(g(arrayList3));
            arrayList5.addAll(h());
            f();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f41509f.get();
        if (bool != null) {
            a(this.f41506a, bool.booleanValue());
        }
    }

    public final void a(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            pa.b bVar = (pa.b) entry.getValue();
            int i10 = ((a) entry.getKey()).d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        l lVar = this.e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f41519b;
                if (arrayDeque != null) {
                    lVar.f41519b = null;
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
    public final Object b(Class cls) {
        return m(s.a(cls));
    }

    @Override
    public final q c(s sVar) {
        pa.b i10 = i(sVar);
        if (i10 == null) {
            return new q(q.f41527c, q.d);
        }
        if (i10 instanceof q) {
            return (q) i10;
        }
        return new q(null, i10);
    }

    public final void d(boolean z10) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f41509f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f41506a);
        }
        a(hashMap, z10);
    }

    @Override
    public final pa.b e(Class cls) {
        return i(s.a(cls));
    }

    public final void f() {
        boolean z10;
        HashMap hashMap = this.f41507b;
        HashMap hashMap2 = this.f41508c;
        for (a aVar : this.f41506a.keySet()) {
            for (j jVar : aVar.f41499c) {
                if (jVar.f41516b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s sVar = jVar.f41515a;
                if (z10 && !hashMap2.containsKey(sVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f41525b = null;
                    obj.f41524a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f41524a.addAll(set);
                    hashMap2.put(sVar, obj);
                } else if (hashMap.containsKey(sVar)) {
                    continue;
                } else {
                    int i10 = jVar.f41516b;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            hashMap.put(sVar, new q(q.f41527c, q.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + aVar + ": " + sVar);
                    }
                }
            }
        }
    }

    public final ArrayList g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (aVar.e == 0) {
                pa.b bVar = (pa.b) this.f41506a.get(aVar);
                for (s sVar : aVar.f41498b) {
                    HashMap hashMap = this.f41507b;
                    if (!hashMap.containsKey(sVar)) {
                        hashMap.put(sVar, bVar);
                    } else {
                        arrayList2.add(new g1(9, (q) ((pa.b) hashMap.get(sVar)), bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList h() {
        HashMap hashMap = this.f41508c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f41506a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.e != 0) {
                pa.b bVar = (pa.b) entry.getValue();
                for (s sVar : aVar.f41498b) {
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
                obj.f41525b = null;
                obj.f41524a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f41524a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((s) entry2.getKey(), obj);
            } else {
                o oVar = (o) hashMap.get(entry2.getKey());
                for (pa.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new g1(10, oVar, bVar2));
                }
            }
        }
        return arrayList;
    }

    @Override
    public final synchronized pa.b i(s sVar) {
        s6.a(sVar, "Null interface requested.");
        return (pa.b) this.f41507b.get(sVar);
    }

    @Override
    public final Set l(s sVar) {
        pa.b bVar;
        synchronized (this) {
            bVar = (o) this.f41508c.get(sVar);
            if (bVar == null) {
                bVar = f41505n;
            }
        }
        return (Set) bVar.get();
    }

    @Override
    public final Object m(s sVar) {
        pa.b i10 = i(sVar);
        if (i10 == null) {
            return null;
        }
        return i10.get();
    }
}
