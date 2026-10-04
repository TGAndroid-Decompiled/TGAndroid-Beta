package x7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class h extends AbstractSet {
    public final int f49504a;
    public final j f49505b;

    public h(j jVar, int i10) {
        this.f49504a = i10;
        this.f49505b = jVar;
    }

    @Override
    public final void clear() {
        switch (this.f49504a) {
            case 0:
                this.f49505b.clear();
                return;
            default:
                this.f49505b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f49504a) {
            case 0:
                j jVar = this.f49505b;
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
                        if (w7.n8.a(objArr[e7], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f49505b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f49504a) {
            case 0:
                j jVar = this.f49505b;
                Map a2 = jVar.a();
                if (a2 != null) {
                    return a2.entrySet().iterator();
                }
                return new g(jVar, 1);
            default:
                j jVar2 = this.f49505b;
                Map a10 = jVar2.a();
                if (a10 != null) {
                    return a10.keySet().iterator();
                }
                return new g(jVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f49504a) {
            case 0:
                j jVar = this.f49505b;
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
                        Object obj2 = jVar.f49534a;
                        obj2.getClass();
                        int[] iArr = jVar.f49535b;
                        iArr.getClass();
                        Object[] objArr = jVar.f49536c;
                        objArr.getClass();
                        Object[] objArr2 = jVar.d;
                        objArr2.getClass();
                        int a10 = w7.j8.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            jVar.b(a10, d);
                            jVar.f49538f--;
                            jVar.f49537e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                j jVar2 = this.f49505b;
                Map a11 = jVar2.a();
                if (a11 != null) {
                    return a11.keySet().remove(obj);
                }
                if (jVar2.g(obj) == j.f49533s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f49504a) {
            case 0:
                return this.f49505b.size();
            default:
                return this.f49505b.size();
        }
    }
}
