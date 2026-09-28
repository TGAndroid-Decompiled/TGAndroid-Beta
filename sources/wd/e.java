package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f45296a;
    public final Object f45297b;

    public e(Object obj, int i10) {
        this.f45296a = i10;
        this.f45297b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45296a) {
            case 0:
                ?? obj = new Object();
                obj.f45295c = g.a(obj, obj, (q1) this.f45297b);
                return obj;
            case 1:
                return (Iterator) this.f45297b;
            default:
                return new xd.b((String) this.f45297b);
        }
    }
}
