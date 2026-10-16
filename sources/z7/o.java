package z7;

import java.util.Iterator;
import java.util.Map;
public final class o extends j {
    public final transient com.google.android.gms.internal.cast.j0 f49731c;
    public final transient Object[] d;
    public final transient int e = 1;

    public o(com.google.android.gms.internal.cast.j0 j0Var, Object[] objArr) {
        this.f49731c = j0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f49731c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        i iVar = this.f49672b;
        if (iVar == null) {
            iVar = new n(this);
            this.f49672b = iVar;
        }
        return iVar.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        i iVar = this.f49672b;
        if (iVar == null) {
            iVar = new n(this);
            this.f49672b = iVar;
        }
        return iVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
