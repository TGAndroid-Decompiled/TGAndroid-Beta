package x7;

import java.util.Iterator;
import java.util.Map;
public final class u extends p {
    public final transient com.google.android.gms.internal.cast.l0 f49668c;
    public final transient Object[] d;
    public final transient int f49669e = 1;

    public u(com.google.android.gms.internal.cast.l0 l0Var, Object[] objArr) {
        this.f49668c = l0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f49668c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        o oVar = this.f49619b;
        if (oVar == null) {
            oVar = new t(this);
            this.f49619b = oVar;
        }
        return oVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        o oVar = this.f49619b;
        if (oVar == null) {
            oVar = new t(this);
            this.f49619b = oVar;
        }
        return oVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f49669e;
    }
}
