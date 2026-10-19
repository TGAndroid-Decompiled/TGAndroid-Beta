package yd;

import be.r1;
import java.util.Iterator;
import w7.n;
public final class e implements b {
    public final int f50123a;
    public final Object f50124b;

    public e(Object obj, int i10) {
        this.f50123a = i10;
        this.f50124b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f50123a) {
            case 0:
                ?? obj = new Object();
                obj.f50122c = n.a(obj, obj, (r1) this.f50124b);
                return obj;
            case 1:
                return (Iterator) this.f50124b;
            default:
                return new zd.b((String) this.f50124b);
        }
    }
}
