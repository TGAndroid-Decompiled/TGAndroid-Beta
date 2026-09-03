package s8;

import java.util.Map;
public final class k0 extends z {
    public final transient x d;
    public final transient Object[] e;
    public final transient int f44199f;

    public k0(x xVar, Object[] objArr, int i10) {
        this.d = xVar;
        this.e = objArr;
        this.f44199f = i10;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        return i().n(i10, objArr);
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return this.f44199f;
    }

    @Override
    public final v v() {
        return new j0(this);
    }

    @Override
    public final u0 w() {
        return i().listIterator(0);
    }
}
