package y7;

import java.util.Iterator;
import java.util.Map;
public final class t extends o {
    public final transient a8.m f52292c;
    public final transient Object[] d;
    public final transient int e = 1;

    public t(a8.m mVar, Object[] objArr) {
        this.f52292c = mVar;
        this.d = objArr;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f52292c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        n nVar = this.f52252b;
        if (nVar == null) {
            nVar = new s(this);
            this.f52252b = nVar;
        }
        return nVar.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        n nVar = this.f52252b;
        if (nVar == null) {
            nVar = new s(this);
            this.f52252b = nVar;
        }
        return nVar.listIterator(0);
    }

    @Override
    public final int size() {
        return this.e;
    }
}
