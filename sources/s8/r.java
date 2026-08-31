package s8;

import java.io.Serializable;
public final class r extends j implements Serializable {
    public final Object f47134a;
    public final Object f47135b;

    public r(Object obj, Object obj2) {
        this.f47134a = obj;
        this.f47135b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f47134a;
    }

    @Override
    public final Object getValue() {
        return this.f47135b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
