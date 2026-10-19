package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f49443b;
    public final e9.m f49444c;

    public l(Object obj, e9.m mVar) {
        super(0, false);
        this.f49443b = obj;
        this.f49444c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f49443b;
    }

    @Override
    public final Object getValue() {
        return this.f49444c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
