package x7;

import java.util.Iterator;
import java.util.Map;
public final class u extends p {
    public final transient com.google.android.gms.internal.cast.i0 f53330c;
    public final transient Object[] d;
    public final transient int e = 1;

    public u(com.google.android.gms.internal.cast.i0 i0Var, Object[] objArr) {
        this.f53330c = i0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f53330c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        o oVar = this.f53282b;
        if (oVar == null) {
            oVar = new t(this);
            this.f53282b = oVar;
        }
        return oVar.listIterator(0);
    }

    @Override
    public final int l(Object[] objArr) {
        o oVar = this.f53282b;
        if (oVar == null) {
            oVar = new t(this);
            this.f53282b = oVar;
        }
        return oVar.l(objArr);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
