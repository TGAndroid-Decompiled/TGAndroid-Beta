package wd;

import java.util.Iterator;
import v7.t8;
import zd.q1;
public final class e implements b {
    public final int f48488a;
    public final Object f48489b;

    public e(Object obj, int i10) {
        this.f48488a = i10;
        this.f48489b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f48488a) {
            case 0:
                ?? obj = new Object();
                obj.f48487c = t8.a(obj, obj, (q1) this.f48489b);
                return obj;
            case 1:
                return (Iterator) this.f48489b;
            default:
                return new xd.b((String) this.f48489b);
        }
    }
}
