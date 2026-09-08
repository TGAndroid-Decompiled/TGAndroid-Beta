package w7;

import java.util.Iterator;
import java.util.Map;
public final class wa extends ta {
    public final transient com.google.android.gms.internal.cast.l0 f48348c;
    public final transient Object[] d;
    public final transient int f48349e = 1;

    public wa(com.google.android.gms.internal.cast.l0 l0Var, Object[] objArr) {
        this.f48348c = l0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f48348c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        sa saVar = this.f48324b;
        if (saVar == null) {
            saVar = new va(this);
            this.f48324b = saVar;
        }
        return saVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        sa saVar = this.f48324b;
        if (saVar == null) {
            saVar = new va(this);
            this.f48324b = saVar;
        }
        return saVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f48349e;
    }
}
