package yd;

import be.r1;
import java.util.Iterator;
import w7.n;
public final class e implements b {
    public final int f50134a;
    public final Object f50135b;

    public e(Object obj, int i10) {
        this.f50134a = i10;
        this.f50135b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f50134a) {
            case 0:
                ?? obj = new Object();
                obj.f50133c = n.a(obj, obj, (r1) this.f50135b);
                return obj;
            case 1:
                return (Iterator) this.f50135b;
            default:
                return new zd.b((String) this.f50135b);
        }
    }
}
