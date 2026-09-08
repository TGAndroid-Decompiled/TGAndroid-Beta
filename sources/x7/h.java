package x7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class h extends AbstractSet {
    public final int f49043a;
    public final j f49044b;

    public h(j jVar, int i10) {
        this.f49043a = i10;
        this.f49044b = jVar;
    }

    @Override
    public final void clear() {
        switch (this.f49043a) {
            case 0:
                this.f49044b.clear();
                return;
            default:
                this.f49044b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f49043a) {
            case 0:
                j jVar = this.f49044b;
                Map a2 = jVar.a();
                if (a2 != null) {
                    return a2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e7 = jVar.e(entry.getKey());
                    if (e7 != -1) {
                        Object[] objArr = jVar.d;
                        objArr.getClass();
                        if (w7.l8.a(objArr[e7], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f49044b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f49043a) {
            case 0:
                j jVar = this.f49044b;
                Map a2 = jVar.a();
                if (a2 != null) {
                    return a2.entrySet().iterator();
                }
                return new g(jVar, 1);
            default:
                j jVar2 = this.f49044b;
                Map a10 = jVar2.a();
                if (a10 != null) {
                    return a10.keySet().iterator();
                }
                return new g(jVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f49043a) {
            case 0:
                j jVar = this.f49044b;
                Map a2 = jVar.a();
                if (a2 != null) {
                    return a2.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!jVar.c()) {
                        int d = jVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = jVar.f49073a;
                        obj2.getClass();
                        int[] iArr = jVar.f49074b;
                        iArr.getClass();
                        Object[] objArr = jVar.f49075c;
                        objArr.getClass();
                        Object[] objArr2 = jVar.d;
                        objArr2.getClass();
                        int a10 = w7.h8.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            jVar.b(a10, d);
                            jVar.f49077f--;
                            jVar.f49076e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                j jVar2 = this.f49044b;
                Map a11 = jVar2.a();
                if (a11 != null) {
                    return a11.keySet().remove(obj);
                }
                if (jVar2.g(obj) == j.f49072s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f49043a) {
            case 0:
                return this.f49044b.size();
            default:
                return this.f49044b.size();
        }
    }
}
