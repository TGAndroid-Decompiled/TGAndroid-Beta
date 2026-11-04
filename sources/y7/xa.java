package y7;

import java.util.Iterator;
import java.util.Map;
public final class xa extends ua {
    public final transient b8.m f59306c;
    public final transient Object[] d;
    public final transient int f59307e = 1;

    public xa(b8.m mVar, Object[] objArr) {
        this.f59306c = mVar;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f59306c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        ta taVar = this.f59286b;
        if (taVar == null) {
            taVar = new wa(this);
            this.f59286b = taVar;
        }
        return taVar.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        ta taVar = this.f59286b;
        if (taVar == null) {
            taVar = new wa(this);
            this.f59286b = taVar;
        }
        return taVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f59307e;
    }
}
