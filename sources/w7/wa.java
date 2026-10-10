package w7;

import java.util.Iterator;
import java.util.Map;
public final class wa extends ta {
    public final transient com.google.android.gms.internal.cast.j0 f50206c;
    public final transient Object[] d;
    public final transient int f50207e = 1;

    public wa(com.google.android.gms.internal.cast.j0 j0Var, Object[] objArr) {
        this.f50206c = j0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f50206c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        sa saVar = this.f50184b;
        if (saVar == null) {
            saVar = new va(this);
            this.f50184b = saVar;
        }
        return saVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        sa saVar = this.f50184b;
        if (saVar == null) {
            saVar = new va(this);
            this.f50184b = saVar;
        }
        return saVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f50207e;
    }
}
