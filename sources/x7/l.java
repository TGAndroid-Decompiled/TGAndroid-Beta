package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f53225b;
    public final e9.m f53226c;

    public l(Object obj, e9.m mVar) {
        super(0, false);
        this.f53225b = obj;
        this.f53226c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f53225b;
    }

    @Override
    public final Object getValue() {
        return this.f53226c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
