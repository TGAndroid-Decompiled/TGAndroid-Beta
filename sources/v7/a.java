package v7;

import java.util.Iterator;
import java.util.Map;
public final class a extends i9 {
    public final transient com.google.android.gms.internal.cast.l0 f42927c;
    public final transient Object[] d;
    public final transient int e = 1;

    public a(com.google.android.gms.internal.cast.l0 l0Var, Object[] objArr) {
        this.f42927c = l0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f42927c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        return q().i(objArr);
    }

    @Override
    public final Iterator iterator() {
        return q().listIterator(0);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
