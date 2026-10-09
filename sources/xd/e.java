package xd;

import ae.s1;
import java.util.Iterator;
import w7.h;
public final class e implements b {
    public final int f51116a;
    public final Object f51117b;

    public e(Object obj, int i10) {
        this.f51116a = i10;
        this.f51117b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f51116a) {
            case 0:
                ?? obj = new Object();
                obj.f51115c = h.a(obj, obj, (s1) this.f51117b);
                return obj;
            case 1:
                return (Iterator) this.f51117b;
            default:
                return new yd.b((String) this.f51117b);
        }
    }
}
