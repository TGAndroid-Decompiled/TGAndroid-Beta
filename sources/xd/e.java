package xd;

import ae.s1;
import java.util.Iterator;
import w7.h;
public final class e implements b {
    public final int f51352a;
    public final Object f51353b;

    public e(Object obj, int i10) {
        this.f51352a = i10;
        this.f51353b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f51352a) {
            case 0:
                ?? obj = new Object();
                obj.f51351c = h.a(obj, obj, (s1) this.f51353b);
                return obj;
            case 1:
                return (Iterator) this.f51353b;
            default:
                return new yd.b((String) this.f51353b);
        }
    }
}
