package x7;

import java.util.Iterator;
import java.util.Map;
public final class u extends p {
    public final transient com.google.android.gms.internal.cast.l0 f44933c;
    public final transient Object[] d;
    public final transient int e = 1;

    public u(com.google.android.gms.internal.cast.l0 l0Var, Object[] objArr) {
        this.f44933c = l0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f44933c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        o oVar = this.f44887b;
        if (oVar == null) {
            oVar = new t(this);
            this.f44887b = oVar;
        }
        return oVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        o oVar = this.f44887b;
        if (oVar == null) {
            oVar = new t(this);
            this.f44887b = oVar;
        }
        return oVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
