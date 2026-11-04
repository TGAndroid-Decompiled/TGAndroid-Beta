package v7;

import java.util.Iterator;
import java.util.Map;
public final class i extends f {
    public final transient b8.m f56460c;
    public final transient Object[] d;
    public final transient int f56461e;

    public i(b8.m mVar, Object[] objArr, int i3) {
        this.f56460c = mVar;
        this.d = objArr;
        this.f56461e = i3;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f56460c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        d dVar = this.f56456b;
        if (dVar == null) {
            dVar = new h(this);
            this.f56456b = dVar;
        }
        return dVar.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        d dVar = this.f56456b;
        if (dVar == null) {
            dVar = new h(this);
            this.f56456b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f56461e;
    }
}
