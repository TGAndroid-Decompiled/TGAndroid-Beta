package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f45874b;
    public final e9.l f45875c;

    public l(Object obj, e9.l lVar) {
        super(0, false);
        this.f45874b = obj;
        this.f45875c = lVar;
    }

    @Override
    public final Object getKey() {
        return this.f45874b;
    }

    @Override
    public final Object getValue() {
        return this.f45875c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
