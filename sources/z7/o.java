package z7;

import java.util.Iterator;
import java.util.Map;
public final class o extends j {
    public final transient com.google.android.gms.internal.cast.i0 f55035c;
    public final transient Object[] d;
    public final transient int e = 1;

    public o(com.google.android.gms.internal.cast.i0 i0Var, Object[] objArr) {
        this.f55035c = i0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f55035c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        i iVar = this.f54976b;
        if (iVar == null) {
            iVar = new n(this);
            this.f54976b = iVar;
        }
        return iVar.listIterator(0);
    }

    @Override
    public final int l(Object[] objArr) {
        i iVar = this.f54976b;
        if (iVar == null) {
            iVar = new n(this);
            this.f54976b = iVar;
        }
        return iVar.l(objArr);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
