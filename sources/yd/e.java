package yd;

import be.r1;
import java.util.Iterator;
import w7.n;
public final class e implements b {
    public final int f48740a;
    public final Object f48741b;

    public e(Object obj, int i10) {
        this.f48740a = i10;
        this.f48741b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f48740a) {
            case 0:
                ?? obj = new Object();
                obj.f48739c = n.a(obj, obj, (r1) this.f48741b);
                return obj;
            case 1:
                return (Iterator) this.f48741b;
            default:
                return new zd.b((String) this.f48741b);
        }
    }
}
