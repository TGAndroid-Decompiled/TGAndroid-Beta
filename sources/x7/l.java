package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f49896b;
    public final e9.m f49897c;

    public l(Object obj, e9.m mVar) {
        super(0, false);
        this.f49896b = obj;
        this.f49897c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f49896b;
    }

    @Override
    public final Object getValue() {
        return this.f49897c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
