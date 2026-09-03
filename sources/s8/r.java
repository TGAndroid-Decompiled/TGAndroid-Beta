package s8;

import java.io.Serializable;
public final class r extends j implements Serializable {
    public final Object f44214a;
    public final Object f44215b;

    public r(Object obj, Object obj2) {
        this.f44214a = obj;
        this.f44215b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f44214a;
    }

    @Override
    public final Object getValue() {
        return this.f44215b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
