package t7;

import com.google.android.gms.internal.cast.i0;
import java.util.Iterator;
import java.util.Map;
public final class i extends f {
    public final transient i0 f48546c;
    public final transient Object[] d;
    public final transient int e;

    public i(i0 i0Var, Object[] objArr, int i10) {
        this.f48546c = i0Var;
        this.d = objArr;
        this.e = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f48546c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        d dVar = this.f48543b;
        if (dVar == null) {
            dVar = new h(this);
            this.f48543b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override
    public final int l(Object[] objArr) {
        d dVar = this.f48543b;
        if (dVar == null) {
            dVar = new h(this);
            this.f48543b = dVar;
        }
        return dVar.l(objArr);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
