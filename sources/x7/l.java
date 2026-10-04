package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f49545b;
    public final e9.l f49546c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f49545b = obj;
        this.f49546c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f49545b;
    }

    @Override
    public final Object getValue() {
        return this.f49546c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
