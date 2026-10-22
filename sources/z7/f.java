package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f50795b;
    public final e9.m f50796c;

    public f(Object obj, e9.m mVar) {
        super(1, false);
        this.f50795b = obj;
        this.f50796c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f50795b;
    }

    @Override
    public final Object getValue() {
        return this.f50796c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
