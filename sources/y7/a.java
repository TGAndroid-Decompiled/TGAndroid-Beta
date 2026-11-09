package y7;

import java.util.Iterator;
import java.util.Map;
public final class a extends m9 {
    public final transient a8.v f58984c;
    public final transient Object[] d;
    public final transient int f58985e = 1;

    public a(a8.v vVar, Object[] objArr) {
        this.f58984c = vVar;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f58984c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int f(Object[] objArr) {
        return l().f(objArr);
    }

    @Override
    public final Iterator iterator() {
        return l().listIterator(0);
    }

    @Override
    public final int size() {
        return this.f58985e;
    }
}
