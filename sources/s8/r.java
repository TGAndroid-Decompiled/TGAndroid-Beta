package s8;

import java.io.Serializable;
public final class r extends j implements Serializable {
    public final Object f44149a;
    public final Object f44150b;

    public r(Object obj, Object obj2) {
        this.f44149a = obj;
        this.f44150b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f44149a;
    }

    @Override
    public final Object getValue() {
        return this.f44150b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
