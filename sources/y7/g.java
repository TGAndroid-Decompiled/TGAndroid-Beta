package y7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class g extends AbstractSet {
    public final int f52146a;
    public final i f52147b;

    public g(i iVar, int i10) {
        this.f52146a = i10;
        this.f52147b = iVar;
    }

    @Override
    public final void clear() {
        switch (this.f52146a) {
            case 0:
                this.f52147b.clear();
                return;
            default:
                this.f52147b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f52146a) {
            case 0:
                i iVar = this.f52147b;
                Map a2 = iVar.a();
                if (a2 != null) {
                    return a2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = iVar.e(entry.getKey());
                    if (e != -1) {
                        Object[] objArr = iVar.d;
                        objArr.getClass();
                        if (w7.g5.a(objArr[e], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f52147b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f52146a) {
            case 0:
                i iVar = this.f52147b;
                Map a2 = iVar.a();
                if (a2 != null) {
                    return a2.entrySet().iterator();
                }
                return new f(iVar, 1);
            default:
                i iVar2 = this.f52147b;
                Map a10 = iVar2.a();
                if (a10 != null) {
                    return a10.keySet().iterator();
                }
                return new f(iVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f52146a) {
            case 0:
                i iVar = this.f52147b;
                Map a2 = iVar.a();
                if (a2 != null) {
                    return a2.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!iVar.c()) {
                        int d = iVar.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = iVar.f52169a;
                        obj2.getClass();
                        int[] iArr = iVar.f52170b;
                        iArr.getClass();
                        Object[] objArr = iVar.f52171c;
                        objArr.getClass();
                        Object[] objArr2 = iVar.d;
                        objArr2.getClass();
                        int a10 = w7.j0.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            iVar.b(a10, d);
                            iVar.f52172f--;
                            iVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                i iVar2 = this.f52147b;
                Map a11 = iVar2.a();
                if (a11 != null) {
                    return a11.keySet().remove(obj);
                }
                if (iVar2.g(obj) == i.f52168s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f52146a) {
            case 0:
                return this.f52147b.size();
            default:
                return this.f52147b.size();
        }
    }
}
