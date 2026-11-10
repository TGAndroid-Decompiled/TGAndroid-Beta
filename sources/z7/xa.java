package z7;

import java.util.Iterator;
import java.util.Map;
public final class xa extends ua {
    public final transient a8.v f59989c;
    public final transient Object[] d;
    public final transient int f59990e = 1;

    public xa(a8.v vVar, Object[] objArr) {
        this.f59989c = vVar;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f59989c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int f(Object[] objArr) {
        ta taVar = this.f59969b;
        if (taVar == null) {
            taVar = new wa(this);
            this.f59969b = taVar;
        }
        return taVar.f(objArr);
    }

    @Override
    public final Iterator iterator() {
        ta taVar = this.f59969b;
        if (taVar == null) {
            taVar = new wa(this);
            this.f59969b = taVar;
        }
        return taVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f59990e;
    }
}
