package yd;

import be.r1;
import java.util.Iterator;
import w7.n;
public final class e implements b {
    public final int f50133a;
    public final Object f50134b;

    public e(Object obj, int i10) {
        this.f50133a = i10;
        this.f50134b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f50133a) {
            case 0:
                ?? obj = new Object();
                obj.f50132c = n.a(obj, obj, (r1) this.f50134b);
                return obj;
            case 1:
                return (Iterator) this.f50134b;
            default:
                return new zd.b((String) this.f50134b);
        }
    }
}
