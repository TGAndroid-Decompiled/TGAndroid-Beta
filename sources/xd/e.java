package xd;

import ae.s1;
import java.util.Iterator;
import w7.h;
public final class e implements b {
    public final int f51237a;
    public final Object f51238b;

    public e(Object obj, int i10) {
        this.f51237a = i10;
        this.f51238b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f51237a) {
            case 0:
                ?? obj = new Object();
                obj.f51236c = h.a(obj, obj, (s1) this.f51238b);
                return obj;
            case 1:
                return (Iterator) this.f51238b;
            default:
                return new yd.b((String) this.f51238b);
        }
    }
}
