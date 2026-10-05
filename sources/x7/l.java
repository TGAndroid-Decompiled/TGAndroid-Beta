package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f49561b;
    public final e9.l f49562c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f49561b = obj;
        this.f49562c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f49561b;
    }

    @Override
    public final Object getValue() {
        return this.f49562c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
