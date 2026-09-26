package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f48506b;
    public final e9.l f48507c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f48506b = obj;
        this.f48507c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f48506b;
    }

    @Override
    public final Object getValue() {
        return this.f48507c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
