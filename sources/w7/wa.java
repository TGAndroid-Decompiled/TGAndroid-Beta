package w7;

import java.util.Iterator;
import java.util.Map;
public final class wa extends ta {
    public final transient com.google.android.gms.internal.cast.l0 f43820c;
    public final transient Object[] d;
    public final transient int e = 1;

    public wa(com.google.android.gms.internal.cast.l0 l0Var, Object[] objArr) {
        this.f43820c = l0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f43820c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        sa saVar = this.f43797b;
        if (saVar == null) {
            saVar = new va(this);
            this.f43797b = saVar;
        }
        return saVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        sa saVar = this.f43797b;
        if (saVar == null) {
            saVar = new va(this);
            this.f43797b = saVar;
        }
        return saVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
