package p8;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class n extends AbstractSet {

    public final int f45559a;

    public final p f45560b;

    public n(p pVar, int i10) {
        this.f45559a = i10;
        this.f45560b = pVar;
    }

    @Override
    public final void clear() {
        switch (this.f45559a) {
            case 0:
                this.f45560b.clear();
                break;
            default:
                this.f45560b.clear();
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f45559a) {
            case 0:
                p pVar = this.f45560b;
                Map mapB = pVar.b();
                if (mapB != null) {
                    return mapB.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iD = pVar.d(entry.getKey());
                    if (iD != -1 && h7.e0.a(pVar.j()[iD], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f45560b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45559a) {
            case 0:
                p pVar = this.f45560b;
                Map mapB = pVar.b();
                return mapB != null ? mapB.entrySet().iterator() : new m(pVar, 1);
            default:
                p pVar2 = this.f45560b;
                Map mapB2 = pVar2.b();
                return mapB2 != null ? mapB2.keySet().iterator() : new m(pVar2, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f45559a) {
            case 0:
                p pVar = this.f45560b;
                Map mapB = pVar.b();
                if (mapB != null) {
                    return mapB.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!pVar.f()) {
                        int iC = pVar.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = pVar.f45568a;
                        Objects.requireNonNull(obj2);
                        int iM = l.m(key, value, iC, obj2, pVar.h(), pVar.i(), pVar.j());
                        if (iM != -1) {
                            pVar.e(iM, iC);
                            pVar.f45572f--;
                            pVar.f45571e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                p pVar2 = this.f45560b;
                Map mapB2 = pVar2.b();
                if (mapB2 != null) {
                    return mapB2.keySet().remove(obj);
                }
                return pVar2.g(obj) != p.f45567s;
        }
    }

    @Override
    public final int size() {
        switch (this.f45559a) {
            case 0:
                break;
        }
        return this.f45560b.size();
    }
}
