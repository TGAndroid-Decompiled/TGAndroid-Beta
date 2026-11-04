package z7;

import b8.ah;
import b8.bh;
import java.io.Serializable;
public final class k extends bh implements Serializable {
    public final Object f59923b;
    public final ah f59924c;

    public k(Object obj, ah ahVar) {
        super(1, false);
        this.f59923b = obj;
        this.f59924c = ahVar;
    }

    @Override
    public final Object getKey() {
        return this.f59923b;
    }

    @Override
    public final Object getValue() {
        return this.f59924c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
