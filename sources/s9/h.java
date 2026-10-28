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
import org.telegram.ui.Wallet.a6;
public final class h implements b {
    public static final f f48029n = new f(0);
    public final m e;
    public final e h;
    public final HashMap f48030a = new HashMap();
    public final HashMap f48031b = new HashMap();
    public final HashMap f48032c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f48033f = new AtomicReference();

    public h(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        m mVar = new m(executor);
        this.e = mVar;
        this.h = eVar;
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        arrayList3.add(a.c(mVar, m.class, oa.b.class, oa.a.class));
        arrayList3.add(a.c(this, h.class, new Class[0]));
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
                } catch (n e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).f48019b.toArray();
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
            if (this.f48030a.isEmpty()) {
                m1.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f48030a.keySet());
                arrayList6.addAll(arrayList3);
                m1.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                a aVar2 = (a) obj4;
                this.f48030a.put(aVar2, new o(new m9.d(2, this, aVar2)));
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
        Boolean bool = (Boolean) this.f48033f.get();
        if (bool != null) {
            c(this.f48030a, bool.booleanValue());
        }
    }

    @Override
    public final Object a(Class cls) {
        return n(s.a(cls));
    }

    @Override
    public final synchronized ra.b b(s sVar) {
        s1.a(sVar, "Null interface requested.");
        return (ra.b) this.f48031b.get(sVar);
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
        m mVar = this.e;
        synchronized (mVar) {
            try {
                arrayDeque = mVar.f48043b;
                if (arrayDeque != null) {
                    mVar.f48043b = null;
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
        return b(s.a(cls));
    }

    public final void e(boolean z10) {
        HashMap hashMap;
        AtomicReference atomicReference = this.f48033f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, valueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f48030a);
        }
        c(hashMap, z10);
    }

    public final void f() {
        boolean z10;
        HashMap hashMap = this.f48031b;
        HashMap hashMap2 = this.f48032c;
        for (a aVar : this.f48030a.keySet()) {
            for (k kVar : aVar.f48020c) {
                if (kVar.f48040b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s sVar = kVar.f48039a;
                if (z10 && !hashMap2.containsKey(sVar)) {
                    Set set = Collections.EMPTY_SET;
                    ?? obj = new Object();
                    obj.f48049b = null;
                    obj.f48048a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f48048a.addAll(set);
                    hashMap2.put(sVar, obj);
                } else if (hashMap.containsKey(sVar)) {
                    continue;
                } else {
                    int i10 = kVar.f48040b;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            hashMap.put(sVar, new q(q.f48050c, q.d));
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
                ra.b bVar = (ra.b) this.f48030a.get(aVar);
                for (s sVar : aVar.f48019b) {
                    HashMap hashMap = this.f48031b;
                    if (!hashMap.containsKey(sVar)) {
                        hashMap.put(sVar, bVar);
                    } else {
                        arrayList2.add(new a6(29, (q) ((ra.b) hashMap.get(sVar)), bVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override
    public final q h(s sVar) {
        ra.b b10 = b(sVar);
        if (b10 == null) {
            return new q(q.f48050c, q.d);
        }
        if (b10 instanceof q) {
            return (q) b10;
        }
        return new q(null, b10);
    }

    public final ArrayList i() {
        HashMap hashMap = this.f48032c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.f48030a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.e != 0) {
                ra.b bVar = (ra.b) entry.getValue();
                for (s sVar : aVar.f48019b) {
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
                obj.f48049b = null;
                obj.f48048a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f48048a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((s) entry2.getKey(), obj);
            } else {
                p pVar = (p) hashMap.get(entry2.getKey());
                for (ra.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new g(0, pVar, bVar2));
                }
            }
        }
        return arrayList;
    }

    @Override
    public final Set j(s sVar) {
        ra.b bVar;
        synchronized (this) {
            bVar = (p) this.f48032c.get(sVar);
            if (bVar == null) {
                bVar = f48029n;
            }
        }
        return (Set) bVar.get();
    }

    @Override
    public final Object n(s sVar) {
        ra.b b10 = b(sVar);
        if (b10 == null) {
            return null;
        }
        return b10.get();
    }
}
