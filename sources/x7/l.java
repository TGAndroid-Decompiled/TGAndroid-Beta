package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f48057b;
    public final e9.m f48058c;

    public l(Object obj, e9.m mVar) {
        super(0, false);
        this.f48057b = obj;
        this.f48058c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f48057b;
    }

    @Override
    public final Object getValue() {
        return this.f48058c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
