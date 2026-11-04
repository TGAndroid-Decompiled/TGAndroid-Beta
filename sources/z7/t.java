package z7;

import java.util.Iterator;
import java.util.Map;
public final class t extends o {
    public final transient b8.m f60039c;
    public final transient Object[] d;
    public final transient int f60040e = 1;

    public t(b8.m mVar, Object[] objArr) {
        this.f60039c = mVar;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f60039c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        n nVar = this.f59987b;
        if (nVar == null) {
            nVar = new s(this);
            this.f59987b = nVar;
        }
        return nVar.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        n nVar = this.f59987b;
        if (nVar == null) {
            nVar = new s(this);
            this.f59987b = nVar;
        }
        return nVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f60040e;
    }
}
