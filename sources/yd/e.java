package yd;

import be.r1;
import java.util.Iterator;
import w7.n;
public final class e implements b {
    public final int f48741a;
    public final Object f48742b;

    public e(Object obj, int i10) {
        this.f48741a = i10;
        this.f48742b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f48741a) {
            case 0:
                ?? obj = new Object();
                obj.f48740c = n.a(obj, obj, (r1) this.f48742b);
                return obj;
            case 1:
                return (Iterator) this.f48742b;
            default:
                return new zd.b((String) this.f48742b);
        }
    }
}
