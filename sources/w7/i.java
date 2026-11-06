package w7;

import a8.v;
import java.util.Iterator;
import java.util.Map;
public final class i extends f {
    public final transient v f57505c;
    public final transient Object[] d;
    public final transient int f57506e;

    public i(v vVar, Object[] objArr, int i7) {
        this.f57505c = vVar;
        this.d = objArr;
        this.f57506e = i7;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f57505c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int f(Object[] objArr) {
        d dVar = this.f57501b;
        if (dVar == null) {
            dVar = new h(this);
            this.f57501b = dVar;
        }
        return dVar.f(objArr);
    }

    @Override
    public final Iterator iterator() {
        d dVar = this.f57501b;
        if (dVar == null) {
            dVar = new h(this);
            this.f57501b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f57506e;
    }
}
