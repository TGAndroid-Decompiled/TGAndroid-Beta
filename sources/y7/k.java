package y7;

import a8.dh;
import a8.eh;
import java.io.Serializable;
public final class k extends eh implements Serializable {
    public final Object f52191b;
    public final dh f52192c;

    public k(Object obj, dh dhVar) {
        super(1, false);
        this.f52191b = obj;
        this.f52192c = dhVar;
    }

    @Override
    public final Object getKey() {
        return this.f52191b;
    }

    @Override
    public final Object getValue() {
        return this.f52192c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
