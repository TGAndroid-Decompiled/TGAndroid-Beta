package w7;

import a8.v;
import java.util.Iterator;
import java.util.Map;
public final class i extends f {
    public final transient v f57504c;
    public final transient Object[] d;
    public final transient int f57505e;

    public i(v vVar, Object[] objArr, int i7) {
        this.f57504c = vVar;
        this.d = objArr;
        this.f57505e = i7;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f57504c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int f(Object[] objArr) {
        d dVar = this.f57500b;
        if (dVar == null) {
            dVar = new h(this);
            this.f57500b = dVar;
        }
        return dVar.f(objArr);
    }

    @Override
    public final Iterator iterator() {
        d dVar = this.f57500b;
        if (dVar == null) {
            dVar = new h(this);
            this.f57500b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f57505e;
    }
}
