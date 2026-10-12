package w7;

import java.util.Iterator;
import java.util.Map;
public final class wa extends ta {
    public final transient com.google.android.gms.internal.cast.j0 f50397c;
    public final transient Object[] d;
    public final transient int f50398e = 1;

    public wa(com.google.android.gms.internal.cast.j0 j0Var, Object[] objArr) {
        this.f50397c = j0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f50397c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        sa saVar = this.f50375b;
        if (saVar == null) {
            saVar = new va(this);
            this.f50375b = saVar;
        }
        return saVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        sa saVar = this.f50375b;
        if (saVar == null) {
            saVar = new va(this);
            this.f50375b = saVar;
        }
        return saVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f50398e;
    }
}
