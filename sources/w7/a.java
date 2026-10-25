package w7;

import java.util.Iterator;
import java.util.Map;
public final class a extends l9 {
    public final transient a8.m f50803c;
    public final transient Object[] d;
    public final transient int e = 1;

    public a(a8.m mVar, Object[] objArr) {
        this.f50803c = mVar;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f50803c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        return p().h(objArr);
    }

    @Override
    public final Iterator iterator() {
        return p().listIterator(0);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
