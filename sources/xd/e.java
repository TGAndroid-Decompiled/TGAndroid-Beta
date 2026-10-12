package xd;

import ae.s1;
import java.util.Iterator;
import w7.h;
public final class e implements b {
    public final int f51344a;
    public final Object f51345b;

    public e(Object obj, int i10) {
        this.f51344a = i10;
        this.f51345b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f51344a) {
            case 0:
                ?? obj = new Object();
                obj.f51343c = h.a(obj, obj, (s1) this.f51345b);
                return obj;
            case 1:
                return (Iterator) this.f51345b;
            default:
                return new yd.b((String) this.f51345b);
        }
    }
}
