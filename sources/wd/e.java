package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f44968a;
    public final Object f44969b;

    public e(Object obj, int i10) {
        this.f44968a = i10;
        this.f44969b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f44968a) {
            case 0:
                ?? obj = new Object();
                obj.f44967c = g.a(obj, obj, (q1) this.f44969b);
                return obj;
            case 1:
                return (Iterator) this.f44969b;
            default:
                return new xd.b((String) this.f44969b);
        }
    }
}
