package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f49554b;
    public final e9.l f49555c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f49554b = obj;
        this.f49555c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f49554b;
    }

    @Override
    public final Object getValue() {
        return this.f49555c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
