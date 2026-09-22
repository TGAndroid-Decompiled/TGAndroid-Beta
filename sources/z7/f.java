package z7;

import java.io.Serializable;
public final class f extends x7.d implements Serializable {
    public final Object f48229b;
    public final e9.l f48230c;

    public f(Object obj, e9.l lVar) {
        super(1, false);
        this.f48229b = obj;
        this.f48230c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f48229b;
    }

    @Override
    public final Object getValue() {
        return this.f48230c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
