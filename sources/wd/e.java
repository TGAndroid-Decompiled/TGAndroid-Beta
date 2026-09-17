package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f45041a;
    public final Object f45042b;

    public e(Object obj, int i10) {
        this.f45041a = i10;
        this.f45042b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45041a) {
            case 0:
                ?? obj = new Object();
                obj.f45040c = g.a(obj, obj, (q1) this.f45042b);
                return obj;
            case 1:
                return (Iterator) this.f45042b;
            default:
                return new xd.b((String) this.f45042b);
        }
    }
}
