package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f47352b;
    public final e9.l f47353c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f47352b = obj;
        this.f47353c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f47352b;
    }

    @Override
    public final Object getValue() {
        return this.f47353c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
