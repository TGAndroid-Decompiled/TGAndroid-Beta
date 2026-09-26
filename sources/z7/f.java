package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f48507b;
    public final e9.l f48508c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f48507b = obj;
        this.f48508c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f48507b;
    }

    @Override
    public final Object getValue() {
        return this.f48508c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
