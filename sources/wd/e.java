package wd;

import java.util.Iterator;
import v7.t8;
import zd.q1;
public final class e implements b {
    public final int f48518a;
    public final Object f48519b;

    public e(Object obj, int i10) {
        this.f48518a = i10;
        this.f48519b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f48518a) {
            case 0:
                ?? obj = new Object();
                obj.f48517c = t8.a(obj, obj, (q1) this.f48519b);
                return obj;
            case 1:
                return (Iterator) this.f48519b;
            default:
                return new xd.b((String) this.f48519b);
        }
    }
}
