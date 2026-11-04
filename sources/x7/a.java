package x7;

import java.util.Iterator;
import java.util.Map;
public final class a extends j9 {
    public final transient b8.m f58228c;
    public final transient Object[] d;
    public final transient int f58229e = 1;

    public a(b8.m mVar, Object[] objArr) {
        this.f58228c = mVar;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f58228c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        return l().h(objArr);
    }

    @Override
    public final Iterator iterator() {
        return l().listIterator(0);
    }

    @Override
    public final int size() {
        return this.f58229e;
    }
}
