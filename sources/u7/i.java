package u7;

import java.util.Iterator;
import java.util.Map;
public final class i extends f {
    public final transient a8.m f49639c;
    public final transient Object[] d;
    public final transient int e;

    public i(a8.m mVar, Object[] objArr, int i10) {
        this.f49639c = mVar;
        this.d = objArr;
        this.e = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f49639c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        d dVar = this.f49636b;
        if (dVar == null) {
            dVar = new h(this);
            this.f49636b = dVar;
        }
        return dVar.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        d dVar = this.f49636b;
        if (dVar == null) {
            dVar = new h(this);
            this.f49636b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
