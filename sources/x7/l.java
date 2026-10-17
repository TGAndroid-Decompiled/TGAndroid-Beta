package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f49466b;
    public final e9.m f49467c;

    public l(Object obj, e9.m mVar) {
        super(0, false);
        this.f49466b = obj;
        this.f49467c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f49466b;
    }

    @Override
    public final Object getValue() {
        return this.f49467c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
