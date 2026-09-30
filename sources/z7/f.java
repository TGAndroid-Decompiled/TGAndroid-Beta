package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f48509b;
    public final e9.l f48510c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f48509b = obj;
        this.f48510c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f48509b;
    }

    @Override
    public final Object getValue() {
        return this.f48510c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
