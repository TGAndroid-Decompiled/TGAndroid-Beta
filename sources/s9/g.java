package s9;

import aa.m1;
import android.util.Log;
import com.google.android.gms.internal.play_billing.s1;
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
import org.telegram.ui.Wallet.q6;
public final class g implements b {
    public static final f f47988n = new f(0);
    public final l e;
    public final e h;
    public final HashMap f47989a = new HashMap();
    public final HashMap f47990b = new HashMap();
    public final HashMap f47991c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f47992f = new AtomicReference();

    public g(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        l lVar = new l(executor);
        this.e = lVar;
        this.h = eVar;
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        arrayList3.add(a.c(lVar, l.class, oa.b.class, oa.a.class));
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((ra.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (m e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).f47981b.toArray();
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
            if (this.f47989a.isEmpty()) {
                m1.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f47989a.keySet());
                arrayList6.addAll(arrayList3);
                m1.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                a aVar2 = (a) obj4;
                this.f47989a.put(aVar2, new n(new m9.d(2, this, aVar2)));
            }
            arrayList5.addAll(g(arrayList3));
            arrayList5.addAll(i());
            f();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f47992f.get();
        if (bool != null) {
            c(this.f47989a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return n(r.a(cls));
    }

    @Override
    public final synchronized ra.b b(r rVar) {
        s1.a(rVar, "Null interface requested.");
        return (ra.b) this.f47990b.get(rVar);
    }

    public final void c(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            ra.b bVar = (ra.b) entry.getValue();
            int i10 = ((a) entry.getKey()).d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        l lVar = this.e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f48002b;
                if (arrayDeque != null) {
                    lVar.f48002b = null;
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
    public final ra.b d(Class cls) {
        return b(r.a(cls));
    }

    public final void e(boolean z10) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f47992f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f47989a);
        }
        c(hashMap, z10);
    }

    public final void f() {
        boolean z10;
        HashMap hashMap = this.f47990b;
        HashMap hashMap2 = this.f47991c;
        for (a aVar : this.f47989a.keySet()) {
            for (j jVar : aVar.f47982c) {
                if (jVar.f47999b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = jVar.f47998a;
                if (z10 && !hashMap2.containsKey(rVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f48008b = null;
                    obj.f48007a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f48007a.addAll(set);
                    hashMap2.put(rVar, obj);
                } else if (hashMap.containsKey(rVar)) {
                    continue;
                } else {
                    int i10 = jVar.f47999b;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            hashMap.put(rVar, new p(p.f48009c, p.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + aVar + ": " + rVar);
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
                ra.b bVar = (ra.b) this.f47989a.get(aVar);
                for (r rVar : aVar.f47981b) {
                    HashMap hashMap = this.f47990b;
                    if (!hashMap.containsKey(rVar)) {
                        hashMap.put(rVar, bVar);
                    } else {
                        arrayList2.add(new q6(28, (p) ((ra.b) hashMap.get(rVar)), bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override
    public final p h(r rVar) {
        ra.b b10 = b(rVar);
        if (b10 == null) {
            return new p(p.f48009c, p.d);
        }
        if (b10 instanceof p) {
            return (p) b10;
        }
        return new p(null, b10);
    }

    public final ArrayList i() {
        HashMap hashMap = this.f47991c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f47989a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.e != 0) {
                ra.b bVar = (ra.b) entry.getValue();
                for (r rVar : aVar.f47981b) {
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
                obj.f48008b = null;
                obj.f48007a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f48007a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((r) entry2.getKey(), obj);
            } else {
                o oVar = (o) hashMap.get(entry2.getKey());
                for (ra.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new q6(29, oVar, bVar2));
                }
            }
        }
        return arrayList;
    }

    @Override
    public final Set j(r rVar) {
        ra.b bVar;
        synchronized (this) {
            bVar = (o) this.f47991c.get(rVar);
            if (bVar == null) {
                bVar = f47988n;
            }
        }
        return (Set) bVar.get();
    }

    @Override
    public final Object n(r rVar) {
        ra.b b10 = b(rVar);
        if (b10 == null) {
            return null;
        }
        return b10.get();
    }
}
