package w7;

import java.util.Iterator;
import java.util.Map;
public final class wa extends ta {
    public final transient com.google.android.gms.internal.cast.l0 f48319c;
    public final transient Object[] d;
    public final transient int f48320e = 1;

    public wa(com.google.android.gms.internal.cast.l0 l0Var, Object[] objArr) {
        this.f48319c = l0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f48319c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        sa saVar = this.f48295b;
        if (saVar == null) {
            saVar = new va(this);
            this.f48295b = saVar;
        }
        return saVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        sa saVar = this.f48295b;
        if (saVar == null) {
            saVar = new va(this);
            this.f48295b = saVar;
        }
        return saVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f48320e;
    }
}
