package v7;

import java.util.Iterator;
import java.util.Map;
public final class a extends h9 {
    public final transient com.google.android.gms.internal.cast.i0 f50392c;
    public final transient Object[] d;
    public final transient int e = 1;

    public a(com.google.android.gms.internal.cast.i0 i0Var, Object[] objArr) {
        this.f50392c = i0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f50392c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return p().listIterator(0);
    }

    @Override
    public final int l(Object[] objArr) {
        return p().l(objArr);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
