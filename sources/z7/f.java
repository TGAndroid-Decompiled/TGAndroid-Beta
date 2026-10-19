package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f50787b;
    public final e9.m f50788c;

    public f(Object obj, e9.m mVar) {
        super(1, false);
        this.f50787b = obj;
        this.f50788c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f50787b;
    }

    @Override
    public final Object getValue() {
        return this.f50788c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
