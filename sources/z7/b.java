package z7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class b extends AbstractSet {
    public final int f48120a;
    public final d f48121b;

    public b(d dVar, int i10) {
        this.f48120a = i10;
        this.f48121b = dVar;
    }

    @Override
    public final void clear() {
        switch (this.f48120a) {
            case 0:
                this.f48121b.clear();
                return;
            default:
                this.f48121b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f48120a) {
            case 0:
                d dVar = this.f48121b;
                Map a2 = dVar.a();
                if (a2 != null) {
                    return a2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = dVar.e(entry.getKey());
                    if (e != -1) {
                        Object[] objArr = dVar.d;
                        objArr.getClass();
                        if (w7.i9.a(objArr[e], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f48121b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f48120a) {
            case 0:
                d dVar = this.f48121b;
                Map a2 = dVar.a();
                if (a2 != null) {
                    return a2.entrySet().iterator();
                }
                return new a(dVar, 1);
            default:
                d dVar2 = this.f48121b;
                Map a10 = dVar2.a();
                if (a10 != null) {
                    return a10.keySet().iterator();
                }
                return new a(dVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f48120a) {
            case 0:
                d dVar = this.f48121b;
                Map a2 = dVar.a();
                if (a2 != null) {
                    return a2.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!dVar.c()) {
                        int d = dVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = dVar.f48149a;
                        obj2.getClass();
                        int[] iArr = dVar.f48150b;
                        iArr.getClass();
                        Object[] objArr = dVar.f48151c;
                        objArr.getClass();
                        Object[] objArr2 = dVar.d;
                        objArr2.getClass();
                        int a10 = w7.e9.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            dVar.b(a10, d);
                            dVar.f48152f--;
                            dVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                d dVar2 = this.f48121b;
                Map a11 = dVar2.a();
                if (a11 != null) {
                    return a11.keySet().remove(obj);
                }
                if (dVar2.g(obj) == d.f48148s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f48120a) {
            case 0:
                return this.f48121b.size();
            default:
                return this.f48121b.size();
        }
    }
}
