package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f48536b;
    public final e9.l f48537c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f48536b = obj;
        this.f48537c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f48536b;
    }

    @Override
    public final Object getValue() {
        return this.f48537c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
