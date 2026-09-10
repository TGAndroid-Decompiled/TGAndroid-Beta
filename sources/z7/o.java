package z7;

import java.util.Iterator;
import java.util.Map;
public final class o extends j {
    public final transient com.google.android.gms.internal.cast.l0 f47675c;
    public final transient Object[] d;
    public final transient int e = 1;

    public o(com.google.android.gms.internal.cast.l0 l0Var, Object[] objArr) {
        this.f47675c = l0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f47675c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        i iVar = this.f47619b;
        if (iVar == null) {
            iVar = new n(this);
            this.f47619b = iVar;
        }
        return iVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        i iVar = this.f47619b;
        if (iVar == null) {
            iVar = new n(this);
            this.f47619b = iVar;
        }
        return iVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
