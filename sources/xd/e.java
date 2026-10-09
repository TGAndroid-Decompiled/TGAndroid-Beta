package xd;

import ae.s1;
import java.util.Iterator;
import w7.h;
public final class e implements b {
    public final int f51114a;
    public final Object f51115b;

    public e(Object obj, int i10) {
        this.f51114a = i10;
        this.f51115b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f51114a) {
            case 0:
                ?? obj = new Object();
                obj.f51113c = h.a(obj, obj, (s1) this.f51115b);
                return obj;
            case 1:
                return (Iterator) this.f51115b;
            default:
                return new yd.b((String) this.f51115b);
        }
    }
}
