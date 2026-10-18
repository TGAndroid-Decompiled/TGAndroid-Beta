package v7;

import java.util.Iterator;
import java.util.Map;
public final class a extends i9 {
    public final transient com.google.android.gms.internal.cast.j0 f48003c;
    public final transient Object[] d;
    public final transient int e = 1;

    public a(com.google.android.gms.internal.cast.j0 j0Var, Object[] objArr) {
        this.f48003c = j0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f48003c.get(key))) {
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
