package p8;

import java.io.Serializable;

public final class v extends j implements Serializable {

    public final Object f45594a;

    public final Object f45595b;

    public v(Object obj, Object obj2) {
        this.f45594a = obj;
        this.f45595b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f45594a;
    }

    @Override
    public final Object getValue() {
        return this.f45595b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
