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
import w7.n6;
import w7.o6;
public final class g implements b {
    public static final f f44218n = new f(0);
    public final l f44222e;
    public final e h;
    public final HashMap f44219a = new HashMap();
    public final HashMap f44220b = new HashMap();
    public final HashMap f44221c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f44223f = new AtomicReference();

    public g(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        l lVar = new l(executor);
        this.f44222e = lVar;
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
                Object[] array = ((a) it2.next()).f44210b.toArray();
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
            if (this.f44219a.isEmpty()) {
                n6.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f44219a.keySet());
                arrayList6.addAll(arrayList3);
                n6.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                a aVar2 = (a) obj4;
                this.f44219a.put(aVar2, new n(new k9.d(2, this, aVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            h();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f44223f.get();
        if (bool != null) {
            d(this.f44219a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return i(r.a(cls));
    }

    @Override
    public final p b(r rVar) {
        pa.b f7 = f(rVar);
        if (f7 == null) {
            return new p(p.f44240c, p.d);
        }
        if (f7 instanceof p) {
            return (p) f7;
        }
        return new p(null, f7);
    }

    @Override
    public final pa.b c(Class cls) {
        return f(r.a(cls));
    }

    public final void d(HashMap hashMap, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            pa.b bVar = (pa.b) entry.getValue();
            int i10 = ((a) entry.getKey()).d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        l lVar = this.f44222e;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f44233b;
                if (arrayDeque != null) {
                    lVar.f44233b = null;
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

    public final void e(boolean z10) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f44223f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f44219a);
        }
        d(hashMap, z10);
    }

    @Override
    public final synchronized pa.b f(r rVar) {
        o6.a(rVar, "Null interface requested.");
        return (pa.b) this.f44220b.get(rVar);
    }

    @Override
    public final Set g(r rVar) {
        pa.b bVar;
        synchronized (this) {
            bVar = (o) this.f44221c.get(rVar);
            if (bVar == null) {
                bVar = f44218n;
            }
        }
        return (Set) bVar.get();
    }

    public final void h() {
        boolean z10;
        HashMap hashMap = this.f44220b;
        HashMap hashMap2 = this.f44221c;
        for (a aVar : this.f44219a.keySet()) {
            for (j jVar : aVar.f44211c) {
                if (jVar.f44230b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = jVar.f44229a;
                if (z10 && !hashMap2.containsKey(rVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f44239b = null;
                    obj.f44238a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f44238a.addAll(set);
                    hashMap2.put(rVar, obj);
                } else if (hashMap.containsKey(rVar)) {
                    continue;
                } else {
                    int i10 = jVar.f44230b;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            hashMap.put(rVar, new p(p.f44240c, p.d));
                        }
                    } else {
                        throw new RuntimeException("Unsatisfied dependency for component " + aVar + ": " + rVar);
                    }
                }
            }
        }
    }

    @Override
    public final Object i(r rVar) {
        pa.b f7 = f(rVar);
        if (f7 == null) {
            return null;
        }
        return f7.get();
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (aVar.f44212e == 0) {
                pa.b bVar = (pa.b) this.f44219a.get(aVar);
                for (r rVar : aVar.f44210b) {
                    HashMap hashMap = this.f44220b;
                    if (!hashMap.containsKey(rVar)) {
                        hashMap.put(rVar, bVar);
                    } else {
                        arrayList2.add(new g1(7, (p) ((pa.b) hashMap.get(rVar)), bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap hashMap = this.f44221c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f44219a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f44212e != 0) {
                pa.b bVar = (pa.b) entry.getValue();
                for (r rVar : aVar.f44210b) {
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
                obj.f44239b = null;
                obj.f44238a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f44238a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((r) entry2.getKey(), obj);
            } else {
                o oVar = (o) hashMap.get(entry2.getKey());
                for (pa.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new g1(8, oVar, bVar2));
                }
            }
        }
        return arrayList;
    }
}
