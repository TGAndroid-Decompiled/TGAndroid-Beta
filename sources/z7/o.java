package z7;

import java.util.Iterator;
import java.util.Map;
public final class o extends j {
    public final transient com.google.android.gms.internal.cast.l0 f52859c;
    public final transient Object[] d;
    public final transient int f52860e = 1;

    public o(com.google.android.gms.internal.cast.l0 l0Var, Object[] objArr) {
        this.f52859c = l0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f52859c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        i iVar = this.f52799b;
        if (iVar == null) {
            iVar = new n(this);
            this.f52799b = iVar;
        }
        return iVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        i iVar = this.f52799b;
        if (iVar == null) {
            iVar = new n(this);
            this.f52799b = iVar;
        }
        return iVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f52860e;
    }
}
