package x7;

import java.util.Iterator;
import java.util.Map;
public final class xa extends ua {
    public final transient a8.m f51725c;
    public final transient Object[] d;
    public final transient int e = 1;

    public xa(a8.m mVar, Object[] objArr) {
        this.f51725c = mVar;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f51725c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        ta taVar = this.f51706b;
        if (taVar == null) {
            taVar = new wa(this);
            this.f51706b = taVar;
        }
        return taVar.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        ta taVar = this.f51706b;
        if (taVar == null) {
            taVar = new wa(this);
            this.f51706b = taVar;
        }
        return taVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
