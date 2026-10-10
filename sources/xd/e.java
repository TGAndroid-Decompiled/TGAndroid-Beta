package xd;

import ae.s1;
import java.util.Iterator;
import w7.h;
public final class e implements b {
    public final int f51160a;
    public final Object f51161b;

    public e(Object obj, int i10) {
        this.f51160a = i10;
        this.f51161b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f51160a) {
            case 0:
                ?? obj = new Object();
                obj.f51159c = h.a(obj, obj, (s1) this.f51161b);
                return obj;
            case 1:
                return (Iterator) this.f51161b;
            default:
                return new yd.b((String) this.f51161b);
        }
    }
}
