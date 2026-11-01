package w7;

import java.util.Iterator;
import java.util.Map;
public final class ua extends ra {
    public final transient com.google.android.gms.internal.cast.i0 f52729c;
    public final transient Object[] d;
    public final transient int e = 1;

    public ua(com.google.android.gms.internal.cast.i0 i0Var, Object[] objArr) {
        this.f52729c = i0Var;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f52729c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        qa qaVar = this.f52707b;
        if (qaVar == null) {
            qaVar = new ta(this);
            this.f52707b = qaVar;
        }
        return qaVar.listIterator(0);
    }

    @Override
    public final int l(Object[] objArr) {
        qa qaVar = this.f52707b;
        if (qaVar == null) {
            qaVar = new ta(this);
            this.f52707b = qaVar;
        }
        return qaVar.l(objArr);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
