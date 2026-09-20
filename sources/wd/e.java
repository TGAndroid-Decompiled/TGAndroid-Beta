package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f45313a;
    public final Object f45314b;

    public e(Object obj, int i10) {
        this.f45313a = i10;
        this.f45314b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45313a) {
            case 0:
                ?? obj = new Object();
                obj.f45312c = g.a(obj, obj, (q1) this.f45314b);
                return obj;
            case 1:
                return (Iterator) this.f45314b;
            default:
                return new xd.b((String) this.f45314b);
        }
    }
}
