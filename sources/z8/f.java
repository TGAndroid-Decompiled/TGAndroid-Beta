package z8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import h7.u8;
import h7.v8;
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
import rh.o2;

public final class f implements b {

    public static final a9.l f50227n = new a9.l(4);

    public final k f50231e;
    public final e h;

    public final HashMap f50228a = new HashMap();

    public final HashMap f50229b = new HashMap();

    public final HashMap f50230c = new HashMap();
    public final HashSet d = new HashSet();

    public final AtomicReference f50232f = new AtomicReference();

    public f(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        k kVar = new k(executor);
        this.f50231e = kVar;
        this.h = eVar;
        ArrayList arrayList3 = new ArrayList();
        int i10 = 2;
        int i11 = 0;
        arrayList3.add(a.c(kVar, k.class, v9.b.class, v9.a.class));
        arrayList3.add(a.c(this, f.class, new Class[0]));
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            a aVar = (a) obj;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((y9.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.h.c(componentRegistrar));
                        it.remove();
                    }
                } catch (l e9) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e9);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                for (Object obj3 : ((a) it2.next()).f50219b.toArray()) {
                    if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.d.contains(obj3.toString())) {
                            it2.remove();
                            break;
                        }
                        this.d.add(obj3.toString());
                    }
                }
            }
            if (this.f50228a.isEmpty()) {
                u8.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f50228a.keySet());
                arrayList6.addAll(arrayList3);
                u8.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                a aVar2 = (a) obj4;
                this.f50228a.put(aVar2, new m(new t8.d(i10, this, aVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            h();
        }
        int size4 = arrayList5.size();
        while (i11 < size4) {
            Object obj5 = arrayList5.get(i11);
            i11++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f50232f.get();
        if (bool != null) {
            c(this.f50228a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return b(q.a(cls));
    }

    @Override
    public final Object b(q qVar) {
        y9.b bVarD = d(qVar);
        if (bVarD == null) {
            return null;
        }
        return bVarD.get();
    }

    public final void c(HashMap map, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getKey();
            y9.b bVar = (y9.b) entry.getValue();
            int i10 = aVar.d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        k kVar = this.f50231e;
        synchronized (kVar) {
            try {
                arrayDeque = kVar.f50242b;
                if (arrayDeque != null) {
                    kVar.f50242b = null;
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
    public final synchronized y9.b d(q qVar) {
        v8.a(qVar, "Null interface requested.");
        return (y9.b) this.f50229b.get(qVar);
    }

    @Override
    public final y9.b e(Class cls) {
        return d(q.a(cls));
    }

    public final void f(boolean z10) {
        HashMap map;
        AtomicReference atomicReference = this.f50232f;
        Boolean boolValueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap(this.f50228a);
        }
        c(map, z10);
    }

    @Override
    public final Set g(q qVar) {
        y9.b bVar;
        synchronized (this) {
            bVar = (n) this.f50230c.get(qVar);
            if (bVar == null) {
                bVar = f50227n;
            }
        }
        return (Set) bVar.get();
    }

    public final void h() {
        HashMap map = this.f50229b;
        HashMap map2 = this.f50230c;
        for (a aVar : this.f50228a.keySet()) {
            for (i iVar : aVar.f50220c) {
                boolean z10 = iVar.f50239b == 2;
                q qVar = iVar.f50238a;
                if (z10 && !map2.containsKey(qVar)) {
                    Set set = Collections.EMPTY_SET;
                    n nVar = new n();
                    nVar.f50248b = null;
                    nVar.f50247a = Collections.newSetFromMap(new ConcurrentHashMap());
                    nVar.f50247a.addAll(set);
                    map2.put(qVar, nVar);
                } else if (map.containsKey(qVar)) {
                    continue;
                } else {
                    int i10 = iVar.f50239b;
                    if (i10 == 1) {
                        throw new j("Unsatisfied dependency for component " + aVar + ": " + qVar);
                    }
                    if (i10 != 2) {
                        map.put(qVar, new o(o.f50249c, o.d));
                    }
                }
            }
        }
    }

    @Override
    public final o i(q qVar) {
        y9.b bVarD = d(qVar);
        if (bVarD == null) {
            return new o(o.f50249c, o.d);
        }
        return bVarD instanceof o ? (o) bVarD : new o(null, bVarD);
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (aVar.f50221e == 0) {
                y9.b bVar = (y9.b) this.f50228a.get(aVar);
                for (q qVar : aVar.f50219b) {
                    HashMap map = this.f50229b;
                    if (map.containsKey(qVar)) {
                        arrayList2.add(new o2(8, (o) ((y9.b) map.get(qVar)), bVar));
                    } else {
                        map.put(qVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap map = this.f50230c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f50228a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f50221e != 0) {
                y9.b bVar = (y9.b) entry.getValue();
                for (q qVar : aVar.f50219b) {
                    if (!map2.containsKey(qVar)) {
                        map2.put(qVar, new HashSet());
                    }
                    ((Set) map2.get(qVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                n nVar = (n) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new o2(9, nVar, (y9.b) it.next()));
                }
            } else {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                n nVar2 = new n();
                nVar2.f50248b = null;
                nVar2.f50247a = Collections.newSetFromMap(new ConcurrentHashMap());
                nVar2.f50247a.addAll(set);
                map.put(qVar2, nVar2);
            }
        }
        return arrayList;
    }
}
