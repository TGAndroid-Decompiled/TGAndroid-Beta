package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f50879b;
    public final e9.l f50880c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f50879b = obj;
        this.f50880c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f50879b;
    }

    @Override
    public final Object getValue() {
        return this.f50880c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
