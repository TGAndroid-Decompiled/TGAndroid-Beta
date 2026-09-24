package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f48496b;
    public final e9.l f48497c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f48496b = obj;
        this.f48497c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f48496b;
    }

    @Override
    public final Object getValue() {
        return this.f48497c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
