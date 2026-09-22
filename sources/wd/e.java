package wd;

import java.util.Iterator;
import w7.g;
import zd.q1;
public final class e implements b {
    public final int f45334a;
    public final Object f45335b;

    public e(Object obj, int i10) {
        this.f45334a = i10;
        this.f45335b = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.f45334a) {
            case 0:
                ?? obj = new Object();
                obj.f45333c = g.a(obj, obj, (q1) this.f45335b);
                return obj;
            case 1:
                return (Iterator) this.f45335b;
            default:
                return new xd.b((String) this.f45335b);
        }
    }
}
