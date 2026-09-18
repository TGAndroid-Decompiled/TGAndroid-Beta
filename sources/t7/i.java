package t7;

import com.google.android.gms.internal.cast.l0;
import java.util.Iterator;
import java.util.Map;
public final class i extends f {
    public final transient l0 f43280c;
    public final transient Object[] d;
    public final transient int e;

    public i(l0 l0Var, Object[] objArr, int i10) {
        this.f43280c = l0Var;
        this.d = objArr;
        this.e = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f43280c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        d dVar = this.f43277b;
        if (dVar == null) {
            dVar = new h(this);
            this.f43277b = dVar;
        }
        return dVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        d dVar = this.f43277b;
        if (dVar == null) {
            dVar = new h(this);
            this.f43277b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
