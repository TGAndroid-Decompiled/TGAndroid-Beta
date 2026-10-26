package y7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class g extends AbstractSet {
    public final int f52149a;
    public final i f52150b;

    public g(i iVar, int i10) {
        this.f52149a = i10;
        this.f52150b = iVar;
    }

    @Override
    public final void clear() {
        switch (this.f52149a) {
            case 0:
                this.f52150b.clear();
                return;
            default:
                this.f52150b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f52149a) {
            case 0:
                i iVar = this.f52150b;
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
                return this.f52150b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f52149a) {
            case 0:
                i iVar = this.f52150b;
                Map a2 = iVar.a();
                if (a2 != null) {
                    return a2.entrySet().iterator();
                }
                return new f(iVar, 1);
            default:
                i iVar2 = this.f52150b;
                Map a10 = iVar2.a();
                if (a10 != null) {
                    return a10.keySet().iterator();
                }
                return new f(iVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f52149a) {
            case 0:
                i iVar = this.f52150b;
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
                        Object obj2 = iVar.f52172a;
                        obj2.getClass();
                        int[] iArr = iVar.f52173b;
                        iArr.getClass();
                        Object[] objArr = iVar.f52174c;
                        objArr.getClass();
                        Object[] objArr2 = iVar.d;
                        objArr2.getClass();
                        int a10 = w7.j0.a(key, value, d, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            iVar.b(a10, d);
                            iVar.f52175f--;
                            iVar.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                i iVar2 = this.f52150b;
                Map a11 = iVar2.a();
                if (a11 != null) {
                    return a11.keySet().remove(obj);
                }
                if (iVar2.g(obj) == i.f52171s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f52149a) {
            case 0:
                return this.f52150b.size();
            default:
                return this.f52150b.size();
        }
    }
}
