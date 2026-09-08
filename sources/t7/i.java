package t7;

import com.google.android.gms.internal.cast.l0;
import java.util.Iterator;
import java.util.Map;
public final class i extends f {
    public final transient l0 f46474c;
    public final transient Object[] d;
    public final transient int f46475e;

    public i(l0 l0Var, Object[] objArr, int i10) {
        this.f46474c = l0Var;
        this.d = objArr;
        this.f46475e = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f46474c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        d dVar = this.f46470b;
        if (dVar == null) {
            dVar = new h(this);
            this.f46470b = dVar;
        }
        return dVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        d dVar = this.f46470b;
        if (dVar == null) {
            dVar = new h(this);
            this.f46470b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f46475e;
    }
}
