package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f45295a;
    public final Object f45296b;

    public e(Object obj, int i10) {
        this.f45295a = i10;
        this.f45296b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45295a) {
            case 0:
                ?? obj = new Object();
                obj.f45294c = g.a(obj, obj, (q1) this.f45296b);
                return obj;
            case 1:
                return (Iterator) this.f45296b;
            default:
                return new xd.b((String) this.f45296b);
        }
    }
}
