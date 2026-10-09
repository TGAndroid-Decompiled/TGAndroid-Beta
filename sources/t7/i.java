package t7;

import com.google.android.gms.internal.cast.j0;
import java.util.Iterator;
import java.util.Map;
public final class i extends f {
    public final transient j0 f48215c;
    public final transient Object[] d;
    public final transient int f48216e;

    public i(j0 j0Var, Object[] objArr, int i10) {
        this.f48215c = j0Var;
        this.d = objArr;
        this.f48216e = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f48215c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        d dVar = this.f48211b;
        if (dVar == null) {
            dVar = new h(this);
            this.f48211b = dVar;
        }
        return dVar.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        d dVar = this.f48211b;
        if (dVar == null) {
            dVar = new h(this);
            this.f48211b = dVar;
        }
        return dVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f48216e;
    }
}
