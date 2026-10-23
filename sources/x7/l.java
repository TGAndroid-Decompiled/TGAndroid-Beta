package x7;

import java.io.Serializable;
public final class l extends d implements Serializable {
    public final Object f49454b;
    public final e9.m f49455c;

    public l(Object obj, e9.m mVar) {
        super(0, false);
        this.f49454b = obj;
        this.f49455c = mVar;
    }

    @Override
    public final Object getKey() {
        return this.f49454b;
    }

    @Override
    public final Object getValue() {
        return this.f49455c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
