package z7;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
public final class g extends AbstractSet {
    public final int f59876a;
    public final i f59877b;

    public g(i iVar, int i3) {
        this.f59876a = i3;
        this.f59877b = iVar;
    }

    @Override
    public final void clear() {
        switch (this.f59876a) {
            case 0:
                this.f59877b.clear();
                return;
            default:
                this.f59877b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f59876a) {
            case 0:
                i iVar = this.f59877b;
                Map b10 = iVar.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int f10 = iVar.f(entry.getKey());
                    if (f10 != -1) {
                        Object[] objArr = iVar.d;
                        objArr.getClass();
                        if (x7.w6.a(objArr[f10], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f59877b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f59876a) {
            case 0:
                i iVar = this.f59877b;
                Map b10 = iVar.b();
                if (b10 != null) {
                    return b10.entrySet().iterator();
                }
                return new f(iVar, 1);
            default:
                i iVar2 = this.f59877b;
                Map b11 = iVar2.b();
                if (b11 != null) {
                    return b11.keySet().iterator();
                }
                return new f(iVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f59876a) {
            case 0:
                i iVar = this.f59877b;
                Map b10 = iVar.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!iVar.d()) {
                        int e10 = iVar.e();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = iVar.f59905a;
                        obj2.getClass();
                        int[] iArr = iVar.f59906b;
                        iArr.getClass();
                        Object[] objArr = iVar.f59907c;
                        objArr.getClass();
                        Object[] objArr2 = iVar.d;
                        objArr2.getClass();
                        int a10 = x7.s6.a(key, value, e10, obj2, iArr, objArr, objArr2);
                        if (a10 != -1) {
                            iVar.c(a10, e10);
                            iVar.f59909f--;
                            iVar.f59908e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                i iVar2 = this.f59877b;
                Map b11 = iVar2.b();
                if (b11 != null) {
                    return b11.keySet().remove(obj);
                }
                if (iVar2.h(obj) == i.f59904s) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int size() {
        switch (this.f59876a) {
            case 0:
                return this.f59877b.size();
            default:
                return this.f59877b.size();
        }
    }
}
