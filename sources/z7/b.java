package z7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class b extends AbstractSet {
    public final int f48477a;
    public final d f48478b;

    public b(d dVar, int i10) {
        this.f48477a = i10;
        this.f48478b = dVar;
    }

    @Override
    public final void clear() {
        switch (this.f48477a) {
            case 0:
                this.f48478b.clear();
                return;
            default:
                this.f48478b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f48477a) {
            case 0:
                d dVar = this.f48478b;
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
                        if (w7.m9.a(objArr[e], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f48478b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f48477a) {
            case 0:
                d dVar = this.f48478b;
                Map a2 = dVar.a();
                if (a2 != null) {
                    return a2.entrySet().iterator();
                }
                return new a(dVar, 1);
            default:
                d dVar2 = this.f48478b;
                Map a10 = dVar2.a();
                if (a10 != null) {
                    return a10.keySet().iterator();
                }
                return new a(dVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f48477a) {
            case 0:
                d dVar = this.f48478b;
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
                        Object obj2 = dVar.f48506a;
                        obj2.getClass();
                        int[] iArr = dVar.f48507b;
                        iArr.getClass();
                        Object[] objArr = dVar.f48508c;
                        objArr.getClass();
                        Object[] objArr2 = dVar.d;
                        objArr2.getClass();
                        int a10 = w7.g9.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            dVar.b(a10, d);
                            dVar.f48509f--;
                            dVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                d dVar2 = this.f48478b;
                Map a11 = dVar2.a();
                if (a11 != null) {
                    return a11.keySet().remove(obj);
                }
                if (dVar2.g(obj) == d.f48505s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f48477a) {
            case 0:
                return this.f48478b.size();
            default:
                return this.f48478b.size();
        }
    }
}
