package s8;

import java.io.Serializable;
public final class r extends j implements Serializable {
    public final Object f47165a;
    public final Object f47166b;

    public r(Object obj, Object obj2) {
        this.f47165a = obj;
        this.f47166b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f47165a;
    }

    @Override
    public final Object getValue() {
        return this.f47166b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
