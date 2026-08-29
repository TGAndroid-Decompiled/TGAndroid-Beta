package q8;

import java.io.Serializable;
public final class v extends j implements Serializable {
    public final Object f46501a;
    public final Object f46502b;

    public v(Object obj, Object obj2) {
        this.f46501a = obj;
        this.f46502b = obj2;
    }

    @Override
    public final Object getKey() {
        return this.f46501a;
    }

    @Override
    public final Object getValue() {
        return this.f46502b;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
