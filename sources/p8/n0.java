package p8;

import java.util.Map;

public final class n0 extends c0 {
    public final transient b0 d;

    public final transient Object[] f45561e;

    public final transient int f45562f;

    public n0(b0 b0Var, Object[] objArr, int i10) {
        this.d = b0Var;
        this.f45561e = objArr;
        this.f45562f = i10;
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
        return this.f45562f;
    }

    @Override
    public final z v() {
        return new m0(this);
    }

    @Override
    public final x0 iterator() {
        return i().listIterator(0);
    }
}
